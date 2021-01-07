package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.i1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import defpackage.va9;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.Map;

public class o4 implements w3 {
    private final a<y3> a = a.h1();
    private final m b;
    private final i1 c;

    public o4(m mVar, i1 i1Var) {
        this.b = mVar;
        this.c = i1Var;
    }

    public y3 a(ImmutableMap immutableMap) {
        ImmutableSet entrySet = immutableMap.entrySet();
        j jVar = j.a;
        if (Collections2.any(entrySet, jVar)) {
            return z3.i(ImmutableList.copyOf(new MusicItem[]{this.b.e(ImmutableList.copyOf(Collections2.transform(Collections2.filter((Iterable) immutableMap.entrySet(), (Predicate) jVar), new n1(this))))}));
        }
        return y3.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a.j0(q1.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        s<R> j0 = sVar.j0(p1.a).E().j0(new o1(this));
        a<y3> aVar = this.a;
        aVar.getClass();
        return j0.N(new m1(aVar));
    }

    public /* synthetic */ va9 e(Map.Entry entry) {
        String str = (String) entry.getKey();
        va9.a a2 = va9.a();
        a2.b(str);
        a2.c(this.c.a(str));
        return a2.a();
    }
}
