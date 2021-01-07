package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class b0 implements l {
    public final /* synthetic */ n3 a;

    public /* synthetic */ b0(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return n3.f(this.a, (List) obj);
    }
}
