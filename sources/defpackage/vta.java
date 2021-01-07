package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.MainViewResponse;

/* access modifiers changed from: package-private */
/* renamed from: vta  reason: default package */
public final class vta extends jua {
    private final String a;
    private final String b;
    private final Optional<Integer> c;
    private final MainViewResponse d;

    vta(String str, String str2, Optional<Integer> optional, MainViewResponse mainViewResponse) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (optional != null) {
                    this.c = optional;
                    if (mainViewResponse != null) {
                        this.d = mainViewResponse;
                        return;
                    }
                    throw new NullPointerException("Null result");
                }
                throw new NullPointerException("Null lastOffset");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null requestId");
    }

    @Override // defpackage.jua
    public Optional<Integer> b() {
        return this.c;
    }

    @Override // defpackage.jua
    public String c() {
        return this.b;
    }

    @Override // defpackage.jua
    public String d() {
        return this.a;
    }

    @Override // defpackage.jua
    public MainViewResponse e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jua)) {
            return false;
        }
        jua jua = (jua) obj;
        if (!this.a.equals(jua.d()) || !this.b.equals(jua.c()) || !this.c.equals(jua.b()) || !this.d.equals(jua.e())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchMainResponse{requestId=");
        V0.append(this.a);
        V0.append(", query=");
        V0.append(this.b);
        V0.append(", lastOffset=");
        V0.append(this.c);
        V0.append(", result=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}
