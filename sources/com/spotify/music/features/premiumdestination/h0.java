package com.spotify.music.features.premiumdestination;

public final class h0 implements fjf<String> {
    private final wlf<yyd> a;

    public h0(wlf<yyd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
