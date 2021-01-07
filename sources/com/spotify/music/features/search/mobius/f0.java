package com.spotify.music.features.search.mobius;

public final class f0 implements fjf<td8> {
    private final wlf<wd8> a;

    public f0(wlf<wd8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        td8 a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
