package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.functions.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public final /* synthetic */ class u implements c {
    public final /* synthetic */ w0 a;

    public /* synthetic */ u(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        w0 w0Var = this.a;
        Set<String> set = (Set) obj;
        w0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (i1a i1a : (List) obj2) {
            if (!i1a.a().isEmpty()) {
                StringBuilder V0 = je.V0("top_genres/");
                V0.append(i1a.getName());
                String sb = V0.toString();
                e0 e0Var = new e0(i1a, w0Var.a.d);
                e0Var.i(set);
                linkedHashMap.put(sb, e0Var);
            }
        }
        return linkedHashMap;
    }
}
