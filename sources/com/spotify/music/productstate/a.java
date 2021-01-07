package com.spotify.music.productstate;

import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(this.a.equals((String) obj));
    }
}
