package com.fruittts.foorttune.uiqwe.wwwwb;

import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.fruittts.foorttune.uiqwe.Cona;
import com.fruittts.foorttune.uiqwe.FF;
import com.fruittts.foorttune.uiqwe.MainActivity;
import com.fruittts.foorttune.uiqwe.MyRandomImage;
import com.fruittts.foorttune.uiqwe.wwwwb.di.Di;
import com.fruittts.foorttune.uiqwe.wwwwb.di.Na;

public class Loa {
    public static String ksds;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void lo(FF ff){

        String ugfd = Na.khudaiw;

        if (ugfd.equals(MyRandomImage.dsda("Tm9uLW9yZ2FuaWM="))){
            ksds = FF.sdadaweq + Na.knsuw;
            ff.startActivity(new Intent(ff.getApplicationContext(),WWWAOF.class));

        }else if(Di.kdhad != null) {
            ksds = FF.sdadaweq + Di.khhad;
            ff.startActivity(new Intent(ff.getApplicationContext(),WWWAOF.class));
        }else {
            if (ff.lojnsda.equals(MyRandomImage.dsda("Tk8="))) {
               MainActivity.clcl();
            }else {
                String strAppsFlyer = FF.lojnsda + MyRandomImage.dsda("P2J1bmRsZT0=") + ff.getPackageName() + MyRandomImage.dsda("JmFkX2lkPQ==") + Cona.kidha + MyRandomImage.dsda("JmFwcHNfaWQ9") + Cona.kdhsa +
                        MyRandomImage.dsda("JmRldl9rZXk9") + MyRandomImage.dsda(Na.aapKo);
                ksds = FF.sdadaweq + strAppsFlyer;
                ff.startActivity(new Intent(ff.getApplicationContext(),WWWAOF.class));
            }
        }
    }
}
