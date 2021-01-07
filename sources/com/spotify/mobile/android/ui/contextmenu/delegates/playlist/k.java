package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

public final class k implements fjf<j> {
    private final wlf<d> a;

    public k(wlf<d> wlf) {
        this.a = wlf;
    }

    public static j a(Object obj) {
        return new j((d) obj);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get());
    }
}
