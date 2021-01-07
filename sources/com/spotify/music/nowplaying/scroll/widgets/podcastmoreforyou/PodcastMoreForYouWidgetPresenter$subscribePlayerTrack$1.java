package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PodcastMoreForYouWidgetPresenter$subscribePlayerTrack$1 extends FunctionReferenceImpl implements nmf<ContextTrack, Boolean> {
    public static final PodcastMoreForYouWidgetPresenter$subscribePlayerTrack$1 a = new PodcastMoreForYouWidgetPresenter$subscribePlayerTrack$1();

    PodcastMoreForYouWidgetPresenter$subscribePlayerTrack$1() {
        super(1, kxd.class, "isPodcast", "isPodcast(Lcom/spotify/player/model/ContextTrack;)Z", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(ContextTrack contextTrack) {
        ContextTrack contextTrack2 = contextTrack;
        h.e(contextTrack2, "p1");
        return Boolean.valueOf(kxd.i(contextTrack2));
    }
}
