package defpackage;

import com.google.android.exoplayer2.audio.g;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: nl  reason: default package */
public final class nl implements vl {
    private final u a;
    private final v b;
    private final String c;
    private String d;
    private zj e;
    private int f = 0;
    private int g;
    private boolean h;
    private long i;
    private d0 j;
    private int k;
    private long l;

    public nl(String str) {
        u uVar = new u(new byte[128]);
        this.a = uVar;
        this.b = new v(uVar.a);
        this.c = str;
    }

    @Override // defpackage.vl
    public void b(v vVar) {
        boolean z;
        while (vVar.a() > 0) {
            int i2 = this.f;
            boolean z2 = true;
            if (i2 == 0) {
                while (true) {
                    if (vVar.a() <= 0) {
                        z = false;
                        break;
                    } else if (!this.h) {
                        this.h = vVar.x() == 11;
                    } else {
                        int x = vVar.x();
                        if (x == 119) {
                            this.h = false;
                            z = true;
                            break;
                        }
                        this.h = x == 11;
                    }
                }
                if (z) {
                    this.f = 1;
                    byte[] bArr = this.b.a;
                    bArr[0] = 11;
                    bArr[1] = 119;
                    this.g = 2;
                }
            } else if (i2 == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(vVar.a(), 128 - this.g);
                vVar.g(bArr2, this.g, min);
                int i3 = this.g + min;
                this.g = i3;
                if (i3 != 128) {
                    z2 = false;
                }
                if (z2) {
                    this.a.m(0);
                    g.b c2 = g.c(this.a);
                    d0 d0Var = this.j;
                    if (!(d0Var != null && c2.c == d0Var.E && c2.b == d0Var.F && c2.a == d0Var.r)) {
                        d0 o = d0.o(this.d, c2.a, null, -1, -1, c2.c, c2.b, null, null, 0, this.c);
                        this.j = o;
                        this.e.c(o);
                    }
                    this.k = c2.d;
                    this.i = (((long) c2.e) * 1000000) / ((long) this.j.F);
                    this.b.K(0);
                    this.e.b(this.b, 128);
                    this.f = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(vVar.a(), this.k - this.g);
                this.e.b(vVar, min2);
                int i4 = this.g + min2;
                this.g = i4;
                int i5 = this.k;
                if (i4 == i5) {
                    this.e.d(this.l, 1, i5, 0, null);
                    this.l += this.i;
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.vl
    public void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
    }

    @Override // defpackage.vl
    public void d(rj rjVar, om.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = rjVar.s(dVar.c(), 1);
    }

    @Override // defpackage.vl
    public void e() {
    }

    @Override // defpackage.vl
    public void f(long j2, int i2) {
        this.l = j2;
    }
}
