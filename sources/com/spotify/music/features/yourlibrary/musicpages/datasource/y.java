package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class y implements l {
    public final /* synthetic */ n3 a;

    public /* synthetic */ y(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return n3.a(this.a, (List) obj);
    }
}
