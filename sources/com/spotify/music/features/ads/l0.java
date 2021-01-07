package com.spotify.music.features.ads;

import android.content.Context;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.x;
import com.spotify.music.ads.voice.VoiceAdService;
import com.spotify.music.features.ads.model.Targetings;
import com.spotify.music.features.ads.rules.AdRules;
import com.spotify.rxjava2.q;
import io.reactivex.s;

public class l0 {
    private final Context a;
    private final AdRules b;
    private final y1 c;
    private final qs3 d;
    private final o0 e;
    private final sg0<a2, lq3> f;
    private final pt3 g;
    private final qv3 h;
    private final p0 i;
    private final c2 j;
    private final w k;
    private final q l = new q();
    private lq3 m;
    private a2 n;

    public l0(Context context, AdRules adRules, y1 y1Var, qs3 qs3, o0 o0Var, mq3 mq3, pt3 pt3, qv3 qv3, p0 p0Var, c2 c2Var, w wVar) {
        f0 f0Var = new f0(mq3);
        this.a = context;
        this.b = adRules;
        this.c = y1Var;
        this.d = qs3;
        this.e = o0Var;
        this.f = f0Var;
        this.g = pt3;
        this.h = qv3;
        this.i = p0Var;
        this.j = c2Var;
        this.k = wVar;
    }

    private void c(g0 g0Var) {
        this.b.c(AdRules.StateType.MIDROLL_VIDEO_ADS, g0Var.c());
        boolean a2 = g0Var.a();
        this.g.h(a2);
        this.c.b(a2);
        if ((g0Var.b() && !x.g(this.a)) || g0Var.a()) {
            if (this.n == null) {
                this.n = this.e.b();
            }
            if (this.m == null) {
                lq3 apply = this.f.apply(this.n);
                this.m = apply;
                apply.a(g0Var);
            }
            this.d.d();
        } else {
            b();
        }
        q qVar = this.l;
        s<Targetings> d2 = this.h.d(this.a);
        ju3 ju3 = new ju3();
        d2.subscribe(ju3);
        qVar.a(ju3);
    }

    public static void d(l0 l0Var, g0 g0Var) {
        l0Var.getClass();
        if (g0Var.a()) {
            l0Var.j.c();
            l0Var.i.e();
            l0Var.c(g0Var);
            return;
        }
        l0Var.c(g0Var);
        l0Var.i.f();
        VoiceAdService.g(l0Var.a);
        l0Var.b.e();
        l0Var.j.d();
    }

    public void a() {
        this.l.c();
        this.i.f();
        VoiceAdService.g(this.a);
        this.b.e();
        this.g.h(false);
        this.j.d();
        b();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.n != null) {
            this.n = null;
        }
        lq3 lq3 = this.m;
        if (lq3 != null) {
            lq3.b();
            this.m = null;
        }
        this.d.e();
    }

    public void e() {
        this.l.a(s.c1(this.k.a("ads"), this.k.a("ad-formats-preroll-video"), this.k.a("ab-watch-now"), j.a).subscribe(new k(this)));
    }
}
