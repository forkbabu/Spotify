package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: zl  reason: default package */
public final class zl implements vl {
    private final v a = new v(10);
    private zj b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    @Override // defpackage.vl
    public void b(v vVar) {
        if (this.c) {
            int a2 = vVar.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a2, 10 - i);
                System.arraycopy(vVar.a, vVar.b(), this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.K(0);
                    if (73 == this.a.x() && 68 == this.a.x() && 51 == this.a.x()) {
                        this.a.L(3);
                        this.e = this.a.w() + 10;
                    } else {
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a2, this.e - this.f);
            this.b.b(vVar, min2);
            this.f += min2;
        }
    }

    @Override // defpackage.vl
    public void c() {
        this.c = false;
    }

    @Override // defpackage.vl
    public void d(rj rjVar, om.d dVar) {
        dVar.a();
        zj s = rjVar.s(dVar.c(), 4);
        this.b = s;
        s.c(d0.s(dVar.b(), "application/id3", null, -1, null));
    }

    @Override // defpackage.vl
    public void e() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.d(this.d, 1, i, 0, null);
            this.c = false;
        }
    }

    @Override // defpackage.vl
    public void f(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }
}
