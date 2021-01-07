package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.connection.l;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.drivingmode.loggers.c;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.q0;
import com.spotify.music.nowplaying.drivingmode.view.ads.DrivingAdNowPlayingBar;
import com.spotify.music.nowplaying.drivingmode.view.ads.a;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotContainerView;
import com.spotify.music.nowplaying.drivingmode.view.pivot.k;
import com.spotify.music.nowplaying.drivingmode.view.pivot.p;
import com.spotify.player.model.Context;
import io.reactivex.BackpressureStrategy;
import io.reactivex.a0;
import io.reactivex.d0;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.y;
import io.reactivex.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class n0 implements p.a, a.AbstractC0312a {
    private final wlf<Player> a;
    private final stb b;
    private final m0 c;
    private final p0 d;
    private final ijc e;
    private final y f;
    private final nfd g;
    private final c h;
    private final l i;
    private final o0 j;
    private final Map<String, PlayOptions> k = new HashMap(20);
    private final Map<String, String> l = new HashMap(20);
    private final Map<String, PlayerTrack> m = new HashMap(20);
    private final io.reactivex.disposables.a n = new io.reactivex.disposables.a();
    private boolean o = true;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private p u;
    private k v;
    private a w;
    private b x = DisposableHelper.DISPOSED;

    public n0(wlf<Player> wlf, stb stb, m0 m0Var, p0 p0Var, nfd nfd, c cVar, l lVar, ijc ijc, y yVar, o0 o0Var) {
        this.a = wlf;
        this.b = stb;
        this.c = m0Var;
        this.d = p0Var;
        this.i = lVar;
        this.g = nfd;
        this.h = cVar;
        this.e = ijc;
        this.f = yVar;
        this.j = o0Var;
    }

    private void a() {
        if (this.s) {
            this.x.dispose();
            this.p = false;
            this.o = true;
        }
        if (this.x.d() && !this.p) {
            this.x = this.i.a().Y0(BackpressureStrategy.BUFFER).O(e0.a).s().f0(new r(this)).Q(this.f).s().subscribe(new x(this));
        }
    }

    private void r(String str, PlayOptions playOptions, boolean z) {
        PlayerContext playerContext;
        if (z) {
            playerContext = PlayerContext.createFromContextUrl(str, je.x0("context://", str), ImmutableMap.of("license", PlayerContext.Metadata.LICENSE_ON_DEMAND_WHEN_FREE, Context.Metadata.KEY_AUTOPLAY_CANDIDATE, "false"));
        } else {
            playerContext = PlayerContext.createFromContextUrl(str, "context://" + str);
        }
        this.a.get().play(playerContext, playOptions);
    }

    private void t(LegacyPlayerState legacyPlayerState, String str, PlayerTrack playerTrack) {
        PlayOptions playOptions;
        if (playerTrack != null && !TextUtils.isEmpty(playerTrack.uri())) {
            this.m.put(str, playerTrack);
        }
        Map<String, PlayOptions> map = this.k;
        PlayerContextIndex index = legacyPlayerState.index();
        if (index != null) {
            playOptions = new PlayOptions.Builder().seekTo(Long.valueOf(legacyPlayerState.currentPlaybackPosition())).skipTo(new PlayOptionsSkipTo(null, Integer.valueOf(index.page()), null, null, index.track())).build();
        } else {
            playOptions = new PlayOptions.Builder().build();
        }
        map.put(str, playOptions);
    }

    public /* synthetic */ void b(a0 a0Var) {
        a0Var.getClass();
        this.a.get().fetchState(new f0(a0Var));
    }

    public tpf c(Boolean bool) {
        if (!bool.booleanValue()) {
            return g.N(new q0.c());
        }
        return this.b.a().q(this.c).q(this.d).j0(g0.a).G0((R) new q0.b()).R0(8, TimeUnit.SECONDS).r0(c.a).Y0(BackpressureStrategy.LATEST).R();
    }

    public /* synthetic */ d0 d(LegacyPlayerState legacyPlayerState) {
        return z.z(Boolean.valueOf(!legacyPlayerState.contextUri().equals(this.t) && !fvb.A(legacyPlayerState.track())));
    }

    public /* synthetic */ void e(q0.b bVar) {
        ((PivotContainerView) this.v).a();
    }

    public /* synthetic */ void f(q0.d dVar) {
        ((PivotContainerView) this.v).e();
        ImmutableList<com.spotify.music.nowplaying.drivingmode.view.pivot.l> b2 = dVar.b().b();
        int c2 = dVar.b().c();
        this.u.b(b2, c2);
        this.t = b2.get(c2).b().a();
        this.p = true;
        this.s = false;
    }

    public /* synthetic */ void g(q0.c cVar) {
        if (!this.p) {
            ((PivotContainerView) this.v).d();
        }
    }

    public void h(com.spotify.music.nowplaying.drivingmode.view.pivot.l lVar, String str) {
        PlayerContext playerContext;
        Long seekTo;
        PlayOptionsSkipTo skipTo;
        if (lVar.b().a() == null) {
            Assertion.h("Context uri was null for %s", lVar.h());
            return;
        }
        String a2 = lVar.b().a();
        PlayerTrack playerTrack = this.m.get(a2);
        String uri = playerTrack != null ? playerTrack.uri() : "";
        if (a2 != null && !str.equals(a2)) {
            if (agd.i(a2)) {
                PlayOptions playOptions = this.k.get(a2);
                this.g.b(new String[]{a2}, ViewUris.A, false, false, (playOptions == null || (skipTo = playOptions.skipTo()) == null) ? 0 : skipTo.trackIndex(), (playOptions == null || (seekTo = playOptions.seekTo()) == null) ? 0 : seekTo.longValue(), kfd.S, yn0.a(kfd.R), null);
            } else if (!this.j.e(a2) || TextUtils.isEmpty(this.l.get(a2))) {
                this.j.getClass();
                if (!(l0.z(a2).q() == LinkType.SEARCH_QUERY) || playerTrack == null || TextUtils.isEmpty(playerTrack.uri())) {
                    r(a2, this.k.get(a2), lVar.e());
                } else {
                    PlayOptions playOptions2 = this.k.get(a2);
                    boolean e2 = lVar.e();
                    PlayerTrack[] playerTrackArr = {this.m.get(a2)};
                    if (e2) {
                        playerContext = PlayerContext.create(a2, playerTrackArr, ImmutableMap.of("license", PlayerContext.Metadata.LICENSE_ON_DEMAND_WHEN_FREE, Context.Metadata.KEY_AUTOPLAY_CANDIDATE, "false"));
                    } else {
                        playerContext = PlayerContext.create(a2, playerTrackArr);
                    }
                    this.a.get().play(playerContext, playOptions2);
                }
            } else {
                String str2 = this.l.get(a2);
                boolean e3 = lVar.e();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(uri)) {
                    this.n.b(this.e.a(str2, uri).B(this.f).subscribe(new p(this, uri), new m(this, str2, e3, uri)));
                } else if (!TextUtils.isEmpty(str2)) {
                    r(str2, this.k.get(str2), e3);
                }
            }
            this.t = a2;
        }
    }

    public /* synthetic */ void i(String str, PlayerContext playerContext) {
        PlayOptions.Builder suppressions = new PlayOptions.Builder().skipTo(new PlayOptionsSkipTo(null, 0, null, str, 0)).suppressions("mft");
        Boolean bool = Boolean.FALSE;
        this.a.get().play(playerContext, suppressions.playerOptionsOverride(bool, bool, bool).build());
    }

    public /* synthetic */ void j(String str, boolean z, String str2, Throwable th) {
        r(str, this.k.get(str), z);
        Logger.e(th, "Failed to fetch episode context: %s", str2);
    }

    public /* synthetic */ String k(String str, LegacyPlayerState legacyPlayerState, PlayerTrack playerTrack, String str2) {
        this.l.put(str, str2);
        t(legacyPlayerState, str, playerTrack);
        return str;
    }

    public /* synthetic */ void l(Boolean bool) {
        if (bool.booleanValue() && this.r) {
            this.s = true;
            a();
        }
    }

    public void m(boolean z) {
        this.u.c(z);
        this.q = z;
    }

    public void n(boolean z) {
        this.r = z;
        if (z) {
            u();
        }
    }

    public void o(com.spotify.music.nowplaying.drivingmode.view.pivot.l lVar, boolean z) {
        if (!this.o) {
            this.h.b(lVar.b().a(), lVar.h(), Integer.parseInt(lVar.c()), z);
            if (this.q) {
                ((DrivingAdNowPlayingBar) this.w).U(lVar.k());
            }
            this.n.b(z.g(new n(this)).s(new k(this)).subscribe(new u(this, lVar)));
        }
        this.o = false;
    }

    public void p(p pVar, a aVar, k kVar) {
        this.u = pVar;
        this.v = kVar;
        this.w = aVar;
        pVar.setListener(this);
        this.w.setListener(this);
        a();
    }

    public void q() {
        this.n.f();
        this.x.dispose();
    }

    /* access modifiers changed from: package-private */
    public z<String> s(LegacyPlayerState legacyPlayerState) {
        String contextUri = legacyPlayerState.contextUri();
        PlayerTrack track = legacyPlayerState.track();
        if (!fvb.A(track)) {
            if (this.j.e(contextUri) && track != null && !TextUtils.isEmpty(track.uri())) {
                return this.j.b(track.uri()).A(new q(this, contextUri, legacyPlayerState, track));
            }
            t(legacyPlayerState, contextUri, track);
        }
        return z.z(contextUri);
    }

    public void u() {
        this.n.b(z.g(new n(this)).s(new s(this)).subscribe(new l(this)));
    }
}
