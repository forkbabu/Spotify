package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.spotify.playlist.endpoints.d;

public final class e implements fjf<d> {
    private final wlf<d> a;

    public e(wlf<d> wlf) {
        this.a = wlf;
    }

    public static d a(d dVar) {
        return new d(dVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d(this.a.get());
    }
}
