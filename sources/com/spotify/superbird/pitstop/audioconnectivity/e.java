package com.spotify.superbird.pitstop.audioconnectivity;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class e<T> implements n<u3<na1, HeadsetPluggedStatus>> {
    public static final e a = new e();

    e() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(u3<na1, HeadsetPluggedStatus> u3Var) {
        u3<na1, HeadsetPluggedStatus> u3Var2 = u3Var;
        h.e(u3Var2, "eventCombination");
        F f = u3Var2.a;
        return f != null && f.e() && u3Var2.b == HeadsetPluggedStatus.UNPLUGGED;
    }
}
