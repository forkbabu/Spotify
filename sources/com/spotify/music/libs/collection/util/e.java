package com.spotify.music.libs.collection.util;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ k a;
    public final /* synthetic */ String b;

    public /* synthetic */ e(k kVar, String str) {
        this.a = kVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (ImmutableList) obj);
    }
}
