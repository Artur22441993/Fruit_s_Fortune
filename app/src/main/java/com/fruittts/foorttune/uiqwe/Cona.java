package com.fruittts.foorttune.uiqwe;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerLib;
import com.fruittts.foorttune.uiqwe.wwwwb.di.Na;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

public class Cona extends Application {

    public static String kdhsa;
    public static String kidha;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(MyRandomImage.dsda("NDg2NjA2MzItNzBjOS00NzI3LWIxMTktN2QxYTUxYmM3OGJj"));
        new Thread(new Runnable() {
            @Override
            public void run() {
               try {
                   kidha = ijd();
               }catch (Exception e){
               }
            }
        }).start();

        kdhsa = uyj();
        Na.na(this);


    }

    private String ijd()throws Exception{
        return AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
    }

    private String uyj(){
        return AppsFlyerLib.getInstance().getAppsFlyerUID(this);
    }
}
