package com.spotify.music.features.ads;

import android.app.Activity;

public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ u1 a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ c0(u1 u1Var, Activity activity) {
        this.a = u1Var;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
