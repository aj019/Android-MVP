package com.mate.android.android_mvp.networking;

import com.mate.android.android_mvp.models.CityListResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by anujgupta on 10/03/17.
 */


public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}