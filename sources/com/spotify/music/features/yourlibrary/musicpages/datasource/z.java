package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class z implements l {
    public final /* synthetic */ n3 a;

    public /* synthetic */ z(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return n3.e(this.a, (List) obj);
    }
}
