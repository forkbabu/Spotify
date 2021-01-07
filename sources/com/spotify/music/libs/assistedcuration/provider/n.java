package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.functions.l;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final /* synthetic */ class n implements l {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ Set b;

    public /* synthetic */ n(k0 k0Var, Set set) {
        this.a = k0Var;
        this.b = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        k0 k0Var = this.a;
        Set<String> set = this.b;
        v vVar = new v((List) obj, k0Var.a.d);
        vVar.i(set);
        return Collections.singletonMap("recently_played", vVar);
    }
}
