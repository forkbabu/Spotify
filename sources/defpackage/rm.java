package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.v;
import defpackage.tm;

/* renamed from: rm  reason: default package */
public final class rm implements qj {
    private rj a;
    private zj b;
    private sm c;
    private int d;
    private int e;

    @Override // defpackage.qj
    public int a(nj njVar, wj wjVar) {
        if (this.c == null) {
            sm a2 = tm.a(njVar);
            this.c = a2;
            if (a2 != null) {
                this.b.c(d0.n(null, "audio/raw", null, a2.a(), 32768, this.c.f(), this.c.k(), this.c.d(), null, null, 0, null));
                this.d = this.c.b();
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.c.l()) {
            sm smVar = this.c;
            njVar.getClass();
            smVar.getClass();
            njVar.j();
            v vVar = new v(8);
            tm.a a3 = tm.a.a(njVar, vVar);
            while (true) {
                int i = a3.a;
                if (i != 1684108385) {
                    long j = a3.b + 8;
                    if (i == 1380533830) {
                        j = 12;
                    }
                    if (j <= 2147483647L) {
                        njVar.l((int) j);
                        a3 = tm.a.a(njVar, vVar);
                    } else {
                        StringBuilder V0 = je.V0("Chunk is too large (~2GB+) to skip; id: ");
                        V0.append(a3.a);
                        throw new ParserException(V0.toString());
                    }
                } else {
                    njVar.l(8);
                    int e2 = (int) njVar.e();
                    long j2 = ((long) e2) + a3.b;
                    long c2 = njVar.c();
                    if (c2 != -1 && j2 > c2) {
                        j2 = c2;
                    }
                    smVar.m(e2, j2);
                    this.a.j(this.c);
                }
            }
        } else if (njVar.e() == 0) {
            njVar.l(this.c.c());
        }
        long g = this.c.g();
        g.m(g != -1);
        long e3 = g - njVar.e();
        if (e3 <= 0) {
            return -1;
        }
        int a4 = this.b.a(njVar, (int) Math.min((long) (32768 - this.e), e3), true);
        if (a4 != -1) {
            this.e += a4;
        }
        int i2 = this.e / this.d;
        if (i2 > 0) {
            long i3 = this.c.i(njVar.e() - ((long) this.e));
            int i4 = i2 * this.d;
            int i5 = this.e - i4;
            this.e = i5;
            this.b.d(i3, 1, i4, i5, null);
        }
        if (a4 == -1) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.a = rjVar;
        this.b = rjVar.s(0, 1);
        this.c = null;
        rjVar.q();
    }

    @Override // defpackage.qj
    public void c(long j, long j2) {
        this.e = 0;
    }

    @Override // defpackage.qj
    public void d() {
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        return tm.a(njVar) != null;
    }
}
