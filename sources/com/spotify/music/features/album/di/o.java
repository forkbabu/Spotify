package com.spotify.music.features.album.di;

public final class o implements fjf<String> {
    private final wlf<String> a;

    public o(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String str = this.a.get();
        if (str != null) {
            return str;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
