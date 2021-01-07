package defpackage;

import com.spotify.music.connection.g;

/* renamed from: be4  reason: default package */
final class be4 extends me4 {
    private final g a;
    private final we4 b;

    be4(g gVar, we4 we4) {
        if (gVar != null) {
            this.a = gVar;
            if (we4 != null) {
                this.b = we4;
                return;
            }
            throw new NullPointerException("Null browseSessionInfo");
        }
        throw new NullPointerException("Null connectionState");
    }

    @Override // defpackage.me4
    public we4 a() {
        return this.b;
    }

    @Override // defpackage.me4
    public g b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof me4)) {
            return false;
        }
        me4 me4 = (me4) obj;
        if (!this.a.equals(me4.b()) || !this.b.equals(me4.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowseParamHolder{connectionState=");
        V0.append(this.a);
        V0.append(", browseSessionInfo=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
