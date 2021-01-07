package defpackage;

import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import defpackage.kj;

/* renamed from: em  reason: default package */
final class em extends kj {

    /* renamed from: em$b */
    private static final class b implements kj.g {
        private final e0 a;
        private final v b = new v();

        b(e0 e0Var, a aVar) {
            this.a = e0Var;
        }

        @Override // defpackage.kj.g
        public kj.f a(nj njVar, long j, kj.c cVar) {
            int h;
            long e = njVar.e();
            int min = (int) Math.min(20000L, njVar.c() - e);
            this.b.G(min);
            njVar.f(this.b.a, 0, min, false);
            v vVar = this.b;
            int i = -1;
            long j2 = -9223372036854775807L;
            int i2 = -1;
            while (vVar.a() >= 4) {
                if (em.h(vVar.a, vVar.b()) != 442) {
                    vVar.L(1);
                } else {
                    vVar.L(4);
                    long g = fm.g(vVar);
                    if (g != -9223372036854775807L) {
                        long b2 = this.a.b(g);
                        if (b2 > j) {
                            if (j2 == -9223372036854775807L) {
                                return kj.f.d(b2, e);
                            }
                            return kj.f.e(e + ((long) i2));
                        } else if (100000 + b2 > j) {
                            return kj.f.e(e + ((long) vVar.b()));
                        } else {
                            i2 = vVar.b();
                            j2 = b2;
                        }
                    }
                    int c = vVar.c();
                    if (vVar.a() >= 10) {
                        vVar.L(9);
                        int x = vVar.x() & 7;
                        if (vVar.a() >= x) {
                            vVar.L(x);
                            if (vVar.a() >= 4) {
                                if (em.h(vVar.a, vVar.b()) == 443) {
                                    vVar.L(4);
                                    int D = vVar.D();
                                    if (vVar.a() < D) {
                                        vVar.K(c);
                                    } else {
                                        vVar.L(D);
                                    }
                                }
                                while (true) {
                                    if (vVar.a() < 4 || (h = em.h(vVar.a, vVar.b())) == 442 || h == 441 || (h >>> 8) != 1) {
                                        break;
                                    }
                                    vVar.L(4);
                                    if (vVar.a() < 2) {
                                        vVar.K(c);
                                        break;
                                    }
                                    vVar.K(Math.min(vVar.c(), vVar.b() + vVar.D()));
                                }
                            } else {
                                vVar.K(c);
                            }
                        } else {
                            vVar.K(c);
                        }
                    } else {
                        vVar.K(c);
                    }
                    i = vVar.b();
                }
            }
            if (j2 != -9223372036854775807L) {
                return kj.f.f(j2, e + ((long) i));
            }
            return kj.f.d;
        }

        @Override // defpackage.kj.g
        public void b() {
            this.b.H(f0.f);
        }
    }

    public em(e0 e0Var, long j, long j2) {
        super(new kj.b(), new b(e0Var, null), j, 0, j + 1, 0, j2, 188, Constants.ONE_SECOND);
    }

    static int h(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
