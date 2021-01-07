package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.v;
import java.io.EOFException;

/* renamed from: kk  reason: default package */
public final class kk implements qj {
    public static final /* synthetic */ int q = 0;
    private final int a;
    private final long b;
    private final v c;
    private final vj d;
    private final tj e;
    private final uj f;
    private rj g;
    private zj h;
    private int i;
    private um j;
    private lk k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private int p;

    public kk() {
        this(0, -9223372036854775807L);
    }

    private lk g(nj njVar) {
        njVar.f(this.c.a, 0, 4, false);
        this.c.K(0);
        vj.b(this.c.h(), this.d);
        return new ik(njVar.c(), njVar.e(), this.d);
    }

    private static boolean h(int i2, long j2) {
        return ((long) (i2 & -128000)) == (j2 & -128000);
    }

    private boolean i(nj njVar) {
        lk lkVar = this.k;
        if (lkVar != null) {
            long g2 = lkVar.g();
            if (g2 != -1 && njVar.d() > g2 - 4) {
                return true;
            }
        }
        try {
            return !njVar.f(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean j(nj njVar, boolean z) {
        int i2;
        int i3;
        int a2;
        hk hkVar;
        int i4 = z ? 16384 : 131072;
        njVar.j();
        if (njVar.e() == 0) {
            if ((this.a & 2) == 0) {
                hkVar = null;
            } else {
                hkVar = hk.a;
            }
            um a3 = this.f.a(njVar, hkVar);
            this.j = a3;
            if (a3 != null) {
                this.e.b(a3);
            }
            i2 = (int) njVar.d();
            if (!z) {
                njVar.l(i2);
            }
            i3 = 0;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (!i(njVar)) {
                this.c.K(0);
                int h2 = this.c.h();
                if ((i3 == 0 || h(h2, (long) i3)) && (a2 = vj.a(h2)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        vj.b(h2, this.d);
                        i3 = h2;
                    }
                    njVar.a(a2 - 4, false);
                } else {
                    int i7 = i6 + 1;
                    if (i6 != i4) {
                        if (z) {
                            njVar.j();
                            njVar.a(i2 + i7, false);
                        } else {
                            njVar.l(1);
                        }
                        i6 = i7;
                        i3 = 0;
                        i5 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw new ParserException("Searched too many bytes.");
                    }
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            njVar.l(i2 + i6);
        } else {
            njVar.j();
        }
        this.i = i3;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0179  */
    @Override // defpackage.qj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(defpackage.nj r33, defpackage.wj r34) {
        /*
        // Method dump skipped, instructions count: 589
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.a(nj, wj):int");
    }

    @Override // defpackage.qj
    public void b(rj rjVar) {
        this.g = rjVar;
        this.h = rjVar.s(0, 1);
        this.g.q();
    }

    @Override // defpackage.qj
    public void c(long j2, long j3) {
        this.i = 0;
        this.m = -9223372036854775807L;
        this.n = 0;
        this.p = 0;
    }

    @Override // defpackage.qj
    public void d() {
    }

    public void e() {
        this.l = true;
    }

    @Override // defpackage.qj
    public boolean f(nj njVar) {
        return j(njVar, true);
    }

    public kk(int i2, long j2) {
        this.a = i2;
        this.b = j2;
        this.c = new v(10);
        this.d = new vj();
        this.e = new tj();
        this.m = -9223372036854775807L;
        this.f = new uj();
    }
}
