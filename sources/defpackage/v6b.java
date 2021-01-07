package defpackage;

import com.spotify.music.connection.g;

/* access modifiers changed from: package-private */
/* renamed from: v6b  reason: default package */
public final class v6b extends a7b {
    private final z6b a;
    private final g b;

    v6b(z6b z6b, g gVar) {
        if (z6b != null) {
            this.a = z6b;
            if (gVar != null) {
                this.b = gVar;
                return;
            }
            throw new NullPointerException("Null connectionState");
        }
        throw new NullPointerException("Null params");
    }

    @Override // defpackage.a7b
    public g a() {
        return this.b;
    }

    @Override // defpackage.a7b
    public z6b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a7b)) {
            return false;
        }
        a7b a7b = (a7b) obj;
        if (!this.a.equals(a7b.c()) || !this.b.equals(a7b.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchPerformerData{params=");
        V0.append(this.a);
        V0.append(", connectionState=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
