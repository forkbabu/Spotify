package com.spotify.music.behindthelyrics.presenter;

import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import com.spotify.music.behindthelyrics.model.business.b;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;

public class l implements io.reactivex.functions.l<s<TrackAnnotationSet>, zp1<TrackAnnotation>> {
    private final s<PlayerState> a;
    private final cqe b;
    private final y c;

    public l(g<PlayerState> gVar, cqe cqe, y yVar) {
        gVar.getClass();
        this.a = new v(gVar);
        this.b = cqe;
        this.c = yVar;
    }

    /* renamed from: a */
    public zp1<TrackAnnotation> apply(s<TrackAnnotationSet> sVar) {
        return new zp1<>(sVar.j0(new a(this)), this.a.Q(new d(this)).j0(new b(this)).E().N(c.a), new aq1(), new yp1(this.c));
    }

    public /* synthetic */ boolean b(PlayerState playerState) {
        return playerState.position(this.b.d()).isPresent();
    }

    public /* synthetic */ cq1 c(PlayerState playerState) {
        return b.f(playerState, this.b);
    }
}
