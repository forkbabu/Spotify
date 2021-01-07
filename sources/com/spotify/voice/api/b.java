package com.spotify.voice.api;

import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.voice.api.model.l;
import defpackage.xte;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ l a;
    public final /* synthetic */ mte b;
    public final /* synthetic */ sse c;
    public final /* synthetic */ y f;
    public final /* synthetic */ sg0 n;

    public /* synthetic */ b(l lVar, mte mte, sse sse, y yVar, sg0 sg0) {
        this.a = lVar;
        this.b = mte;
        this.c = sse;
        this.f = yVar;
        this.n = sg0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        l lVar = this.a;
        mte mte = this.b;
        sse sse = this.c;
        y yVar = this.f;
        sg0 sg0 = this.n;
        Boolean bool = (Boolean) obj;
        if (!lVar.a().c()) {
            xte.a a2 = xte.a();
            a2.b(sse.c());
            a2.a(lVar.b().name());
            a2.c(yVar.a().toString());
            a2.e(((Boolean) sg0.apply(ng0.a())).booleanValue());
            a2.d(!bool.booleanValue());
            mte.e(a2.build());
        }
    }
}
