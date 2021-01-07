package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network.f;
import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.y;

public final class h {
    private final p a = new p();
    private j b;
    private final y c;
    private final y d;
    private final f e;
    private final g<ContextTrack> f;

    public h(y yVar, y yVar2, f fVar, g<ContextTrack> gVar) {
        kotlin.jvm.internal.h.e(yVar, "mainScheduler");
        kotlin.jvm.internal.h.e(yVar2, "ioScheduler");
        kotlin.jvm.internal.h.e(fVar, "moreForYouRequestsRunner");
        kotlin.jvm.internal.h.e(gVar, "playerTrackFlowable");
        this.c = yVar;
        this.d = yVar2;
        this.e = fVar;
        this.f = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.d] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.e] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.view.PodcastMoreForYouWidgetView r4) {
        /*
            r3 = this;
            java.lang.String r0 = "binder"
            kotlin.jvm.internal.h.e(r4, r0)
            r3.b = r4
            com.spotify.rxjava2.p r4 = r3.a
            io.reactivex.g<com.spotify.player.model.ContextTrack> r0 = r3.f
            com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.PodcastMoreForYouWidgetPresenter$subscribePlayerTrack$1 r1 = com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.PodcastMoreForYouWidgetPresenter$subscribePlayerTrack$1.a
            if (r1 == 0) goto L_0x0015
            com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.e r2 = new com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.e
            r2.<init>(r1)
            r1 = r2
        L_0x0015:
            io.reactivex.functions.n r1 = (io.reactivex.functions.n) r1
            io.reactivex.g r0 = r0.C(r1)
            com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.PodcastMoreForYouWidgetPresenter$subscribePlayerTrack$2 r1 = com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.PodcastMoreForYouWidgetPresenter$subscribePlayerTrack$2.a
            if (r1 == 0) goto L_0x0025
            com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.d r2 = new com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.d
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.g r0 = r0.O(r1)
            io.reactivex.g r0 = r0.s()
            com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.f r1 = new com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.f
            r1.<init>(r3)
            io.reactivex.g r0 = r0.F(r1)
            io.reactivex.y r1 = r3.d
            io.reactivex.g r0 = r0.e0(r1)
            io.reactivex.y r1 = r3.c
            io.reactivex.g r0 = r0.Q(r1)
            com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.g r1 = new com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.g
            r1.<init>(r3)
            io.reactivex.disposables.b r0 = r0.subscribe(r1)
            r4.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.h.c(com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.view.PodcastMoreForYouWidgetView):void");
    }

    public final void d() {
        this.a.a();
    }
}
