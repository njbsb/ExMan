package com.fyp.exman.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.fyp.exman.R;
import com.fyp.exman.model.Expense;

import java.util.ArrayList;

public class ExpensesAdapter extends RecyclerView.Adapter<ExpensesAdapter.ViewHolder> {
    private ArrayList<Expense> expenseList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ExpensesAdapter(Context context, ArrayList<Expense> expenses) {
        this.context = context;
        this.expenseList = expenses;
    }

    @NonNull
    @Override
    public ExpensesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View view =layoutInflater.inflate(R.layout.card_expense, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return expenseList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Expense expense = expenseList.get(position);
//        holder.icon.setImageResource(R.drawable.ic_groceries);
        holder.title.setText(expense.getExpenseCategory().getCategory());
        int icon = 0;
        int color = 0;
        switch (expense.getExpenseCategory().getCategory()) {
            case "Grocery":
                icon = R.drawable.ic_groceries;
                color = ContextCompat.getColor(context,R.color.grocery);
                break;
            case "Home":
                icon = R.drawable.ic_home;
                color = ContextCompat.getColor(context,R.color.home);
                break;
            case "Room":
                icon = R.drawable.ic_bed;
                color = ContextCompat.getColor(context,R.color.room);
                break;
        }
        holder.icon.setImageResource(icon);
        holder.card.setCardBackgroundColor(color);
        holder.date.setText(String.valueOf(expense.getStringDate()));
        holder.amount.setText(String.format("RM %s", String.valueOf(expense.getAmount())));
        holder.sharegroup.setText( String.format("Shared by: %s", expense.getShareGroup().getCode()));
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        ImageView icon;
        TextView title, date, amount, sharegroup;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            card = itemView.findViewById(R.id.expense_card);
            icon = itemView.findViewById(R.id.expense_icon);
            title = itemView.findViewById(R.id.expense_title);
            date = itemView.findViewById(R.id.expense_date);
            amount = itemView.findViewById(R.id.expense_amount);
            sharegroup = itemView.findViewById(R.id.expense_shared);
        }
    }
}
