package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import io.reactivex.functions.n;

public final /* synthetic */ class k implements l {
    public final /* synthetic */ n a;

    public /* synthetic */ k(n nVar) {
        this.a = nVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.test((x3) obj));
    }
}
