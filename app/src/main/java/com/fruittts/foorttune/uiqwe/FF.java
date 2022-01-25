package com.fruittts.foorttune.uiqwe;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.Room;

import com.fruittts.foorttune.uiqwe.wwwwb.Loa;
import com.fruittts.foorttune.uiqwe.wwwwb.WWWAOF;
import com.fruittts.foorttune.uiqwe.wwwwb.di.Di;
import com.fruittts.foorttune.uiqwe.wwwwb.jsd.Rooo;
import com.fruittts.foorttune.uiqwe.wwwwb.udh.Basetab;


public class FF extends Activity {

    Display dsd;
    int w;
    int h;
    int sizeBar;
    int sizeButtW;
    int sizeButtH;
    public static Basetab basetab;
    public static String savLi;
    public static int savInt;

    public static String sdadaweq;
    public static String lojnsda;
    public static String kdakd;
    ConstraintLayout dadastyyh;
    @SuppressLint("StaticFieldLeak")
    public static ProgressBar progressBar;
    @SuppressLint("StaticFieldLeak")
    public  static Button buttonS, buttonP, buttonf;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.ff);
        dadastyyh = findViewById(R.id.constrainLa);
        MainActivity.ff = this;

        dsd = getWindowManager().getDefaultDisplay();
        w = dsd.getWidth();
        h = dsd.getHeight();
        sizeBar = w/3;
        sizeButtW = w/2;
        sizeButtH = w/5;

        new Thread(new Runnable() {
            @Override
            public void run() {
                basetab = Room.databaseBuilder(getApplicationContext(),
                        Basetab.class, "ueksaq").build();

                try {
                    savInt = basetab.daotab().getIntTab();
                    savLi = basetab.daotab().getEnti().cun;
                }catch (Exception e){

                }
            }
        }).start();


        progressBar = new ProgressBar(FF.this);
        ConstraintLayout.LayoutParams pogressLayoutParams =
                new ConstraintLayout.LayoutParams(sizeBar,sizeButtH);
        progressBar.setLayoutParams(pogressLayoutParams);
        dadastyyh.addView(progressBar);
        progressBar.setX(w/2-sizeBar/2);
        progressBar.setY(h/2 -sizeBar/2);

        buttonS = new Button(FF.this);
        ConstraintLayout.LayoutParams buttonSLa =
                new ConstraintLayout.LayoutParams(sizeButtW, sizeButtH);
        buttonS.setLayoutParams(buttonSLa);
        dadastyyh.addView(buttonS);
        buttonS.setX(w/2 - sizeButtW /2);
        buttonS.setY(h/2 - sizeBar /2);
        buttonS.setBackgroundColor(getResources().getColor(R.color.purple_200));
        buttonS.setText("start game");
        buttonS.setTextColor(getResources().getColor(R.color.white));

        buttonP = new Button(FF.this);
        ConstraintLayout.LayoutParams buttonBLa =
                new ConstraintLayout.LayoutParams(sizeButtW, sizeButtH);
        buttonP.setLayoutParams(buttonBLa);
        dadastyyh.addView(buttonP);
        buttonP.setX(w/2 - sizeButtW /2);
        buttonP.setY(h/2 - sizeBar /2 + 160);
        buttonP.setBackgroundColor(getResources().getColor(R.color.purple_200));
        buttonP.setText("Privacy Policy");
        buttonP.setTextColor(getResources().getColor(R.color.white));

        buttonf = new Button(FF.this);
        ConstraintLayout.LayoutParams buttonLLa =
                new ConstraintLayout.LayoutParams(sizeButtW, sizeButtH);
        buttonf.setLayoutParams(buttonLLa);
        dadastyyh.addView(buttonf);
        buttonf.setX(w/2 - sizeButtW /2);
        buttonf.setY(h/2 - sizeBar /2 + 320);
        buttonf.setBackgroundColor(getResources().getColor(R.color.purple_200));
        buttonf.setText("close games");
        buttonf.setTextColor(getResources().getColor(R.color.white));

        buttonS.setVisibility(View.INVISIBLE);
        buttonf.setVisibility(View.INVISIBLE);
        buttonP.setVisibility(View.INVISIBLE);

        if (de() == des(0)){
            Rooo.rooo();
            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    String [] ssd = Rooo.rooo().split("\\\u007C");
                    sdadaweq = ssd[0];
                    lojnsda = ssd[1];
                    kdakd = ssd[2];
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Di.di(FF.this);
                            Di.dip(FF.this);
                        }
                    });
                }
            },3000);


            if (savInt > 0){

                startActivity(new Intent(getApplicationContext(),WWWAOF.class));

            }else {
                new Handler().postDelayed(new Runnable() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void run() {
                        Loa.lo(FF.this);
                    }
                },5000);
            }





        }else {
         MainActivity.clcl();
        }

    }


    private int de(){
        int ihjds = Settings.Secure.getInt(this.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        return ihjds;
    }

    private int des(int aa){
        int a []  = {aa};
        int sd = 0;
        for (int i = 0; i < a.length; i++){
            sd = a[i];
        }
        return sd;
    }



}
