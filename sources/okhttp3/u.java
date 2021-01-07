package okhttp3;

import com.adjust.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.e;

public final class u {
    private static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    private final String b;
    private final String c;
    final String d;
    final int e;
    private final List<String> f;
    private final List<String> g;
    private final String h;
    private final String i;

    public static final class a {
        String a;
        String b = "";
        String c = "";
        String d;
        int e = -1;
        final List<String> f;
        List<String> g;
        String h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
            if (r17 != false) goto L_0x0038;
         */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void h(java.lang.String r19, int r20, int r21) {
            /*
            // Method dump skipped, instructions count: 243
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.u.a.h(java.lang.String, int, int):void");
        }

        public a a(String str, String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(u.b(str, " \"'<>#&=", true, false, true, true));
                this.g.add(str2 != null ? u.b(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public a b(String str, String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(u.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.g.add(str2 != null ? u.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public u c() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.d != null) {
                return new u(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public a d(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            } else if (str.startsWith("/")) {
                h(str, 0, str.length());
                return this;
            } else {
                throw new IllegalArgumentException(je.x0("unexpected encodedPath: ", str));
            }
        }

        public a e(String str) {
            this.g = str != null ? u.x(u.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a f(String str) {
            if (str != null) {
                String d2 = rnf.d(u.r(str, 0, str.length(), false));
                if (d2 != null) {
                    this.d = d2;
                    return this;
                }
                throw new IllegalArgumentException(je.x0("unexpected host: ", str));
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0212, code lost:
            if (r1 <= 65535) goto L_0x021a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x023a  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0255  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x02a6  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x01e1 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01c3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public okhttp3.u.a g(okhttp3.u r20, java.lang.String r21) {
            /*
            // Method dump skipped, instructions count: 714
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.u.a.g(okhttp3.u, java.lang.String):okhttp3.u$a");
        }

        public a i(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.a = "http";
            } else if (str.equalsIgnoreCase(Constants.SCHEME)) {
                this.a = Constants.SCHEME;
            } else {
                throw new IllegalArgumentException(je.x0("unexpected scheme: ", str));
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int i = this.e;
            if (!(i == -1 && this.a == null)) {
                if (i == -1) {
                    i = u.d(this.a);
                }
                String str3 = this.a;
                if (str3 == null || i != u.d(str3)) {
                    sb.append(':');
                    sb.append(i);
                }
            }
            List<String> list = this.f;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
            if (this.g != null) {
                sb.append('?');
                u.m(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    u(a aVar) {
        this.a = aVar.a;
        this.b = s(aVar.b, false);
        this.c = s(aVar.c, false);
        this.d = aVar.d;
        int i2 = aVar.e;
        this.e = i2 == -1 ? d(aVar.a) : i2;
        this.f = t(aVar.f, false);
        List<String> list = aVar.g;
        String str = null;
        this.g = list != null ? t(list, true) : null;
        String str2 = aVar.h;
        this.h = str2 != null ? r(str2, 0, str2.length(), false) : str;
        this.i = aVar.toString();
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            int i5 = -1;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !u(str, i4, i3)))) || (codePointAt == 43 && z3)))) {
                e eVar = new e();
                eVar.c0(str, i2, i4);
                e eVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z3) {
                            eVar.b0(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != i5 || (codePointAt2 == 37 && (!z || (z2 && !u(str, i4, i3)))))) {
                            if (eVar2 == null) {
                                eVar2 = new e();
                            }
                            if (charset == null || charset.equals(rnf.i)) {
                                eVar2.f0(codePointAt2);
                            } else {
                                eVar2.W(str, i4, Character.charCount(codePointAt2) + i4, charset);
                            }
                            while (!eVar2.l1()) {
                                int readByte = eVar2.readByte() & 255;
                                eVar.J(37);
                                char[] cArr = j;
                                eVar.J(cArr[(readByte >> 4) & 15]);
                                eVar.J(cArr[readByte & 15]);
                            }
                        } else {
                            eVar.f0(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = -1;
                }
                return eVar.s();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str.substring(i2, i3);
    }

    static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    static String c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Constants.SCHEME) ? 443 : -1;
    }

    public static u j(String str) {
        a aVar = new a();
        aVar.g(null, str);
        return aVar.c();
    }

    static void m(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static u p(String str) {
        try {
            return j(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static String r(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                e eVar = new e();
                eVar.c0(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int i6 = rnf.i(str.charAt(i5 + 1));
                        int i7 = rnf.i(str.charAt(i4));
                        if (!(i6 == -1 || i7 == -1)) {
                            eVar.J((i6 << 4) + i7);
                            i5 = i4;
                            i5 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        eVar.J(32);
                        i5 += Character.charCount(codePointAt);
                    }
                    eVar.f0(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return eVar.s();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    static String s(String str, boolean z) {
        return r(str, 0, str.length(), z);
    }

    private List<String> t(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? r(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static boolean u(String str, int i2, int i3) {
        int i4 = i2 + 2;
        if (i4 >= i3 || str.charAt(i2) != '%' || rnf.i(str.charAt(i2 + 1)) == -1 || rnf.i(str.charAt(i4)) == -1) {
            return false;
        }
        return true;
    }

    static List<String> x(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public URI A() {
        a n = n();
        int size = n.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            n.f.set(i2, b(n.f.get(i2), "[]", true, true, false, true));
        }
        List<String> list = n.g;
        if (list != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = n.g.get(i3);
                if (str != null) {
                    n.g.set(i3, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = n.h;
        if (str2 != null) {
            n.h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar = n.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public URL B() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String e() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.i.indexOf(64);
        return this.i.substring(this.i.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).i.equals(this.i);
    }

    public String f() {
        int indexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        return this.i.substring(indexOf, rnf.l(str, indexOf, str.length(), "?#"));
    }

    public List<String> g() {
        int indexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        int l = rnf.l(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < l) {
            int i2 = indexOf + 1;
            int k = rnf.k(this.i, i2, l, '/');
            arrayList.add(this.i.substring(i2, k));
            indexOf = k;
        }
        return arrayList;
    }

    public String h() {
        if (this.g == null) {
            return null;
        }
        int indexOf = this.i.indexOf(63) + 1;
        String str = this.i;
        return this.i.substring(indexOf, rnf.k(str, indexOf, str.length(), '#'));
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public String i() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return this.i.substring(length, rnf.l(str, length, str.length(), ":@"));
    }

    public String k() {
        return this.d;
    }

    public boolean l() {
        return this.a.equals(Constants.SCHEME);
    }

    public a n() {
        String str;
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = i();
        aVar.c = e();
        aVar.d = this.d;
        aVar.e = this.e != d(this.a) ? this.e : -1;
        aVar.f.clear();
        aVar.f.addAll(g());
        aVar.e(h());
        if (this.h == null) {
            str = null;
        } else {
            str = this.i.substring(this.i.indexOf(35) + 1);
        }
        aVar.h = str;
        return aVar;
    }

    public a o(String str) {
        try {
            a aVar = new a();
            aVar.g(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public List<String> q() {
        return this.f;
    }

    public String toString() {
        return this.i;
    }

    public int v() {
        return this.e;
    }

    public String w() {
        if (this.g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m(sb, this.g);
        return sb.toString();
    }

    public String y() {
        a o = o("/...");
        o.getClass();
        o.b = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        o.c = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return o.c().i;
    }

    public String z() {
        return this.a;
    }
}
