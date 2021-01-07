package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DurationPlayPauseButtonPresenterImpl$onToggleUpdate$1 extends FunctionReferenceImpl implements nmf<zwd, f> {
    DurationPlayPauseButtonPresenterImpl$onToggleUpdate$1(DurationPlayPauseButtonPresenterImpl durationPlayPauseButtonPresenterImpl) {
        super(1, durationPlayPauseButtonPresenterImpl, DurationPlayPauseButtonPresenterImpl.class, "logPlayerCommand", "logPlayerCommand(Lcom/spotify/player/CommandResult;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(zwd zwd) {
        zwd zwd2 = zwd;
        h.e(zwd2, "p1");
        DurationPlayPauseButtonPresenterImpl.e((DurationPlayPauseButtonPresenterImpl) this.receiver, zwd2);
        return f.a;
    }
}
