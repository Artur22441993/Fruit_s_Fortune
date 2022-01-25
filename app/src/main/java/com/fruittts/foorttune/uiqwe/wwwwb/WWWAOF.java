package com.fruittts.foorttune.uiqwe.wwwwb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.fruittts.foorttune.uiqwe.FF;
import com.fruittts.foorttune.uiqwe.R;
import com.fruittts.foorttune.uiqwe.wwwwb.wwCl.Weds;
import com.fruittts.foorttune.uiqwe.wwwwb.wwCl.Wewc;

public class WWWAOF extends AppCompatActivity {

    WebView webaof;
    public static ValueCallback<Uri> kdd;
    public static Uri qwewds = null;
    public static ValueCallback<Uri[]> ljsdkd;
    public static String kdjew;
    public static final int kdjwisa = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.wwwaof);
        webaof = findViewById(R.id.webaof);
        Weds.wwwaof = this;
        Wewc.wwwaof = this;

        if (FF.savInt > 0){
            webaof.loadUrl(FF.savLi);
        }else {
            webaof.loadUrl(Loa.ksds);
        }

    }

    @Override
    public void onBackPressed() {
        if (webaof.isFocused() && webaof.canGoBack()) {
            webaof.goBack();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != kdjwisa || ljsdkd == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (kdjew != null) {
                    results = new Uri[]{Uri.parse(kdjew)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        ljsdkd.onReceiveValue(results);
        ljsdkd = null;
        if (kdd == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? qwewds : data.getData();
            }
        } catch (Exception e) { }
        kdd.onReceiveValue(result);
        kdd = null;
    }


}
