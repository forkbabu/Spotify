package com.spotify.libs.instrumentation.performance;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;

interface i extends m {
    @w(Lifecycle.Event.ON_PAUSE)
    void onPause();

    @w(Lifecycle.Event.ON_RESUME)
    void onResume();

    @w(Lifecycle.Event.ON_START)
    void onStart();

    @w(Lifecycle.Event.ON_STOP)
    void onStop();
}
