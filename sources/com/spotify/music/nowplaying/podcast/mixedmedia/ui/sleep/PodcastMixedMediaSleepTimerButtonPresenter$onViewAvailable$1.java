package com.spotify.music.nowplaying.podcast.mixedmedia.ui.sleep;

import com.spotify.music.nowplaying.podcast.sleeptimer.g;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class PodcastMixedMediaSleepTimerButtonPresenter$onViewAvailable$1 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    PodcastMixedMediaSleepTimerButtonPresenter$onViewAvailable$1(g gVar) {
        super(1, gVar, g.class, "setActive", "setActive(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        ((g) this.receiver).setActive(bool.booleanValue());
        return f.a;
    }
}
