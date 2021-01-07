package com.spotify.superbird.pitstop.audioconnectivity;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class AudioConnectivityLogger$startAudioConnectivityStatusObservers$2 extends FunctionReferenceImpl implements nmf<na1, f> {
    AudioConnectivityLogger$startAudioConnectivityStatusObservers$2(g gVar) {
        super(1, gVar, g.class, "logBluetoothConnectionEvent", "logBluetoothConnectionEvent(Lcom/spotify/mobile/android/observablestates/bluetooth/BluetoothA2dpConnectionInfo;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(na1 na1) {
        na1 na12 = na1;
        h.e(na12, "p1");
        g.a((g) this.receiver, na12);
        return f.a;
    }
}
