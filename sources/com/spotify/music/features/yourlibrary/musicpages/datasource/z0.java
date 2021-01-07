package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.functions.l;

public final /* synthetic */ class z0 implements l {
    public final /* synthetic */ n4 a;

    public /* synthetic */ z0(n4 n4Var) {
        this.a = n4Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n4 n4Var = this.a;
        y3 y3Var = (y3) obj;
        x3 e = y3Var.e();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int count = y3Var.getCount();
        for (int i = 0; i < count; i++) {
            MusicItem item = y3Var.getItem(i);
            if (n4Var.a(e, item)) {
                builder.mo53add((ImmutableList.Builder) item);
            }
        }
        return z3.j(builder.build(), e);
    }
}
