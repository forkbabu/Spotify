package com.spotify.music.cyoa.game;

public final class r implements fjf<t> {
    private final wlf<u> a;

    public r(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        u uVar = this.a.get();
        if (uVar != null) {
            return uVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
