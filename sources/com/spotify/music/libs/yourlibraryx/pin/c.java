package com.spotify.music.libs.yourlibraryx.pin;

import io.reactivex.s;

public final class c implements fjf<YourLibraryXPinHelperImpl> {
    private final wlf<ei0> a;
    private final wlf<wbb> b;
    private final wlf<s<String>> c;

    public c(wlf<ei0> wlf, wlf<wbb> wlf2, wlf<s<String>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new YourLibraryXPinHelperImpl(this.a.get(), this.b.get(), this.c.get());
    }
}
