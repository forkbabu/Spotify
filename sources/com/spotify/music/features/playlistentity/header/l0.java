package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

public final class l0 implements fjf<k0> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<y> c;
    private final wlf<SnackbarManager> d;
    private final wlf<v> e;

    public l0(wlf<Context> wlf, wlf<String> wlf2, wlf<y> wlf3, wlf<SnackbarManager> wlf4, wlf<v> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
