package com.spotify.music.page;

import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class b implements usd<Parcelable> {
    final /* synthetic */ usd a;

    b(usd<ArgType> usd) {
        this.a = usd;
    }

    @Override // defpackage.usd
    public psd a(Parcelable parcelable, etd etd) {
        h.e(parcelable, "parameters");
        h.e(etd, "context");
        return this.a.a(parcelable, etd);
    }
}
