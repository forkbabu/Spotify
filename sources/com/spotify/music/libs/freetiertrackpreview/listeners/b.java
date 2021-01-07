package com.spotify.music.libs.freetiertrackpreview.listeners;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.freetiertrackpreview.logging.c;
import com.spotify.music.preview.v;
import io.reactivex.y;

public final class b implements fjf<RowInteractionListenerImpl> {
    private final wlf<v> a;
    private final wlf<ExplicitContentFacade> b;
    private final wlf<y> c;
    private final wlf<String> d;
    private final wlf<s7a> e;
    private final wlf<t8a> f;
    private final wlf<c> g;
    private final wlf<nfa> h;
    private final wlf<sfa> i;

    public b(wlf<v> wlf, wlf<ExplicitContentFacade> wlf2, wlf<y> wlf3, wlf<String> wlf4, wlf<s7a> wlf5, wlf<t8a> wlf6, wlf<c> wlf7, wlf<nfa> wlf8, wlf<sfa> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    public static b a(wlf<v> wlf, wlf<ExplicitContentFacade> wlf2, wlf<y> wlf3, wlf<String> wlf4, wlf<s7a> wlf5, wlf<t8a> wlf6, wlf<c> wlf7, wlf<nfa> wlf8, wlf<sfa> wlf9) {
        return new b(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new RowInteractionListenerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
