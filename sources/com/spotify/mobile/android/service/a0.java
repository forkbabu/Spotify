package com.spotify.mobile.android.service;

import android.os.Binder;
import com.spotify.libs.connect.ConnectManager;

public class a0 extends Binder {
    private final ConnectManager a;

    a0(ConnectManager connectManager, aw8 aw8) {
        this.a = connectManager;
    }

    public ConnectManager a() {
        ConnectManager connectManager = this.a;
        connectManager.getClass();
        return connectManager;
    }
}
