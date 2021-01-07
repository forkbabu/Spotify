package com.spotify.music.autoplay;

import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ s a;
    public final /* synthetic */ RadioSeedBundle b;

    public /* synthetic */ f(s sVar, RadioSeedBundle radioSeedBundle) {
        this.a = sVar;
        this.b = radioSeedBundle;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s sVar = this.a;
        RadioSeedBundle radioSeedBundle = this.b;
        if (((Boolean) obj).booleanValue()) {
            return sVar.Q(new e(radioSeedBundle)).N0(1).j0(d.a);
        }
        return s.i0(Boolean.FALSE);
    }
}
