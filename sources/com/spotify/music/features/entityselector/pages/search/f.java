package com.spotify.music.features.entityselector.pages.search;

import com.spotify.libs.search.online.entity.b;
import com.spotify.mobile.android.rx.w;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class f implements fjf<s<b>> {
    private final wlf<w> a;
    private final wlf<Boolean> b;

    public f(wlf<w> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        w wVar = this.a.get();
        boolean booleanValue = this.b.get().booleanValue();
        h.e(wVar, "rxProductState");
        s<R> j0 = wVar.a("shows-collection").j0(new b(booleanValue));
        h.d(j0, "rxProductState\n         …      )\n                }");
        return j0;
    }
}
