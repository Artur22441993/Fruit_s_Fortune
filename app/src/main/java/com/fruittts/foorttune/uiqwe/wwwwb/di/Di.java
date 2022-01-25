package com.fruittts.foorttune.uiqwe.wwwwb.di;

import android.net.Uri;
import android.os.Build;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.fruittts.foorttune.uiqwe.Cona;
import com.fruittts.foorttune.uiqwe.FF;

public class Di {

    public static String kdhad;
    public static String khhad;

    public static void di(FF ff){
        FacebookSdk.setApplicationId(FF.kdakd);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(ff.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
    }

    public static void dip(FF ff){

        AppEventsLogger.activateApp(ff.getApplication());
        AppLinkData.fetchDeferredAppLinkData(ff.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(ff);
                }
                if (appLinkData != null) {
                    Uri url = appLinkData.getTargetUri();
                    kdhad = url.getQuery();
                    khhad = Parapa.papap(kdhad,ff.getPackageName(), Cona.kidha, Cona.kdhsa);

                }else {

                }

            }
        });

    }
}
