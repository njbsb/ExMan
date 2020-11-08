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
import com.fyp.exman.adapter.ExpensesAdapter;
import com.fyp.exman.model.Expense;
import com.fyp.exman.model.ExpenseCategory;
import com.fyp.exman.model.ShareGroup;
import com.fyp.exman.model.User;

import java.util.ArrayList;
import java.util.Arrays;

public class ExpensesFragment extends Fragment {

    private RecyclerView expenseRecycler;
    private ExpensesAdapter expensesAdapter;
    private Button addExpense;
    private ArrayList<Expense> expenses;

    public ExpensesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_expenses, container, false);
        expenseRecycler = view.findViewById(R.id.expenses_recycler);
        expenses = new ArrayList<>();
        User user1 = new User("1", "NS");
        User user2 = new User("1", "AH");
        ShareGroup sh = new ShareGroup("AN", new ArrayList<User>(Arrays.asList(user1, user2)));
        expenses.add(new Expense(new ExpenseCategory("1", "Grocery"), sh, 60.));
        expenses.add(new Expense(new ExpenseCategory("1", "Home"), sh, 70.));
        expenses.add(new Expense(new ExpenseCategory("1", "Room"), sh, 20.));
        addExpense = view.findViewById(R.id.add_expense);
        expensesAdapter = new ExpensesAdapter(getActivity(), expenses);

        expenseRecycler.setAdapter(expensesAdapter);
        expenseRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        addExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }
}