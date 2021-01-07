package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;

/* access modifiers changed from: package-private */
public final class l4 implements w3 {
    final /* synthetic */ w3 a;

    l4(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.b().G0(Boolean.FALSE).E();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a.c().G0(y3.b);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        return this.a.d(sVar).G0(y3.b);
    }
}
