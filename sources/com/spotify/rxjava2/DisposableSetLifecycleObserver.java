package com.spotify.rxjava2;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;

public class DisposableSetLifecycleObserver implements m {
    private final q a;

    public DisposableSetLifecycleObserver(q qVar) {
        this.a = qVar;
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public void leaveScope() {
        this.a.c();
    }
}
