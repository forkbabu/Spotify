package com.spotify.music.autoplay;

import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;

public class f0 implements l<RadioSeedBundle, s<RadioSeedBundle>> {
    private final e0 a;

    f0(e0 e0Var) {
        this.a = e0Var;
    }

    public v a(RadioSeedBundle radioSeedBundle) {
        String radioSeed = radioSeedBundle.getRadioSeed();
        return this.a.a(radioSeed).P().J0(new s(radioSeed));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public s<RadioSeedBundle> apply(RadioSeedBundle radioSeedBundle) {
        RadioSeedBundle radioSeedBundle2 = radioSeedBundle;
        return s.d1(s.i0(radioSeedBundle2).J0(new t(this)), s.i0(radioSeedBundle2), u.a);
    }
}
