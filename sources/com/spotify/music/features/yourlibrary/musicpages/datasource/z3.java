package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.features.yourlibrary.musicpages.datasource.c;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.functions.n;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.ArrayList;

public final class z3 {
    private static w3 a(w3 w3Var, n<x3> nVar) {
        return new b4(a.h1(), nVar, w3Var);
    }

    public static w3 b(w3 w3Var) {
        return a(w3Var, j1.a);
    }

    public static w3 c(w3 w3Var) {
        return a(w3Var, g1.a);
    }

    public static w3 d(w3 w3Var) {
        return a(w3Var, k1.a);
    }

    public static w3 e(s<Boolean> sVar, w3 w3Var) {
        return new d4(sVar.E().v0(1).h1(), w3Var);
    }

    public static w3 f(s<Boolean> sVar, m4 m4Var, w3... w3VarArr) {
        w3 w3Var;
        s<Boolean> h1 = sVar.E().v0(1).h1();
        if (w3VarArr.length == 1) {
            w3Var = w3VarArr[0];
        } else {
            w3Var = l(ImmutableList.copyOf(w3VarArr));
        }
        return new f4(h1, w3Var, m4Var);
    }

    public static y3 g(y3 y3Var, int i, int i2) {
        int i3 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i4 = i2 + i;
        for (int i5 = i; i5 < i4; i5++) {
            builder.mo53add((ImmutableList.Builder) y3Var.getItem(i5));
        }
        return k(y3Var.f(), y3Var.getCount(), i, builder.build(), y3Var.a(), y3Var.k());
    }

    public static w3 h(s<MusicItem> sVar) {
        s<R> h1 = sVar.j0(i3.a).v0(1).h1();
        return new k4(h1.j0(l1.a).v0(1).h1(), h1.j0(d.a).v0(1).h1());
    }

    public static y3 i(ImmutableList<MusicItem> immutableList) {
        return j(immutableList, x3.b);
    }

    public static y3 j(ImmutableList<MusicItem> immutableList, x3 x3Var) {
        y3 y3Var = y3.a;
        c.b bVar = new c.b();
        bVar.e(false);
        bVar.c(immutableList.size());
        bVar.d(0);
        bVar.f(immutableList);
        bVar.h(MusicItem.a);
        bVar.b(x3Var);
        bVar.g(null);
        return bVar.a();
    }

    public static y3 k(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, x3 x3Var, MusicItem musicItem) {
        y3 y3Var = y3.a;
        c.b bVar = new c.b();
        bVar.e(z);
        bVar.c(i);
        bVar.d(i2);
        bVar.f(immutableList);
        bVar.b(x3Var);
        bVar.h(musicItem);
        bVar.g(null);
        return bVar.a();
    }

    public static w3 l(ImmutableList<w3> immutableList) {
        ArrayList arrayList = new ArrayList(immutableList.size());
        UnmodifiableListIterator<w3> listIterator = immutableList.listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(listIterator.next().b());
        }
        s h1 = s.p(arrayList, i1.a).v0(1).h1();
        ArrayList arrayList2 = new ArrayList(immutableList.size());
        UnmodifiableListIterator<w3> listIterator2 = immutableList.listIterator();
        while (listIterator2.hasNext()) {
            arrayList2.add(listIterator2.next().c());
        }
        return new i4(h1, s.p(arrayList2, h1.a).v0(1).h1(), immutableList);
    }

    private static y3 m(y3 y3Var, y3 y3Var2) {
        y3 j = y3Var.j();
        if (j == null) {
            y3.a l = y3Var.l();
            l.g(y3Var2);
            return l.a();
        }
        y3.a l2 = y3Var.l();
        l2.g(m(j, y3Var2));
        return l2.a();
    }

    public static y3 n(ImmutableList<y3> immutableList) {
        y3 y3Var = y3.a;
        for (int size = immutableList.size() - 1; size >= 0; size--) {
            y3 y3Var2 = immutableList.get(size);
            if (y3Var.equals(y3.a)) {
                y3Var = y3Var2;
            } else {
                y3Var = m(y3Var2, y3Var);
            }
        }
        return y3Var;
    }
}
