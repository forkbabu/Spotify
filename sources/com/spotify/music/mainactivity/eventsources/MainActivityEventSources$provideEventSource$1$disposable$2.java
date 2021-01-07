package com.spotify.music.mainactivity.eventsources;

import io.reactivex.plugins.a;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class MainActivityEventSources$provideEventSource$1$disposable$2 extends FunctionReferenceImpl implements nmf<Throwable, f> {
    public static final MainActivityEventSources$provideEventSource$1$disposable$2 a = new MainActivityEventSources$provideEventSource$1$disposable$2();

    MainActivityEventSources$provideEventSource$1$disposable$2() {
        super(1, a.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "p1");
        a.g(th2);
        return f.a;
    }
}
