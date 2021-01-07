package com.spotify.music.libs.mediabrowserservice;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.a3;
import com.spotify.mobile.android.service.media.b3;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.music.genie.p;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.mediasession.e0;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import defpackage.yda;
import io.reactivex.disposables.a;

public class a2 extends MediaSessionCompat.a {
    private final a3 e;
    protected final v1 f;
    private final PlayOrigin g;
    private final e0 h;
    private final cqe i;
    private final z2 j;
    private final d k;
    protected final pea l;
    private final v1 m;
    private final wl1 n;
    private long o;
    protected final a p = new a();

    public a2(v1 v1Var, PlayOrigin playOrigin, cqe cqe, d dVar, pea pea, e0 e0Var, p pVar, b3 b3Var, v1 v1Var2) {
        this.f = v1Var;
        this.g = playOrigin;
        this.h = e0Var;
        this.i = cqe;
        this.k = dVar;
        this.l = pea;
        this.m = v1Var2;
        this.e = b3Var.b(v1Var);
        this.j = new z2(v1Var, playOrigin, pea, pVar.a(v1Var));
        this.n = new wl1(pea, v1Var.C0(), v1Var.Z2());
        x();
    }

    private static yda v(String str) {
        yda.b bVar = new yda.b("unknown");
        bVar.l("unknown");
        bVar.s("android_media_session");
        bVar.q("media_session");
        bVar.r(str);
        return bVar.k();
    }

    protected static boolean y(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        int i2 = bundle.getInt("android.media.session.extra.LEGACY_STREAM_TYPE", 3);
        if (bundle.getInt("com.spotify.music.extra.PLAYBACK_TYPE") == 1 || i2 == 4) {
            return true;
        }
        return false;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void c(String str, Bundle bundle) {
        yda t = t();
        Logger.l("MediaSessionCallback.onCustomAction", new Object[0]);
        try {
            this.p.b(this.e.a(str, bundle, t).subscribe());
        } catch (IllegalArgumentException e2) {
            Logger.e(e2, "Media action %s is not supported", str);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void e() {
        Logger.l("MediaSessionCallback.onPause", new Object[0]);
        yda t = t();
        this.f.Z2().pause();
        this.p.b(this.l.u(t).subscribe());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void f() {
        Logger.l("MediaSessionCallback.onPlay", new Object[0]);
        yda t = t();
        this.f.Z2().m(null);
        this.p.b(this.l.h(t).subscribe());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void g(String str, Bundle bundle) {
        boolean z = false;
        Logger.l("MediaSessionCallback.onPlayFromMediaId", new Object[0]);
        String string = bundle.getString("com.spotify.music.extra.CONTEXT_URI");
        String d = s1.d(str);
        PreparePlayOptions a = tl1.a(d, bundle);
        if (y(bundle)) {
            this.f.A3().h();
        }
        if (string != null) {
            z = true;
        }
        if (!z) {
            string = d;
        }
        PlayOrigin.Builder builder = this.g.toBuilder();
        String string2 = bundle.getString("com.spotify.music.extra.PLAY_ORIGIN");
        if (string2 != null) {
            builder.referrerIdentifier(string2);
        }
        PlayOrigin build = builder.viewUri(string).build();
        a aVar = this.p;
        Optional<nqe> b = this.k.b(string, bundle);
        aVar.b(this.l.n(t(), string, b.orNull()).A(y.a).s(new w(this, string, build, a)).subscribe());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void h(String str, Bundle bundle) {
        Logger.l("MediaSessionCallback.onPlayFromSearch", new Object[0]);
        this.p.b(this.j.d(str, bundle, t()).subscribe());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void k(long j2) {
        Logger.l("MediaSessionCallback.onSeek", new Object[0]);
        this.p.b(this.l.g(t(), j2).A(z.a).s(new x(this, j2)).subscribe());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void m(int i2) {
        yda t = t();
        if (i2 == -1) {
            Logger.d("Setting Repeat mode invalid: (%d)", Integer.valueOf(i2));
        } else if (i2 == 0) {
            this.f.Z2().c();
            this.p.b(this.l.o(t).subscribe());
        } else if (i2 == 1) {
            this.f.Z2().o();
            this.p.b(this.l.a(t).subscribe());
        } else if (i2 == 2) {
            this.f.Z2().b();
            this.p.b(this.l.p(t).subscribe());
        } else if (i2 != 3) {
            Logger.d("Setting Repeat mode unknown: (%d)", Integer.valueOf(i2));
        } else {
            Logger.d("Setting Repeat mode unsupported: (%d)", Integer.valueOf(i2));
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void o() {
        Logger.l("MediaSessionCallback.onSkipToNext", new Object[0]);
        yda t = t();
        this.f.Z2().next();
        this.p.b(this.l.s(t).subscribe());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void p() {
        Logger.l("MediaSessionCallback.onSkipToPrevious", new Object[0]);
        yda t = t();
        this.f.Z2().previous();
        this.p.b(this.l.f(t).subscribe());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void q(long j2) {
        Logger.l("MediaSessionCallback.onSkipToQueueItem", new Object[0]);
        this.p.b(this.n.b((int) j2, t()).subscribe());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public void r() {
        Logger.l("MediaSessionCallback.onStop", new Object[0]);
        yda t = t();
        this.f.Z2().pause();
        this.p.b(this.l.u(t).subscribe());
    }

    /* access modifiers changed from: protected */
    public yda t() {
        String h2 = this.h.h();
        if (h2 != null) {
            return this.m.a(h2).or((Optional<yda>) v(h2));
        }
        return v(null);
    }

    public void u() {
        this.p.dispose();
    }

    public long w() {
        return this.o;
    }

    public void x() {
        this.o = this.i.d();
    }
}
