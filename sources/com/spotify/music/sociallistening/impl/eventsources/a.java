package com.spotify.music.sociallistening.impl.eventsources;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
public final class a<T> implements g<Throwable> {
    public static final a a = new a();

    a() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Logger.e(th, "social listening impl: Failed observing current user from session state.", new Object[0]);
    }
}
