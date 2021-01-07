package com.spotify.music.premiummini;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.navigation.t;
import com.spotify.music.premiummini.ui.b;
import io.reactivex.y;

public final class d implements fjf<b> {
    private final wlf<UserMixDataSource> a;
    private final wlf<y> b;
    private final wlf<SnackbarManager> c;
    private final wlf<b> d;
    private final wlf<t> e;

    public d(wlf<UserMixDataSource> wlf, wlf<y> wlf2, wlf<SnackbarManager> wlf3, wlf<b> wlf4, wlf<t> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static d a(wlf<UserMixDataSource> wlf, wlf<y> wlf2, wlf<SnackbarManager> wlf3, wlf<b> wlf4, wlf<t> wlf5) {
        return new d(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
