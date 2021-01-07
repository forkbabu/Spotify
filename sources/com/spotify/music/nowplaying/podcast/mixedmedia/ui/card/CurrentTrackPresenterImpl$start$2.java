package com.spotify.music.nowplaying.podcast.mixedmedia.ui.card;

import com.spotify.base.java.logging.Logger;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class CurrentTrackPresenterImpl$start$2 extends FunctionReferenceImpl implements nmf<Throwable, f> {
    CurrentTrackPresenterImpl$start$2(CurrentTrackPresenterImpl currentTrackPresenterImpl) {
        super(1, currentTrackPresenterImpl, CurrentTrackPresenterImpl.class, "manageError", "manageError(Ljava/lang/Throwable;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "p1");
        ((CurrentTrackPresenterImpl) this.receiver).getClass();
        Logger.d("Error loading Current Track Card: " + th2, new Object[0]);
        return f.a;
    }
}
