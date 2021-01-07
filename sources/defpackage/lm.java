package defpackage;

import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;
import defpackage.kj;

/* access modifiers changed from: package-private */
/* renamed from: lm  reason: default package */
public final class lm extends kj {

    /* renamed from: lm$a */
    private static final class a implements kj.g {
        private final e0 a;
        private final v b = new v();
        private final int c;

        public a(int i, e0 e0Var) {
            this.c = i;
            this.a = e0Var;
        }

        @Override // defpackage.kj.g
        public kj.f a(nj njVar, long j, kj.c cVar) {
            long e = njVar.e();
            int min = (int) Math.min(112800L, njVar.c() - e);
            this.b.G(min);
            njVar.f(this.b.a, 0, min, false);
            v vVar = this.b;
            int c2 = vVar.c();
            long j2 = -1;
            long j3 = -1;
            long j4 = -9223372036854775807L;
            while (vVar.a() >= 188) {
                byte[] bArr = vVar.a;
                int b2 = vVar.b();
                while (b2 < c2 && bArr[b2] != 71) {
                    b2++;
                }
                int i = b2 + 188;
                if (i > c2) {
                    break;
                }
                long a2 = pm.a(vVar, b2, this.c);
                if (a2 != -9223372036854775807L) {
                    long b3 = this.a.b(a2);
                    if (b3 > j) {
                        if (j4 == -9223372036854775807L) {
                            return kj.f.d(b3, e);
                        }
                        return kj.f.e(e + j3);
                    } else if (100000 + b3 > j) {
                        return kj.f.e(e + ((long) b2));
                    } else {
                        j4 = b3;
                        j3 = (long) b2;
                    }
                }
                vVar.K(i);
                j2 = (long) i;
            }
            if (j4 != -9223372036854775807L) {
                return kj.f.f(j4, e + j2);
            }
            return kj.f.d;
        }

        @Override // defpackage.kj.g
        public void b() {
            this.b.H(f0.f);
        }
    }

    public lm(e0 e0Var, long j, long j2, int i) {
        super(new kj.b(), new a(i, e0Var), j, 0, j + 1, 0, j2, 188, 940);
    }
}
