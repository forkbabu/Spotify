package com.spotify.music.sociallistening.impl.eventsources;

import com.spotify.music.sociallistening.models.SessionUpdate;
import defpackage.o8d;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class d<T, R> implements l<SessionUpdate, o8d> {
    public static final d a = new d();

    d() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public o8d apply(SessionUpdate sessionUpdate) {
        SessionUpdate sessionUpdate2 = sessionUpdate;
        h.e(sessionUpdate2, "sessionUpdate");
        return new o8d.m(sessionUpdate2);
    }
}
