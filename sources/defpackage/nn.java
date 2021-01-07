package defpackage;

import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: nn  reason: default package */
public final class nn implements wm {
    private final a a;

    /* renamed from: nn$a */
    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    /* access modifiers changed from: private */
    /* renamed from: nn$b */
    public static final class b {
        private final int a;
        private final boolean b;
        private final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public nn() {
        this.a = null;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return f0.f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static hn d(v vVar, int i, int i2) {
        String str;
        int i3;
        int x = vVar.x();
        String r = r(x);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        vVar.g(bArr, 0, i4);
        if (i2 == 2) {
            StringBuilder V0 = je.V0("image/");
            V0.append(f0.Q(new String(bArr, 0, 3, "ISO-8859-1")));
            str = V0.toString();
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            int u = u(bArr, 0);
            String Q = f0.Q(new String(bArr, 0, u, "ISO-8859-1"));
            if (Q.indexOf(47) == -1) {
                i3 = u;
                str = je.x0("image/", Q);
            } else {
                i3 = u;
                str = Q;
            }
        }
        int i5 = i3 + 2;
        int t = t(bArr, i5, x);
        return new hn(str, new String(bArr, i5, t - i5, r), bArr[i3 + 1] & 255, b(bArr, t + q(x), i4));
    }

    private static jn e(v vVar, int i, int i2, boolean z, int i3, a aVar) {
        int b2 = vVar.b();
        int u = u(vVar.a, b2);
        String str = new String(vVar.a, b2, u - b2, "ISO-8859-1");
        vVar.K(u + 1);
        int h = vVar.h();
        int h2 = vVar.h();
        long z2 = vVar.z();
        long j = z2 == 4294967295L ? -1 : z2;
        long z3 = vVar.z();
        long j2 = z3 == 4294967295L ? -1 : z3;
        ArrayList arrayList = new ArrayList();
        int i4 = b2 + i;
        while (vVar.b() < i4) {
            on h3 = h(i2, vVar, z, i3, aVar);
            if (h3 != null) {
                arrayList.add(h3);
            }
        }
        on[] onVarArr = new on[arrayList.size()];
        arrayList.toArray(onVarArr);
        return new jn(str, h, h2, j, j2, onVarArr);
    }

    private static kn f(v vVar, int i, int i2, boolean z, int i3, a aVar) {
        int b2 = vVar.b();
        int u = u(vVar.a, b2);
        String str = new String(vVar.a, b2, u - b2, "ISO-8859-1");
        vVar.K(u + 1);
        int x = vVar.x();
        boolean z2 = (x & 2) != 0;
        boolean z3 = (x & 1) != 0;
        int x2 = vVar.x();
        String[] strArr = new String[x2];
        for (int i4 = 0; i4 < x2; i4++) {
            int b3 = vVar.b();
            int u2 = u(vVar.a, b3);
            strArr[i4] = new String(vVar.a, b3, u2 - b3, "ISO-8859-1");
            vVar.K(u2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = b2 + i;
        while (vVar.b() < i5) {
            on h = h(i2, vVar, z, i3, aVar);
            if (h != null) {
                arrayList.add(h);
            }
        }
        on[] onVarArr = new on[arrayList.size()];
        arrayList.toArray(onVarArr);
        return new kn(str, z2, z3, strArr, onVarArr);
    }

    private static ln g(v vVar, int i) {
        if (i < 4) {
            return null;
        }
        int x = vVar.x();
        String r = r(x);
        byte[] bArr = new byte[3];
        vVar.g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        vVar.g(bArr2, 0, i2);
        int t = t(bArr2, 0, x);
        String str2 = new String(bArr2, 0, t, r);
        int q = t + q(x);
        return new ln(str, str2, l(bArr2, q, t(bArr2, q, x), r));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0181, code lost:
        if (r13 == 67) goto L_0x0183;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.on h(int r17, com.google.android.exoplayer2.util.v r18, boolean r19, int r20, defpackage.nn.a r21) {
        /*
        // Method dump skipped, instructions count: 510
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.h(int, com.google.android.exoplayer2.util.v, boolean, int, nn$a):on");
    }

    private static mn i(v vVar, int i) {
        int x = vVar.x();
        String r = r(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.g(bArr, 0, i2);
        int u = u(bArr, 0);
        String str = new String(bArr, 0, u, "ISO-8859-1");
        int i3 = u + 1;
        int t = t(bArr, i3, x);
        String l = l(bArr, i3, t, r);
        int q = t + q(x);
        int t2 = t(bArr, q, x);
        return new mn(str, l, l(bArr, q, t2, r), b(bArr, t2 + q(x), i2));
    }

    private static qn j(v vVar, int i) {
        int D = vVar.D();
        int A = vVar.A();
        int A2 = vVar.A();
        int x = vVar.x();
        int x2 = vVar.x();
        u uVar = new u();
        uVar.l(vVar.a, vVar.c());
        uVar.m(vVar.b() * 8);
        int i2 = ((i - 10) * 8) / (x + x2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = uVar.h(x);
            int h2 = uVar.h(x2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new qn(D, A, A2, iArr, iArr2);
    }

    private static rn k(v vVar, int i) {
        byte[] bArr = new byte[i];
        vVar.g(bArr, 0, i);
        int u = u(bArr, 0);
        return new rn(new String(bArr, 0, u, "ISO-8859-1"), b(bArr, u + 1, i));
    }

    private static String l(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static sn m(v vVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int x = vVar.x();
        String r = r(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.g(bArr, 0, i2);
        return new sn(str, null, new String(bArr, 0, t(bArr, 0, x), r));
    }

    private static sn n(v vVar, int i) {
        if (i < 1) {
            return null;
        }
        int x = vVar.x();
        String r = r(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.g(bArr, 0, i2);
        int t = t(bArr, 0, x);
        String str = new String(bArr, 0, t, r);
        int q = t + q(x);
        return new sn("TXXX", str, l(bArr, q, t(bArr, q, x), r));
    }

    private static tn o(v vVar, int i, String str) {
        byte[] bArr = new byte[i];
        vVar.g(bArr, 0, i);
        return new tn(str, null, new String(bArr, 0, u(bArr, 0), "ISO-8859-1"));
    }

    private static tn p(v vVar, int i) {
        if (i < 1) {
            return null;
        }
        int x = vVar.x();
        String r = r(x);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        vVar.g(bArr, 0, i2);
        int t = t(bArr, 0, x);
        String str = new String(bArr, 0, t, r);
        int q = t + q(x);
        return new tn("WXXX", str, l(bArr, q, u(bArr, q), "ISO-8859-1"));
    }

    private static int q(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : Constants.ENCODING : "UTF-16BE" : "UTF-16";
    }

    private static String s(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int t(byte[] bArr, int i, int i2) {
        int u = u(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return u;
        }
        while (u < bArr.length - 1) {
            if (u % 2 == 0 && bArr[u + 1] == 0) {
                return u;
            }
            u = u(bArr, u + 1);
        }
        return bArr.length;
    }

    private static int u(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static int v(v vVar, int i) {
        byte[] bArr = vVar.a;
        int b2 = vVar.b();
        int i2 = b2;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= b2 + i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - (i2 - b2)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        if ((r10 & 128) != 0) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean w(com.google.android.exoplayer2.util.v r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.b()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x00ad }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00a9
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.h()     // Catch:{ all -> 0x00ad }
            long r8 = r18.z()     // Catch:{ all -> 0x00ad }
            int r10 = r18.D()     // Catch:{ all -> 0x00ad }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.A()     // Catch:{ all -> 0x00ad }
            int r8 = r18.A()     // Catch:{ all -> 0x00ad }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.K(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.K(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x0079
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0079:
            if (r0 != r3) goto L_0x0087
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0081
            r3 = 1
            goto L_0x0082
        L_0x0081:
            r3 = 0
        L_0x0082:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0087:
            r3 = 0
        L_0x0088:
            r4 = 0
        L_0x0089:
            if (r4 == 0) goto L_0x008d
            int r3 = r3 + 4
        L_0x008d:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0096
            r1.K(r2)
            return r6
        L_0x0096:
            int r3 = r18.a()
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a3
            r1.K(r2)
            return r6
        L_0x00a3:
            int r3 = (int) r8
            r1.L(r3)
            goto L_0x0008
        L_0x00a9:
            r1.K(r2)
            return r4
        L_0x00ad:
            r0 = move-exception
            r1.K(r2)
            goto L_0x00b3
        L_0x00b2:
            throw r0
        L_0x00b3:
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.w(com.google.android.exoplayer2.util.v, int, int, boolean):boolean");
    }

    @Override // defpackage.wm
    public um a(ym ymVar) {
        ByteBuffer byteBuffer = ymVar.b;
        byteBuffer.getClass();
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (((r7 & 64) != 0) != false) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.um c(byte[] r12, int r13) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.c(byte[], int):um");
    }

    public nn(a aVar) {
        this.a = aVar;
    }
}
