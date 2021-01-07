package com.spotify.music.libs.assistedcuration.provider;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.playlist.models.o;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class c0 implements b0 {
    private final HashMap<String, w> a;
    private final w b;
    private final w c;
    private final w d;
    private final w e;
    private final p0 f;
    private final g62<o> g;
    private final ImmutableList<String> h;

    public c0(h0 h0Var, l0 l0Var, x0 x0Var, t0 t0Var, p0 p0Var, g62<o> g62, ImmutableList<String> immutableList) {
        HashMap<String, w> hashMap = new HashMap<>();
        this.a = hashMap;
        this.b = h0Var;
        this.c = l0Var;
        this.d = x0Var;
        this.e = t0Var;
        this.f = p0Var;
        this.g = g62;
        this.h = immutableList;
        hashMap.put(h0Var.c(), h0Var);
        hashMap.put(l0Var.c(), l0Var);
        hashMap.put(x0Var.c(), x0Var);
        hashMap.put(t0Var.c(), t0Var);
        p0Var.getClass();
        hashMap.put("similar_to", p0Var);
    }

    public static int j(c0 c0Var, h hVar, h hVar2) {
        c0Var.getClass();
        int indexOf = c0Var.h.indexOf(hVar.c());
        if (indexOf == -1) {
            indexOf = c0Var.h.size();
        }
        int indexOf2 = c0Var.h.indexOf(hVar2.c());
        if (indexOf2 == -1) {
            indexOf2 = c0Var.h.size();
        }
        return indexOf - indexOf2;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.b0
    public List<byte[]> a() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.a.values()) {
            arrayList.add(wVar.a());
        }
        return arrayList;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.b0
    public void b(Set<String> set) {
        for (w wVar : this.a.values()) {
            wVar.b(set);
        }
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.b0
    public void c(h hVar, e eVar, Set<String> set) {
        w wVar = this.a.get(hVar.c());
        if (wVar != null) {
            wVar.f(hVar.d(), eVar, set);
        }
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.b0
    public s<List<h>> d(Set<String> set, String str) {
        return s.k(s.i0(Collections.emptyList()).x(this.f.d(set, str)), this.e.d(set, str), this.d.d(set, str), this.c.d(set, str), this.b.d(set, str), new h(this));
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.b0
    public void e(h hVar, Set<String> set) {
        w wVar = this.a.get(hVar.c());
        if (wVar != null) {
            wVar.g(hVar.d(), set);
        }
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.b0
    public void f(List<byte[]> list) {
        if (list.size() == this.a.values().size()) {
            int i = 0;
            for (w wVar : this.a.values()) {
                wVar.e(list.get(i));
                i++;
            }
        }
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.b0
    public a g(String str, Set<String> set, String str2) {
        g62<o> g62 = this.g;
        g62.getClass();
        return g62.a(str2, str).j0(new f62(str)).Y(new i(this, set));
    }

    public io.reactivex.e h(Set set, o oVar) {
        this.f.n(e.a(oVar), set);
        return b.a;
    }

    public List i(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list3);
        arrayList.addAll(list4);
        arrayList.addAll(list5);
        if (!this.h.isEmpty()) {
            Collections.sort(arrayList, new j(this));
        }
        return arrayList;
    }
}
