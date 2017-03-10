package com.mate.android.android_mvp.home;

import com.mate.android.android_mvp.models.CityListResponse;

/**
 * Created by anujgupta on 10/03/17.
 */


public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getityListSuccess(CityListResponse cityListResponse);

}