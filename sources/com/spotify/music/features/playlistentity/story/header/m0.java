package com.spotify.music.features.playlistentity.story.header;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.c;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.q;
import com.spotify.rxjava2.p;
import io.reactivex.disposables.a;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class m0 {
    private b a = EmptyDisposable.INSTANCE;
    private final p b = new p();
    private final a c = new a();
    private final vfa d;
    private oo6 e;
    private final h0 f;
    private final v g;
    private final f0 h;
    private final k0 i;
    private final String j;
    private final w k;
    private final y l;
    private final y m;
    private final CompletableSubject n = CompletableSubject.R();
    private final g0 o;
    private final c<Boolean> p = PublishRelay.g1();
    private final int q;
    private final z<p62> r;
    private final io.reactivex.subjects.a<h76> s = io.reactivex.subjects.a.h1();
    private final a t = new a();
    private boolean u;
    private q0 v;
    private Boolean w;
    private h76 x;

    public m0(vfa vfa, h0 h0Var, v vVar, k0 k0Var, w wVar, String str, y yVar, y yVar2, g0 g0Var, int i2, z<p62> zVar, f0 f0Var) {
        this.d = vfa;
        this.f = h0Var;
        this.g = vVar;
        this.h = f0Var;
        this.i = k0Var;
        this.j = str;
        this.k = wVar;
        this.o = g0Var;
        this.l = yVar;
        this.m = yVar2;
        this.q = i2;
        this.r = zVar;
    }

    public static void e(m0 m0Var, boolean z) {
        boolean z2 = !m0Var.h.b();
        if (z) {
            ((s0) m0Var.v).O(z2);
        } else {
            ((s0) m0Var.v).P(z2);
        }
        m0Var.u = z;
    }

    public static void f(m0 m0Var, Boolean bool) {
        m0Var.getClass();
        if (bool.booleanValue()) {
            ((s0) m0Var.v).U();
        } else {
            ((s0) m0Var.v).A();
        }
    }

    public static void i(m0 m0Var, h76 h76) {
        m0Var.x = h76;
        j l2 = h76.l();
        ((s0) m0Var.v).L(l2.t());
        ((s0) m0Var.v).N(m0Var.i.a(h76, m0Var.h.e()), m0Var.h.g());
        String str = "";
        if (h76.n()) {
            ((s0) m0Var.v).T(str);
        } else {
            ((s0) m0Var.v).T(l2.j());
        }
        Map<String, String> f2 = l2.f();
        String str2 = f2.get("primary_color");
        int i2 = -1;
        if (str2 != null) {
            try {
                i2 = Color.parseColor(str2);
            } catch (IllegalArgumentException unused) {
            }
        }
        String str3 = f2.get("image_url");
        if (TextUtils.isEmpty(str3)) {
            str3 = q.c(l2.c(), Covers.Size.LARGE);
        }
        ((s0) m0Var.v).Q(i2, str3);
        com.spotify.playlist.models.p m2 = l2.m();
        if (m2 != null) {
            String c2 = m2.c();
            ((s0) m0Var.v).R(c2);
            if (m0Var.a.d()) {
                m0Var.a = io.reactivex.a.u(new n(m0Var, c2)).g(s.c(s.X0(1500, TimeUnit.MILLISECONDS, m0Var.m).J0(new r(m0Var)), m0Var.p.E().C0(1))).o0(m0Var.l).subscribe(new g(m0Var), m.a);
            }
        }
        String d2 = l2.d();
        q0 q0Var = m0Var.v;
        CharSequence charSequence = str;
        if (d2 != null) {
            charSequence = z42.m(d2);
        }
        ((s0) q0Var).M(charSequence);
    }

    private void n() {
        this.b.b(this.r.subscribe(new h(this, l0.A(l0.z(this.j).i())), s.a));
    }

    public void a(q0 q0Var) {
        this.v = q0Var;
        if (q0Var != null) {
            Boolean bool = this.w;
            if (bool != null) {
                ((s0) q0Var).J(bool.booleanValue());
                this.w = null;
            }
            this.t.b(this.s.subscribe(new o(this)));
            this.t.b(this.k.b().o0(this.l).subscribe(new f(this), l.a));
            this.t.b(z.R(this.o.a(this.j), this.r, c0.a).B(this.l).subscribe(new i(this), new d(this)));
            if (this.h.f()) {
                this.t.b(this.e.b().o0(this.l).subscribe(new e(this)));
                return;
            }
            return;
        }
        this.t.f();
        this.a.dispose();
        this.b.a();
    }

    public void b() {
        io.reactivex.a aVar;
        boolean t2 = this.x.l().t();
        this.f.c(this.j, t2);
        if (!t2) {
            aVar = this.g.c(this.j);
        } else {
            aVar = this.g.d(this.j);
        }
        this.c.b(aVar.subscribe(c.a, q.a));
    }

    public io.reactivex.a c() {
        return this.n;
    }

    public void d(int i2) {
        this.p.accept(Boolean.valueOf(i2 < this.q));
    }

    public /* synthetic */ void g(w.b bVar) {
        ((s0) this.v).z(this.k.d(bVar));
    }

    public void h(u3 u3Var) {
        q0 q0Var = this.v;
        s0 s0Var = (s0) q0Var;
        s0Var.S(u3Var.a.h(), u3Var.b);
    }

    public /* synthetic */ void j(l0 l0Var, p62 p62) {
        this.d.a(l0Var.B(), p62);
    }

    public /* synthetic */ io.reactivex.v k(Long l2) {
        return this.p.E().G0(Boolean.TRUE);
    }

    public /* synthetic */ void l(String str) {
        ((s0) this.v).I(str);
    }

    public /* synthetic */ void m(h76 h76) {
        this.s.onNext(h76);
        this.n.onComplete();
    }

    public void o() {
        String str;
        if (this.u) {
            str = this.f.a(this.j);
        } else {
            str = this.f.b(this.j);
        }
        this.c.b(this.e.a(true, str).subscribe(p.a, j.a));
    }

    public void p() {
        n();
    }

    public void q() {
        n();
    }

    public void r(Bundle bundle) {
        if (bundle != null) {
            this.w = Boolean.valueOf(bundle.getBoolean(m0.class.getName()));
        }
    }

    public void s(Bundle bundle) {
        if (this.v != null) {
            bundle.putBoolean(m0.class.getName(), ((s0) this.v).K());
        }
    }

    public void t(t.b bVar) {
        this.e = bVar.b();
        this.c.f();
        a aVar = this.c;
        s<h76> o0 = bVar.a().b().E().o0(this.l);
        k kVar = new k(this);
        CompletableSubject completableSubject = this.n;
        completableSubject.getClass();
        aVar.b(o0.subscribe(kVar, new b0(completableSubject)));
    }

    public void u() {
        this.c.f();
    }
}
