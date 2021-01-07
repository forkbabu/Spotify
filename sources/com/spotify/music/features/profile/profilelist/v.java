package com.spotify.music.features.profile.profilelist;

import kotlin.jvm.internal.h;

public final class v implements usd<u> {
    private final h a;

    public v(h hVar) {
        h.e(hVar, "dependencies");
        this.a = hVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable, etd] */
    @Override // defpackage.usd
    public psd a(u uVar, etd etd) {
        u uVar2 = uVar;
        h.e(uVar2, "parameters");
        h.e(etd, "context");
        h hVar = this.a;
        hVar.getClass();
        return new g(hVar, uVar2, etd, null).a();
    }
}
