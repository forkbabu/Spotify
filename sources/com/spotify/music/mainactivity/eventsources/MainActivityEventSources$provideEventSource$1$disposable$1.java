package com.spotify.music.mainactivity.eventsources;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class MainActivityEventSources$provideEventSource$1$disposable$1 extends FunctionReferenceImpl implements nmf<ufb, f> {
    MainActivityEventSources$provideEventSource$1$disposable$1(da2 da2) {
        super(1, da2, da2.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ufb ufb) {
        ((da2) this.receiver).accept(ufb);
        return f.a;
    }
}
