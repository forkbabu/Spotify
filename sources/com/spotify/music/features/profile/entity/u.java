package com.spotify.music.features.profile.entity;

import kotlin.jvm.internal.h;

public final class u implements usd<t> {
    private final g a;

    public u(g gVar) {
        h.e(gVar, "dependencies");
        this.a = gVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable, etd] */
    @Override // defpackage.usd
    public psd a(t tVar, etd etd) {
        t tVar2 = tVar;
        h.e(tVar2, "parameters");
        h.e(etd, "context");
        int i = f.a0;
        g gVar = this.a;
        gVar.getClass();
        return new f(gVar, tVar2, etd, null).a();
    }
}
