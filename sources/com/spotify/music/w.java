package com.spotify.music;

import com.spotify.base.java.logging.Logger;

public final /* synthetic */ class w {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ w(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void a() {
        MainActivity mainActivity = this.a;
        mainActivity.getClass();
        Logger.b("MainActivityLifecycle onUiVisible", new Object[0]);
        for (ahb ahb : mainActivity.c0.a()) {
            ahb.a();
        }
    }
}