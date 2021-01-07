package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class DurationPlayPauseButtonPresenterImpl$start$1 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    DurationPlayPauseButtonPresenterImpl$start$1(DurationPlayPauseButtonPresenterImpl durationPlayPauseButtonPresenterImpl) {
        super(1, durationPlayPauseButtonPresenterImpl, DurationPlayPauseButtonPresenterImpl.class, "onIsResumedChanged", "onIsResumedChanged(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        DurationPlayPauseButtonPresenterImpl.g((DurationPlayPauseButtonPresenterImpl) this.receiver, bool.booleanValue());
        return f.a;
    }
}
