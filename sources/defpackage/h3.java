package defpackage;

import android.util.Base64;
import java.util.List;

/* renamed from: h3  reason: default package */
public final class h3 {
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final String e;

    public h3(String str, String str2, String str3, List<List<byte[]>> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder V0 = je.V0("FontRequest {mProviderAuthority: ");
        V0.append(this.a);
        V0.append(", mProviderPackage: ");
        V0.append(this.b);
        V0.append(", mQuery: ");
        V0.append(this.c);
        V0.append(", mCertificates:");
        sb.append(V0.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return je.I0(sb, "}", "mCertificatesArray: 0");
    }
}
