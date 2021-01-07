package com.spotify.music.yourlibrary.quickscroll;

import com.spotify.music.yourlibrary.quickscroll.i;
import com.spotify.music.yourlibrary.quickscroll.u;

/* access modifiers changed from: package-private */
public class t implements m {
    private k a;
    private final l b;
    private n c;
    private v d;
    private u e;
    private final u.a.AbstractC0355a f;
    private final u.a.AbstractC0355a g;
    private boolean h;

    t(k kVar, l lVar) {
        i.b bVar = new i.b();
        bVar.c(0.0f);
        bVar.b(0);
        this.f = bVar;
        i.b bVar2 = new i.b();
        bVar2.c(0.0f);
        bVar2.b(0);
        this.g = bVar2;
        this.a = kVar;
        this.b = lVar;
    }

    private int d(int i, int i2) {
        do {
            i += i2;
            if (!(i >= 0 && i < this.d.getSize())) {
                return -1;
            }
        } while (this.d.h(i));
        return i;
    }

    private void e() {
        if (this.a.o()) {
            ((c0) this.c).e();
        }
        ((c0) this.c).f();
        ((c0) this.c).u();
        ((c0) this.c).a();
        u uVar = this.e;
        if (uVar != null) {
            uVar.getClass();
            this.h = false;
        }
    }

    private void f() {
        u uVar = this.e;
        if (uVar != null && !this.h) {
            uVar.a();
            this.h = true;
        }
    }

    private void l(int i) {
        this.d.o(i);
        ((c0) this.c).B(this.d.a(i));
    }

    private void n(k kVar) {
        if (kVar.h()) {
            ((c0) this.c).x(true);
            ((c0) this.c).b();
            if (kVar.o()) {
                ((c0) this.c).w(true);
            }
            u uVar = this.e;
            if (uVar != null && !this.h) {
                uVar.a();
                this.h = true;
                return;
            }
            return;
        }
        ((c0) this.c).x(false);
        ((c0) this.c).w(false);
        ((c0) this.c).a();
    }

    private void o(k kVar) {
        if (kVar.o()) {
            ((c0) this.c).n();
            return;
        }
        ((c0) this.c).s();
        ((c0) this.c).t();
    }

    private boolean p(int i) {
        if (this.a.m()) {
            if (i == 0) {
                return true;
            }
        }
        if (this.a.l()) {
            v vVar = this.d;
            if (vVar != null && i > 0 && (vVar.g() + i) + -1 >= (this.d.getSize() - this.d.m()) + -1) {
                return true;
            }
        }
        return false;
    }

    private void r(int i) {
        double d2;
        ((c0) this.c).B(this.d.a(i));
        float d3 = (float) ((c0) this.c).d();
        float size = ((float) this.d.getSize()) - Math.max(((float) this.d.g()) - 1.0f, 0.0f);
        if (size <= 0.0f) {
            d3 = 0.0f;
        } else {
            double d4 = (double) (d3 / size);
            double d5 = (double) i;
            Double.isNaN(d5);
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d4);
            Double.isNaN(d5);
            Double.isNaN(d4);
            double d6 = d5 * d4;
            double d7 = (double) d3;
            Double.isNaN(d7);
            Double.isNaN(d7);
            Double.isNaN(d7);
            if (d6 >= d7 / 2.0d) {
                d2 = Math.ceil(d6);
            } else {
                d2 = Math.floor(d6);
            }
            float f2 = (float) d2;
            if (((double) (d3 - f2)) >= d4) {
                d3 = f2;
            }
        }
        ((c0) this.c).o(d3);
        ((c0) this.c).p(d3);
        i.b bVar = (i.b) this.f;
        bVar.c(d3);
        bVar.b(i);
    }

    public void a(n nVar) {
        this.c = nVar;
        o(this.a);
        n(this.a);
    }

    public void b(v vVar) {
        this.d = vVar;
        r(0);
    }

    public void c(v vVar, int i) {
        this.d = vVar;
        r(i);
    }

    public void g() {
        e();
    }

    public void h() {
        if (this.a.o()) {
            ((c0) this.c).z();
        } else {
            ((c0) this.c).r();
        }
        ((o) this.b).b();
        u.a.AbstractC0355a aVar = this.g;
        u.a.AbstractC0355a aVar2 = this.f;
        aVar.getClass();
        u.a a2 = ((i.b) aVar2).a();
        i.b bVar = (i.b) aVar;
        bVar.c(a2.b());
        bVar.b(a2.a());
        u uVar = this.e;
        if (uVar != null) {
            uVar.getClass();
        }
    }

    public void i() {
        if (!this.a.o()) {
            ((c0) this.c).u();
        }
        v vVar = this.d;
        if (vVar != null ? p(vVar.f()) : false) {
            e();
        } else {
            ((o) this.b).a(this.a.d(), this);
        }
        u uVar = this.e;
        if (uVar != null) {
            uVar.b(((i.b) this.g).a(), ((i.b) this.f).a());
        }
    }

    public void j(int i) {
        v vVar = this.d;
        if (vVar != null) {
            if (!(i > 0 && (vVar.g() + i) + -1 > (this.d.getSize() - this.d.m()) + -1)) {
                if (!this.d.h(i)) {
                    r(i);
                    if (p(i)) {
                        e();
                        return;
                    }
                    ((c0) this.c).b();
                    if (this.a.o()) {
                        ((c0) this.c).y();
                    } else {
                        ((c0) this.c).z();
                    }
                    if (!((c0) this.c).j()) {
                        ((o) this.b).a(this.a.d(), this);
                    }
                    f();
                    return;
                }
                e();
            }
        }
    }

    public void k(float f2) {
        int i;
        double d2;
        if (this.d != null) {
            float d3 = (float) ((c0) this.c).d();
            float size = (float) this.d.getSize();
            float g2 = (float) this.d.g();
            if (d3 <= 0.0f) {
                i = 0;
            } else {
                double max = (double) ((size - Math.max(g2 - 1.0f, 0.0f)) / d3);
                double d4 = (double) f2;
                Double.isNaN(d4);
                Double.isNaN(max);
                Double.isNaN(d4);
                Double.isNaN(max);
                Double.isNaN(d4);
                Double.isNaN(max);
                double d5 = d4 * max;
                double d6 = (double) size;
                Double.isNaN(d6);
                Double.isNaN(d6);
                Double.isNaN(d6);
                if (d5 >= d6 / 2.0d) {
                    d2 = Math.ceil(d5);
                } else {
                    d2 = Math.floor(d5);
                }
                i = (int) d2;
            }
            if (!this.d.h(i)) {
                l(i);
            } else {
                int d7 = d(i, -1);
                if (d7 >= 0) {
                    l(d7);
                } else {
                    int d8 = d(i, 1);
                    if (d8 >= 0) {
                        l(d8);
                    } else {
                        l(i);
                    }
                }
            }
            i.b bVar = (i.b) this.f;
            bVar.c(f2);
            bVar.b(i);
        }
    }

    public void m(u uVar) {
        this.e = uVar;
    }

    public void q(k kVar) {
        if (this.c != null) {
            if (kVar.o() != this.a.o()) {
                o(kVar);
            }
            if (kVar.h() != this.a.h()) {
                n(kVar);
            }
        }
        this.a = kVar;
    }
}
