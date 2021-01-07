package defpackage;

import com.spotify.music.connection.g;

/* renamed from: zd4  reason: default package */
final class zd4 extends de4 {
    private final g a;
    private final we4 b;
    private final ff4 c;

    zd4(g gVar, we4 we4, ff4 ff4) {
        if (gVar != null) {
            this.a = gVar;
            if (we4 != null) {
                this.b = we4;
                if (ff4 != null) {
                    this.c = ff4;
                    return;
                }
                throw new NullPointerException("Null paginationParams");
            }
            throw new NullPointerException("Null browseSessionInfo");
        }
        throw new NullPointerException("Null connectionState");
    }

    @Override // defpackage.de4
    public we4 a() {
        return this.b;
    }

    @Override // defpackage.de4
    public g b() {
        return this.a;
    }

    @Override // defpackage.de4
    public ff4 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof de4)) {
            return false;
        }
        de4 de4 = (de4) obj;
        if (!this.a.equals(de4.b()) || !this.b.equals(de4.a()) || !this.c.equals(de4.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowseDrillDownParamHolder{connectionState=");
        V0.append(this.a);
        V0.append(", browseSessionInfo=");
        V0.append(this.b);
        V0.append(", paginationParams=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
