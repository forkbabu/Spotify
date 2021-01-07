package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.d0;
import okhttp3.l;
import okhttp3.m;
import okhttp3.t;
import okhttp3.u;
import okio.ByteString;

/* renamed from: eof  reason: default package */
public final class eof {
    public static final /* synthetic */ int a = 0;

    static {
        ByteString.m("\"\\");
        ByteString.m("\t ,=");
    }

    public static long a(d0 d0Var) {
        String c = d0Var.l().c("Content-Length");
        if (c != null) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static boolean b(d0 d0Var) {
        if (d0Var.C().g().equals("HEAD")) {
            return false;
        }
        int f = d0Var.f();
        if (((f >= 100 && f < 200) || f == 204 || f == 304) && a(d0Var) == -1 && !"chunked".equalsIgnoreCase(d0Var.h("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int c(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void d(m mVar, u uVar, t tVar) {
        if (mVar != m.a) {
            List<l> c = l.c(uVar, tVar);
            if (!c.isEmpty()) {
                mVar.b(uVar, c);
            }
        }
    }

    public static int e(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static Set<String> f(t tVar) {
        Set<String> emptySet = Collections.emptySet();
        int g = tVar.g();
        for (int i = 0; i < g; i++) {
            if ("Vary".equalsIgnoreCase(tVar.d(i))) {
                String i2 = tVar.i(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : i2.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }
}
