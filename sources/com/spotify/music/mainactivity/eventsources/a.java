package com.spotify.music.mainactivity.eventsources;

import com.spotify.android.flags.c;
import defpackage.ufb;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class a<T, R> implements l<c, ufb> {
    public static final a a = new a();

    a() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public ufb apply(c cVar) {
        c cVar2 = cVar;
        h.e(cVar2, "flags");
        return new ufb.b(cVar2);
    }
}
