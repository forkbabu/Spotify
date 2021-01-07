package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import java.util.Collections;
import java.util.Set;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public final /* synthetic */ g0 a;
    public final /* synthetic */ Set b;

    public /* synthetic */ l(g0 g0Var, Set set) {
        this.a = g0Var;
        this.b = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        g0 g0Var = this.a;
        Set<String> set = this.b;
        g0Var.getClass();
        v vVar = new v(e.e(((ni0) obj).getItems()), g0Var.a.d);
        vVar.i(set);
        return Collections.singletonMap("liked_songs", vVar);
    }
}
