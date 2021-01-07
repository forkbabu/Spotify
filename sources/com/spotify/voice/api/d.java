package com.spotify.voice.api;

import com.spotify.voice.api.model.l;
import defpackage.wte;
import io.reactivex.functions.a;

public final /* synthetic */ class d implements a {
    public final /* synthetic */ l a;
    public final /* synthetic */ mte b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(l lVar, mte mte, String str) {
        this.a = lVar;
        this.b = mte;
        this.c = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        l lVar = this.a;
        mte mte = this.b;
        String str = this.c;
        if (!lVar.a().c()) {
            wte.a a2 = wte.a();
            a2.b(str);
            a2.a(lVar.b().name());
            mte.d(a2.build());
        }
    }
}
