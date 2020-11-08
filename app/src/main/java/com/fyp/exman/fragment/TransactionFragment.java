package com.fyp.exman.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fyp.exman.R;
import com.fyp.exman.adapter.TransactionAdapter;
import com.fyp.exman.model.Transaction;
import com.fyp.exman.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TransactionFragment extends Fragment {

    private RecyclerView transactionRecycler;
    private TransactionAdapter transactionAdapter;
    private Button addTransaction;
    private ArrayList<Transaction> transactions;


    public TransactionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_transaction, container, false);
        transactionRecycler = view.findViewById(R.id.transaction_recycler);
        addTransaction = view.findViewById(R.id.add_transaction);
        User sender = new User("1", "AH");
        User receiver = new User("2", "NS");
        Date date = new Date();
        Transaction t1 = new Transaction("Expenses",date, sender, receiver, 120.0);
        Transaction t2 = new Transaction("Bills",date, sender, receiver, 20.0);
        transactions = new ArrayList<>(Arrays.asList(t1, t2));

        transactionAdapter = new TransactionAdapter(transactions, getActivity());
        transactionRecycler.setAdapter(transactionAdapter);
        transactionRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}