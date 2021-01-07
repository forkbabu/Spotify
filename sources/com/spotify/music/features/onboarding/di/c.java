package com.spotify.music.features.onboarding.di;

import defpackage.b70;
import defpackage.t8a;
import kotlin.jvm.internal.h;

public final class c implements fjf<t8a> {
    private final wlf<t8a.a> a;

    public c(wlf<t8a.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t8a.a aVar = this.a.get();
        h.e(aVar, "likedContentFactory");
        t8a a2 = aVar.a(b70.a.c.b());
        h.d(a2, "likedContentFactory.crea…ifiers.ContentPicker.uri)");
        return a2;
    }
}
