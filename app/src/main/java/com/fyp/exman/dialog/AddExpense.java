package com.fyp.exman.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.fyp.exman.R;

import java.util.Objects;

public class AddExpense extends AppCompatDialogFragment {
    private EditText expenseAmount;
    private Spinner categorySpinner;

//    @NonNull
////    @Override
////    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
////        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
////        LayoutInflater inflater = Objects.requireNonNull(getActivity()).getLayoutInflater();
//////        View view = inflater.inflate(R.layout.dialog_add_expenses);
////    }
}
