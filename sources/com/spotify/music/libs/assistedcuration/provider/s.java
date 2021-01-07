package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.functions.l;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final /* synthetic */ class s implements l {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ Set b;

    public /* synthetic */ s(s0 s0Var, Set set) {
        this.a = s0Var;
        this.b = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s0 s0Var = this.a;
        Set<String> set = this.b;
        v vVar = new v((List) obj, s0Var.a.d);
        vVar.i(set);
        return Collections.singletonMap("suggested_songs", vVar);
    }
}
