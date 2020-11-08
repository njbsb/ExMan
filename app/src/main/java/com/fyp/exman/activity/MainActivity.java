package com.fyp.exman.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.fyp.exman.R;
import com.fyp.exman.fragment.ExpensesFragment;
import com.fyp.exman.fragment.HomeFragment;
import com.fyp.exman.fragment.ProfileFragment;
import com.fyp.exman.fragment.TransactionFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavBar = findViewById(R.id.bottomNavbar);
        bottomNavBar.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod =new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            if(item.getItemId() == R.id.home) {
                fragment = new HomeFragment();
            } else if(item.getItemId() == R.id.expenses) {
                fragment = new ExpensesFragment();
            } else if(item.getItemId() == R.id.transaction) {
                fragment = new TransactionFragment();
            } else if(item.getItemId() == R.id.profile) {
                fragment = new ProfileFragment();
            }
            getSupportFragmentManager().
                    beginTransaction().
//                    setCustomAnimations(
//                            R.anim.slide_in,  // enter
//                            R.anim.fade_out,  // exit
//                            R.anim.fade_in   // popEnter
//                            R.anim.slide_out  // popExit
        replace(R.id.container, fragment).commit();
            return true;
        }
    };
}