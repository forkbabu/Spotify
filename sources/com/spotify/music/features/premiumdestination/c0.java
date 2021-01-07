package com.spotify.music.features.premiumdestination;

public final class c0 implements fjf<String> {
    private final wlf<yyd> a;

    public c0(wlf<yyd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
