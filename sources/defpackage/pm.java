package defpackage;

import com.google.android.exoplayer2.util.v;

/* renamed from: pm  reason: default package */
public final class pm {
    public static long a(v vVar, int i, int i2) {
        vVar.K(i);
        if (vVar.a() < 5) {
            return -9223372036854775807L;
        }
        int h = vVar.h();
        if ((8388608 & h) != 0 || ((2096896 & h) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((h & 32) != 0) && vVar.x() >= 7 && vVar.a() >= 7) {
            if ((vVar.x() & 16) == 16) {
                byte[] bArr = new byte[6];
                vVar.g(bArr, 0, 6);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
