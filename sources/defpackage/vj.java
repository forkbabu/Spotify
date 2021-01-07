package defpackage;

import com.comscore.android.ConnectivityType;

/* renamed from: vj  reason: default package */
public final class vj {
    private static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] i = {44100, 48000, 32000};
    private static final int[] j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] m = {32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] n = {8000, 16000, 24000, 32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & -2097152) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? j[i5 - 1] : k[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
        } else {
            i7 = n[i5 - 1];
        }
        int i10 = 144;
        if (i3 == 3) {
            return je.g0(i7, 144, i8, i9);
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return je.g0(i10, i7, i8, i9);
    }

    public static boolean b(int i2, vj vjVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i2 & -2097152) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = i[i6];
        int i11 = 2;
        if (i3 == 2) {
            i10 /= 2;
        } else if (i3 == 0) {
            i10 /= 4;
        }
        int i12 = (i2 >>> 9) & 1;
        int i13 = 1152;
        if (i4 == 3) {
            i9 = i3 == 3 ? j[i5 - 1] : k[i5 - 1];
            i7 = (((i9 * 12) / i10) + i12) * 4;
            i8 = 384;
        } else if (i3 == 3) {
            i9 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
            i7 = je.g0(i9, 144, i10, i12);
            i8 = 1152;
        } else {
            i9 = n[i5 - 1];
            if (i4 == 1) {
                i13 = 576;
            }
            i7 = je.g0(i4 == 1 ? 72 : 144, i9, i10, i12);
            i8 = i13;
        }
        String str = h[3 - i4];
        if (((i2 >> 6) & 3) == 3) {
            i11 = 1;
        }
        vjVar.a = i3;
        vjVar.b = str;
        vjVar.c = i7;
        vjVar.d = i10;
        vjVar.e = i11;
        vjVar.f = i9;
        vjVar.g = i8;
        return true;
    }
}
