package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = PlayerStateCompat.a;
        if (ig0.b()) {
            Logger.d("Failed to update: %s", th.getMessage());
        } else {
            Logger.e(th, "Failed to update", new Object[0]);
        }
    }
}
