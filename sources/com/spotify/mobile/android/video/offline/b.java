package com.spotify.mobile.android.video.offline;

import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ t a;
    public final /* synthetic */ r82 b;

    public /* synthetic */ b(t tVar, r82 r82) {
        this.a = tVar;
        this.b = r82;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.m(this.b, (Long) obj);
    }
}
