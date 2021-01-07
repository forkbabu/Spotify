package com.spotify.music.features.listeninghistory.di;

import com.spotify.pageloader.o0;
import com.spotify.pageloader.resource.a;
import kotlin.jvm.internal.h;

public final class r implements fjf<o0<rm5>> {
    private final wlf<rm5> a;

    public r(wlf<rm5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        rm5 rm5 = this.a.get();
        h.e(rm5, "loadableResource");
        return a.a(rm5);
    }
}
