package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: bne  reason: default package */
public final class bne {
    private static final Set<String> a = d.H("addTime", "publishDate", "number", "rowId", "frecencyScore");

    private static final void a(StringBuilder sb, ane ane, int i) {
        ane f = ane.f();
        boolean e = ane.e();
        if (a.contains(ane.c())) {
            e = !e;
        }
        boolean z = false;
        List W = d.W(e.w(ane.c(), new String[]{"_"}, false, 0, 6, null));
        ArrayList arrayList = (ArrayList) W;
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            StringBuilder sb2 = new StringBuilder();
            if (str != null) {
                String substring = str.substring(0, 1);
                h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Locale locale = Locale.US;
                h.d(locale, "Locale.US");
                String upperCase = substring.toUpperCase(locale);
                h.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                sb2.append(upperCase);
                String substring2 = str.substring(1);
                h.d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                arrayList.set(i2, sb2.toString());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        String p = d.p(W, "", null, null, 0, null, null, 62, null);
        sb.append(p);
        if (e) {
            if (p.length() > 0) {
                z = true;
            }
            if (z) {
                sb.append(" DESC");
            }
        }
        if (5 > i && f != null) {
            sb.append(',');
            a(sb, f, i + 1);
        }
    }

    public static final String b(ane ane) {
        h.e(ane, "sortOrder");
        StringBuilder sb = new StringBuilder(50);
        a(sb, ane, 0);
        String sb2 = sb.toString();
        h.d(sb2, "sb.toString()");
        return sb2;
    }
}
