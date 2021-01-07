package com.spotify.superbird.pitstop.audioconnectivity;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
public final class c<T> implements g<HeadsetPluggedStatus> {
    final /* synthetic */ g a;

    c(g gVar) {
        this.a = gVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(HeadsetPluggedStatus headsetPluggedStatus) {
        g.b(this.a);
    }
}
