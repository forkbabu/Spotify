package com.spotify.music.features.spoton;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.h2;
import com.spotify.mobile.android.service.media.i2;
import com.spotify.mobile.android.service.media.t2;
import com.spotify.mobile.android.service.media.u2;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.genie.Wish;
import com.spotify.music.genie.o;
import com.spotify.music.genie.p;
import com.spotify.music.genie.q;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Locale;

public class SpotOnPlaybackManager {
    private t2 a;
    private i2 b;
    private g<SessionState> c;
    private final m d;
    private final y e;
    private final y f;
    private final p g;
    private o h;
    private final ifd i;
    private final pea j;
    private yda k;
    private final Context l;
    private final uk8 m;
    private final cte n;
    private final yk8 o;
    private final OnboardingMode p;
    private final TtsMode q;

    public enum OnboardingMode {
        NONE,
        ONCE,
        THREE_TIMES
    }

    public enum TtsMode {
        NONE,
        TTS_PLAYLIST,
        TTS_PLAY_PLAYLIST
    }

    public SpotOnPlaybackManager(p pVar, y yVar, y yVar2, m mVar, ifd ifd, pea pea, Context context, uk8 uk8, cte cte, yk8 yk8, OnboardingMode onboardingMode, TtsMode ttsMode) {
        this.l = context;
        this.g = pVar;
        this.e = yVar;
        this.f = yVar2;
        this.d = mVar;
        this.i = ifd;
        this.j = pea;
        this.m = uk8;
        this.n = cte;
        this.o = yk8;
        this.p = onboardingMode;
        this.q = ttsMode;
    }

    public void a() {
        if (this.d.d()) {
            t2 t2Var = this.a;
            if (t2Var != null) {
                ((u2) t2Var).a();
                this.a = null;
            }
            this.d.c();
        }
    }

    public a b(SpotOnAction spotOnAction) {
        a aVar;
        a t = this.c.E().A(l.a).t(h.a);
        if (SpotOnAction.PLAY == spotOnAction) {
            a t2 = ((q) this.h).d().B(this.f).t(new a(this));
            pea pea = this.j;
            yda yda = this.k;
            yda.getClass();
            z<String> r = pea.r(yda);
            r.getClass();
            aVar = t2.E(new i(r));
        } else if (SpotOnAction.PLAY_NEW == spotOnAction) {
            a t3 = ((q) this.h).g().B(this.f).t(new a(this));
            pea pea2 = this.j;
            yda yda2 = this.k;
            yda2.getClass();
            z<String> r2 = pea2.r(yda2);
            r2.getClass();
            aVar = t3.E(new i(r2));
        } else {
            aVar = b.a;
        }
        return t.d(aVar);
    }

    public boolean c() {
        return this.a != null;
    }

    public /* synthetic */ e d() {
        return this.m.b();
    }

    public void e(io.reactivex.b bVar) {
        this.b.m(new p(bVar, "Current playback could not be started. reasons: %s"));
    }

    public /* synthetic */ e f(Boolean bool) {
        if (bool.booleanValue()) {
            return b.a;
        }
        return this.n.b(C0707R.raw.spoton_onboarding).d(a.n(new k(this))).q(f.a).B();
    }

    public void g(String str, PlayOrigin playOrigin, io.reactivex.b bVar) {
        h2.a c2 = h2.c(str);
        c2.a(new p(bVar, "Uri playback could not be started. reasons: %s"));
        if (playOrigin != null) {
            c2.f(playOrigin);
        }
        this.b.h(c2.b());
    }

    public /* synthetic */ void h(boolean z) {
        if (z) {
            this.b.pause();
        }
    }

    public /* synthetic */ void i(Throwable th) {
        Logger.e(th, "%s: Failed to play TTS.", this.i);
    }

    public void j(v1 v1Var) {
        yda yda = this.k;
        this.c = v1Var.a0();
        this.b = v1Var.Z2();
        t2 Z1 = v1Var.Z1(yda);
        this.a = Z1;
        ((u2) Z1).d();
        this.h = this.g.a(v1Var);
    }

    /* access modifiers changed from: package-private */
    public a k(Wish wish) {
        PlayOrigin playOrigin;
        a aVar = b.a;
        int ordinal = wish.a().ordinal();
        if (ordinal == 0) {
            return aVar;
        }
        int i2 = 1;
        if (ordinal == 1) {
            String b2 = wish.b();
            a m2 = a.m(new g(this));
            pea pea = this.j;
            yda yda = this.k;
            yda.getClass();
            z<String> h2 = pea.h(yda);
            h2.getClass();
            a E = m2.E(new i(h2)).E(l(b2, false));
            int ordinal2 = this.p.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    i2 = 3;
                }
                return E.E(aVar).G(this.e);
            }
            aVar = this.m.a(i2).t(new i(this));
            return E.E(aVar).G(this.e);
        } else if (ordinal != 2) {
            StringBuilder V0 = je.V0("Element not handled ");
            V0.append(wish.a());
            String sb = V0.toString();
            Assertion.g(sb);
            return a.t(new Throwable(sb));
        } else {
            String c2 = wish.c();
            c2.getClass();
            String b3 = wish.b();
            ifd ifd = this.i;
            if (ifd == null) {
                playOrigin = null;
            } else {
                playOrigin = PlayOrigin.builder(ifd.getName()).build();
            }
            a E2 = a.m(new d(this, c2, playOrigin)).E(l(b3, true));
            pea pea2 = this.j;
            yda yda2 = this.k;
            yda2.getClass();
            z<String> n2 = pea2.n(yda2, c2, null);
            n2.getClass();
            return E2.E(new i(n2)).G(this.e);
        }
    }

    /* access modifiers changed from: package-private */
    public a l(String str, boolean z) {
        a aVar = b.a;
        if (str == null) {
            return aVar;
        }
        int ordinal = this.q.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return aVar;
            }
            str = this.l.getString(C0707R.string.spoton_tts_playing_playlist, str);
        }
        return this.o.a(str, Locale.US).E(a.u(new c(this, z))).q(new j(this)).B();
    }

    public a m(yda yda) {
        this.k = yda;
        return new i(this.d.b().p(new e(this)));
    }
}
