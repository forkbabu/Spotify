package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: oxa  reason: default package */
public final class oxa {
    private String a;
    private String b;

    public final String a() {
        StringBuilder sb = new StringBuilder("spotify:search");
        String str = this.b;
        String str2 = null;
        boolean z = true;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                sb.append(':');
                sb.append(str);
            }
        }
        String str3 = this.a;
        if (str3 != null) {
            if (str3.length() <= 0) {
                z = false;
            }
            if (z) {
                str2 = str3;
            }
            if (str2 != null) {
                sb.append(':');
                sb.append(yz0.a(str2));
            }
        }
        String sb2 = sb.toString();
        h.d(sb2, "uriBuilder.toString()");
        return sb2;
    }

    public final oxa b(String str, String str2) {
        h.e(str, "path");
        h.e(str2, "query");
        this.a = str2;
        this.b = str;
        return this;
    }

    public final oxa c(String str) {
        h.e(str, "query");
        this.a = str;
        return this;
    }
}
