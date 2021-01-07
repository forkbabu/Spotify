package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar;

import com.spotify.music.nowplaying.podcast.mixedmedia.model.b;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ControlBarPresenter$onDirectionalButtonClick$1 extends Lambda implements cmf<Integer> {
    final /* synthetic */ f $adjacentSegment;
    final /* synthetic */ boolean $isAdjacentSegmentTalk;
    final /* synthetic */ int $skipDurationInMs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ControlBarPresenter$onDirectionalButtonClick$1(boolean z, f fVar, int i) {
        super(0);
        this.$isAdjacentSegmentTalk = z;
        this.$adjacentSegment = fVar;
        this.$skipDurationInMs = i;
    }

    public final int a() {
        if (this.$isAdjacentSegmentTalk) {
            f fVar = this.$adjacentSegment;
            h.c(fVar);
            b b = fVar.b();
            return (int) Math.max(b.k() + ((long) this.$skipDurationInMs), b.j());
        }
        f fVar2 = this.$adjacentSegment;
        h.c(fVar2);
        return fVar2.d().a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public /* bridge */ /* synthetic */ Integer invoke() {
        return Integer.valueOf(a());
    }
}
