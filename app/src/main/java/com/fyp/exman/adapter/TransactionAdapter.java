package com.fyp.exman.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.fyp.exman.R;
import com.fyp.exman.model.Transaction;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransViewHolder> {

    private ArrayList<Transaction> transactions;
    private LayoutInflater layoutInflater;
    private Context context;

    public TransactionAdapter(ArrayList<Transaction> transactions, Context context) {
        this.transactions = transactions;
        this.context = context;
    }

    @NonNull
    @Override
    public TransViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.card_transaction, parent, false);
        return new TransViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransViewHolder holder, int position) {
        Transaction transaction = transactions.get(position);
        holder.title.setText(transaction.getCategory());
        if(transaction.getCategory().equals("Expenses"))
            holder.icon.setImageResource(R.drawable.ic_trolley);
        else
            holder.icon.setImageResource(R.drawable.ic_bill);
        holder.sender.setText(String.format("From: %s",transaction.getSender().getName()));
        holder.receiver.setText(String.format("To: %s", transaction.getReceiver().getName()));
        holder.date.setText(transaction.getDate().toString());
        holder.amount.setText(String.format("RM %s", transaction.getAmount()));
    }

    @Override
    public int getItemCount() {
        return transactions.size();
    }

    public static class TransViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        ImageView icon;
        TextView title, sender, receiver, date, amount;
        public TransViewHolder(@NonNull View itemView) {
            super(itemView);
            card = itemView.findViewById(R.id.transaction_card);
            icon = itemView.findViewById(R.id.transaction_icon);
            title = itemView.findViewById(R.id.transaction_title);
            sender = itemView.findViewById(R.id.sender);
            receiver = itemView.findViewById(R.id.receiver);
            date = itemView.findViewById(R.id.transaction_date);
            amount = itemView.findViewById(R.id.transaction_amount);
        }
    }
}
