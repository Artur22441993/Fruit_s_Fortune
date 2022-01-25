package com.fruittts.foorttune.uiqwe.wwwwb.di;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.fruittts.foorttune.uiqwe.MyRandomImage;
import com.onesignal.OneSignal;

public class Parapa {

    static String jhdsjd;
    static String jd;
    static String jhjhda;
    static String jdhsd;
    static String jggsw;
    static String iuhhw;
    static String utsvha;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String papap(String khbha, String jhss, String kijh, String khsd){


        String[] khss = khbha.split("::");

        try {
            jhdsjd = khss[0];
        }catch (Exception e){
            jhdsjd = "";
        }
        try {
            jd = khss[1];
        }catch (Exception e){
            jd = "";
        }

        try {
            jhjhda = khss[2];
        }catch (Exception e){
            jhjhda = "";

        }

        try {
            jdhsd = khss[3];
        }catch (Exception e){
            jdhsd = "";
        }

        try {
            jggsw = khss[4];
        }catch (Exception e){
            jggsw = "";
        }


        try {
            iuhhw = khss[5];
        }catch (Exception e){
            iuhhw = "";
        }

        try {
            utsvha = khss[6];
        }catch (Exception e){
            utsvha = "";
        }

        OneSignal.sendTag(MyRandomImage.dsda("c3ViX2FwcA=="), jd);

        String khsja = jhdsjd + MyRandomImage.dsda("P2J1bmRsZT0=") + jhss + MyRandomImage.dsda("JmFkX2lkPQ==") + kijh + MyRandomImage.dsda("JmFwcHNfaWQ9") + khsd +
                MyRandomImage.dsda("JnN1YjY9") + jd +
                MyRandomImage.dsda("JnN1Yjc9") + jhjhda +
                MyRandomImage.dsda("JnN1YjI9") + jdhsd +
                MyRandomImage.dsda("JnN1YjM9") + jggsw +
                MyRandomImage.dsda("JnN1YjQ9") + iuhhw +
                MyRandomImage.dsda("JnN1YjU9") + utsvha +
                MyRandomImage.dsda("JmRldl9rZXk9") + MyRandomImage.dsda(Na.aapKo);
        return khsja;
    }
}
