package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position;

import defpackage.j1c;
import io.reactivex.g;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PlaybackPositionFlowableHelperImpl$flowable$3 extends FunctionReferenceImpl implements nmf<j1c.b.C0628b, g<j1c.b.C0628b>> {
    PlaybackPositionFlowableHelperImpl$flowable$3(PlaybackPositionFlowableHelperImpl playbackPositionFlowableHelperImpl) {
        super(1, playbackPositionFlowableHelperImpl, PlaybackPositionFlowableHelperImpl.class, "interpolate", "interpolate(Lcom/spotify/music/nowplaying/podcast/mixedmedia/ui/seekbar/timeline/helpers/Dimension$Time$PlaybackPosition;)Lio/reactivex/Flowable;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public g<j1c.b.C0628b> invoke(j1c.b.C0628b bVar) {
        j1c.b.C0628b bVar2 = bVar;
        h.e(bVar2, "p1");
        return PlaybackPositionFlowableHelperImpl.f((PlaybackPositionFlowableHelperImpl) this.receiver, bVar2);
    }
}
