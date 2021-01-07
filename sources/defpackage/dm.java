package defpackage;

import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import defpackage.om;

/* renamed from: dm  reason: default package */
public final class dm implements om {
    private final vl a;
    private final u b = new u(new byte[10]);
    private int c = 0;
    private int d;
    private e0 e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public dm(vl vlVar) {
        this.a = vlVar;
    }

    private boolean d(v vVar, byte[] bArr, int i2) {
        int min = Math.min(vVar.a(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.L(min);
        } else {
            vVar.g(bArr, this.d, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        if (i3 == i2) {
            return true;
        }
        return false;
    }

    private void e(int i2) {
        this.c = i2;
        this.d = 0;
    }

    @Override // defpackage.om
    public void a(e0 e0Var, rj rjVar, om.d dVar) {
        this.e = e0Var;
        this.a.d(rjVar, dVar);
    }

    @Override // defpackage.om
    public final void b(v vVar, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            int i3 = this.c;
            if (!(i3 == 0 || i3 == 1 || i3 == 2)) {
                if (i3 == 3) {
                    int i4 = this.j;
                    this.a.e();
                } else {
                    throw new IllegalStateException();
                }
            }
            e(1);
        }
        int i5 = i2;
        while (vVar.a() > 0) {
            int i6 = this.c;
            if (i6 != 0) {
                int i7 = 0;
                if (i6 != 1) {
                    if (i6 == 2) {
                        if (d(vVar, this.b.a, Math.min(10, this.i)) && d(vVar, null, this.i)) {
                            this.b.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                this.b.o(4);
                                this.b.o(1);
                                this.b.o(1);
                                long h2 = (((long) this.b.h(3)) << 30) | ((long) (this.b.h(15) << 15)) | ((long) this.b.h(15));
                                this.b.o(1);
                                if (!this.h && this.g) {
                                    this.b.o(4);
                                    this.b.o(1);
                                    long h3 = (long) (this.b.h(15) << 15);
                                    this.b.o(1);
                                    this.b.o(1);
                                    this.e.b(h3 | (((long) this.b.h(3)) << 30) | ((long) this.b.h(15)));
                                    this.h = true;
                                }
                                this.l = this.e.b(h2);
                            }
                            i5 |= this.k ? 4 : 0;
                            this.a.f(this.l, i5);
                            e(3);
                        }
                    } else if (i6 == 3) {
                        int a2 = vVar.a();
                        int i8 = this.j;
                        if (i8 != -1) {
                            i7 = a2 - i8;
                        }
                        if (i7 > 0) {
                            a2 -= i7;
                            vVar.J(vVar.b() + a2);
                        }
                        this.a.b(vVar);
                        int i9 = this.j;
                        if (i9 != -1) {
                            int i10 = i9 - a2;
                            this.j = i10;
                            if (i10 == 0) {
                                this.a.e();
                                e(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(vVar, this.b.a, 9)) {
                    int i11 = 0;
                    this.b.m(0);
                    if (this.b.h(24) != 1) {
                        this.j = -1;
                        z = false;
                    } else {
                        this.b.o(8);
                        int h4 = this.b.h(16);
                        this.b.o(5);
                        this.k = this.b.g();
                        this.b.o(2);
                        this.f = this.b.g();
                        this.g = this.b.g();
                        this.b.o(6);
                        int h5 = this.b.h(8);
                        this.i = h5;
                        if (h4 == 0) {
                            this.j = -1;
                        } else {
                            this.j = ((h4 + 6) - 9) - h5;
                        }
                        z = true;
                    }
                    if (z) {
                        i11 = 2;
                    }
                    e(i11);
                }
            } else {
                vVar.L(vVar.a());
            }
        }
    }

    @Override // defpackage.om
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }
}
