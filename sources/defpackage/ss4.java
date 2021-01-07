package defpackage;

import com.spotify.music.C0707R;
import defpackage.dr4;
import defpackage.qu0;
import defpackage.wt4;
import defpackage.zs4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ss4  reason: default package */
public class ss4 extends vba {
    private final fr4 n;
    private final dr4 o;
    private final p4d p;
    private final n4d q;
    private final hr4 r;
    private boolean s;
    private boolean t;

    public ss4(fr4 fr4, dr4 dr4, p4d p4d, n4d n4d, hr4 hr4) {
        this.n = fr4;
        this.o = dr4;
        this.p = p4d;
        this.q = n4d;
        this.r = hr4;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.vba
    public List<qu0> Z() {
        ArrayList arrayList = new ArrayList(4);
        if (this.t) {
            arrayList.add(this.q);
            this.r.g(C0707R.string.device_picker_title_select_device_header);
            arrayList.add(this.r);
        }
        arrayList.add(this.n);
        arrayList.add(this.o);
        if (this.s) {
            arrayList.add(this.p);
        }
        return arrayList;
    }

    public void c0(dr4.b bVar) {
        this.o.m(bVar);
    }

    public void f0(dr4.g gVar) {
        this.o.p(gVar);
    }

    public void g0(zs4.a aVar) {
        this.n.g(aVar);
    }

    public void i0(dr4.f fVar) {
        this.o.o(fVar);
    }

    public void j0(boolean z) {
        this.o.n(z);
    }

    public void k0(qu0.a aVar) {
        this.p.a(aVar);
        this.q.a(aVar);
        this.r.a(aVar);
    }

    public void l0(boolean z) {
        this.s = z;
    }

    public void m0(boolean z) {
        this.t = z;
    }

    public void n0(wt4.a aVar) {
        this.o.q(aVar);
    }

    public void p0(boolean z) {
        this.r.h(z);
    }

    public void q0() {
        this.o.start();
        this.n.start();
        if (this.t) {
            this.q.start();
        }
        if (this.s) {
            this.p.start();
        }
    }

    public void r0() {
        this.o.stop();
        this.n.stop();
        if (this.t) {
            this.q.stop();
        }
        if (this.s) {
            this.p.stop();
        }
    }
}
