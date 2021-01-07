package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.playlist.models.o;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;
import java.util.Set;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ Set b;

    public /* synthetic */ i(c0 c0Var, Set set) {
        this.a = c0Var;
        this.b = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.h(this.b, (o) obj);
        return b.a;
    }
}
