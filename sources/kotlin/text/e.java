package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.sequences.k;
import kotlin.sequences.n;

public final class e {
    public static String A(String str, char c, String str2, int i, Object obj) {
        String str3 = (i & 2) != 0 ? str : null;
        h.e(str, "$this$substringAfterLast");
        h.e(str3, "missingDelimiterValue");
        int g = g(str);
        h.e(str, "$this$lastIndexOf");
        int lastIndexOf = str.lastIndexOf(c, g);
        if (lastIndexOf == -1) {
            return str3;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static String B(String str, int i) {
        h.e(str, "$this$take");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(je.q0("Requested character count ", i, " is less than zero.").toString());
    }

    public static CharSequence C(CharSequence charSequence) {
        h.e(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean o = o(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!o) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!o) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static <T> void a(Appendable appendable, T t, nmf<? super T, ? extends CharSequence> nmf) {
        h.e(appendable, "$this$appendElement");
        if (nmf != null) {
            appendable.append((CharSequence) nmf.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append(t);
        } else if (t instanceof Character) {
            appendable.append(t.charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        h.e(charSequence, "$this$contains");
        h.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (l(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (j(charSequence, charSequence2, 0, charSequence.length(), z, false, 16) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(charSequence, charSequence2, z);
    }

    public static boolean d(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        h.e(str, "$this$endsWith");
        h.e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return r(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean e(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public static boolean f(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final int g(CharSequence charSequence) {
        h.e(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int h(CharSequence charSequence, String str, int i, boolean z) {
        h.e(charSequence, "$this$indexOf");
        h.e(str, "string");
        if (z || !(charSequence instanceof String)) {
            return j(charSequence, str, i, charSequence.length(), z, false, 16);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    private static final int i(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        hnf hnf;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            hnf = new jnf(i, i2);
        } else {
            int g = g(charSequence);
            if (i > g) {
                i = g;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            hnf = new hnf(i, i2, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int d = hnf.d();
            int e = hnf.e();
            int f = hnf.f();
            if (f < 0 ? d >= e : d <= e) {
                while (!s(charSequence2, 0, charSequence, d, charSequence2.length(), z)) {
                    if (d != e) {
                        d += f;
                    }
                }
                return d;
            }
        } else {
            int d2 = hnf.d();
            int e2 = hnf.e();
            int f2 = hnf.f();
            if (f2 < 0 ? d2 >= e2 : d2 <= e2) {
                while (!r((String) charSequence2, 0, (String) charSequence, d2, charSequence2.length(), z)) {
                    if (d2 != e2) {
                        d2 += f2;
                    }
                }
                return d2;
            }
        }
        return -1;
    }

    static /* synthetic */ int j(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3) {
        return i(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static int k(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        h.e(charSequence, "$this$indexOf");
        if (!z) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m(charSequence, new char[]{c}, i, z);
    }

    public static /* synthetic */ int l(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return h(charSequence, str, i, z);
    }

    public static final int m(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        h.e(charSequence, "$this$indexOfAny");
        h.e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int g = g(charSequence);
            if (i > g) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (e(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return i;
                }
                if (i == g) {
                    return -1;
                }
                i++;
            }
        } else {
            return ((String) charSequence).indexOf(d.I(cArr), i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            kotlin.jvm.internal.h.e(r4, r0)
            int r0 = r4.length()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "$this$indices"
            kotlin.jvm.internal.h.e(r4, r0)
            jnf r0 = new jnf
            int r3 = r4.length()
            int r3 = r3 + -1
            r0.<init>(r2, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002b
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002b
            goto L_0x004b
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            r3 = r0
            inf r3 = (defpackage.inf) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L_0x004b
            r3 = r0
            kotlin.collections.k r3 = (kotlin.collections.k) r3
            int r3 = r3.a()
            char r3 = r4.charAt(r3)
            boolean r3 = o(r3)
            if (r3 != 0) goto L_0x002f
            r4 = 0
            goto L_0x004c
        L_0x004b:
            r4 = 1
        L_0x004c:
            if (r4 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.e.n(java.lang.CharSequence):boolean");
    }

    public static final boolean o(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static int p(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = g(charSequence);
        }
        boolean z2 = (i2 & 4) != 0 ? false : z;
        h.e(charSequence, "$this$lastIndexOf");
        h.e(str, "string");
        if (z2 || !(charSequence instanceof String)) {
            return i(charSequence, str, i, 0, z2, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    static kotlin.sequences.e q(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3) {
        boolean z2 = false;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if (i2 >= 0) {
            z2 = true;
        }
        if (z2) {
            return new b(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$4(d.c(strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static final boolean r(String str, int i, String str2, int i2, int i3, boolean z) {
        h.e(str, "$this$regionMatches");
        h.e(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        h.e(charSequence, "$this$regionMatchesImpl");
        h.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!e(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String t(String str, String str2, String str3, boolean z, int i, Object obj) {
        int i2 = 0;
        boolean z2 = (i & 4) != 0 ? false : z;
        je.x(str, "$this$replace", str2, "oldValue", str3, "newValue");
        String[] strArr = {str2};
        h.e(str, "$this$splitToSequence");
        h.e(strArr, "delimiters");
        kotlin.sequences.e q = q(str, strArr, 0, z2, 0, 2);
        StringsKt__StringsKt$splitToSequence$1 stringsKt__StringsKt$splitToSequence$1 = new StringsKt__StringsKt$splitToSequence$1(str);
        h.e(q, "$this$map");
        h.e(stringsKt__StringsKt$splitToSequence$1, "transform");
        n nVar = new n(q, stringsKt__StringsKt$splitToSequence$1);
        h.e(nVar, "$this$joinToString");
        h.e(str3, "separator");
        h.e("", "prefix");
        h.e("", "postfix");
        h.e("...", "truncated");
        StringBuilder sb = new StringBuilder();
        h.e(nVar, "$this$joinTo");
        h.e(sb, "buffer");
        h.e(str3, "separator");
        h.e("", "prefix");
        h.e("", "postfix");
        h.e("...", "truncated");
        sb.append((CharSequence) "");
        Iterator it = nVar.iterator();
        while (true) {
            n.a aVar = (n.a) it;
            if (aVar.hasNext()) {
                Object next = aVar.next();
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) str3);
                }
                a(sb, next, null);
            } else {
                sb.append((CharSequence) "");
                String sb2 = sb.toString();
                h.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
                return sb2;
            }
        }
    }

    private static final List<String> u(CharSequence charSequence, String str, boolean z, int i) {
        boolean z2 = true;
        int i2 = 0;
        if (i >= 0) {
            int h = h(charSequence, str, 0, z);
            if (h == -1 || i == 1) {
                return d.t(charSequence.toString());
            }
            if (i <= 0) {
                z2 = false;
            }
            int i3 = 10;
            if (z2 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, h).toString());
                i2 = str.length() + h;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                h = h(charSequence, str, i2, z);
            } while (h != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public static List v(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        h.e(charSequence, "$this$split");
        h.e(cArr, "delimiters");
        boolean z2 = true;
        if (cArr.length == 1) {
            return u(charSequence, String.valueOf(cArr[0]), z, i);
        }
        if (i < 0) {
            z2 = false;
        }
        if (z2) {
            b bVar = new b(charSequence, 0, i, new StringsKt__StringsKt$rangesDelimitedBy$2(cArr, z));
            h.e(bVar, "$this$asIterable");
            k kVar = new k(bVar);
            ArrayList arrayList = new ArrayList(d.e(kVar, 10));
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                arrayList.add(y(charSequence, (jnf) it.next()));
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public static List w(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        boolean z2 = false;
        boolean z3 = (i2 & 2) != 0 ? false : z;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        h.e(charSequence, "$this$split");
        h.e(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return u(charSequence, str, z3, i3);
            }
        }
        kotlin.sequences.e q = q(charSequence, strArr, 0, z3, i3, 2);
        h.e(q, "$this$asIterable");
        k kVar = new k(q);
        ArrayList arrayList = new ArrayList(d.e(kVar, 10));
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(y(charSequence, (jnf) it.next()));
        }
        return arrayList;
    }

    public static boolean x(String str, String str2, boolean z, int i, Object obj) {
        boolean z2 = (i & 2) != 0 ? false : z;
        h.e(str, "$this$startsWith");
        h.e(str2, "prefix");
        if (!z2) {
            return str.startsWith(str2);
        }
        return r(str, 0, str2, 0, str2.length(), z2);
    }

    public static final String y(CharSequence charSequence, jnf jnf) {
        h.e(charSequence, "$this$substring");
        h.e(jnf, "range");
        return charSequence.subSequence(jnf.j().intValue(), Integer.valueOf(jnf.e()).intValue() + 1).toString();
    }

    public static String z(String str, String str2, String str3, int i, Object obj) {
        String str4 = (i & 2) != 0 ? str : null;
        je.x(str, "$this$substringAfter", str2, "delimiter", str4, "missingDelimiterValue");
        int l = l(str, str2, 0, false, 6, null);
        if (l == -1) {
            return str4;
        }
        String substring = str.substring(str2.length() + l, str.length());
        h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
