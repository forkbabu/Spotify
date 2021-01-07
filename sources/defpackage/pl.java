package defpackage;

import com.google.android.exoplayer2.audio.h;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: pl  reason: default package */
public final class pl implements vl {
    private final u a;
    private final v b;
    private final String c;
    private String d;
    private zj e;
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private boolean i = false;
    private long j;
    private d0 k;
    private int l;
    private long m;

    public pl(String str) {
        u uVar = new u(new byte[16]);
        this.a = uVar;
        this.b = new v(uVar.a);
        this.c = str;
    }

    @Override // defpackage.vl
    public void b(v vVar) {
        int i2;
        boolean z;
        int x;
        while (vVar.a() > 0) {
            int i3 = this.f;
            boolean z2 = true;
            if (i3 == 0) {
                while (true) {
                    i2 = 65;
                    if (vVar.a() <= 0) {
                        z = false;
                        break;
                    } else if (!this.h) {
                        this.h = vVar.x() == 172;
                    } else {
                        x = vVar.x();
                        this.h = x == 172;
                        if (x == 64 || x == 65) {
                            break;
                        }
                    }
                }
                this.i = x == 65;
                z = true;
                if (z) {
                    this.f = 1;
                    byte[] bArr = this.b.a;
                    bArr[0] = -84;
                    if (!this.i) {
                        i2 = 64;
                    }
                    bArr[1] = (byte) i2;
                    this.g = 2;
                }
            } else if (i3 == 1) {
                byte[] bArr2 = this.b.a;
                int min = Math.min(vVar.a(), 16 - this.g);
                vVar.g(bArr2, this.g, min);
                int i4 = this.g + min;
                this.g = i4;
                if (i4 != 16) {
                    z2 = false;
                }
                if (z2) {
                    this.a.m(0);
                    h.b b2 = h.b(this.a);
                    d0 d0Var = this.k;
                    if (d0Var == null || 2 != d0Var.E || b2.a != d0Var.F || !"audio/ac4".equals(d0Var.r)) {
                        d0 o = d0.o(this.d, "audio/ac4", null, -1, -1, 2, b2.a, null, null, 0, this.c);
                        this.k = o;
                        this.e.c(o);
                    }
                    this.l = b2.b;
                    this.j = (((long) b2.c) * 1000000) / ((long) this.k.F);
                    this.b.K(0);
                    this.e.b(this.b, 16);
                    this.f = 2;
                }
            } else if (i3 == 2) {
                int min2 = Math.min(vVar.a(), this.l - this.g);
                this.e.b(vVar, min2);
                int i5 = this.g + min2;
                this.g = i5;
                int i6 = this.l;
                if (i5 == i6) {
                    this.e.d(this.m, 1, i6, 0, null);
                    this.m += this.j;
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
        this.m = j2;
    }
}
