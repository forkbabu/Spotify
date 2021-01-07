package com.spotify.music.lyrics.core.experience.presenter.controller;

import com.spotify.music.lyrics.core.experience.contract.b;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class LyricsPlaybackController$observeUpdates$2 extends FunctionReferenceImpl implements nmf<Integer, f> {
    LyricsPlaybackController$observeUpdates$2(b bVar) {
        super(1, bVar, b.class, "autoScroll", "autoScroll(I)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Integer num) {
        ((b) this.receiver).m(num.intValue());
        return f.a;
    }
}
