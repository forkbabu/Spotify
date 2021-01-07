package defpackage;

import com.spotify.searchview.assistedcuration.proto.MainViewResponse;

/* access modifiers changed from: package-private */
/* renamed from: fva  reason: default package */
public final class fva extends hva {
    private final String a;
    private final String b;
    private final MainViewResponse c;

    fva(String str, String str2, MainViewResponse mainViewResponse) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (mainViewResponse != null) {
                    this.c = mainViewResponse;
                    return;
                }
                throw new NullPointerException("Null result");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null requestId");
    }

    @Override // defpackage.hva
    public String b() {
        return this.b;
    }

    @Override // defpackage.hva
    public String c() {
        return this.a;
    }

    @Override // defpackage.hva
    public MainViewResponse d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hva)) {
            return false;
        }
        hva hva = (hva) obj;
        if (!this.a.equals(hva.c()) || !this.b.equals(hva.b()) || !this.c.equals(hva.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchMainResponse{requestId=");
        V0.append(this.a);
        V0.append(", query=");
        V0.append(this.b);
        V0.append(", result=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
