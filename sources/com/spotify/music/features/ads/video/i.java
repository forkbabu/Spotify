package com.spotify.music.features.ads.video;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.i0;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.events.y;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exo.f;
import com.spotify.mobile.android.video.f0;
import com.spotify.mobile.android.video.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class i implements e0 {
    private final dv3 a;
    private final Map<String, String> b = g();
    private final xr3 c;
    private final p f;
    private final d0 n;
    private o o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final f0 s;

    public i(dv3 dv3, d0 d0Var, f0 f0Var, xr3 xr3, p pVar) {
        dv3.getClass();
        this.a = dv3;
        this.n = d0Var;
        this.s = f0Var;
        this.f = pVar;
        this.c = xr3;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void a(long j) {
        com.spotify.mobile.android.video.events.d0.l(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void b(j0 j0Var, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.x(this, j0Var, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void c(long j) {
        Logger.b("onResume", new Object[0]);
        this.o.getClass();
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void d(boolean z, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.b(this, z, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void e(long j, long j2) {
        if (!this.r) {
            this.r = true;
            this.o.e(j);
            double d = (double) j;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            ((f) this.s).a(new long[]{0, 10, (long) (0.25d * d), (long) (0.5d * d), (long) (0.75d * d), (long) (d * 0.95d)}, new b(this));
        }
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void f(long j, long j2, long j3) {
        com.spotify.mobile.android.video.events.d0.u(this, j, j2, j3);
    }

    /* access modifiers changed from: protected */
    public final Map<String, String> g() {
        HashMap hashMap = new HashMap(1);
        hashMap.put(PlayerTrack.Metadata.IS_ACTIVE_PLAY_INTERRUPTION, this.n.c().get(PlayerTrack.Metadata.IS_ACTIVE_PLAY_INTERRUPTION));
        return hashMap;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void h(i0 i0Var, long j) {
        com.spotify.mobile.android.video.events.d0.t(this, i0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void i(EncryptionType encryptionType, long j) {
        com.spotify.mobile.android.video.events.d0.g(this, encryptionType, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void j(long j, long j2, long j3, long j4) {
        com.spotify.mobile.android.video.events.d0.d(this, j, j2, j3, j4);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void k(List list, long j) {
        com.spotify.mobile.android.video.events.d0.k(this, list, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void l(BetamaxException betamaxException, long j, long j2) {
        this.o.getClass();
        this.o.f(Collections.emptyMap(), j);
        this.o.l();
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void m(boolean z, long j) {
        Logger.b("onPlaybackCreated with track %s", z42.t(this.n));
        o a2 = this.f.a(PlayerTrackUtil.getAdId(this.n.c()), g(), this.c.a(), this.a);
        this.o = a2;
        a2.k();
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void n(d0 d0Var, long j) {
        com.spotify.mobile.android.video.events.d0.i(this, d0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void o(BetamaxException betamaxException, long j, long j2) {
        this.o.getClass();
        this.o.f(Collections.emptyMap(), j);
        this.o.l();
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
        Logger.b("onPlaybackEnded() %s", reasonEnd);
        this.o.getClass();
        if (!this.p || reasonEnd != ReasonEnd.PLAYED_TO_END) {
            this.o.f(Collections.emptyMap(), j);
        } else {
            o oVar = this.o;
            Collections.emptyMap();
            oVar.d(j);
        }
        this.o.l();
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void q(StreamingType streamingType, long j, long j2) {
        Logger.b("onReady", new Object[0]);
        this.o.getClass();
        this.o.g(true, j);
        this.p = true;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void r(long j) {
        com.spotify.mobile.android.video.events.d0.h(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void s(float f2, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.p(this, f2, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void t(Optional optional, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.v(this, optional, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void u(Optional<VideoSurfaceView> optional, long j, long j2) {
        boolean z = optional.isPresent() && optional.get().e();
        if (optional.isPresent() && this.q != z) {
            this.a.c(z ? "expanded" : "collapsed", PlayerTrackUtil.getAdId(this.n.c()), String.valueOf(PlayerTrackUtil.getDuration(this.n.c()) / 1000), j, this.b);
            this.q = z;
        }
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void v(y yVar, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.a(this, yVar, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void w(long j, long j2) {
        com.spotify.mobile.android.video.events.d0.c(this, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void x(long j, long j2) {
        Logger.b("onPause", new Object[0]);
        this.o.getClass();
        this.o.g(false, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void y(int i, long j) {
        com.spotify.mobile.android.video.events.d0.e(this, i, j);
    }

    public /* synthetic */ void z(long j) {
        o oVar = this.o;
        if (oVar != null) {
            oVar.h(j);
        }
    }
}
