package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import com.spotify.base.java.logging.Logger;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class TrackListPresenterImpl$onTrackListItemSelected$1 extends FunctionReferenceImpl implements nmf<zwd, f> {
    TrackListPresenterImpl$onTrackListItemSelected$1(TrackListPresenterImpl trackListPresenterImpl) {
        super(1, trackListPresenterImpl, TrackListPresenterImpl.class, "onPlayOrSeekToSuccess", "onPlayOrSeekToSuccess(Lcom/spotify/player/CommandResult;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(zwd zwd) {
        zwd zwd2 = zwd;
        h.e(zwd2, "p1");
        ((TrackListPresenterImpl) this.receiver).getClass();
        Logger.g("playOrSeekTo executed with  success: " + zwd2, new Object[0]);
        return f.a;
    }
}
