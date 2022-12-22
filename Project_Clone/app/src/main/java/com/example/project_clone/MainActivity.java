package com.example.project_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.example.project_clone.activity.ActivityFragment;
import com.example.project_clone.club.ClubFragment;
import com.example.project_clone.home.HomeFragment;
import com.example.project_clone.plan.PlanFragment;
import com.example.project_clone.running.RunningFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    BottomNavigationView btm_nav;
   int container;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       container = R.id.container;
       actionBar = getSupportActionBar();
       changeFragment(container,new HomeFragment());



        btm_nav = findViewById(R.id.btm_nav);
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    actionBar.setTitle("홈");
                    changeFragment(container, new HomeFragment());

                } else if (item.getItemId() == R.id.plan) {
                    actionBar.setTitle("플랜");
                    changeFragment(container,new PlanFragment());

                } else if (item.getItemId() == R.id.running) {
                    actionBar.setTitle("러닝");
                    changeFragment(container,new RunningFragment());


                } else if (item.getItemId() == R.id.club) {
                    actionBar.setTitle("클럽");
                    changeFragment(container,new ClubFragment());



                } else if (item.getItemId() == R.id.activity) {
                    actionBar.setTitle("활동");
                    changeFragment(container,new ActivityFragment());

                }
                return true;
            }
        });



    }

    private void changeFragment(int container,Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(container,fragment).commit();
    }

/*    private void getHashKey(){

        PackageInfo packageInfo = null;

        try {

            packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);

        } catch (PackageManager.NameNotFoundException e) {

            e.printStackTrace();

        }

        if (packageInfo == null)

            Log.e("KeyHash", "KeyHash:null");


        for (Signature signature : packageInfo.signatures) {

            try {

                MessageDigest md = MessageDigest.getInstance("SHA");

                md.update(signature.toByteArray());

                Log.d("로그", Base64.encodeToString(md.digest(), Base64.DEFAULT));

            } catch (NoSuchAlgorithmException e) {

                Log.e("로그", "Unable to get MessageDigest. signature=" + signature, e);

            }

        }

    }*/

}
