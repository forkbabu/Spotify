package defpackage;

/* renamed from: jja  reason: default package */
final class jja extends pja {
    private final String a;
    private final String b;

    jja(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.pja
    public String a() {
        return this.b;
    }

    @Override // defpackage.pja
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pja)) {
            return false;
        }
        pja pja = (pja) obj;
        if (!this.a.equals(pja.b()) || !this.b.equals(pja.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastMetadata{title=");
        V0.append(this.a);
        V0.append(", description=");
        return je.I0(V0, this.b, "}");
    }
}
