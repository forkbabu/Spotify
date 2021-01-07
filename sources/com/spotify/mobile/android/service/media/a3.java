package com.spotify.mobile.android.service.media;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mediasession.playbackactions.MediaAction;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.a;
import io.reactivex.d0;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.maybe.p;
import io.reactivex.l;
import io.reactivex.z;

public final class a3 {
    private final pea a;
    private final v1 b;
    private final g<PlayerState> c;

    public a3(v1 v1Var, pea pea, g<PlayerState> gVar) {
        this.a = pea;
        this.b = v1Var;
        this.c = gVar;
    }

    private a v(String str, yda yda) {
        l<R> f = this.b.K0().a(str).r(b.a).l(p1.a).f(new l1(this));
        o1 o1Var = new o1(str);
        io.reactivex.functions.g f2 = Functions.f();
        io.reactivex.functions.g f3 = Functions.f();
        io.reactivex.functions.a aVar = Functions.c;
        a w = a.w(new p(f, f2, f3, o1Var, aVar, aVar, aVar));
        z<String> v = this.a.v(yda, str);
        v.getClass();
        return w.E(new i(v));
    }

    public a a(String str, Bundle bundle, yda yda) {
        MediaAction valueOf = MediaAction.valueOf(str);
        a aVar = b.a;
        boolean z = false;
        Logger.b("Running action %s", valueOf);
        switch (valueOf.ordinal()) {
            case 0:
                a u = a.u(new c1(this));
                z<String> h = this.a.h(yda);
                h.getClass();
                return u.E(new i(h));
            case 1:
                a u2 = a.u(new d1(this));
                z<String> u3 = this.a.u(yda);
                u3.getClass();
                return u2.E(new i(u3));
            case 2:
                a u4 = a.u(new k1(this));
                z<String> s = this.a.s(yda);
                s.getClass();
                return u4.E(new i(s));
            case 3:
                a u5 = a.u(new z0(this));
                z<String> f = this.a.f(yda);
                f.getClass();
                return u5.E(new i(f));
            case 4:
                a u6 = a.u(new v0(this));
                z<String> i = this.a.i(yda, true);
                i.getClass();
                return u6.E(new i(i));
            case 5:
                a u7 = a.u(new t0(this));
                z<String> i2 = this.a.i(yda, false);
                i2.getClass();
                return u7.E(new i(i2));
            case 6:
                String str2 = "";
                if (bundle != null) {
                    str2 = bundle.getString("com.spotify.music.extra.CONTEXT_URI", str2);
                }
                if (!MoreObjects.isNullOrEmpty(str2)) {
                    z = l0.c(str2, LinkType.ALBUM, LinkType.ARTIST, LinkType.TRACK);
                }
                if (z) {
                    return v(str2, yda);
                }
                return this.c.h0(1).a0().t(new u0(this, yda));
            case 7:
                a t = this.c.h0(1).a0().t(new j1(this));
                z<String> j = this.a.j(yda, true);
                j.getClass();
                return t.E(new i(j));
            case 8:
                a t2 = this.c.h0(1).a0().t(new m1(this));
                z<String> j2 = this.a.j(yda, false);
                j2.getClass();
                return t2.E(new i(j2));
            case 9:
                a u8 = a.u(new f1(this));
                z<String> p = this.a.p(yda);
                p.getClass();
                return u8.E(new i(p));
            case 10:
                a u9 = a.u(new n1(this));
                z<String> a2 = this.a.a(yda);
                a2.getClass();
                return u9.E(new i(a2));
            case 11:
            case 12:
                a u10 = a.u(new i1(this));
                z<String> o = this.a.o(yda);
                o.getClass();
                return u10.E(new i(o));
            case 13:
            case 14:
            case 21:
            case 22:
            case 23:
                return aVar;
            case 15:
                return new i(this.a.c(yda, 15000).A(s0.a).s(new x0(this)));
            case 16:
                return new i(this.a.c(yda, -15000).A(b1.a).s(new w0(this)));
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                Assertion.g(String.format("Unhandled MediaAction: %s", valueOf));
                return aVar;
            case 24:
            case 29:
            case 30:
                a u11 = a.u(new y0(this));
                z<String> k = this.a.k(yda, 80);
                k.getClass();
                return u11.E(new i(k));
            case 25:
                a u12 = a.u(new h1(this));
                z<String> k2 = this.a.k(yda, 100);
                k2.getClass();
                return u12.E(new i(k2));
            case 26:
                a u13 = a.u(new a1(this));
                z<String> k3 = this.a.k(yda, 120);
                k3.getClass();
                return u13.E(new i(k3));
            case 27:
                a u14 = a.u(new g1(this));
                z<String> k4 = this.a.k(yda, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150);
                k4.getClass();
                return u14.E(new i(k4));
            case 28:
                a u15 = a.u(new e1(this));
                z<String> k5 = this.a.k(yda, 200);
                k5.getClass();
                return u15.E(new i(k5));
        }
    }

    public /* synthetic */ void b() {
        this.b.Z2().m(null);
    }

    public /* synthetic */ void c() {
        this.b.Z2().pause();
    }

    public /* synthetic */ e d(PlayerState playerState) {
        String e = com.spotify.paste.widgets.b.e(playerState);
        if (!e.isEmpty()) {
            return this.b.n2().c(e);
        }
        return b.a;
    }

    public /* synthetic */ d0 e(LoggingParams loggingParams) {
        return this.b.Z2().l(15000, Optional.of(loggingParams));
    }

    public /* synthetic */ d0 f(LoggingParams loggingParams) {
        return this.b.Z2().l(-15000, Optional.of(loggingParams));
    }

    public /* synthetic */ void g() {
        this.b.Z2().n(80);
    }

    public /* synthetic */ void h() {
        this.b.Z2().n(100);
    }

    public /* synthetic */ void i() {
        this.b.Z2().n(120);
    }

    public /* synthetic */ void j() {
        this.b.Z2().n(AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150);
    }

    public /* synthetic */ void k() {
        this.b.Z2().n(200);
    }

    public /* synthetic */ void l() {
        this.b.Z2().i();
    }

    public /* synthetic */ void m() {
        this.b.Z2().q();
    }

    public /* synthetic */ void n() {
        this.b.Z2().next();
    }

    public /* synthetic */ void o() {
        this.b.Z2().previous();
    }

    public /* synthetic */ void p() {
        this.b.Z2().b();
    }

    public /* synthetic */ void q() {
        this.b.Z2().o();
    }

    public /* synthetic */ void r() {
        this.b.Z2().c();
    }

    public /* synthetic */ e s(PlayerState playerState) {
        String e = com.spotify.paste.widgets.b.e(playerState);
        if (!e.isEmpty()) {
            return this.b.n2().a(e, playerState.contextUri());
        }
        return b.a;
    }

    public /* synthetic */ e t(yda yda, PlayerState playerState) {
        Optional<ContextTrack> track = playerState.track();
        if (track.isPresent()) {
            return v(track.get().uri(), yda);
        }
        Logger.d("Couldn't find a track to start radio for.", new Object[0]);
        return b.a;
    }

    public /* synthetic */ void u(String str) {
        this.b.Z2().h(h2.c(str).b());
    }
}
