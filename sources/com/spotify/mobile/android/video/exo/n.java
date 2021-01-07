package com.spotify.mobile.android.video.exo;

import android.net.Uri;
import com.spotify.mobile.android.util.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n {
    private static final Pattern e = Pattern.compile("([\\w-]+\\.[\\w-]+\\.[\\w-]+\\.[\\w-]+$)");
    private final cqe a;
    private final Map<String, Long> b = new HashMap();
    private final Map<String, Integer> c = new HashMap();
    private List<String> d = new ArrayList(0);

    public n(cqe cqe) {
        this.a = cqe;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.u3<java.lang.String, java.lang.Boolean> c(java.util.List<java.lang.String> r17) {
        /*
            r16 = this;
            r0 = r16
            com.spotify.mobile.android.util.Assertion.e(r17)
            boolean r1 = r17.isEmpty()
            java.lang.String r2 = "No base URLs"
            com.spotify.mobile.android.util.Assertion.b(r2, r1)
            r1 = 0
            r2 = r17
            java.lang.Object r3 = r2.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Iterator r2 = r17.iterator()
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0021:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00bf
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri r7 = android.net.Uri.parse(r6)
            java.lang.String r7 = d(r7)
            java.util.Map<java.lang.String, java.lang.Integer> r8 = r0.c
            java.lang.Object r8 = r8.get(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = com.spotify.mobile.android.util.x.n(r8, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = 2
            if (r8 >= r9) goto L_0x004f
        L_0x004c:
            r17 = r2
            goto L_0x008d
        L_0x004f:
            java.util.Map<java.lang.String, java.lang.Long> r9 = r0.b
            java.lang.Object r9 = r9.get(r7)
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r9 = com.spotify.mobile.android.util.x.n(r9, r12)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x006a
            goto L_0x004c
        L_0x006a:
            r9 = 30000(0x7530, double:1.4822E-319)
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r8 = r8 + -2
            r11 = 6
            int r8 = java.lang.Math.min(r8, r11)
            r17 = r2
            double r1 = (double) r8
            double r1 = java.lang.Math.pow(r14, r1)
            long r1 = (long) r1
            long r1 = r1 * r9
            cqe r8 = r0.a
            long r8 = r8.b()
            long r8 = r8 - r12
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x008c
            r1 = 1
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            if (r1 != 0) goto L_0x0097
            u3 r1 = new u3
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r6, r2)
            return r1
        L_0x0097:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.c
            java.lang.Object r1 = r1.get(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = com.spotify.mobile.android.util.x.n(r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 >= r5) goto L_0x00ba
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r0.c
            java.lang.Object r1 = r1.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r5 = r1.intValue()
            r3 = r6
        L_0x00ba:
            r2 = r17
            r1 = 0
            goto L_0x0021
        L_0x00bf:
            u3 r1 = new u3
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.exo.n.c(java.util.List):u3");
    }

    static String d(Uri uri) {
        Matcher matcher = e.matcher(uri.getHost());
        if (matcher.find()) {
            return matcher.group(1);
        }
        return uri.getHost();
    }

    public boolean a(List<String> list) {
        S s = c(list).b;
        s.getClass();
        return s.booleanValue();
    }

    public String b(List<String> list) {
        this.d = list;
        return c(list).a;
    }

    public Map<String, Integer> e() {
        HashMap hashMap = new HashMap(this.c);
        for (String str : this.d) {
            String d2 = d(Uri.parse(str));
            if (!hashMap.containsKey(d2)) {
                hashMap.put(d2, 0);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void f(Uri uri) {
        String d2 = d(uri);
        this.c.put(d2, Integer.valueOf(((Integer) x.n(this.c.get(d2), 0)).intValue() + 1));
        this.b.put(d2, Long.valueOf(this.a.b()));
    }

    /* access modifiers changed from: package-private */
    public void g(Uri uri) {
        String d2 = d(uri);
        this.c.put(d2, Integer.valueOf(Math.max(0, ((Integer) x.n(this.c.get(d2), 0)).intValue() - 1)));
        this.b.remove(d2);
    }
}
