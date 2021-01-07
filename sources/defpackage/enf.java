package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: enf  reason: default package */
public abstract class enf {
    private static final enf a = new dnf();
    public static final a b = new a(null);

    /* renamed from: enf$a */
    public static final class a extends enf {
        public a(f fVar) {
        }

        @Override // defpackage.enf
        public int b(int i) {
            return enf.a.b(i);
        }

        @Override // defpackage.enf
        public int c() {
            return enf.a.c();
        }

        @Override // defpackage.enf
        public long d() {
            return enf.a.d();
        }

        @Override // defpackage.enf
        public long e(long j, long j2) {
            return enf.a.e(j, j2);
        }
    }

    static {
        amf.a.getClass();
    }

    public abstract int b(int i);

    public abstract int c();

    public abstract long d();

    public long e(long j, long j2) {
        long j3;
        long d;
        long j4;
        int i;
        if (j2 > j) {
            long j5 = j2 - j;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i2 = (int) j5;
                    int i3 = (int) (j5 >>> 32);
                    if (i2 != 0) {
                        i = b(31 - Integer.numberOfLeadingZeros(i2));
                    } else if (i3 == 1) {
                        i = c();
                    } else {
                        j3 = (((long) b(31 - Integer.numberOfLeadingZeros(i3))) << 32) + ((long) c());
                    }
                    j3 = ((long) i) & 4294967295L;
                } else {
                    do {
                        d = d() >>> 1;
                        j4 = d % j5;
                    } while ((j5 - 1) + (d - j4) < 0);
                    j3 = j4;
                }
                return j + j3;
            }
            while (true) {
                long d2 = d();
                if (j <= d2 && j2 > d2) {
                    return d2;
                }
            }
        } else {
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            h.e(valueOf, "from");
            h.e(valueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
        }
    }
}
