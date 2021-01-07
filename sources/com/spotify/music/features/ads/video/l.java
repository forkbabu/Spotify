package com.spotify.music.features.ads.video;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exo.f;
import com.spotify.mobile.android.video.f0;
import com.spotify.mobile.android.video.tracking.BufferEvent;
import com.spotify.mobile.android.video.tracking.i;
import com.spotify.mobile.android.video.tracking.k;
import com.spotify.mobile.android.video.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class l extends i {
    private final dv3 O;
    private final p P;
    private final d0 Q;
    private final Map<String, String> R = Q();
    private final xr3 S;
    private o T;
    private boolean U;
    private boolean V;
    private boolean W;
    private final f0 X;

    public l(d0 d0Var, f0 f0Var, cqe cqe, dv3 dv3, xr3 xr3, p pVar) {
        super(d0Var, cqe);
        dv3.getClass();
        this.O = dv3;
        this.P = pVar;
        this.Q = d0Var;
        this.X = f0Var;
        this.S = xr3;
    }

    private Map<String, String> R() {
        long j;
        long j2;
        long j3;
        Long l;
        long j4 = 0;
        long j5 = 0L;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        for (BufferEvent bufferEvent : C()) {
            Long or = bufferEvent.a().or((Optional<Long>) 0L);
            int ordinal = bufferEvent.b().ordinal();
            if (ordinal == 0) {
                j9 = or.longValue();
            } else if (ordinal == 2) {
                j6 += or.longValue();
                j7 = Math.max(j7, or.longValue());
                j8++;
            }
        }
        Iterator it = ((ArrayList) P(F().isPresent() ? F().get().longValue() + 30000 : Long.MAX_VALUE)).iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += ((com.spotify.mobile.android.video.tracking.l) it.next()).b();
        }
        for (k<j0> kVar : N()) {
            if (kVar.a().isPresent()) {
                j3 = j8;
                double a = (double) kVar.a().get().a();
                j2 = j7;
                double longValue = (double) kVar.b().or((Optional<Long>) j5).longValue();
                l = j5;
                j = j6;
                double d = (double) j10;
                Double.isNaN(longValue);
                Double.isNaN(d);
                Double.isNaN(a);
                j4 += (long) ((longValue / d) * a);
            } else {
                l = j5;
                j = j6;
                j2 = j7;
                j3 = j8;
            }
            j5 = l;
            j8 = j3;
            j7 = j2;
            j6 = j;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ms_latency", String.valueOf(L()));
        hashMap.put("ms_initial_buffering", String.valueOf(j9));
        hashMap.put("ms_stalled", String.valueOf(j6));
        hashMap.put("max_ms_stalled", String.valueOf(j7));
        hashMap.put("n_stalls", String.valueOf(j8));
        hashMap.put("ms_played", String.valueOf(j10));
        hashMap.put("time_weighted_bitrate", String.valueOf(j4));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final Map<String, String> Q() {
        HashMap hashMap = new HashMap(1);
        hashMap.put(PlayerTrack.Metadata.IS_ACTIVE_PLAY_INTERRUPTION, this.Q.c().get(PlayerTrack.Metadata.IS_ACTIVE_PLAY_INTERRUPTION));
        return hashMap;
    }

    public /* synthetic */ void S(long j) {
        o oVar = this.T;
        if (oVar != null) {
            oVar.h(j);
        }
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void e(long j, long j2) {
        super.e(j, j2);
        if (!this.W) {
            this.W = true;
            this.T.e(j);
            double d = (double) j;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            ((f) this.X).a(new long[]{0, 10, (long) (0.25d * d), (long) (0.5d * d), (long) (0.75d * d), (long) (d * 0.95d)}, new c(this));
        }
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void l(BetamaxException betamaxException, long j, long j2) {
        this.T.f(R(), j);
        this.T.l();
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void m(boolean z, long j) {
        super.m(z, j);
        Logger.b("onPlaybackCreated with track %s", z42.t(this.Q));
        o a = this.P.a(PlayerTrackUtil.getAdId(this.Q.c()), Q(), this.S.a(), this.O);
        this.T = a;
        a.k();
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void o(BetamaxException betamaxException, long j, long j2) {
        this.T.f(R(), j);
        this.T.l();
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
        super.p(vVar, reasonEnd, j, j2);
        if (!this.U || reasonEnd != ReasonEnd.PLAYED_TO_END) {
            this.T.f(R(), j);
        } else {
            o oVar = this.T;
            R();
            oVar.d(j);
        }
        this.T.l();
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void q(StreamingType streamingType, long j, long j2) {
        super.q(streamingType, j, j2);
        Logger.b("onReady", new Object[0]);
        this.T.getClass();
        this.T.g(true, j);
        this.U = true;
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void u(Optional<VideoSurfaceView> optional, long j, long j2) {
        super.u(optional, j, j2);
        boolean z = optional.isPresent() && optional.get().e();
        if (optional.isPresent() && this.V != z) {
            this.O.c(z ? "expanded" : "collapsed", PlayerTrackUtil.getAdId(this.Q.c()), String.valueOf(PlayerTrackUtil.getDuration(this.Q.c()) / 1000), j, this.R);
            this.V = z;
        }
    }

    @Override // com.spotify.mobile.android.video.tracking.i, com.spotify.mobile.android.video.events.e0
    public void x(long j, long j2) {
        super.x(j, j2);
        Logger.b("onPause", new Object[0]);
        this.T.getClass();
        this.T.g(false, j);
    }
}
