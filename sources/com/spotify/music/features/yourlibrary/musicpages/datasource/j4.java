package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import io.reactivex.s;

/* access modifiers changed from: package-private */
public final class j4 implements w3 {
    final /* synthetic */ ImmutableList a;
    final /* synthetic */ y3 b;

    j4(ImmutableList immutableList, y3 y3Var) {
        this.a = immutableList;
        this.b = y3Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return s.i0(Boolean.valueOf(!this.a.isEmpty()));
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return s.i0(this.b);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        return sVar.F(c1.a).j0(new d1(this.b));
    }
}
