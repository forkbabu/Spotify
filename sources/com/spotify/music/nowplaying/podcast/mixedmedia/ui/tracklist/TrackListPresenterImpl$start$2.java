package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class TrackListPresenterImpl$start$2 extends FunctionReferenceImpl implements nmf<Throwable, f> {
    TrackListPresenterImpl$start$2(i iVar) {
        super(1, iVar, i.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "p1");
        ((i) this.receiver).a(th2);
        return f.a;
    }
}
