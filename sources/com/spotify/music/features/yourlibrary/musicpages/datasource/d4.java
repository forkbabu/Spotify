package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;

/* access modifiers changed from: package-private */
public final class d4 implements w3 {
    final /* synthetic */ s a;
    final /* synthetic */ w3 b;

    d4(s sVar, w3 w3Var) {
        this.a = sVar;
        this.b = w3Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.J0(new m0(this.b)).G0(Boolean.FALSE);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a.J0(new k0(this.b)).G0(y3.b);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        return this.a.J0(new l0(this.b, sVar));
    }
}
