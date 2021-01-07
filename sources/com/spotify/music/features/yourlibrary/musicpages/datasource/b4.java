package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.n;
import io.reactivex.s;
import io.reactivex.subjects.a;

/* access modifiers changed from: package-private */
public final class b4 implements w3 {
    final /* synthetic */ a a;
    final /* synthetic */ n b;
    final /* synthetic */ w3 c;

    b4(a aVar, n nVar, w3 w3Var) {
        this.a = aVar;
        this.b = nVar;
        this.c = w3Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.j0(p0.a).o0(io.reactivex.schedulers.a.e());
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a.o0(io.reactivex.schedulers.a.e());
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        n nVar = this.b;
        nVar.getClass();
        s<R> J0 = sVar.j0(new k(nVar)).E().J0(new o0(this.c, sVar));
        a aVar = this.a;
        aVar.getClass();
        return J0.N(new m1(aVar));
    }
}
