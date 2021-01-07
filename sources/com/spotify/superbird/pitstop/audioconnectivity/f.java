package com.spotify.superbird.pitstop.audioconnectivity;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
public final class f<T> implements g<u3<na1, HeadsetPluggedStatus>> {
    final /* synthetic */ g a;

    f(g gVar) {
        this.a = gVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(u3<na1, HeadsetPluggedStatus> u3Var) {
        g.c(this.a);
    }
}
