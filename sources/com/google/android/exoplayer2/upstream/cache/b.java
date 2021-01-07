package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        j jVar = (j) obj;
        j jVar2 = (j) obj2;
        long j = jVar.o;
        long j2 = jVar2.o;
        if (j - j2 == 0) {
            return jVar.compareTo(jVar2);
        }
        return j < j2 ? -1 : 1;
    }
}
