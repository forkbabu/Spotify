package defpackage;

import com.spotify.music.connection.g;

/* renamed from: ae4  reason: default package */
final class ae4 extends le4 {
    private final b91 a;
    private final g b;
    private final we4 c;

    ae4(b91 b91, g gVar, we4 we4) {
        if (b91 != null) {
            this.a = b91;
            if (gVar != null) {
                this.b = gVar;
                if (we4 != null) {
                    this.c = we4;
                    return;
                }
                throw new NullPointerException("Null browseSessionInfo");
            }
            throw new NullPointerException("Null connectionState");
        }
        throw new NullPointerException("Null hubsViewModel");
    }

    @Override // defpackage.le4
    public we4 a() {
        return this.c;
    }

    @Override // defpackage.le4
    public g b() {
        return this.b;
    }

    @Override // defpackage.le4
    public b91 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof le4)) {
            return false;
        }
        le4 le4 = (le4) obj;
        if (!this.a.equals(le4.c()) || !this.b.equals(le4.b()) || !this.c.equals(le4.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowseModelHolder{hubsViewModel=");
        V0.append(this.a);
        V0.append(", connectionState=");
        V0.append(this.b);
        V0.append(", browseSessionInfo=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
