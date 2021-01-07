package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class e {
    public static final e c = new e(null, null);
    private final Boolean a;
    private final Boolean b;

    public e(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    private static int a(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r9 != '1') goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.internal.e b(java.lang.String r9) {
        /*
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 0
            if (r9 == 0) goto L_0x0036
            int r3 = r9.length()
            r4 = 49
            r5 = 48
            r6 = 3
            if (r3 < r6) goto L_0x0020
            r3 = 2
            char r3 = r9.charAt(r3)
            if (r3 == r5) goto L_0x001e
            if (r3 == r4) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            r3 = r0
            goto L_0x0021
        L_0x001e:
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r2
        L_0x0021:
            int r7 = r9.length()
            r8 = 4
            if (r7 < r8) goto L_0x0033
            char r9 = r9.charAt(r6)
            if (r9 == r5) goto L_0x0031
            if (r9 == r4) goto L_0x0034
            goto L_0x0033
        L_0x0031:
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            r2 = r3
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            com.google.android.gms.measurement.internal.e r9 = new com.google.android.gms.measurement.internal.e
            r9.<init>(r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.b(java.lang.String):com.google.android.gms.measurement.internal.e");
    }

    private static Boolean c(Boolean bool, Boolean bool2) {
        Boolean bool3 = Boolean.FALSE;
        if (bool != null) {
            return bool.booleanValue() ? bool2 : bool3;
        }
        if (bool2 == null || bool2.booleanValue()) {
            return null;
        }
        return bool3;
    }

    public static String e(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && k(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || k(string2) != null) {
            return null;
        }
        return string2;
    }

    static boolean f(int i, int i2) {
        return i <= i2;
    }

    public static e h(Bundle bundle) {
        if (bundle == null) {
            return c;
        }
        return new e(k(bundle.getString("ad_storage")), k(bundle.getString("analytics_storage")));
    }

    private static Boolean k(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String d() {
        char c2;
        StringBuilder sb = new StringBuilder("G1");
        Boolean bool = this.a;
        char c3 = '0';
        if (bool == null) {
            c2 = '-';
        } else {
            c2 = bool.booleanValue() ? '1' : '0';
        }
        sb.append(c2);
        Boolean bool2 = this.b;
        if (bool2 == null) {
            c3 = '-';
        } else if (bool2.booleanValue()) {
            c3 = '1';
        }
        sb.append(c3);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (a(this.a) == a(eVar.a) && a(this.b) == a(eVar.b)) {
            return true;
        }
        return false;
    }

    public final boolean g(e eVar) {
        Boolean bool = this.a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || eVar.a == bool2) {
            return this.b == bool2 && eVar.b != bool2;
        }
        return true;
    }

    public final int hashCode() {
        return ((a(this.a) + 527) * 31) + a(this.b);
    }

    public final e i(e eVar) {
        return new e(c(this.a, eVar.a), c(this.b, eVar.b));
    }

    public final Boolean j() {
        return this.a;
    }

    public final e l(e eVar) {
        Boolean bool = this.a;
        if (bool == null) {
            bool = eVar.a;
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            bool2 = eVar.b;
        }
        return new e(bool, bool2);
    }

    public final boolean m() {
        Boolean bool = this.a;
        return bool == null || bool.booleanValue();
    }

    public final Boolean n() {
        return this.b;
    }

    public final boolean o() {
        Boolean bool = this.b;
        return bool == null || bool.booleanValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.a;
        String str2 = "granted";
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            if (bool.booleanValue()) {
                str = str2;
            } else {
                str = "denied";
            }
            sb.append(str);
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (!bool2.booleanValue()) {
                str2 = "denied";
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
