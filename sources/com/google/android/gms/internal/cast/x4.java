package com.google.android.gms.internal.cast;

import android.os.Bundle;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.internal.cast.r3;
import com.google.android.gms.internal.cast.s3;
import com.google.android.gms.internal.cast.w3;
import com.google.android.gms.internal.cast.z3;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class x4 {
    private static final b d = new b("ApplicationAnalyticsUtils");
    private static final String e = "19.0.0";
    private final String a;
    private final Map<Integer, Integer> b;
    private final Map<Integer, Integer> c;

    public x4(Bundle bundle, String str) {
        this.a = str;
        this.b = d(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.c = d(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    private static Map<Integer, Integer> d(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return zzfd.n;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    private static void e(w3.a aVar, boolean z) {
        s3.a n = s3.n(aVar.p());
        if (n.c) {
            n.k();
            n.c = false;
        }
        s3.r((s3) n.b, z);
        aVar.o(n);
    }

    private final w3.a h(p5 p5Var) {
        long j;
        w3.a w = w3.w();
        long j2 = p5Var.c;
        if (w.c) {
            w.k();
            w.c = false;
        }
        w3.p((w3) w.b, j2);
        int i = p5Var.d;
        p5Var.d = i + 1;
        if (w.c) {
            w.k();
            w.c = false;
        }
        w3.o((w3) w.b, i);
        String str = p5Var.b;
        if (str != null) {
            if (w.c) {
                w.k();
                w.c = false;
            }
            w3.u((w3) w.b, str);
        }
        r3.a p = r3.p();
        String str2 = e;
        if (p.c) {
            p.k();
            p.c = false;
        }
        r3.o((r3) p.b, str2);
        String str3 = this.a;
        if (p.c) {
            p.k();
            p.c = false;
        }
        r3.n((r3) p.b, str3);
        r3 r3Var = (r3) ((r5) p.n());
        if (w.c) {
            w.k();
            w.c = false;
        }
        w3.r((w3) w.b, r3Var);
        s3.a t = s3.t();
        if (p5Var.a != null) {
            z3.a o = z3.o();
            String str4 = p5Var.a;
            if (o.c) {
                o.k();
                o.c = false;
            }
            z3.n((z3) o.b, str4);
            z3 z3Var = (z3) ((r5) o.n());
            if (t.c) {
                t.k();
                t.c = false;
            }
            s3.q((s3) t.b, z3Var);
        }
        if (t.c) {
            t.k();
            t.c = false;
        }
        s3.r((s3) t.b, false);
        String str5 = p5Var.e;
        if (str5 != null) {
            try {
                String replace = str5.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e2) {
                d.f("receiverSessionId %s is not valid for hash: %s", str5, e2.getMessage());
                j = 0;
            }
            if (t.c) {
                t.k();
                t.c = false;
            }
            s3.p((s3) t.b, j);
        }
        w.o(t);
        return w;
    }

    public final w3 a(p5 p5Var) {
        return (w3) ((r5) h(p5Var).n());
    }

    public final w3 b(p5 p5Var, int i) {
        w3.a h = h(p5Var);
        s3.a n = s3.n(h.p());
        Map<Integer, Integer> map = this.c;
        n.o((map == null || !map.containsKey(Integer.valueOf(i))) ? i + 10000 : this.c.get(Integer.valueOf(i)).intValue());
        h.o(n);
        return (w3) ((r5) h.n());
    }

    public final w3 c(p5 p5Var, boolean z) {
        w3.a h = h(p5Var);
        e(h, z);
        return (w3) ((r5) h.n());
    }

    public final w3 f(p5 p5Var) {
        w3.a h = h(p5Var);
        e(h, true);
        s3.a n = s3.n(h.p());
        n.o(zzgj.APP_SESSION_RESUMED_FROM_SAVED_SESSION.j());
        h.o(n);
        return (w3) ((r5) h.n());
    }

    public final w3 g(p5 p5Var, int i) {
        zzgj zzgj;
        w3.a h = h(p5Var);
        s3.a n = s3.n(h.p());
        if (i == 0) {
            zzgj = zzgj.APP_SESSION_CASTING_STOPPED;
        } else {
            zzgj = zzgj.APP_SESSION_REASON_ERROR;
        }
        n.o(zzgj.j());
        Map<Integer, Integer> map = this.b;
        int intValue = (map == null || !map.containsKey(Integer.valueOf(i))) ? i + 10000 : this.b.get(Integer.valueOf(i)).intValue();
        if (n.c) {
            n.k();
            n.c = false;
        }
        s3.s((s3) n.b, intValue);
        h.o(n);
        return (w3) ((r5) h.n());
    }
}
