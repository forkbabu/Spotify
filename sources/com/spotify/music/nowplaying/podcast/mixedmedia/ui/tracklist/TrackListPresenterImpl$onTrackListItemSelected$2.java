package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import com.spotify.base.java.logging.Logger;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class TrackListPresenterImpl$onTrackListItemSelected$2 extends FunctionReferenceImpl implements nmf<Throwable, f> {
    TrackListPresenterImpl$onTrackListItemSelected$2(TrackListPresenterImpl trackListPresenterImpl) {
        super(1, trackListPresenterImpl, TrackListPresenterImpl.class, "onPlayOrSeekToError", "onPlayOrSeekToError(Ljava/lang/Throwable;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "p1");
        ((TrackListPresenterImpl) this.receiver).getClass();
        Logger.n("Unable to playOrSeekTo because of " + th2, new Object[0]);
        return f.a;
    }
}
