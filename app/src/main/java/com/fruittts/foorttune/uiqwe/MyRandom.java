package com.fruittts.foorttune.uiqwe;

import static android.content.Context.TELEPHONY_SERVICE;

import android.telephony.TelephonyManager;

import java.util.Random;

public class MyRandom {


    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
