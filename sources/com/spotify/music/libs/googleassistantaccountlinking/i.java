package com.spotify.music.libs.googleassistantaccountlinking;

import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class i implements fjf<g<rga>> {
    private final wlf<sga> a;

    public i(wlf<sga> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        sga sga = this.a.get();
        h.e(sga, "googleAssistantLinkStateProvider");
        g<rga> a2 = sga.a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
