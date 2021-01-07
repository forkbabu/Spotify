package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.playlist.models.i;
import io.reactivex.functions.l;

public final /* synthetic */ class f0 implements l {
    public final /* synthetic */ p3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ x3 n;

    public /* synthetic */ f0(p3 p3Var, int i, boolean z, boolean z2, x3 x3Var) {
        this.a = p3Var;
        this.b = i;
        this.c = z;
        this.f = z2;
        this.n = x3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.m(this.b, this.c, this.f, this.n, (i) obj);
    }
}
