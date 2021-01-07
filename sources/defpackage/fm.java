package defpackage;

import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;

/* renamed from: fm  reason: default package */
final class fm {
    private final e0 a = new e0(0);
    private final v b = new v();
    private boolean c;
    private boolean d;
    private boolean e;
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;

    fm() {
    }

    private int a(nj njVar) {
        this.b.H(f0.f);
        this.c = true;
        njVar.j();
        return 0;
    }

    private int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long g(v vVar) {
        int b2 = vVar.b();
        if (vVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        vVar.g(bArr, 0, 9);
        vVar.K(b2);
        if (!((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3)) {
            return -9223372036854775807L;
        }
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long b() {
        return this.h;
    }

    public e0 c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public int f(nj njVar, wj wjVar) {
        long j = -9223372036854775807L;
        if (!this.e) {
            long c2 = njVar.c();
            int min = (int) Math.min(20000L, c2);
            long j2 = c2 - ((long) min);
            if (njVar.e() != j2) {
                wjVar.a = j2;
                return 1;
            }
            this.b.G(min);
            njVar.j();
            njVar.f(this.b.a, 0, min, false);
            v vVar = this.b;
            int b2 = vVar.b();
            int c3 = vVar.c() - 4;
            while (true) {
                if (c3 < b2) {
                    break;
                }
                if (e(vVar.a, c3) == 442) {
                    vVar.K(c3 + 4);
                    long g2 = g(vVar);
                    if (g2 != -9223372036854775807L) {
                        j = g2;
                        break;
                    }
                }
                c3--;
            }
            this.g = j;
            this.e = true;
            return 0;
        } else if (this.g == -9223372036854775807L) {
            a(njVar);
            return 0;
        } else if (!this.d) {
            int min2 = (int) Math.min(20000L, njVar.c());
            long j3 = (long) 0;
            if (njVar.e() != j3) {
                wjVar.a = j3;
                return 1;
            }
            this.b.G(min2);
            njVar.j();
            njVar.f(this.b.a, 0, min2, false);
            v vVar2 = this.b;
            int b3 = vVar2.b();
            int c4 = vVar2.c();
            while (true) {
                if (b3 >= c4 - 3) {
                    break;
                }
                if (e(vVar2.a, b3) == 442) {
                    vVar2.K(b3 + 4);
                    long g3 = g(vVar2);
                    if (g3 != -9223372036854775807L) {
                        j = g3;
                        break;
                    }
                }
                b3++;
            }
            this.f = j;
            this.d = true;
            return 0;
        } else {
            long j4 = this.f;
            if (j4 == -9223372036854775807L) {
                a(njVar);
                return 0;
            }
            this.h = this.a.b(this.g) - this.a.b(j4);
            a(njVar);
            return 0;
        }
    }
}
