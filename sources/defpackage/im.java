package defpackage;

import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: im  reason: default package */
public final class im implements om {
    private final hm a;
    private final v b = new v(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public im(hm hmVar) {
        this.a = hmVar;
    }

    @Override // defpackage.om
    public void a(e0 e0Var, rj rjVar, om.d dVar) {
        this.a.a(e0Var, rjVar, dVar);
        this.f = true;
    }

    @Override // defpackage.om
    public void b(v vVar, int i) {
        boolean z = (i & 1) != 0;
        int b2 = z ? vVar.b() + vVar.x() : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                vVar.K(b2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (vVar.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int x = vVar.x();
                    vVar.K(vVar.b() - 1);
                    if (x == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(vVar.a(), 3 - this.d);
                vVar.g(this.b.a, this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    this.b.G(3);
                    this.b.L(1);
                    int x2 = this.b.x();
                    int x3 = this.b.x();
                    this.e = (x2 & 128) != 0;
                    int i4 = (((x2 & 15) << 8) | x3) + 3;
                    this.c = i4;
                    v vVar2 = this.b;
                    byte[] bArr = vVar2.a;
                    if (bArr.length < i4) {
                        vVar2.G(Math.min(4098, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(vVar.a(), this.c - this.d);
                vVar.g(this.b.a, this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.G(i6);
                    } else if (f0.k(this.b.a, 0, i6, -1) != 0) {
                        this.f = true;
                        return;
                    } else {
                        this.b.G(this.c - 4);
                    }
                    this.a.b(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.om
    public void c() {
        this.f = true;
    }
}
