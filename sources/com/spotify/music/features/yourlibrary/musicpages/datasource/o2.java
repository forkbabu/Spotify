package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;
import io.reactivex.functions.l;

public final /* synthetic */ class o2 implements l {
    public final /* synthetic */ x3 a;

    public /* synthetic */ o2(x3 x3Var) {
        this.a = x3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        x3 x3Var = this.a;
        x3.a i = x3Var.i();
        i.h(Math.max(0, Math.min((((Integer) obj).intValue() - x3Var.j()) - 1, x3Var.k())));
        return i.b();
    }
}
