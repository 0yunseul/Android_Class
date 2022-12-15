package com.example.project_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.project_clone.activity.ActivityFragment;
import com.example.project_clone.club.ClubFragment;
import com.example.project_clone.home.HomeFragment;
import com.example.project_clone.plan.PlanFragment;
import com.example.project_clone.running.RunningFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    BottomNavigationView btm_nav;
    Toolbar toolbar;
    Fragment board, challange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


       actionBar = getSupportActionBar();
       changeFragment(new HomeFragment());

        btm_nav = findViewById(R.id.btm_nav);
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    actionBar.setTitle("홈");
                    changeFragment(new HomeFragment());
                } else if (item.getItemId() == R.id.plan) {
                    actionBar.setTitle("플랜");
                    changeFragment(new PlanFragment());
                } else if (item.getItemId() == R.id.running) {
                    actionBar.setTitle("러닝");
                    changeFragment(new RunningFragment());


                } else if (item.getItemId() == R.id.club) {
                    actionBar.setTitle("클럽");
                    changeFragment(new ClubFragment());



                } else if (item.getItemId() == R.id.activity) {
                    actionBar.setTitle("활동");
                    changeFragment(new ActivityFragment());
                }
                return true;
            }
        });



    }

    private void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }


}
