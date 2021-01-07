package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.j1c;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.k;
import kotlin.jvm.internal.h;

public final class PlaybackPositionFlowableHelperImpl implements a {
    private boolean a;
    private final y1c<j1c.b.C0628b> b;
    private final ValueAnimator c;
    private final io.reactivex.disposables.b d;
    private final g<j1c.b.C0628b> e;
    private final g<Long> f;
    private final i g;

    static final class a<T> implements io.reactivex.functions.g<j1c.a.b.C0627b> {
        final /* synthetic */ PlaybackPositionFlowableHelperImpl a;

        a(PlaybackPositionFlowableHelperImpl playbackPositionFlowableHelperImpl) {
            this.a = playbackPositionFlowableHelperImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(j1c.a.b.C0627b bVar) {
            PlaybackPositionFlowableHelperImpl.b(this.a);
        }
    }

    static final class b<T> implements n<Long> {
        final /* synthetic */ PlaybackPositionFlowableHelperImpl a;

        b(PlaybackPositionFlowableHelperImpl playbackPositionFlowableHelperImpl) {
            this.a = playbackPositionFlowableHelperImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Long l) {
            Long l2 = l;
            h.e(l2, "currentPosition");
            Long d = this.a.g.d();
            return d == null || Math.abs(d.longValue() - l2.longValue()) <= 1000;
        }
    }

    static final class c<T, R> implements l<Long, j1c.b.C0628b> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public j1c.b.C0628b apply(Long l) {
            Long l2 = l;
            h.e(l2, "it");
            return new j1c.b.C0628b((int) l2.longValue(), false, 2);
        }
    }

    static final class d implements io.reactivex.functions.a {
        final /* synthetic */ PlaybackPositionFlowableHelperImpl a;

        d(PlaybackPositionFlowableHelperImpl playbackPositionFlowableHelperImpl) {
            this.a = playbackPositionFlowableHelperImpl;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            io.reactivex.disposables.b bVar = this.a.d;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    public PlaybackPositionFlowableHelperImpl(g<Long> gVar, n1c n1c, i iVar) {
        h.e(gVar, "trackPositionFlowable");
        h.e(n1c, "timeLineDragHelper");
        h.e(iVar, "positionState");
        this.f = gVar;
        this.g = iVar;
        y1c<j1c.b.C0628b> y1c = new y1c<>(false, 1);
        this.b = y1c;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.c = valueAnimator;
        this.d = n1c.b().subscribe(new a(this));
        g<R> F = gVar.C(new b(this)).O(c.a).F(new e(new PlaybackPositionFlowableHelperImpl$flowable$3(this)));
        g<j1c.b.C0628b> a2 = y1c.a();
        if (a2 != null) {
            this.e = g.P(F, a2).w(new d(this)).Z();
            return;
        }
        throw new NullPointerException("other is null");
    }

    public static final void b(PlaybackPositionFlowableHelperImpl playbackPositionFlowableHelperImpl) {
        if (playbackPositionFlowableHelperImpl.c.isRunning()) {
            playbackPositionFlowableHelperImpl.c.cancel();
        }
    }

    public static final g f(PlaybackPositionFlowableHelperImpl playbackPositionFlowableHelperImpl, j1c.b.C0628b bVar) {
        if (playbackPositionFlowableHelperImpl.a) {
            int i = g.b;
            g<Object> gVar = k.c;
            h.d(gVar, "Flowable.empty<PlaybackPosition>()");
            return gVar;
        }
        playbackPositionFlowableHelperImpl.g.i(null);
        int a2 = playbackPositionFlowableHelperImpl.g.b().a();
        if (a2 > 0 && Math.abs(bVar.a() - a2) >= 5000) {
            playbackPositionFlowableHelperImpl.a = true;
            ValueAnimator valueAnimator = playbackPositionFlowableHelperImpl.c;
            valueAnimator.setDuration(15000 == bVar.a() - a2 ? 250 : 500);
            valueAnimator.setIntValues(a2, (int) (valueAnimator.getDuration() + ((long) bVar.a())));
            valueAnimator.addUpdateListener(new b(playbackPositionFlowableHelperImpl, bVar, a2));
            valueAnimator.addListener(new c(playbackPositionFlowableHelperImpl, bVar, a2));
            valueAnimator.start();
            int i2 = g.b;
            g<Object> gVar2 = k.c;
            h.d(gVar2, "with(positionAnimator) {…Position>()\n            }");
            return gVar2;
        }
        g N = g.N(bVar);
        h.d(N, "Flowable.just(newPosition)");
        return N;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.a
    public g<j1c.b.C0628b> a() {
        return this.e;
    }
}
