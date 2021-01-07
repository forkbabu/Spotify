package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.s;
import io.reactivex.v;

/* access modifiers changed from: package-private */
public final class e4 implements w3 {
    final /* synthetic */ s a;
    final /* synthetic */ w3 b;
    final /* synthetic */ w3 c;

    e4(s sVar, w3 w3Var, w3 w3Var2) {
        this.a = sVar;
        this.b = w3Var;
        this.c = w3Var2;
    }

    private w3 a(boolean z) {
        return z ? this.b : this.c;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.J0(new r0(this)).G0(Boolean.FALSE);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a.J0(new s0(this)).G0(y3.b);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        return this.a.J0(new q0(this, sVar));
    }

    public /* synthetic */ v e(s sVar, Boolean bool) {
        return a(bool.booleanValue()).d(sVar);
    }

    public /* synthetic */ v f(Boolean bool) {
        return a(bool.booleanValue()).c();
    }

    public /* synthetic */ v g(Boolean bool) {
        return a(bool.booleanValue()).b();
    }
}
