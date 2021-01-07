package com.spotify.music.superbird.setup;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.music.superbird.setup.domain.b;
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.e;
import com.spotify.music.superbird.setup.domain.f;
import com.spotify.music.superbird.setup.domain.n;
import com.spotify.music.superbird.setup.domain.o;
import com.spotify.music.superbird.setup.domain.p;
import com.spotify.music.superbird.setup.domain.q;
import kotlin.jvm.internal.h;

final class k<T, R> implements ea2<da2<q>, MobiusLoop.h<p, f, d>> {
    final /* synthetic */ j a;

    k(j jVar) {
        this.a = jVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.ea2
    public MobiusLoop.h<p, f, d> apply(da2<q> da2) {
        da2<q> da22 = da2;
        l lVar = new l(new SuperbirdSetupViewModelFactory$provideLoopFactory$1$1(o.a));
        e eVar = this.a.a;
        h.d(da22, "consumer");
        return i.c(lVar, ((b) eVar).f(da22)).f(new com.spotify.mobius.android.e("SuperbirdSetup")).h(((n) this.a.d).b());
    }
}
