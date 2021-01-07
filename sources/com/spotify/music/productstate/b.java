package com.spotify.music.productstate;

import io.reactivex.functions.n;

public final /* synthetic */ class b implements n {
    public final /* synthetic */ String a;

    public /* synthetic */ b(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.equals((String) obj);
    }
}
