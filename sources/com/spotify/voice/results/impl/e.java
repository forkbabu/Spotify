package com.spotify.voice.results.impl;

import com.spotify.voice.results.impl.d;
import com.spotify.voice.results.model.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

final class e<V> implements Callable<List<? extends e.a>> {
    final /* synthetic */ d.C0578d a;
    final /* synthetic */ ugf b;

    e(d.C0578d dVar, ugf ugf) {
        this.a = dVar;
        this.b = ugf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public List<? extends e.a> call() {
        List<e.a> c = this.a.a.c();
        h.d(c, "resultsPageModel.results()");
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(c, 10));
        boolean z = false;
        for (T t : c) {
            boolean z2 = !z && vgf.a(t, this.b);
            if (z2) {
                z = true;
            }
            if (t.a() != z2) {
                t = (T) t.k(z2);
            }
            arrayList.add(t);
        }
        return arrayList;
    }
}
