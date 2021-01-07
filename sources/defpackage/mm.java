package defpackage;

import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v;

/* access modifiers changed from: package-private */
/* renamed from: mm  reason: default package */
public final class mm {
    private final e0 a = new e0(0);
    private final v b = new v();
    private boolean c;
    private boolean d;
    private boolean e;
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;

    mm() {
    }

    private int a(nj njVar) {
        this.b.H(f0.f);
        this.c = true;
        njVar.j();
        return 0;
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

    public int e(nj njVar, wj wjVar, int i) {
        if (i <= 0) {
            a(njVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.e) {
            long c2 = njVar.c();
            int min = (int) Math.min(112800L, c2);
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
            int c3 = vVar.c();
            while (true) {
                c3--;
                if (c3 < b2) {
                    break;
                } else if (vVar.a[c3] == 71) {
                    long a2 = pm.a(vVar, c3, i);
                    if (a2 != -9223372036854775807L) {
                        j = a2;
                        break;
                    }
                }
            }
            this.g = j;
            this.e = true;
            return 0;
        } else if (this.g == -9223372036854775807L) {
            a(njVar);
            return 0;
        } else if (!this.d) {
            int min2 = (int) Math.min(112800L, njVar.c());
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
                if (b3 >= c4) {
                    break;
                }
                if (vVar2.a[b3] == 71) {
                    long a3 = pm.a(vVar2, b3, i);
                    if (a3 != -9223372036854775807L) {
                        j = a3;
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
