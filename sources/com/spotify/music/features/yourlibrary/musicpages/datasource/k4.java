package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;

/* access modifiers changed from: package-private */
public final class k4 implements w3 {
    final /* synthetic */ s a;
    final /* synthetic */ s b;

    k4(s sVar, s sVar2) {
        this.a = sVar;
        this.b = sVar2;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.b;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        return s.n(this.b, sVar.F(e1.a), f1.a);
    }
}
