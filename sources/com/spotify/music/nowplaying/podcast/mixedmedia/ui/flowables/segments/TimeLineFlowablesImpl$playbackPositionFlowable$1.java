package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import defpackage.j1c;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class TimeLineFlowablesImpl$playbackPositionFlowable$1 extends Lambda implements nmf<Pair<? extends List<? extends f>, ? extends j1c.b.C0628b>, Optional<a.b>> {
    final /* synthetic */ f $positionMapper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TimeLineFlowablesImpl$playbackPositionFlowable$1(f fVar) {
        super(1);
        this.$positionMapper = fVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Optional<a.b> invoke(Pair<? extends List<? extends f>, ? extends j1c.b.C0628b> pair) {
        Pair<? extends List<? extends f>, ? extends j1c.b.C0628b> pair2 = pair;
        List<f> list = (List) pair2.a();
        f fVar = this.$positionMapper;
        h.d(list, "timeLineSegments");
        return fVar.b(list, (j1c.b.C0628b) pair2.b());
    }
}
