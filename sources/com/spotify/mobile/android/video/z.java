package com.spotify.mobile.android.video;

public final class z implements fjf<y> {
    private final wlf<l0e> a;

    public z(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        y yVar = (y) this.a.get().a(a.a);
        yif.g(yVar, "Cannot return null from a non-@Nullable @Provides method");
        return yVar;
    }
}
