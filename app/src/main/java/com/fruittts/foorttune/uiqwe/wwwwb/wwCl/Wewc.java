package com.fruittts.foorttune.uiqwe.wwwwb.wwCl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.fruittts.foorttune.uiqwe.MyRandomImage;
import com.fruittts.foorttune.uiqwe.wwwwb.WWWAOF;

public class Wewc extends WebChromeClient {

    @SuppressLint("StaticFieldLeak")
    public static WWWAOF wwwaof;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> filePath,
                                     FileChooserParams fileChooserParams) {
        if (wwwaof.ljsdkd != null) {
            wwwaof.ljsdkd.onReceiveValue(null);
        }
        wwwaof.ljsdkd = filePath;
        Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
        contentSelectionIntent.setType("*/*");
        Intent[] intentArray = new Intent[0];
        Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
        chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
        chooserIntent.putExtra(Intent.EXTRA_TITLE, MyRandomImage.dsda("U2VsZWN0IE9wdGlvbjo="));
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
        wwwaof.startActivityForResult(chooserIntent, 1);
        return true;
    }
}
