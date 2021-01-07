package defpackage;

import java.util.Date;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.t;

/* renamed from: vnf  reason: default package */
public final class vnf {
    public final a0 a;
    public final d0 b;

    /* renamed from: vnf$a */
    public static class a {
        final long a;
        final a0 b;
        final d0 c;
        private Date d;
        private String e;
        private Date f;
        private String g;
        private Date h;
        private long i;
        private long j;
        private String k;
        private int l = -1;

        public a(long j2, a0 a0Var, d0 d0Var) {
            this.a = j2;
            this.b = a0Var;
            this.c = d0Var;
            if (d0Var != null) {
                this.i = d0Var.D();
                this.j = d0Var.B();
                t l2 = d0Var.l();
                int g2 = l2.g();
                for (int i2 = 0; i2 < g2; i2++) {
                    String d2 = l2.d(i2);
                    String i3 = l2.i(i2);
                    if ("Date".equalsIgnoreCase(d2)) {
                        this.d = dof.b(i3);
                        this.e = i3;
                    } else if ("Expires".equalsIgnoreCase(d2)) {
                        this.h = dof.b(i3);
                    } else if ("Last-Modified".equalsIgnoreCase(d2)) {
                        this.f = dof.b(i3);
                        this.g = i3;
                    } else if ("ETag".equalsIgnoreCase(d2)) {
                        this.k = i3;
                    } else if ("Age".equalsIgnoreCase(d2)) {
                        this.l = eof.c(i3, -1);
                    }
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [okhttp3.d0, okhttp3.a0] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
            if (r2 > 0) goto L_0x00fa;
         */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:99:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.vnf a() {
            /*
            // Method dump skipped, instructions count: 487
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vnf.a.a():vnf");
        }
    }

    vnf(a0 a0Var, d0 d0Var) {
        this.a = a0Var;
        this.b = d0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.b().a() == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(okhttp3.d0 r3, okhttp3.a0 r4) {
        /*
            int r0 = r3.f()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.h(r0)
            if (r0 != 0) goto L_0x005a
            okhttp3.d r0 = r3.b()
            int r0 = r0.c()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            okhttp3.d r0 = r3.b()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x005a
            okhttp3.d r0 = r3.b()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            okhttp3.d r3 = r3.b()
            boolean r3 = r3.h()
            if (r3 != 0) goto L_0x006f
            okhttp3.d r3 = r4.b()
            boolean r3 = r3.h()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
            switch-data {300->0x005a, 301->0x005a, 302->0x0031, }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnf.a(okhttp3.d0, okhttp3.a0):boolean");
    }
}
