package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.d1;
import defpackage.di9;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ d1 a;

    public /* synthetic */ f(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        d1.c cVar = (d1.c) obj;
        this.a.getClass();
        di9 b = cVar.b();
        ImmutableMap<String, Boolean> a2 = cVar.a();
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableListIterator<di9.b> listIterator = b.b().listIterator();
        while (listIterator.hasNext()) {
            di9.b next = listIterator.next();
            boolean booleanValue = ((Boolean) x.n(a2.get(next.e()), Boolean.FALSE)).booleanValue();
            di9.b.a i2 = next.i();
            i2.g(booleanValue);
            builder.mo53add((ImmutableList.Builder) i2.c());
        }
        ImmutableList<di9.b> build = builder.build();
        di9.a j = b.j();
        j.b(build);
        return j.a();
    }
}
