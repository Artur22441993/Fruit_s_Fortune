package com.fruittts.foorttune.uiqwe.wwwwb.di;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.fruittts.foorttune.uiqwe.Cona;
import com.fruittts.foorttune.uiqwe.MyRandomImage;

import java.util.Map;

public class Na {

    public static String khudaiw = "";
    public static String knsuw;
    public final static String aapKo = "ZTlteWNLdjQ2ZlZZUHdWZXZ0aVRDWQ==";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void na(Cona cona){

        AppsFlyerLib.getInstance().init(MyRandomImage.dsda(aapKo), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                khudaiw = map.get(MyRandomImage.dsda("YWZfc3RhdHVz")).toString();
                if (khudaiw.equals(MyRandomImage.dsda("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(MyRandomImage.dsda("Y2FtcGFpZ24=")).toString();
                    knsuw = Parapa.papap(str,cona.getPackageName(),Cona.kidha,Cona.kdhsa);
                }
            }

            @Override
            public void onConversionDataFail(String s) {
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {
            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },cona.getApplicationContext());
        AppsFlyerLib.getInstance().start(cona.getApplicationContext());
    }
}
