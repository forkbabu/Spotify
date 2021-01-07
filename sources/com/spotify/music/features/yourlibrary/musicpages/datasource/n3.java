package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.models.b;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.Collections;
import java.util.List;

public class n3 implements w3 {
    private final ia9 a;
    private final a8a b;
    private final CollectionStateProvider c;
    private final m d;
    private final a<s<String>> e = a.h1();
    private s<y3> f;

    public n3(ia9 ia9, a8a a8a, CollectionStateProvider collectionStateProvider, m mVar) {
        this.a = ia9;
        this.b = a8a;
        this.c = collectionStateProvider;
        this.d = mVar;
    }

    public static s a(n3 n3Var, List list) {
        return s.n(n3Var.c.b("", "", (String[]) list.toArray(new String[0])).j0(a0.a).J0(new z(n3Var)), s.M0(n3Var.e).G0("").E(), d0.a).j0(new b0(n3Var));
    }

    public static s e(n3 n3Var, List list) {
        n3Var.getClass();
        if (list.isEmpty()) {
            return s.i0(Collections.emptyList());
        }
        return n3Var.b.e(null, (String[]) list.toArray(new String[0])).A(x.a).P();
    }

    public static y3 f(n3 n3Var, List list) {
        n3Var.getClass();
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            builder.mo53add((ImmutableList.Builder) n3Var.d.j((b) list.get(i2), i2, false, true));
        }
        return z3.i(builder.build());
    }

    public static s g(n3 n3Var) {
        return n3Var.a.b(100).A(w.a).P().J0(new y(n3Var)).r0(v.a);
    }

    private s<y3> h() {
        if (this.f == null) {
            this.f = s.B(new e0(this)).v0(1).h1();
        }
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return h().j0(c0.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return h();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        this.e.onNext(sVar.j0(f3.a).j0(s1.a));
        return h();
    }
}
