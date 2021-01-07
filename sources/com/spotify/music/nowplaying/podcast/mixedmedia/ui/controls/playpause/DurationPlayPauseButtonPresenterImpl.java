package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.h;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.rxjava2.q;
import defpackage.zwd;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.Pair;

public final class DurationPlayPauseButtonPresenterImpl implements a, h.a, com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a {
    private final q a = new q();
    private boolean b;
    private String c = "";
    private final d d;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.player.a e;
    private final g<Boolean> f;
    private final y g;
    private final g<String> h;
    private final a1c i;
    private final /* synthetic */ com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a j;

    static final class a<T, R> implements l<Pair<? extends a.C0316a, ? extends a.b>, Float> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Float apply(Pair<? extends a.C0316a, ? extends a.b> pair) {
            Pair<? extends a.C0316a, ? extends a.b> pair2 = pair;
            kotlin.jvm.internal.h.e(pair2, "<name for destructuring parameter 0>");
            return Float.valueOf(((float) ((a.b) pair2.b()).b().a().a()) / ((float) ((a.C0316a) pair2.a()).b().a()));
        }
    }

    public DurationPlayPauseButtonPresenterImpl(d dVar, com.spotify.music.nowplaying.podcast.mixedmedia.player.a aVar, com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a aVar2, g<Boolean> gVar, y yVar, g<String> gVar2, a1c a1c) {
        kotlin.jvm.internal.h.e(dVar, "viewBinder");
        kotlin.jvm.internal.h.e(aVar, "playerHelper");
        kotlin.jvm.internal.h.e(aVar2, "timeLineFlowables");
        kotlin.jvm.internal.h.e(gVar, "isResumedFlowable");
        kotlin.jvm.internal.h.e(yVar, "mainScheduler");
        kotlin.jvm.internal.h.e(gVar2, "trackUriFlowable");
        kotlin.jvm.internal.h.e(a1c, "mainControlLogger");
        this.j = aVar2;
        this.d = dVar;
        this.e = aVar;
        this.f = gVar;
        this.g = yVar;
        this.h = gVar2;
        this.i = a1c;
    }

    public static final void e(DurationPlayPauseButtonPresenterImpl durationPlayPauseButtonPresenterImpl, zwd zwd) {
        durationPlayPauseButtonPresenterImpl.getClass();
        if (zwd instanceof zwd.a) {
            String c2 = ((zwd.a) zwd).c();
            kotlin.jvm.internal.h.d(c2, "result.asFailure().reasons()");
            Logger.n("PlayerCommand error in DurationPlayPauseButtonPresenterImpl: " + c2, new Object[0]);
        }
    }

    public static final void g(DurationPlayPauseButtonPresenterImpl durationPlayPauseButtonPresenterImpl, boolean z) {
        durationPlayPauseButtonPresenterImpl.b = z;
        durationPlayPauseButtonPresenterImpl.d.f(z);
    }

    public static final void h(DurationPlayPauseButtonPresenterImpl durationPlayPauseButtonPresenterImpl, String str) {
        durationPlayPauseButtonPresenterImpl.c = str;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.h.a
    public void a() {
        if (this.b) {
            this.i.b(this.c);
            this.a.a(this.e.a().subscribe(new b(new DurationPlayPauseButtonPresenterImpl$onToggleUpdate$1(this))));
            return;
        }
        this.i.c(this.c);
        this.a.a(this.e.b().subscribe(new b(new DurationPlayPauseButtonPresenterImpl$onToggleUpdate$2(this))));
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<a.C0316a> b() {
        return this.j.b();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<a.b> c(boolean z) {
        return this.j.c(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<Pair<a.C0316a, a.b>> f(boolean z) {
        return this.j.f(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.a
    public void start() {
        this.d.setOnToggleListener(this);
        this.a.a(this.f.subscribe(new b(new DurationPlayPauseButtonPresenterImpl$start$1(this))));
        this.a.a(this.h.subscribe(new b(new DurationPlayPauseButtonPresenterImpl$start$2(this))));
        this.a.a(f(true).O(a.a).Q(this.g).subscribe(new b(new DurationPlayPauseButtonPresenterImpl$start$4(this.d))));
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.a
    public void stop() {
        this.d.setOnToggleListener(null);
        this.a.c();
    }
}
