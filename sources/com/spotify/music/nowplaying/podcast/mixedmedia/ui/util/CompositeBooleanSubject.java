package com.spotify.music.nowplaying.podcast.mixedmedia.ui.util;

import io.reactivex.s;
import io.reactivex.subjects.a;
import io.reactivex.subjects.c;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class CompositeBooleanSubject<E extends Enum<E>> implements a<E> {
    private final s<Boolean> a;
    private final Map<E, c<Boolean>> b;

    public CompositeBooleanSubject(E[] eArr) {
        h.e(eArr, "keys");
        int w = d.w(eArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(w < 16 ? 16 : w);
        for (E e : eArr) {
            Pair pair = new Pair(e, a.i1(Boolean.FALSE));
            linkedHashMap.put(pair.c(), pair.d());
        }
        AnonymousClass2 r7 = AnonymousClass2.a;
        this.b = linkedHashMap;
        s<Boolean> z0 = r7.invoke(linkedHashMap).E().z0();
        h.c(z0);
        this.a = z0;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.a
    public void a(E e, boolean z) {
        h.e(e, "key");
        c<Boolean> cVar = this.b.get(e);
        if (cVar != null) {
            cVar.onNext(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException("Key not found: " + e);
    }

    public final s<Boolean> b() {
        return this.a;
    }
}
