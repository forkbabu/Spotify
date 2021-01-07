package defpackage;

import com.spotify.music.libs.mediabrowserservice.RootHintsParams;
import defpackage.wy8;

/* access modifiers changed from: package-private */
/* renamed from: qy8  reason: default package */
public final class qy8 extends wy8.a {
    private final String a;
    private final RootHintsParams.Mode b;

    qy8(String str, RootHintsParams.Mode mode) {
        if (str != null) {
            this.a = str;
            if (mode != null) {
                this.b = mode;
                return;
            }
            throw new NullPointerException("Null mode");
        }
        throw new NullPointerException("Null packageName");
    }

    @Override // defpackage.wy8.a
    public RootHintsParams.Mode c() {
        return this.b;
    }

    @Override // defpackage.wy8.a
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wy8.a)) {
            return false;
        }
        wy8.a aVar = (wy8.a) obj;
        if (!this.a.equals(aVar.d()) || !this.b.equals(aVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Key{packageName=");
        V0.append(this.a);
        V0.append(", mode=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
