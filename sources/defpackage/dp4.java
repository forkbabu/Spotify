package defpackage;

import defpackage.ln4;
import defpackage.nn4;
import defpackage.op4;
import defpackage.qp4;
import defpackage.qu0;
import defpackage.vn4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dp4  reason: default package */
public class dp4 extends wba {
    private final tn4 o;
    private final o4d p;
    private final rn4 q;
    private final vn4 r;
    private final ln4 s;
    private final pn4 t;
    private final nn4 u;
    private final p4d v;
    private boolean w;

    public dp4(tn4 tn4, o4d o4d, rn4 rn4, vn4 vn4, ln4 ln4, pn4 pn4, nn4 nn4, p4d p4d) {
        this.o = tn4;
        this.p = o4d;
        this.q = rn4;
        this.r = vn4;
        this.s = ln4;
        this.t = pn4;
        this.u = nn4;
        this.v = p4d;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.vba
    public List<qu0> Z() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.w) {
            arrayList.add(this.o);
        } else {
            arrayList.add(this.p);
        }
        arrayList.add(this.q);
        arrayList.add(this.r);
        arrayList.add(this.s);
        if (this.w) {
            arrayList.add(this.v);
        }
        arrayList.add(this.t);
        arrayList.add(this.u);
        return arrayList;
    }

    public void g0(ln4.a aVar) {
        this.s.i(aVar);
    }

    public void i0(ln4.c cVar) {
        this.s.l(cVar);
    }

    public void j0(nn4.a aVar) {
        this.u.i(aVar);
    }

    public void k0(op4.a aVar) {
        this.q.g(aVar);
    }

    public void l0(boolean z) {
        this.r.i(z);
    }

    public void m0(vn4.b bVar) {
        this.r.h(bVar);
    }

    public void n0(int i) {
        this.o.d(i);
        this.p.d(i);
    }

    public void p0(boolean z, boolean z2) {
        this.s.j(z);
        this.s.k(z2);
    }

    public void q0(qu0.a aVar) {
        this.v.a(aVar);
    }

    public void r0(boolean z) {
        this.w = z;
    }

    public void s0(qp4.a aVar) {
        this.s.m(aVar);
    }

    public void t0() {
        this.s.start();
        this.q.start();
        if (this.w) {
            this.v.start();
        }
    }

    public void u0() {
        this.s.stop();
        this.q.stop();
        if (this.w) {
            this.v.stop();
        }
    }

    public void v0(int i) {
        b0();
        this.o.d(i);
        this.p.d(i);
        z();
    }
}
