package com.fruittts.foorttune.uiqwe.wwwwb.jsd;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.fruittts.foorttune.uiqwe.MainActivity;
import com.fruittts.foorttune.uiqwe.MyRandomImage;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Rooo {
   public static String kds;
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String rooo(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyRandomImage.dsda("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzE1YTcyY2JhNDczNGY3YmFjNzI3NzdhNjNmZDkxMjE2L3Jhdy9GcnVpdF9zX0ZvcnR1bmUv"))
                .build();
        AS as = retrofit.create(AS.class);
        Call<ResponseBody> gistQuery = as.getStrU();

        gistQuery.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                if (response.isSuccessful()) {
                    try {
                        kds = response.body().string();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                MainActivity.clcl();
            }
        });

        return kds;
    }
}
