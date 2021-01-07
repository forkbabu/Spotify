package com.spotify.music.autoplay;

import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

public final /* synthetic */ class k implements l {
    public final /* synthetic */ RadioSeedBundle a;

    public /* synthetic */ k(RadioSeedBundle radioSeedBundle) {
        this.a = radioSeedBundle;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        RadioSeedBundle radioSeedBundle = this.a;
        if (((Boolean) obj).booleanValue()) {
            return s.i0(radioSeedBundle);
        }
        return o.a;
    }
}
