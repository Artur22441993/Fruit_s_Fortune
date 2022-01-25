package com.fruittts.foorttune.uiqwe;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Click {
    private ImageView imageViewSpin,imageView1, imageView2,imageView3;
    private int p;
    private TextView textView;
    private int min = 600;
    private int max = 800;

    public Click(ImageView imageViewSpin, ImageView imageView1, ImageView imageView2, ImageView imageView3, TextView textView) {
        this.imageViewSpin = imageViewSpin;
        this.imageView1 = imageView1;
        this.imageView2 = imageView2;
        this.imageView3 = imageView3;
        this.textView = textView;
    }

    public ImageView getImageView1() {
        return imageView1;
    }

    public void setImageView1(ImageView imageView1) {
        this.imageView1 = imageView1;
    }

    public ImageView getImageView2() {
        return imageView2;
    }

    public void setImageView2(ImageView imageView2) {
        this.imageView2 = imageView2;
    }

    public ImageView getImageView3() {
        return imageView3;
    }

    public void setImageView3(ImageView imageView3) {
        this.imageView3 = imageView3;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public ImageView getImageViewSpin() {
        return imageViewSpin;
    }

    public void setImageViewSpin(ImageView imageViewSpin) {
        this.imageViewSpin = imageViewSpin;
    }

    public void click(){
         imageViewSpin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Handler handler = new Handler();

                 handler.post(new Runnable() {
                     @Override
                     public void run() {
                         textView.setText("" + MyRandom.rnd(min,max));
                         MyRandomImage.myRandomImage(imageView1,imageView2,imageView3);
                         p ++;
                         if (p!=20){
                             handler.postDelayed(this::run,40);

                         }else {
                             p = 0;}
                     }
                 });

             }
         });

    }

}
