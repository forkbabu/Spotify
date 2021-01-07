package defpackage;

import com.spotify.searchview.proto.MainViewResponse;

/* access modifiers changed from: package-private */
/* renamed from: uya  reason: default package */
public final class uya extends cza {
    private final String a;
    private final MainViewResponse b;

    uya(String str, MainViewResponse mainViewResponse) {
        if (str != null) {
            this.a = str;
            if (mainViewResponse != null) {
                this.b = mainViewResponse;
                return;
            }
            throw new NullPointerException("Null result");
        }
        throw new NullPointerException("Null requestId");
    }

    @Override // defpackage.cza
    public String b() {
        return this.a;
    }

    @Override // defpackage.cza
    public MainViewResponse c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cza)) {
            return false;
        }
        cza cza = (cza) obj;
        if (!this.a.equals(cza.b()) || !this.b.equals(cza.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchResponse{requestId=");
        V0.append(this.a);
        V0.append(", result=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
