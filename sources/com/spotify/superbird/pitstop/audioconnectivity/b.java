package com.spotify.superbird.pitstop.audioconnectivity;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class b<T> implements n<HeadsetPluggedStatus> {
    public static final b a = new b();

    b() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(HeadsetPluggedStatus headsetPluggedStatus) {
        HeadsetPluggedStatus headsetPluggedStatus2 = headsetPluggedStatus;
        h.e(headsetPluggedStatus2, "event");
        return headsetPluggedStatus2 == HeadsetPluggedStatus.PLUGGED;
    }
}
