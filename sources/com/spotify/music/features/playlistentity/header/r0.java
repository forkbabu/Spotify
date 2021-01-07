package com.spotify.music.features.playlistentity.header;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.navigation.t;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.p;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.v;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class r0 {
    private final q a = new q();
    private oo6 b;
    private final o0 c;
    private final t d;
    private final u0 e;
    private final g f;
    private final String g;
    private final w h;
    private final y i;
    private final Optional<v0> j;
    private final CompletableSubject k = CompletableSubject.R();
    private final a<h76> l = a.h1();
    private final q m = new q();
    private final h0 n;
    private final k0 o;
    private boolean p;
    private y0 q;
    private Boolean r;
    private h76 s;

    public r0(o0 o0Var, t tVar, u0 u0Var, w wVar, String str, y yVar, h0 h0Var, k0 k0Var, g gVar, Optional<v0> optional) {
        this.c = o0Var;
        this.d = tVar;
        this.e = u0Var;
        this.f = gVar;
        this.g = str;
        this.h = wVar;
        this.i = yVar;
        this.j = optional;
        this.n = h0Var;
        this.o = k0Var;
    }

    public static void e(r0 r0Var, boolean z) {
        boolean c2 = r0Var.f.b().c();
        if (r0Var.f.b().e() || !z) {
            ((z0) r0Var.q).Y(c2);
        } else {
            ((z0) r0Var.q).X(c2);
        }
        r0Var.p = z;
    }

    public static void f(r0 r0Var, h76 h76) {
        r0Var.s = h76;
        j l2 = h76.l();
        ((z0) r0Var.q).Z(com.spotify.playlist.models.q.c(l2.c(), Covers.Size.NORMAL), com.spotify.playlist.models.q.c(l2.c(), Covers.Size.LARGE));
        ((z0) r0Var.q).d0(r0Var.f.c() && !l2.w());
        ((z0) r0Var.q).Q(l2.t());
        ((z0) r0Var.q).S(l2.d(), h76.g(), (int) h76.e());
        boolean n2 = h76.n();
        if (!n2 || h76.a()) {
            ((z0) r0Var.q).b0(l2.j());
        } else {
            ((z0) r0Var.q).b0("");
        }
        ((z0) r0Var.q).a0(!n2);
    }

    public void a(y0 y0Var) {
        this.q = y0Var;
        if (y0Var != null) {
            Boolean bool = this.r;
            if (bool != null) {
                ((z0) y0Var).N(bool.booleanValue());
                this.r = null;
            }
            this.m.a(s.n(this.l, this.l.G(r.a).J0(new j(this)), a.a).o0(this.i).subscribe(new k(this), q.a));
            this.m.a(this.l.subscribe(new n(this)));
            this.m.a(this.h.b().o0(this.i).subscribe(new g(this), p.a));
            if (this.f.d()) {
                this.m.a(this.b.b().o0(this.i).subscribe(new i(this)));
                return;
            }
            return;
        }
        this.m.c();
    }

    public void b() {
        String e2 = this.c.e();
        String i2 = l0.z(this.g).i();
        String B = l0.z("spotify:playlist-participants:" + i2).B();
        t tVar = this.d;
        B.getClass();
        tVar.b(B, e2);
    }

    public void c() {
        boolean t = this.s.l().t();
        this.c.c(this.g, t);
        this.m.a(this.o.a(!t, this.s.l().j()).subscribe(m.a, t.a));
    }

    public io.reactivex.a d() {
        return this.k;
    }

    public /* synthetic */ v g(h76 h76) {
        h0 h0Var = this.n;
        return h0Var.c(h76, h0Var.d(), this.f.e());
    }

    public void h(u3 u3Var) {
        String str;
        String str2;
        String str3;
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        S s2 = u3Var.b;
        s2.getClass();
        S s3 = s2;
        Optional<Integer> a2 = s3.a();
        String b2 = j0.b(f3.l().m());
        boolean z = false;
        int intValue = a2.or((Optional<Integer>) 0).intValue();
        if (intValue > 1) {
            str2 = this.e.c(b2, intValue, this.f.e());
            str3 = this.e.c(b2, intValue, false);
            str = this.e.b();
        } else {
            str2 = this.e.d(f3, this.f.g());
            str = this.e.a(b2);
            str3 = b2;
        }
        if (this.j.isPresent()) {
            ((z0) this.q).U(f3, str2, this.j.get());
        } else {
            ((z0) this.q).e0(!MoreObjects.isNullOrEmpty(str2));
            ((z0) this.q).V(str2);
        }
        ((z0) this.q).P(str);
        ((z0) this.q).T(b2, str3);
        if (s3.b().isPresent()) {
            if (s3.a().or((Optional<Integer>) 0).intValue() > 1) {
                z = true;
            }
            ((z0) this.q).c0(s3.b().get());
            ((z0) this.q).W(z);
            return;
        }
        ((z0) this.q).z();
        ((z0) this.q).M();
    }

    public /* synthetic */ void i(w.b bVar) {
        ((z0) this.q).y(this.h.d(bVar));
    }

    public /* synthetic */ void j(h76 h76) {
        this.l.onNext(h76);
        this.k.onComplete();
    }

    public void k() {
        if (this.q != null) {
            this.c.d(this.g);
            j l2 = this.s.l();
            ((z0) this.q).L(com.spotify.playlist.models.q.c(l2.c(), Covers.Size.LARGE), com.spotify.playlist.models.q.c(l2.c(), Covers.Size.XLARGE));
        }
    }

    public void l() {
        String str;
        io.reactivex.a aVar;
        boolean b2 = this.f.b().b();
        if (this.f.b().e()) {
            String b3 = this.c.b(this.g);
            q qVar = this.a;
            if (b2) {
                aVar = this.b.h(b3);
            } else {
                aVar = this.b.j(b3);
            }
            qVar.a(aVar.subscribe(h.a, s.a));
            return;
        }
        if (this.p) {
            str = this.c.a(this.g);
        } else {
            str = this.c.b(this.g);
        }
        this.a.a(this.b.a(b2, str).subscribe(l.a, o.a));
    }

    public void m() {
        p m2 = this.s.l().m();
        if (m2 != null) {
            String e2 = m2.e();
            this.d.b(e2, this.c.f(this.g, e2));
        }
    }

    public void n(Bundle bundle) {
        if (bundle != null) {
            this.r = Boolean.valueOf(bundle.getBoolean(r0.class.getName()));
        }
    }

    public void o(Bundle bundle) {
        if (this.q != null) {
            bundle.putBoolean(r0.class.getName(), ((z0) this.q).O());
        }
    }

    public void p(t.b bVar) {
        this.b = bVar.b();
        this.a.c();
        q qVar = this.a;
        s<h76> o0 = bVar.a().b().E().o0(this.i);
        f fVar = new f(this);
        CompletableSubject completableSubject = this.k;
        completableSubject.getClass();
        qVar.a(o0.subscribe(fVar, new f0(completableSubject)));
    }

    public void q() {
        this.a.c();
    }
}
