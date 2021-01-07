package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.PlaylistMenuMaker;

public final class g implements fjf<f> {
    private final wlf<PlaylistMenuMaker.a> a;
    private final wlf<h> b;

    public g(wlf<PlaylistMenuMaker.a> wlf, wlf<h> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
