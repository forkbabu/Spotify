package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class DurationPlayPauseButtonPresenterImpl$start$4 extends FunctionReferenceImpl implements nmf<Float, f> {
    DurationPlayPauseButtonPresenterImpl$start$4(d dVar) {
        super(1, dVar, d.class, "setPosition", "setPosition(F)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Float f) {
        ((d) this.receiver).setPosition(f.floatValue());
        return f.a;
    }
}
