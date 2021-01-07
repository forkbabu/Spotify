package com.spotify.mobile.android.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.v0;
import com.google.android.video.exo.NetworkAccessWhileInOfflineModeException;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.c0;
import com.spotify.mobile.android.video.events.i0;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exception.ErrorType;
import com.spotify.mobile.android.video.exception.ManifestLoadException;
import com.spotify.mobile.android.video.exception.PlaybackException;
import com.spotify.mobile.android.video.exception.UnplayablePlaybackException;
import com.spotify.mobile.android.video.exo.InvalidResponseCodeException;
import com.spotify.mobile.android.video.exo.ManifestResponseException;
import com.spotify.mobile.android.video.exo.b;
import com.spotify.mobile.android.video.exo.e;
import com.spotify.mobile.android.video.exo.i;
import com.spotify.mobile.android.video.exo.u;
import com.spotify.mobile.android.video.l0;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.mobile.android.video.v;
import defpackage.aq;
import defpackage.cq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import okhttp3.y;

public class t extends b implements r, l0.c, e72, h0, r72 {
    private static final Set<Integer> F;
    private g0 A;
    private int B = 1;
    private boolean C;
    private boolean D;
    private w E;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final c0 b;
    private final q72 c;
    private final boolean f;
    private final u n;
    private final com.spotify.mobile.android.video.sync.b o;
    private final String p;
    private final BetamaxOfflineManager q;
    private u0 r;
    private c0 s;
    private l0 t;
    private VideoSurfaceView u;
    private int v;
    private int w;
    private boolean x;
    private List<i0> y = Collections.emptyList();
    private Optional<i0> z = Optional.absent();

    static {
        HashSet hashSet = new HashSet();
        F = hashSet;
        hashSet.add(2);
        hashSet.add(3);
    }

    t(Context context, y yVar, c0 c0Var, l0 l0Var, String str, boolean z2, u uVar, com.spotify.mobile.android.video.sync.b bVar, List<c72> list, q72 q72, g0 g0Var, BetamaxOfflineManager betamaxOfflineManager) {
        e eVar = new e();
        i iVar = new i();
        w wVar = new w();
        this.t = l0Var;
        this.b = c0Var;
        this.s = new c0();
        this.p = str;
        this.f = z2;
        this.n = uVar;
        this.o = null;
        this.c = q72;
        this.A = g0Var;
        this.q = betamaxOfflineManager;
        cq cqVar = new cq(cq.d.L, new aq.d());
        this.E = wVar;
        u0 e = wVar.e(context, eVar, new u(context, null, 1, this), iVar, cqVar, yVar, uVar, list, betamaxOfflineManager, this, this);
        this.r = e;
        e.Y(this);
        this.t.f(this);
        this.r.o(this);
    }

    private void c0(boolean z2) {
        this.E.s(z2);
        c0 c0Var = this.s;
        boolean z3 = (c0Var == null || c0Var.a() == null || !this.s.a().e()) ? false : true;
        if (z2 && !z3) {
            pause();
        }
    }

    private void d0(VideoSurfaceView videoSurfaceView) {
        videoSurfaceView.l(this.w, this.v);
        this.r.U(this.u);
        this.r.J(videoSurfaceView);
        Surface surface = videoSurfaceView.getSurface();
        if (surface == null || !surface.isValid()) {
            surface = null;
        }
        this.E.r(surface);
        this.b.z(Optional.fromNullable(this.s.a()), Optional.fromNullable(videoSurfaceView), this.E.b());
    }

    private void e0(ReasonEnd reasonEnd) {
        this.c.b(this);
        this.r.n(false);
        this.B = 1;
        this.E.q(true);
        this.y = Collections.emptyList();
        c0 c0Var = this.b;
        Optional<d0> fromNullable = Optional.fromNullable(this.s.a());
        long b2 = this.E.b();
        c0Var.getClass();
        c0Var.r(fromNullable, reasonEnd, v.e(), b2);
        this.s.d();
        c0 c0Var2 = this.s;
        this.E.b();
        c0Var2.getClass();
        com.spotify.mobile.android.video.sync.b bVar = this.o;
        if (bVar != null) {
            bVar.a();
        }
        if (this.u != null) {
            if (this.A.b()) {
                w0(this.u, false);
            }
            t0(new g(this));
            this.E.r(null);
        }
        this.r.U(this.u);
        this.u = null;
    }

    private boolean f0() {
        return this.E != null;
    }

    private boolean g0() {
        return this.r.M() && F.contains(Integer.valueOf(this.r.O()));
    }

    private boolean h0() {
        return this.c.a() || this.D;
    }

    private void p0() {
        Optional<i0> optional;
        if (f0()) {
            Optional<i0> optional2 = this.z;
            List<i0> list = this.y;
            if (optional2.isPresent()) {
                i0 i0Var = optional2.get();
                ArrayList arrayList = new ArrayList();
                for (T t2 : list) {
                    if (i0Var.a().equals(t2.a())) {
                        arrayList.add(t2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i0 i0Var2 = (i0) it.next();
                            if (i0Var.equals(i0Var2)) {
                                optional = Optional.of(i0Var2);
                                break;
                            }
                        } else {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    i0 i0Var3 = (i0) it2.next();
                                    if (i0Var.c().equals(i0Var3.c())) {
                                        optional = Optional.of(i0Var3);
                                        break;
                                    }
                                } else {
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            optional = Optional.of(arrayList.get(0));
                                            break;
                                        }
                                        i0 i0Var4 = (i0) it3.next();
                                        if (i0Var.d() == i0Var4.d()) {
                                            optional = Optional.of(i0Var4);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    optional = Optional.absent();
                }
            } else {
                optional = Optional.absent();
            }
            this.E.q(((String) optional.transform(b.a).or((Optional) "")).isEmpty());
            this.E.n(optional);
            this.b.y(Optional.fromNullable(this.s.a()), this.E.b(), optional);
        }
    }

    private void q0(BetamaxException betamaxException) {
        Logger.e(betamaxException, "Fatal error", new Object[0]);
        this.b.m(Optional.fromNullable(this.s.a()), betamaxException, this.E.b());
        this.E.g();
        e0(ReasonEnd.FATAL_ERROR);
    }

    private void s0(boolean z2) {
        if (this.A.b()) {
            for (VideoSurfaceView videoSurfaceView : this.t.h()) {
                w0(videoSurfaceView, z2);
            }
        }
    }

    private void t0(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.a.post(runnable);
        }
    }

    private synchronized void u0(boolean z2) {
        if (this.s.a() != null) {
            VideoSurfaceView g = this.t.g(this.s.a());
            VideoSurfaceView videoSurfaceView = this.u;
            if (videoSurfaceView != null || g != null) {
                boolean z3 = false;
                if (!(videoSurfaceView == g || videoSurfaceView == null)) {
                    if (this.A.b()) {
                        w0(this.u, false);
                    }
                    t0(new f(this));
                }
                if (g == null) {
                    this.r.U(this.u);
                    this.E.r(null);
                } else {
                    this.r.U(this.u);
                    this.r.J(g);
                    g.l(this.w, this.v);
                    if (this.u != g || z2) {
                        this.s.getClass();
                        g.h(null);
                        if (this.r.O() == 2) {
                            z3 = true;
                        }
                        g.setIsBuffering(z3);
                        d0(g);
                    }
                }
                this.u = g;
                s0(g0());
            }
        }
    }

    private void v0(boolean z2) {
        if (f0()) {
            this.b.e(Optional.fromNullable(this.s.a()), z2, this.E.b());
            c0(h0());
        }
    }

    private void w0(VideoSurfaceView videoSurfaceView, boolean z2) {
        if (videoSurfaceView != null && videoSurfaceView.getKeepScreenOn() != z2) {
            t0(new e(videoSurfaceView, z2));
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void A(boolean z2) {
        this.D = z2;
        if (f0()) {
            c0(z2);
        }
    }

    @Override // com.spotify.mobile.android.video.l0.c
    public void B(VideoSurfaceView videoSurfaceView) {
        o0();
    }

    @Override // com.spotify.mobile.android.video.r
    public void D(VideoSurfaceView videoSurfaceView) {
        if (f0()) {
            this.t.k(videoSurfaceView);
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void E(float f2) {
        if (f0()) {
            this.E.m(f2);
            this.b.s(Optional.fromNullable(this.s.a()), this.E.b(), f2);
        }
    }

    @Override // com.spotify.mobile.android.video.l0.c
    public void J(VideoSurfaceView videoSurfaceView) {
        o0();
    }

    @Override // com.spotify.mobile.android.video.r
    public void K(e0 e0Var) {
        t(e0Var, a0.a().b());
    }

    @Override // com.spotify.mobile.android.video.r
    public void L(VideoSurfaceView videoSurfaceView) {
        if (f0()) {
            this.t.e(videoSurfaceView);
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public void M(int i) {
        if (this.E.d() && i == 0) {
            c0 c0Var = this.b;
            Optional<d0> fromNullable = Optional.fromNullable(this.s.a());
            long j = -1;
            if (!this.E.f()) {
                long e = this.r.e();
                if (e != -9223372036854775807L) {
                    j = e;
                }
            }
            c0Var.x(fromNullable, j, 0);
        }
    }

    @Override // com.google.android.exoplayer2.m0.a
    public void O(ExoPlaybackException exoPlaybackException) {
        ErrorType errorType = ErrorType.ERROR_UNKNOWN;
        if (f0()) {
            boolean z2 = false;
            Logger.e(exoPlaybackException, "Video playback error", new Object[0]);
            Throwable cause = exoPlaybackException.getCause();
            if ((cause instanceof HttpDataSource.HttpDataSourceException) && !(cause.getCause() instanceof InvalidResponseCodeException)) {
                z2 = true;
            }
            if (z2) {
                this.b.u(Optional.fromNullable(this.s.a()), cause.getCause() instanceof NetworkAccessWhileInOfflineModeException ? new PlaybackException("Error during playback", ErrorType.ERROR_IN_OFFLINE_MODE, exoPlaybackException) : new PlaybackException("Error during playback", errorType, exoPlaybackException), this.E.b());
                pause();
                return;
            }
            q0(new PlaybackException("Error during playback", errorType, exoPlaybackException));
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void P(boolean z2) {
        if (f0()) {
            this.E.p(z2);
        }
    }

    @Override // com.google.android.exoplayer2.video.s
    public void Q(int i, long j) {
        if (f0()) {
            this.b.j(Optional.fromNullable(this.s.a()), i);
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x002a: APUT  (r1v0 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r6v0 java.lang.String) */
    @Override // com.google.android.exoplayer2.m0.a
    public void R(boolean z2, int i) {
        StreamingType streamingType;
        if (f0()) {
            Object[] objArr = new Object[2];
            boolean z3 = false;
            objArr[0] = Boolean.valueOf(z2);
            objArr[1] = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Ended" : "Ready" : "Buffering" : "Idle";
            Logger.b("BetamaxPlayer onPlayerStateChanged, playWhenReady: %b, playbackState: %s", objArr);
            s0(g0());
            if (i == 1) {
                c0 c0Var = this.s;
                this.E.b();
                c0Var.getClass();
            } else if (i == 2) {
                this.b.f(Optional.fromNullable(this.s.a()), this.E.b());
                if (this.u != null) {
                    if (this.x) {
                        t0(new d(this));
                    } else {
                        t0(new c(this));
                    }
                }
            } else if (i == 3) {
                this.x = false;
                int i2 = this.B;
                if (i2 == 2 || i2 == 1) {
                    if (!this.C) {
                        this.C = true;
                        this.b.s(Optional.fromNullable(this.s.a()), this.E.b(), this.r.N().a);
                    }
                    c0 c0Var2 = this.b;
                    Optional<d0> fromNullable = Optional.fromNullable(this.s.a());
                    d0 a2 = this.s.a();
                    String b2 = a2.b();
                    if (a2.b().startsWith("file:")) {
                        streamingType = StreamingType.LOCAL;
                    } else if (this.E.f()) {
                        streamingType = StreamingType.LIVE;
                    } else {
                        BetamaxOfflineManager betamaxOfflineManager = this.q;
                        if (betamaxOfflineManager == null || !betamaxOfflineManager.f(b2)) {
                            u uVar = this.n;
                            if (uVar != null && (uVar instanceof q) && ((q) uVar).c(b2)) {
                                z3 = true;
                            }
                            if (z3) {
                                streamingType = StreamingType.CACHE;
                            } else {
                                streamingType = StreamingType.ON_DEMAND;
                            }
                        } else {
                            streamingType = StreamingType.OFFLINE;
                        }
                    }
                    c0Var2.t(fromNullable, streamingType, this.E.b());
                }
            } else if (i == 4) {
                e0(ReasonEnd.PLAYED_TO_END);
            }
            if ((!z2 || i != 2) && this.u != null) {
                t0(new h(this));
            }
            this.B = i;
        }
    }

    @Override // defpackage.r72
    public void S() {
        v0(false);
    }

    @Override // com.google.android.exoplayer2.m0.a
    public void T(v0 v0Var, Object obj, int i) {
        if (f0()) {
            long e = this.r.e();
            if (e != -9223372036854775807L) {
                if (!this.E.f()) {
                    this.b.k(Optional.fromNullable(this.s.a()), e);
                }
                v0.c c2 = this.E.c();
                if (c2 != null) {
                    this.b.w(Optional.fromNullable(this.s.a()), new i0(com.google.android.exoplayer2.u.b(c2.j), com.google.android.exoplayer2.u.b(c2.i)));
                }
            }
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void U(Optional<i0> optional) {
        this.z = optional;
        p0();
    }

    @Override // com.spotify.mobile.android.video.l0.c
    public void X(VideoSurfaceView videoSurfaceView) {
        synchronized (this) {
            if (videoSurfaceView == this.u) {
                d0(videoSurfaceView);
            }
        }
    }

    @Override // defpackage.e72
    public void Y(x xVar, int i, d0 d0Var, long j) {
        if (f0() && xVar.equals(this.s.a()) && d0Var != null) {
            if (i == 2) {
                this.b.A(Optional.fromNullable(this.s.a()), d0Var, j);
            } else if (i == 1) {
                this.b.d(Optional.fromNullable(this.s.a()), d0Var, j);
            } else {
                Logger.n("Unknown event source id for downstream format changed event", new Object[0]);
            }
        }
    }

    @Override // defpackage.r72
    public void Z() {
        v0(true);
    }

    @Override // com.spotify.mobile.android.video.r
    public void a0(boolean z2) {
        MoreObjects.checkState(f0(), "Video player not initialized");
        this.E.l(z2);
    }

    @Override // com.spotify.mobile.android.video.r
    public void c(v vVar) {
        this.c.b(this);
        if (this.r != null) {
            this.b.r(Optional.fromNullable(this.s.a()), ReasonEnd.PLAYER_RELEASED, vVar, this.E.b());
            this.r.h(this);
        }
        l0 l0Var = this.t;
        if (l0Var != null) {
            l0Var.l(this);
        }
        w wVar = this.E;
        if (wVar != null) {
            wVar.i();
        }
        this.r = null;
        this.E = null;
        this.t = null;
        this.s = new c0();
    }

    @Override // com.spotify.mobile.android.video.r
    public void d() {
        c(new v(new v.a()));
    }

    @Override // com.google.android.exoplayer2.drm.k
    public void g() {
        d0 d0Var;
        EncryptionType encryptionType;
        if (f0()) {
            c0 c0Var = this.b;
            Optional<d0> fromNullable = Optional.fromNullable(this.s.a());
            if (this.r.S() != null) {
                d0Var = this.r.S();
            } else {
                d0Var = this.r.K();
            }
            UUID uuid = null;
            if (d0Var != null) {
                Set<UUID> set = DrmUtil.a;
                if (d0Var.u != null) {
                    int i = 0;
                    loop0:
                    while (true) {
                        if (i >= d0Var.u.f) {
                            break;
                        }
                        for (UUID uuid2 : DrmUtil.a) {
                            if (d0Var.u.c(i).c(uuid2)) {
                                uuid = uuid2;
                                break loop0;
                            }
                        }
                        i++;
                    }
                }
            }
            if (DrmUtil.b.equals(uuid)) {
                encryptionType = EncryptionType.WIDEVINE;
            } else {
                encryptionType = EncryptionType.UNKNOWN;
            }
            c0Var.h(fromNullable, encryptionType);
        }
    }

    @Override // com.google.android.exoplayer2.video.s
    public void h(int i, int i2, int i3, float f2) {
        c0 c0Var;
        if (f0() && (c0Var = this.s) != null && c0Var.a() != null) {
            this.w = i;
            this.v = i2;
            VideoSurfaceView g = this.t.g(this.s.a());
            if (g != null) {
                g.l(i, i2);
            }
        }
    }

    public /* synthetic */ void i0() {
        this.u.i();
    }

    public /* synthetic */ void j0() {
        this.u.setIsBuffering(true);
    }

    public /* synthetic */ void k0() {
        this.u.n();
    }

    public /* synthetic */ void l0() {
        this.u.setIsBuffering(false);
    }

    public /* synthetic */ void m0() {
        this.u.j();
    }

    public /* synthetic */ void n0() {
        this.u.i();
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        if (f0()) {
            u0(false);
        }
    }

    @Override // com.google.android.exoplayer2.video.s
    public void p(Surface surface) {
        if (f0()) {
            this.s.getClass();
            if (this.u != null) {
                t0(new i(this));
            }
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void pause() {
        if (f0() && this.r.M()) {
            this.E.g();
            this.b.p(Optional.fromNullable(this.s.a()), this.E.b());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.f.a
    public void q(int i, long j, long j2) {
        if (f0()) {
            this.b.g(Optional.fromNullable(this.s.a()), j, j2, (long) i);
        }
    }

    public void r0(p0[] p0VarArr) {
        for (p0 p0Var : p0VarArr) {
            if (p0Var.c() == 2) {
                this.E.t(p0Var);
            }
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void resume() {
        if (f0() && !this.r.M()) {
            if ((!h0() || this.s.a().e()) && this.s.b()) {
                if (this.r.O() == 1) {
                    this.r.V();
                    u0(true);
                }
                this.E.j();
                this.b.v(Optional.fromNullable(this.s.a()));
            }
        }
    }

    @Override // com.spotify.mobile.android.video.l0.c
    public void s(VideoSurfaceView videoSurfaceView) {
        synchronized (this) {
            if (videoSurfaceView == this.u) {
                d0(videoSurfaceView);
            }
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void seekTo(long j) {
        if (f0()) {
            if (this.E.f() && j == Long.MAX_VALUE) {
                v0.c c2 = this.E.c();
                j = c2 != null ? c2.a() : 0;
            }
            this.b.x(Optional.fromNullable(this.s.a()), this.E.b(), this.E.a(j));
            this.x = true;
            this.E.k(j);
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void stop() {
        if (f0()) {
            e0(ReasonEnd.END_REQUESTED);
        }
    }

    @Override // com.spotify.mobile.android.video.r
    public void t(e0 e0Var, a0 a0Var) {
        ReasonEnd reasonEnd = ReasonEnd.FATAL_ERROR;
        e0Var.getClass();
        if (f0()) {
            n nVar = new n(UUID.randomUUID().toString().replace("-", ""), e0Var.d(), e0Var.e(), e0Var.b(), e0Var.c());
            this.b.c(nVar, a0Var, this.r, this.p, this.A);
            this.b.l(Optional.fromNullable(this.s.a()), nVar);
            e0(ReasonEnd.END_REQUESTED);
            boolean a2 = this.c.a();
            this.s = new c0(nVar);
            this.b.q(nVar, a2);
            if (!this.f && nVar.f()) {
                long longValue = a0Var.b().or((Optional<Long>) 0L).longValue();
                this.b.m(Optional.of(nVar), new UnplayablePlaybackException("Unable to play royalty media without royalty support", ErrorType.ERROR_ROYALTY_MEDIA_UNSUPPORTED), longValue);
                e0(reasonEnd);
            } else if (!h0() || nVar.e()) {
                c0(h0());
                this.c.c(this);
                this.C = false;
                com.spotify.mobile.android.video.sync.b bVar = this.o;
                if (bVar != null) {
                    bVar.b(this, nVar);
                }
                try {
                    com.google.android.exoplayer2.source.t h = this.E.h(nVar, a0Var);
                    u0(false);
                    this.s.c(h);
                } catch (Exception e) {
                    Logger.e(e, "Could not initiate video playback", new Object[0]);
                    q0(new UnplayablePlaybackException("Failed to start playback", ErrorType.ERROR_UNKNOWN, e));
                }
            } else {
                long longValue2 = a0Var.b().or((Optional<Long>) 0L).longValue();
                this.b.m(Optional.of(nVar), new UnplayablePlaybackException("Unable to play media when video is disabled and audio only is not allowed", ErrorType.ERROR_AUDIO_ONLY_NOT_ALLOWED), longValue2);
                e0(reasonEnd);
            }
        }
    }

    @Override // com.spotify.mobile.android.video.l0.c
    public void u(VideoSurfaceView videoSurfaceView) {
        o0();
    }

    @Override // defpackage.e72
    public void v(x xVar) {
        if (f0() && xVar.equals(this.s.a())) {
            this.b.o(Optional.fromNullable(this.s.a()));
        }
    }

    @Override // defpackage.e72
    public void w(x xVar, Exception exc) {
        BetamaxException betamaxException;
        xVar.getClass();
        if (f0()) {
            if (xVar.equals(this.s.a())) {
                if ((exc instanceof HttpDataSource.HttpDataSourceException) && !(exc.getCause() instanceof InvalidResponseCodeException)) {
                    pause();
                    this.r.n(false);
                    return;
                }
                if (exc instanceof UnsupportedOperationException) {
                    betamaxException = new ManifestLoadException("Platform not supported", ErrorType.ERROR_UNSUPPORTED_PLATFORM_VERSION, exc);
                } else if (exc instanceof ManifestResponseException) {
                    betamaxException = new ManifestLoadException("Error loading manifest", ((ManifestResponseException) exc).c(), exc);
                } else if (exc instanceof DrmException) {
                    betamaxException = (BetamaxException) exc;
                } else {
                    betamaxException = new ManifestLoadException("Could not load manifest", ErrorType.ERROR_UNKNOWN, exc);
                }
                q0(betamaxException);
                return;
            }
            Logger.n("Got renderers exception for video other than the current one, ignoring", new Object[0]);
        }
    }

    @Override // defpackage.e72
    public void x(x xVar, List<i0> list) {
        if (f0() && xVar.equals(this.s.a())) {
            this.y = list;
            p0();
            this.b.n(Optional.fromNullable(this.s.a()), list);
        }
    }

    @Override // com.spotify.mobile.android.video.drm.c
    public void y() {
        if (f0()) {
            this.b.i(Optional.fromNullable(this.s.a()));
        }
    }
}
