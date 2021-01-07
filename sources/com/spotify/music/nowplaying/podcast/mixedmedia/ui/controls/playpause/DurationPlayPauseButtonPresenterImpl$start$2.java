package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DurationPlayPauseButtonPresenterImpl$start$2 extends FunctionReferenceImpl implements nmf<String, f> {
    DurationPlayPauseButtonPresenterImpl$start$2(DurationPlayPauseButtonPresenterImpl durationPlayPauseButtonPresenterImpl) {
        super(1, durationPlayPauseButtonPresenterImpl, DurationPlayPauseButtonPresenterImpl.class, "onTrackUriChanged", "onTrackUriChanged(Ljava/lang/String;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(String str) {
        String str2 = str;
        h.e(str2, "p1");
        DurationPlayPauseButtonPresenterImpl.h((DurationPlayPauseButtonPresenterImpl) this.receiver, str2);
        return f.a;
    }
}
