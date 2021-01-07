package com.spotify.music.features.california.feature;

import kotlin.jvm.internal.h;

public final class e implements usd<f> {
    private final a a;

    public e(a aVar) {
        h.e(aVar, "dependencies");
        this.a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable, etd] */
    @Override // defpackage.usd
    public psd a(f fVar, etd etd) {
        f fVar2 = fVar;
        h.e(fVar2, "parameters");
        h.e(etd, "context");
        a aVar = this.a;
        aVar.getClass();
        return new l(aVar, fVar2, etd, null).a();
    }
}
