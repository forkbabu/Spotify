package com.spotify.music.newplaying.scroll.widgets.btl;

import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import com.spotify.music.behindthelyrics.presenter.h;
import com.spotify.music.behindthelyrics.presenter.i;
import com.spotify.music.behindthelyrics.presenter.k;
import com.spotify.player.model.ContextTrack;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

public class l {
    private static final bq1<TrackAnnotation> h = new bq1<>(TrackAnnotation.createIntroAnnotation(), 0, 0, false);
    private final g<ContextTrack> a;
    private final jk2 b;
    private final i c;
    private final com.spotify.music.behindthelyrics.presenter.l d;
    private final y e;
    private final sk2 f;
    private b g = EmptyDisposable.INSTANCE;

    public l(g<ContextTrack> gVar, jk2 jk2, i iVar, com.spotify.music.behindthelyrics.presenter.l lVar, y yVar, sk2 sk2) {
        this.a = gVar;
        this.b = jk2;
        this.c = iVar;
        this.d = lVar;
        this.e = yVar;
        this.f = sk2;
    }

    public static zp1 b(l lVar, TrackAnnotationSet trackAnnotationSet) {
        return lVar.d.apply(s.i0(trackAnnotationSet));
    }

    public v a(k kVar, ContextTrack contextTrack) {
        return this.b.a(contextTrack).N(kVar).j0(new e(this)).W(f.a, false, Integer.MAX_VALUE).p0(o.a).G0((R) h);
    }

    public void c(bl2 bl2) {
        bl2.getClass();
        h a2 = this.c.a(bl2);
        i iVar = this.c;
        sk2 sk2 = this.f;
        iVar.getClass();
        this.g = new io.reactivex.internal.operators.observable.v(this.a.u(a.a)).J0(new d(this, new k(bl2, sk2))).o0(this.e).J(new b(a2)).subscribe(new g(a2), new h(a2));
    }

    public void d() {
        this.g.dispose();
    }
}
