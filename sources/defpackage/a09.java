package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: a09  reason: default package */
public final class a09 {
    private final String a;
    private final List<String> b;
    private final int c;
    private final int d;

    public a09(String str, List<String> list, int i, int i2) {
        h.e(str, "text");
        h.e(list, "textValues");
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    private final void a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 17);
    }

    public final CharSequence b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = this.a;
        List<String> list = this.b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                T t2 = t;
                String format = String.format(Locale.ENGLISH, "$%d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                h.d(format, "java.lang.String.format(locale, this, *args)");
                int l = e.l(str, format, 0, false, 6, null);
                if (l != -1) {
                    arrayList.add(new xz8(l, format.length() + l, t2));
                }
                i2 = i3;
            } else {
                d.L();
                throw null;
            }
        }
        List<xz8> Q = d.Q(d.J(arrayList, new zz8()));
        int i4 = 0;
        for (xz8 xz8 : Q) {
            String str2 = this.a;
            int b2 = xz8.b();
            if (str2 != null) {
                String substring = str2.substring(i4, b2);
                h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                a(spannableStringBuilder, substring, this.c);
                a(spannableStringBuilder, xz8.c(), this.d);
                i4 = xz8.a();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        xz8 xz82 = (xz8) d.r(Q);
        if (xz82 != null) {
            i = xz82.a();
        }
        if (i < this.a.length()) {
            String str3 = this.a;
            if (str3 != null) {
                String substring2 = str3.substring(i);
                h.d(substring2, "(this as java.lang.String).substring(startIndex)");
                a(spannableStringBuilder, substring2, this.c);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return spannableStringBuilder;
    }
}
