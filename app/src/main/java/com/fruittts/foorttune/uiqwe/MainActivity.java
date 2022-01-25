package com.fruittts.foorttune.uiqwe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.fruittts.foorttune.uiqwe.wwwwb.WWWAP;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView1, imageView2,imageView3, imageViewSpin;
    private Click click;
    @SuppressLint("StaticFieldLeak")
    public static FF ff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageViewSpin = findViewById(R.id.imageView5);
        textView = findViewById(R.id.textView);

        click = new Click(imageViewSpin,imageView3,imageView1,imageView2,textView);
        click.click();

    }

    public static void clcl(){

        FF.progressBar.setVisibility(View.INVISIBLE);
        FF.buttonS.setVisibility(View.VISIBLE);
        FF.buttonf.setVisibility(View.VISIBLE);
        FF.buttonP.setVisibility(View.VISIBLE);

        FF.buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ff.startActivity(new Intent(ff.getApplicationContext(),MainActivity.class));
            }
        });

        FF.buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ff.startActivity(new Intent(ff.getApplicationContext(), WWWAP.class));
            }
        });

        FF.buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ff.finishAffinity();
            }
        });

    }
}