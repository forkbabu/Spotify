package com.spotify.mobile.android.video.exo;

import android.text.TextUtils;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.exoplayer2.util.f0;
import com.google.android.video.exo.e;
import com.spotify.mobile.android.video.exo.q;
import java.io.IOException;
import java.util.List;

public class d implements q {
    private final w a;
    private final r b;
    private final int c;
    private final gq d;
    private final k e;
    private final int f;
    private final long g;
    private final List<j> h;
    private final n i;
    private boolean j;
    int k;
    IOException l;

    public static final class a implements q.a {
        private final k.a a;
        private final n b;

        public a(k.a aVar, n nVar) {
            this.a = aVar;
            this.b = nVar;
        }

        public q a(w wVar, r rVar, int i, int i2, gq gqVar, long j, a0 a0Var) {
            return new d(this.b, wVar, rVar, i, i2, gqVar, this.a.a(), 1, a0Var);
        }
    }

    public d(n nVar, w wVar, r rVar, int i2, int i3, gq gqVar, k kVar, int i4, a0 a0Var) {
        this.i = nVar;
        this.a = wVar;
        this.b = rVar;
        this.c = i3;
        this.d = gqVar;
        this.e = kVar;
        this.f = i2;
        this.g = (long) i4;
        this.h = rVar.c(i2).c(i3).b;
        if (a0Var != null) {
            kVar.b(a0Var);
        }
    }

    public long a(long j2, t0 t0Var) {
        if (this.h.size() <= 0) {
            return j2;
        }
        j jVar = this.h.get(0);
        int g2 = jVar.g(j2);
        long h2 = jVar.h((long) g2);
        return f0.J(j2, t0Var, h2, (h2 >= j2 || g2 >= jVar.e() + -1) ? h2 : jVar.h((long) (g2 + 1)));
    }

    public void b(long j2, long j3, List<? extends po> list, jo joVar) {
        int i2;
        long j4;
        ho hoVar;
        if (this.l == null) {
            long j5 = j3 - j2;
            int length = this.d.length();
            qo[] qoVarArr = new qo[length];
            int i3 = 0;
            while (true) {
                i2 = 1;
                if (i3 >= length) {
                    break;
                }
                j jVar = this.b.c(this.f).c(this.c).b.get(i3);
                qoVarArr[i3] = new p(jVar, this.i, jVar.g(j2), (jVar.e() + 0) - 1);
                i3++;
            }
            this.d.m(j2, j5, -9223372036854775807L, list, qoVarArr);
            j d2 = d();
            d2.getClass();
            if (!this.j || d2.b() != null) {
                d0 o = this.d.o();
                String b2 = this.i.b(d2.a());
                if (d2.b() != null) {
                    e d3 = d2.b().a() == null ? d2.d() : null;
                    if (d3 != null) {
                        joVar.a = new oo(this.e, new m(d3.b(b2), d3.a, d3.b, null), o, this.d.p(), this.d.g(), d2.b());
                        return;
                    }
                }
                long e2 = ((long) d2.e()) - 1;
                po poVar = list.isEmpty() ? null : (po) list.get(list.size() - 1);
                if (poVar == null) {
                    j4 = f0.i((long) d2.g(j2), 0, e2);
                } else {
                    j4 = poVar.f();
                    if (j4 < 0) {
                        this.l = new BehindLiveWindowException();
                        return;
                    }
                }
                if (j4 > e2) {
                    joVar.b = true;
                    return;
                }
                long j6 = list.isEmpty() ? j3 : -9223372036854775807L;
                int min = (int) Math.min(this.g, (e2 - j4) + 1);
                k kVar = this.e;
                int p = this.d.p();
                Object g2 = this.d.g();
                long h2 = d2.h(j4);
                long f2 = d2.f(j4) + h2;
                e i4 = d2.i(j4);
                if (d2.b() == null) {
                    hoVar = new ro(kVar, new m(i4.b(b2), i4.a, i4.b, null), o, p, g2, h2, f2, j4, 3, o);
                } else {
                    int i5 = 1;
                    while (i2 < min) {
                        e a2 = i4.a(d2.i(((long) i2) + j4), b2);
                        if (a2 == null) {
                            break;
                        }
                        i5++;
                        i2++;
                        i4 = a2;
                    }
                    hoVar = new mo(kVar, new m(i4.b(b2), i4.a, i4.b, null), o, p, g2, h2, f2, j6, -9223372036854775807L, j4, i5, 0, d2.b());
                }
                joVar.a = hoVar;
                return;
            }
            joVar.b = true;
        }
    }

    public int c(long j2, List<? extends po> list) {
        if (this.l != null || this.d.length() < 2) {
            return list.size();
        }
        return this.d.l(j2, list);
    }

    /* access modifiers changed from: package-private */
    public j d() {
        d0 o = this.d.o();
        for (j jVar : this.h) {
            if (jVar.c().equals(o.e(null))) {
                return jVar;
            }
        }
        return null;
    }

    public void e() {
        IOException iOException = this.l;
        if (iOException == null) {
            ((Loader) this.a).j();
            return;
        }
        throw iOException;
    }

    public void f(ho hoVar) {
        this.i.g(hoVar.a.a);
        this.k = 0;
        this.l = null;
    }

    public boolean g(ho hoVar, boolean z, Exception exc, long j2) {
        this.i.f(hoVar.a.a);
        j d2 = d();
        if (d2 != null && this.i.a(d2.a())) {
            this.k++;
        }
        if (d2 == null || this.k >= 3) {
            d0 d0Var = hoVar.c;
            if (!(d0Var != null && TextUtils.equals(d0Var.r, "text/vtt"))) {
                return false;
            }
            this.j = true;
        }
        return z;
    }
}
