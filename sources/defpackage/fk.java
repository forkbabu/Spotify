package defpackage;

import com.google.android.exoplayer2.util.v;

/* renamed from: fk  reason: default package */
final class fk {
    private final v a = new v(8);
    private int b;

    private long a(nj njVar) {
        int i = 0;
        njVar.f(this.a.a, 0, 1, false);
        int i2 = this.a.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ -1);
        njVar.f(this.a.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.a.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return (long) i5;
    }

    public boolean b(nj njVar) {
        long c = njVar.c();
        long j = 1024;
        if (c != -1 && c <= 1024) {
            j = c;
        }
        int i = (int) j;
        njVar.f(this.a.a, 0, 4, false);
        long z = this.a.z();
        this.b = 4;
        while (z != 440786851) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            njVar.f(this.a.a, 0, 1, false);
            z = ((z << 8) & -256) | ((long) (this.a.a[0] & 255));
        }
        long a2 = a(njVar);
        long j2 = (long) this.b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (c != -1 && j2 + a2 >= c) {
            return false;
        }
        while (true) {
            int i3 = this.b;
            long j3 = j2 + a2;
            if (((long) i3) < j3) {
                if (a(njVar) == Long.MIN_VALUE) {
                    return false;
                }
                long a3 = a(njVar);
                if (a3 < 0 || a3 > 2147483647L) {
                    break;
                } else if (a3 != 0) {
                    int i4 = (int) a3;
                    njVar.a(i4, false);
                    this.b += i4;
                }
            } else if (((long) i3) == j3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
