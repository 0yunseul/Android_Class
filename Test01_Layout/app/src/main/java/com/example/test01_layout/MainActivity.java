package com.example.test01_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    ImageView img1, img2,img3;
    ImageView[] images = new ImageView[3];
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn1 = findViewById(R.id.btn1);

    images[0] = findViewById(R.id.img1);
    images[1] = findViewById(R.id.img2);
    images[2] = findViewById(R.id.img3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               count--;
                //조건 : -1이 되면 안됨
                if (count == -1)
                    count = 2;
                imgChange();
            }
        });

    }
    public void imgChange(){
        for(int i = 0; i <images.length; i++){
            images[i].setVisibility(View.GONE);
        }images[count].setVisibility(View.VISIBLE);
    }

}