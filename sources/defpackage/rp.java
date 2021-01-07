package defpackage;

import com.google.android.exoplayer2.util.v;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: rp  reason: default package */
public final class rp {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private final v a = new v();
    private final StringBuilder b = new StringBuilder();

    private static String b(v vVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int b2 = vVar.b();
        int c2 = vVar.c();
        while (b2 < c2 && !z) {
            char c3 = (char) vVar.a[b2];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z = true;
            } else {
                b2++;
                sb.append(c3);
            }
        }
        vVar.L(b2 - vVar.b());
        return sb.toString();
    }

    static String c(v vVar, StringBuilder sb) {
        d(vVar);
        if (vVar.a() == 0) {
            return null;
        }
        String b2 = b(vVar, sb);
        if (!"".equals(b2)) {
            return b2;
        }
        StringBuilder V0 = je.V0("");
        V0.append((char) vVar.x());
        return V0.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[LOOP:1: B:2:0x0002->B:35:0x0070, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0001 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void d(com.google.android.exoplayer2.util.v r8) {
        /*
            r0 = 1
        L_0x0001:
            r1 = 1
        L_0x0002:
            int r2 = r8.a()
            if (r2 <= 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            int r1 = r8.b()
            byte[] r2 = r8.a
            byte r1 = r2[r1]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L_0x002a
            r2 = 10
            if (r1 == r2) goto L_0x002a
            r2 = 12
            if (r1 == r2) goto L_0x002a
            r2 = 13
            if (r1 == r2) goto L_0x002a
            r2 = 32
            if (r1 == r2) goto L_0x002a
            r1 = 0
            goto L_0x002e
        L_0x002a:
            r8.L(r0)
            r1 = 1
        L_0x002e:
            if (r1 != 0) goto L_0x0001
            int r1 = r8.b()
            int r2 = r8.c()
            byte[] r4 = r8.a
            int r5 = r1 + 2
            if (r5 > r2) goto L_0x006c
            int r5 = r1 + 1
            byte r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L_0x006c
            int r1 = r5 + 1
            byte r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L_0x006c
        L_0x004e:
            int r5 = r1 + 1
            if (r5 >= r2) goto L_0x0062
            byte r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L_0x0060
            byte r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L_0x0060
            int r2 = r5 + 1
            r1 = r2
            goto L_0x004e
        L_0x0060:
            r1 = r5
            goto L_0x004e
        L_0x0062:
            int r1 = r8.b()
            int r2 = r2 - r1
            r8.L(r2)
            r1 = 1
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 == 0) goto L_0x0070
            goto L_0x0001
        L_0x0070:
            r1 = 0
            goto L_0x0002
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp.d(com.google.android.exoplayer2.util.v):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (")".equals(c(r3, r4)) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.up> a(com.google.android.exoplayer2.util.v r18) {
        /*
        // Method dump skipped, instructions count: 566
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp.a(com.google.android.exoplayer2.util.v):java.util.List");
    }
}
