package com.spotify.music.sociallistening.impl.eventsources;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class e<T> implements g<Throwable> {
    public static final e a = new e();

    e() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "throwable");
        Logger.e(th2, "social listening impl: Failed observing social session update.", new Object[0]);
    }
}
