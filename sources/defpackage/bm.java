package defpackage;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: bm  reason: default package */
public final class bm implements vl {
    private final v a;
    private final vj b;
    private final String c;
    private String d;
    private zj e;
    private int f = 0;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public bm(String str) {
        v vVar = new v(4);
        this.a = vVar;
        vVar.a[0] = -1;
        this.b = new vj();
        this.c = str;
    }

    @Override // defpackage.vl
    public void b(v vVar) {
        while (vVar.a() > 0) {
            int i2 = this.f;
            if (i2 == 0) {
                byte[] bArr = vVar.a;
                int b2 = vVar.b();
                int c2 = vVar.c();
                while (true) {
                    if (b2 >= c2) {
                        vVar.K(c2);
                        break;
                    }
                    boolean z = (bArr[b2] & 255) == 255;
                    boolean z2 = this.i && (bArr[b2] & 224) == 224;
                    this.i = z;
                    if (z2) {
                        vVar.K(b2 + 1);
                        this.i = false;
                        this.a.a[1] = bArr[b2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    b2++;
                }
            } else if (i2 == 1) {
                int min = Math.min(vVar.a(), 4 - this.g);
                vVar.g(this.a.a, this.g, min);
                int i3 = this.g + min;
                this.g = i3;
                if (i3 >= 4) {
                    this.a.K(0);
                    if (!vj.b(this.a.h(), this.b)) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        vj vjVar = this.b;
                        this.k = vjVar.c;
                        if (!this.h) {
                            int i4 = vjVar.d;
                            this.j = (((long) vjVar.g) * 1000000) / ((long) i4);
                            this.e.c(d0.o(this.d, vjVar.b, null, -1, 4096, vjVar.e, i4, null, null, 0, this.c));
                            this.h = true;
                        }
                        this.a.K(0);
                        this.e.b(this.a, 4);
                        this.f = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(vVar.a(), this.k - this.g);
                this.e.b(vVar, min2);
                int i5 = this.g + min2;
                this.g = i5;
                int i6 = this.k;
                if (i5 >= i6) {
                    this.e.d(this.l, 1, i6, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // defpackage.vl
    public void c() {
        this.f = 0;
        this.g = 0;
        this.i = false;
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
