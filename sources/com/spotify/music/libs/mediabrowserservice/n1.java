package com.spotify.music.libs.mediabrowserservice;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.mediabrowserservice.p1;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.s;
import io.reactivex.y;

public class n1 {
    private final Context a;
    private final MediaUriUtil b;
    private final y c;
    private final g<PlayerState> d;
    private final g<SessionState> e;
    private final mk1 f;
    private final cqe g;
    private v1 h;
    private final g<Boolean> i;
    private final w j;
    private final qja k;
    private final nja l;

    public n1(Context context, cqe cqe, MediaUriUtil mediaUriUtil, y yVar, g<PlayerState> gVar, g<SessionState> gVar2, mk1 mk1, g<Boolean> gVar3, w wVar, qja qja, nja nja) {
        context.getClass();
        this.a = context;
        this.g = cqe;
        this.b = mediaUriUtil;
        this.c = yVar;
        this.d = gVar;
        this.e = gVar2;
        this.f = mk1;
        this.i = gVar3;
        this.j = wVar;
        this.k = qja;
        this.l = nja;
    }

    public boolean a() {
        return this.h != null;
    }

    public /* synthetic */ Optional b(PlayerState playerState, ImmutableMap immutableMap, pja pja) {
        return Optional.of(this.l.b(playerState, immutableMap, Optional.of(pja)));
    }

    public p1 c(boolean z, PlayerState playerState, PlayerQueue playerQueue, Boolean bool, Integer num, lk1 lk1, Boolean bool2, Boolean bool3) {
        cqe cqe = this.g;
        MediaUriUtil mediaUriUtil = this.b;
        boolean booleanValue = bool.booleanValue();
        int intValue = num.intValue();
        boolean booleanValue2 = bool2.booleanValue();
        boolean booleanValue3 = bool3.booleanValue();
        if (playerState.track().isPresent() || playerState.isPlaying()) {
            Logger.g("Playable state", new Object[0]);
            return new p1.d(mediaUriUtil, cqe, playerState, playerQueue, booleanValue, intValue, lk1, z, booleanValue2, booleanValue3);
        }
        Logger.g("Empty state, track = %s, isPlaying = %b, isPaused = %b", playerState.track(), Boolean.valueOf(playerState.isPlaying()), Boolean.valueOf(playerState.isPaused()));
        return new p1.a(z, booleanValue2);
    }

    public tpf d(PlayerState playerState) {
        Optional<ContextTrack> track = playerState.track();
        if (!track.isPresent()) {
            return g.N(Optional.absent());
        }
        ImmutableMap<String, String> metadata = track.get().metadata();
        if (!l0.b(playerState.contextUri(), LinkType.SHOW_SHOW)) {
            return g.N(Optional.of(this.l.b(playerState, metadata, Optional.absent())));
        }
        return this.k.a(playerState.contextUri()).N().O(new i(this, playerState, metadata));
    }

    public tpf e(v1 v1Var, SessionState sessionState) {
        if (!sessionState.loggedIn() || sessionState.loggingOut()) {
            return g.N(new p1.c(this.a));
        }
        g<PlayerState> gVar = this.d;
        g<PlayerQueue> b2 = v1Var.C0().b();
        s<Boolean> j2 = v1Var.A3().j();
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.BUFFER;
        g<Boolean> Y0 = j2.Y0(backpressureStrategy);
        g<Integer> Y02 = v1Var.Z2().a().Y0(backpressureStrategy);
        s<lk1> a2 = this.f.a();
        BackpressureStrategy backpressureStrategy2 = BackpressureStrategy.LATEST;
        g<lk1> Y03 = a2.Y0(backpressureStrategy2);
        g<Boolean> gVar2 = this.i;
        g<R> Y04 = this.j.a("offline").j0(j.a).E().Y0(backpressureStrategy2);
        k kVar = new k(this, !sessionState.canConnect());
        if (gVar == null) {
            throw new NullPointerException("source1 is null");
        } else if (b2 == null) {
            throw new NullPointerException("source2 is null");
        } else if (gVar2 != null) {
            return new FlowableOnBackpressureBufferStrategy(g.h(Functions.l(kVar), gVar, b2, Y0, Y02, Y03, gVar2, Y04), 10, e.a, BackpressureOverflowStrategy.DROP_OLDEST);
        } else {
            throw new NullPointerException("source6 is null");
        }
    }

    public /* synthetic */ void f() {
        this.h = null;
    }

    public g<Optional<mja>> g() {
        return this.d.F(new h(this)).s().Q(this.c);
    }

    public g<p1> h(v1 v1Var) {
        this.h = v1Var;
        return this.e.f0(new g(this, v1Var)).Q(this.c).v(new f(this));
    }
}
