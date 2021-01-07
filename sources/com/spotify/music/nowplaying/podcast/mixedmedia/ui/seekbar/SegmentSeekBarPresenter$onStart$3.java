package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class SegmentSeekBarPresenter$onStart$3 extends FunctionReferenceImpl implements nmf<Integer, f> {
    SegmentSeekBarPresenter$onStart$3(d dVar) {
        super(1, dVar, d.class, "setDurationString", "setDurationString(I)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Integer num) {
        ((d) this.receiver).setDurationString(num.intValue());
        return f.a;
    }
}
