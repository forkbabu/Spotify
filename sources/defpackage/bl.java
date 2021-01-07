package defpackage;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import defpackage.xj;

/* access modifiers changed from: package-private */
/* renamed from: bl  reason: default package */
public final class bl implements gl {
    private final fl a = new fl();
    private final long b;
    private final long c;
    private final il d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    /* renamed from: bl$b */
    private final class b implements xj {
        b(a aVar) {
        }

        @Override // defpackage.xj
        public xj.a e(long j) {
            long b = bl.this.d.b(j);
            return new xj.a(new yj(j, f0.i(((((bl.this.c - bl.this.b) * b) / bl.this.f) + bl.this.b) - 30000, bl.this.b, bl.this.c - 1)));
        }

        @Override // defpackage.xj
        public boolean h() {
            return true;
        }

        @Override // defpackage.xj
        public long j() {
            return bl.this.d.a(bl.this.f);
        }
    }

    public bl(il ilVar, long j2, long j3, long j4, long j5, boolean z) {
        g.a(j2 >= 0 && j3 > j2);
        this.d = ilVar;
        this.b = j2;
        this.c = j3;
        if (j4 == j3 - j2 || z) {
            this.f = j5;
            this.e = 4;
            return;
        }
        this.e = 0;
    }

    private boolean h(nj njVar, long j2) {
        int i2;
        long min = Math.min(j2 + 3, this.c);
        int i3 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i4 = 0;
            if (njVar.e() + ((long) i3) <= min || (i3 = (int) (min - njVar.e())) >= 4) {
                njVar.f(bArr, 0, i3, false);
                while (true) {
                    i2 = i3 - 3;
                    if (i4 >= i2) {
                        break;
                    } else if (bArr[i4] == 79 && bArr[i4 + 1] == 103 && bArr[i4 + 2] == 103 && bArr[i4 + 3] == 83) {
                        njVar.l(i4);
                        return true;
                    } else {
                        i4++;
                    }
                }
            } else {
                return false;
            }
            njVar.l(i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0  */
    @Override // defpackage.gl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(defpackage.nj r23) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(nj):long");
    }

    @Override // defpackage.gl
    public xj b() {
        if (this.f != 0) {
            return new b(null);
        }
        return null;
    }

    @Override // defpackage.gl
    public void c(long j2) {
        this.h = f0.i(j2, 0, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0;
        this.l = this.f;
    }
}
