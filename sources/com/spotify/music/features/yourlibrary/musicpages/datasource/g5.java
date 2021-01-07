package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;

public abstract class g5 implements w3 {
    private s<y3> a;

    private s<y3> e() {
        if (this.a == null) {
            this.a = a().v0(1).h1();
        }
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract s<y3> a();

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return e().j0(x2.a).v0(1).h1();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return e();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        return e();
    }
}
