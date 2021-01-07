package com.spotify.music.features.album.di;

public final class m implements fjf<xz3> {
    private final wlf<Boolean> a;
    private final wlf<vy3> b;
    private final wlf<yz3> c;

    public m(wlf<Boolean> wlf, wlf<vy3> wlf2, wlf<yz3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        boolean booleanValue = this.a.get().booleanValue();
        xz3 xz3 = (vy3) this.b.get();
        xz3 xz32 = (yz3) this.c.get();
        if (!booleanValue) {
            xz3 = xz32;
        }
        yif.g(xz3, "Cannot return null from a non-@Nullable @Provides method");
        return xz3;
    }
}
