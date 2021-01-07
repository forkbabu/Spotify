package com.spotify.music.features.listeninghistory.di;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.music.features.listeninghistory.ListeningHistoryFragment;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

public final class o implements fjf<e61> {
    private final wlf<c> a;
    private final wlf<w51> b;
    private final wlf<m> c;
    private final wlf<Context> d;
    private final wlf<ListeningHistoryFragment> e;
    private final wlf<bn5> f;

    public o(wlf<c> wlf, wlf<w51> wlf2, wlf<m> wlf3, wlf<Context> wlf4, wlf<ListeningHistoryFragment> wlf5, wlf<bn5> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = this.a.get();
        w51 w51 = this.b.get();
        m mVar = this.c.get();
        Context context = this.d.get();
        ListeningHistoryFragment listeningHistoryFragment = this.e.get();
        bn5 bn5 = this.f.get();
        h.e(cVar, "viewUri");
        h.e(w51, "hubsConfig");
        h.e(mVar, "hubsLayoutManagerFactory");
        h.e(context, "context");
        h.e(listeningHistoryFragment, "fragment");
        h.e(bn5, "scrollListener");
        e61 b2 = HubsGlueViewBinderFactories.c(cVar).d(HubsGlueViewBinderFactories.HeaderPolicy.ALWAYS_ON_TOP).a(mVar).c(listeningHistoryFragment).b(context, w51, bn5);
        h.d(b2, "HubsGlueViewBinderFactor…bsConfig, scrollListener)");
        return b2;
    }
}
