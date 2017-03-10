package com.mate.android.android_mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mate.android.android_mvp.deps.DaggerDeps;
import com.mate.android.android_mvp.deps.Deps;
import com.mate.android.android_mvp.networking.NetworkModule;

import java.io.File;

/**
 * Created by anujgupta on 10/03/17.
 */

public class BaseApp  extends AppCompatActivity {
    Deps deps;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        deps = DaggerDeps.builder().networkModule(new NetworkModule(cacheFile)).build();

    }

    public Deps getDeps() {
        return deps;
    }
}
