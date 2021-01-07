package com.spotify.music.nowplaying.podcast.mixedmedia.ui.util;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ReadinessSubject$1$1 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    ReadinessSubject$1$1(c cVar) {
        super(1, cVar, c.class, "invoke", "invoke(Z)V", 0);
    }

    public final void e(boolean z) {
        ((c) this.receiver).a(z);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(Boolean bool) {
        e(bool.booleanValue());
        return f.a;
    }
}
