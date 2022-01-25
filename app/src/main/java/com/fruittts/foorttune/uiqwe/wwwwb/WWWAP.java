package com.fruittts.foorttune.uiqwe.wwwwb;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.fruittts.foorttune.uiqwe.MyRandomImage;
import com.fruittts.foorttune.uiqwe.R;

public class WWWAP extends AppCompatActivity {

    WebView wp;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.wwwap);
        wp = findViewById(R.id.wp);
        String sda = "aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49SXpGWUpDa0RKR2UxTmZTUG5VTEVBY1dVV1F1SHg2bzk=";
        wp.loadUrl(MyRandomImage.dsda(sda));
    }
}
