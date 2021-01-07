package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbv$zzd;
import com.google.android.gms.internal.measurement.zzbv$zzf;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* access modifiers changed from: package-private */
public abstract class na {
    String a;
    int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;

    na(String str, int i) {
        this.a = str;
        this.b = i;
    }

    static Boolean b(double d2, zzbv$zzd zzbv_zzd) {
        try {
            return g(new BigDecimal(d2), zzbv_zzd, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j, zzbv$zzd zzbv_zzd) {
        try {
            return g(new BigDecimal(j), zzbv_zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(String str, zzbv$zzd zzbv_zzd) {
        if (!v9.S(str)) {
            return null;
        }
        try {
            return g(new BigDecimal(str), zzbv_zzd, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean f(String str, zzbv$zzf zzbv_zzf, a4 a4Var) {
        String str2;
        List<String> list;
        zzbv$zzf.zzb zzb = zzbv$zzf.zzb.REGEXP;
        zzbv$zzf.zzb zzb2 = zzbv$zzf.zzb.IN_LIST;
        if (zzbv_zzf == null) {
            throw new NullPointerException("null reference");
        } else if (str == null || !zzbv_zzf.u() || zzbv_zzf.v() == zzbv$zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        } else {
            if (zzbv_zzf.v() == zzb2) {
                if (zzbv_zzf.B() == 0) {
                    return null;
                }
            } else if (!zzbv_zzf.w()) {
                return null;
            }
            zzbv$zzf.zzb v = zzbv_zzf.v();
            boolean z = zzbv_zzf.z();
            if (z || v == zzb || v == zzb2) {
                str2 = zzbv_zzf.x();
            } else {
                str2 = zzbv_zzf.x().toUpperCase(Locale.ENGLISH);
            }
            if (zzbv_zzf.B() == 0) {
                list = null;
            } else {
                list = zzbv_zzf.A();
                if (!z) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (String str3 : list) {
                        arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
            }
            String str4 = v == zzb ? str2 : null;
            if (v == zzb2) {
                if (list == null || list.size() == 0) {
                    return null;
                }
            } else if (str2 == null) {
                return null;
            }
            if (!z && v != zzb) {
                str = str.toUpperCase(Locale.ENGLISH);
            }
            switch (ja.a[v.ordinal()]) {
                case 1:
                    try {
                        return Boolean.valueOf(Pattern.compile(str4, z ? 0 : 66).matcher(str).matches());
                    } catch (PatternSyntaxException unused) {
                        if (a4Var == null) {
                            return null;
                        }
                        a4Var.H().b("Invalid regular expression in REGEXP audience filter. expression", str4);
                        return null;
                    }
                case 2:
                    return Boolean.valueOf(str.startsWith(str2));
                case 3:
                    return Boolean.valueOf(str.endsWith(str2));
                case 4:
                    return Boolean.valueOf(str.contains(str2));
                case 5:
                    return Boolean.valueOf(str.equals(str2));
                case 6:
                    return Boolean.valueOf(list.contains(str));
                default:
                    return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        if (r3 != null) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean g(java.math.BigDecimal r9, com.google.android.gms.internal.measurement.zzbv$zzd r10, double r11) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.na.g(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzbv$zzd, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean h();

    /* access modifiers changed from: package-private */
    public abstract boolean i();
}
