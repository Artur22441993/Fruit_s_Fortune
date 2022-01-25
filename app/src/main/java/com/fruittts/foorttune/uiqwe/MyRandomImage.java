package com.fruittts.foorttune.uiqwe;

import android.os.Build;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import java.util.Base64;
import java.util.Random;

public class MyRandomImage {


    public static void myRandomImage(ImageView imageView1,ImageView imageView2,ImageView imageView3){

        Random random = new Random();
        int a = random.nextInt(6);
        int b = random.nextInt(6);
        int c = random.nextInt(6);
        int img1 = R.drawable.a1;
        int img2 =R.drawable.a2;
        int img3 = R.drawable.a3;
        int img4 = R.drawable.b1;
        int img5 = R.drawable.b1;
        int img6 = R.drawable.b2;
        int img7 = R.drawable.b3;

        switch (a){
            case 0:
                imageView1.setImageResource(img1);
                break;
            case 1:  imageView1.setImageResource(img2);
                break;
            case 2:  imageView1.setImageResource(img3);
                break;
            case 3:  imageView1.setImageResource(img4);
                break;
            case 4:  imageView1.setImageResource(img5);
                break;
            case 5:  imageView1.setImageResource(img6);
                break;
            case 6:  imageView1.setImageResource(img7);
                break;
        }


        switch (b){
            case 0:
                imageView2.setImageResource(img1);
                break;
            case 1:  imageView2.setImageResource(img2);
                break;
            case 2:  imageView2.setImageResource(img3);
                break;
            case 3:  imageView2.setImageResource(img4);
                break;
            case 4:  imageView2.setImageResource(img5);
                break;
            case 5:  imageView2.setImageResource(img6);
                break;
            case 6:  imageView2.setImageResource(img7);
                break;
        }


        switch (c){
            case 0:
                imageView3.setImageResource(img1);
                break;
            case 1:  imageView3.setImageResource(img2);
                break;
            case 2:  imageView3.setImageResource(img3);
                break;
            case 3:  imageView3.setImageResource(img4);
                break;
            case 4:  imageView3.setImageResource(img5);
                break;
            case 5:  imageView3.setImageResource(img6);
                break;
            case 6:  imageView3.setImageResource(img7);
                break;
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String dsda(String ifna){
        Base64.Decoder lodmnka = Base64.getDecoder();
        String ibjbq = new String(lodmnka.decode(ifna));
        return ibjbq;
    }



}
