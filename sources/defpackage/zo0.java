package defpackage;

import com.spotify.inappmessaging.FormatType;
import java.util.Map;

/* renamed from: zo0  reason: default package */
abstract class zo0 extends fp0 {
    private final String a;
    private final Map<String, ep0> b;
    private final String c;
    private final String f;
    private final String n;
    private final FormatType o;

    zo0(String str, Map<String, ep0> map, String str2, String str3, String str4, FormatType formatType) {
        if (str != null) {
            this.a = str;
            if (map != null) {
                this.b = map;
                this.c = str2;
                this.f = str3;
                this.n = str4;
                this.o = formatType;
                return;
            }
            throw new NullPointerException("Null clickActions");
        }
        throw new NullPointerException("Null htmlContent");
    }

    @Override // defpackage.fp0
    public Map<String, ep0> b() {
        return this.b;
    }

    @Override // defpackage.fp0
    public FormatType c() {
        return this.o;
    }

    @Override // defpackage.fp0
    public String e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fp0)) {
            return false;
        }
        fp0 fp0 = (fp0) obj;
        if (this.a.equals(fp0.e()) && this.b.equals(fp0.b()) && ((str = this.c) != null ? str.equals(fp0.g()) : fp0.g() == null) && ((str2 = this.f) != null ? str2.equals(fp0.f()) : fp0.f() == null) && ((str3 = this.n) != null ? str3.equals(fp0.h()) : fp0.h() == null)) {
            FormatType formatType = this.o;
            if (formatType == null) {
                if (fp0.c() == null) {
                    return true;
                }
            } else if (formatType.equals(fp0.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fp0
    public String f() {
        return this.f;
    }

    @Override // defpackage.fp0
    public String g() {
        return this.c;
    }

    @Override // defpackage.fp0
    public String h() {
        return this.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.n;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        FormatType formatType = this.o;
        if (formatType != null) {
            i = formatType.hashCode();
        }
        return hashCode4 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("InAppMessage{htmlContent=");
        V0.append(this.a);
        V0.append(", clickActions=");
        V0.append(this.b);
        V0.append(", impressionUrl=");
        V0.append(this.c);
        V0.append(", id=");
        V0.append(this.f);
        V0.append(", uuid=");
        V0.append(this.n);
        V0.append(", format=");
        V0.append(this.o);
        V0.append("}");
        return V0.toString();
    }
}
