package com.spotify.music.lyrics.core.experience.presenter.controller;

import com.spotify.music.lyrics.core.experience.contract.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class LyricsPlaybackController$onStart$lineTransformerObservable$1$1 extends FunctionReferenceImpl implements nmf<String, Integer> {
    LyricsPlaybackController$onStart$lineTransformerObservable$1$1(b bVar) {
        super(1, bVar, b.class, "calculateLineCount", "calculateLineCount(Ljava/lang/String;)I", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Integer invoke(String str) {
        String str2 = str;
        h.e(str2, "p1");
        return Integer.valueOf(((b) this.receiver).p(str2));
    }
}
