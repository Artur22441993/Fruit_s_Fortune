package com.fruittts.foorttune.uiqwe.wwwwb.wwCl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import com.fruittts.foorttune.uiqwe.FF;
import com.fruittts.foorttune.uiqwe.MainActivity;
import com.fruittts.foorttune.uiqwe.MyRandomImage;
import com.fruittts.foorttune.uiqwe.wwwwb.WWWAOF;
import com.fruittts.foorttune.uiqwe.wwwwb.udh.Enti;

public class Weds extends WebViewClient {

    @SuppressLint("StaticFieldLeak")
    public static WWWAOF wwwaof;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains(MyRandomImage.dsda("NDA0"))){
            wwwaof.startActivity(new Intent(wwwaof.getApplicationContext(), MainActivity.class));
            wwwaof.finishAffinity();
        }
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Enti enti = new Enti(url);
                FF.basetab.daotab().ins(enti);

            }
        }).start();
    }
}
