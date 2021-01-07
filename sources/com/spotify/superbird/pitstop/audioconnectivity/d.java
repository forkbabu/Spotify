package com.spotify.superbird.pitstop.audioconnectivity;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.functions.c;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class d<T1, T2, R> implements c<na1, HeadsetPluggedStatus, u3<na1, HeadsetPluggedStatus>> {
    public static final d a = new d();

    d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public u3<na1, HeadsetPluggedStatus> a(na1 na1, HeadsetPluggedStatus headsetPluggedStatus) {
        na1 na12 = na1;
        HeadsetPluggedStatus headsetPluggedStatus2 = headsetPluggedStatus;
        h.e(na12, "bluetoothEvent");
        h.e(headsetPluggedStatus2, "headsetEvent");
        return new u3<>(na12, headsetPluggedStatus2);
    }
}
