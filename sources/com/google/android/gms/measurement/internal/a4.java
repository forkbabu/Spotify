package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

public final class a4 extends b6 {
    private char c = 0;
    private long d = -1;
    private String e;
    private final c4 f = new c4(this, 6, false, false);
    private final c4 g = new c4(this, 6, true, false);
    private final c4 h = new c4(this, 6, false, true);
    private final c4 i = new c4(this, 5, false, false);
    private final c4 j = new c4(this, 5, true, false);
    private final c4 k = new c4(this, 5, false, true);
    private final c4 l = new c4(this, 4, false, false);
    private final c4 m = new c4(this, 3, false, false);
    private final c4 n = new c4(this, 2, false, false);

    a4(f5 f5Var) {
        super(f5Var);
    }

    private static String D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    private final String O() {
        String str;
        synchronized (this) {
            if (this.e == null) {
                this.e = this.a.L() != null ? this.a.L() : "FA";
            }
            str = this.e;
        }
        return str;
    }

    protected static Object w(String str) {
        if (str == null) {
            return null;
        }
        return new b4(str);
    }

    private static String x(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + str.length() + 43);
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String D = D(f5.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && D(className).equals(D)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof b4) {
                return b4.a((b4) obj);
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    static String y(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String x = x(z, obj);
        String x2 = x(z, obj2);
        String x3 = x(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(x)) {
            sb.append(str2);
            sb.append(x);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(x2)) {
            sb.append(str2);
            sb.append(x2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(x3)) {
            sb.append(str3);
            sb.append(x3);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void A(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(O(), i2)) {
            Log.println(i2, O(), y(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            if (str != null) {
                y4 D = this.a.D();
                if (D == null) {
                    z(6, "Scheduler not set. Not logging error/warn");
                } else if (!D.s()) {
                    z(6, "Scheduler not initialized. Not logging error/warn");
                } else {
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    D.y(new z3(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
                }
            } else {
                throw new NullPointerException("null reference");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i2) {
        return Log.isLoggable(O(), i2);
    }

    public final c4 E() {
        return this.f;
    }

    public final c4 F() {
        return this.g;
    }

    public final c4 G() {
        return this.h;
    }

    public final c4 H() {
        return this.i;
    }

    public final c4 I() {
        return this.j;
    }

    public final c4 J() {
        return this.k;
    }

    public final c4 K() {
        return this.l;
    }

    public final c4 L() {
        return this.m;
    }

    public final c4 M() {
        return this.n;
    }

    public final String N() {
        Pair<String, Long> a = super.h().d.a();
        if (a == null || a == n4.D) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        return je.j0(je.N0(str, valueOf.length() + 1), valueOf, ":", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.b6
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void z(int i2, String str) {
        Log.println(i2, O(), str);
    }
}
