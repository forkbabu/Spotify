package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.l;

public final /* synthetic */ class b1 implements l {
    public static final /* synthetic */ b1 a = new b1();

    private /* synthetic */ b1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (Object obj2 : (Object[]) obj) {
            builder.mo53add((ImmutableList.Builder) ((y3) obj2));
        }
        return z3.n(builder.build());
    }
}
