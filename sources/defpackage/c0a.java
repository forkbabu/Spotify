package defpackage;

import com.spotify.music.libs.assistedcuration.model.e;
import java.util.List;

/* renamed from: c0a  reason: default package */
abstract class c0a extends i1a {
    private final String b;
    private final List<e> c;

    c0a(String str, List<e> list) {
        if (str != null) {
            this.b = str;
            if (list != null) {
                this.c = list;
                return;
            }
            throw new NullPointerException("Null tracks");
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.i1a
    public List<e> a() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1a)) {
            return false;
        }
        i1a i1a = (i1a) obj;
        if (!this.b.equals(i1a.getName()) || !this.c.equals(i1a.a())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.i1a
    public String getName() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Genre{name=");
        V0.append(this.b);
        V0.append(", tracks=");
        return je.L0(V0, this.c, "}");
    }
}
