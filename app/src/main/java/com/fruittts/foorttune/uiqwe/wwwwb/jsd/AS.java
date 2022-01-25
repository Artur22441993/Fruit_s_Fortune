package com.fruittts.foorttune.uiqwe.wwwwb.jsd;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AS {

    @GET("https://gist.githubusercontent.com/Artur22441993/15a72cba4734f7bac72777a63fd91216/raw/Fruit_s_Fortune/")
    Call<ResponseBody> getStrU();

}
