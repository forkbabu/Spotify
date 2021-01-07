package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import io.reactivex.s;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class i4 implements w3 {
    final /* synthetic */ s a;
    final /* synthetic */ s b;
    final /* synthetic */ ImmutableList c;

    i4(s sVar, s sVar2, ImmutableList immutableList) {
        this.a = sVar;
        this.b = sVar2;
        this.c = immutableList;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return this.a;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return this.b;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        s<x3> sVar2;
        ArrayList arrayList = new ArrayList(this.c.size());
        UnmodifiableListIterator listIterator = this.c.listIterator();
        w3 w3Var = null;
        s<x3> sVar3 = sVar;
        while (listIterator.hasNext()) {
            w3 w3Var2 = (w3) listIterator.next();
            if (w3Var == null) {
                sVar2 = sVar.v0(1).h1();
            } else {
                sVar2 = s.n(sVar3, w3Var.c().j0(d3.a).E(), a1.a).v0(1).h1();
            }
            sVar3 = sVar2;
            arrayList.add(w3Var2.d(sVar3));
            w3Var = w3Var2;
        }
        return s.p(arrayList, b1.a);
    }
}
