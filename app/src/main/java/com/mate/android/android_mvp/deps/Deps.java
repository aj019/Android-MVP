package com.mate.android.android_mvp.deps;

import com.mate.android.android_mvp.home.HomeActivity;
import com.mate.android.android_mvp.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anujgupta on 10/03/17.
 */

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity homeActivity);
}