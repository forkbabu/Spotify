package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import io.reactivex.functions.n;

public final /* synthetic */ class o0 implements n {
    public final /* synthetic */ String a;

    public /* synthetic */ o0(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        String str = (String) obj;
        return str.isEmpty() || str.equals(this.a);
    }
}
