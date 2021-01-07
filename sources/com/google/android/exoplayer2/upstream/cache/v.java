package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.g;
import java.io.File;
import java.util.regex.Pattern;

final class v extends j {
    private static final Pattern p = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern q = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern r = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private v(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (r16.renameTo(r1) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.upstream.cache.v h(java.io.File r16, long r17, long r19, com.google.android.exoplayer2.upstream.cache.m r21) {
        /*
            r0 = r21
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0073
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.upstream.cache.v.q
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L_0x002d
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = com.google.android.exoplayer2.util.f0.S(r1)
            if (r1 != 0) goto L_0x003f
            goto L_0x0039
        L_0x002d:
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.upstream.cache.v.p
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            r1 = r6
            goto L_0x0069
        L_0x003b:
            java.lang.String r1 = r2.group(r5)
        L_0x003f:
            java.io.File r7 = r16.getParentFile()
            com.google.android.exoplayer2.util.g.q(r7)
            com.google.android.exoplayer2.upstream.cache.l r1 = r0.h(r1)
            int r8 = r1.a
            java.lang.String r1 = r2.group(r4)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = m(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L_0x0069
            goto L_0x0039
        L_0x0069:
            if (r1 != 0) goto L_0x006c
            return r6
        L_0x006c:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L_0x0076
        L_0x0073:
            r2 = r16
            r15 = r2
        L_0x0076:
            java.util.regex.Pattern r2 = com.google.android.exoplayer2.upstream.cache.v.r
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x0083
            return r6
        L_0x0083:
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r8 = r0.g(r2)
            if (r8 != 0) goto L_0x0092
            return r6
        L_0x0092:
            r9 = -1
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x009e
            long r9 = r15.length()
            r11 = r9
            goto L_0x00a0
        L_0x009e:
            r11 = r17
        L_0x00a0:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00a7
            return r6
        L_0x00a7:
            java.lang.String r0 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r0)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = r1.group(r3)
            long r0 = java.lang.Long.parseLong(r0)
            r13 = r0
            goto L_0x00c4
        L_0x00c2:
            r13 = r19
        L_0x00c4:
            com.google.android.exoplayer2.upstream.cache.v r0 = new com.google.android.exoplayer2.upstream.cache.v
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.v.h(java.io.File, long, long, com.google.android.exoplayer2.upstream.cache.m):com.google.android.exoplayer2.upstream.cache.v");
    }

    public static v i(String str, long j, long j2) {
        return new v(str, j, j2, -9223372036854775807L, null);
    }

    public static v k(String str, long j) {
        return new v(str, j, -1, -9223372036854775807L, null);
    }

    public static v l(String str, long j) {
        return new v(str, j, -1, -9223372036854775807L, null);
    }

    public static File m(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, je.E0(sb, j2, ".v3.exo"));
    }

    public v g(File file, long j) {
        g.m(this.f);
        return new v(this.a, this.b, this.c, j, file);
    }
}
