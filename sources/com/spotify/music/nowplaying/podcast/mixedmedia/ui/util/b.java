package com.spotify.music.nowplaying.podcast.mixedmedia.ui.util;

import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<Object[], Boolean> {
    public static final b a = new b();

    b() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Boolean apply(Object[] objArr) {
        Object[] objArr2 = objArr;
        h.e(objArr2, "it");
        ArrayList arrayList = new ArrayList(objArr2.length);
        for (Object obj : objArr2) {
            if (obj != null) {
                arrayList.add(Boolean.valueOf(((Boolean) obj).booleanValue()));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        }
        Boolean bool = Boolean.TRUE;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bool = Boolean.valueOf(bool.booleanValue() && ((Boolean) it.next()).booleanValue());
        }
        return bool;
    }
}
