package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: u3e  reason: default package */
public final class u3e extends w3e {
    private final String a;
    private final String b;
    private final String c;

    u3e(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null spotifyUri");
            }
            throw new NullPointerException("Null shareId");
        }
        throw new NullPointerException("Null url");
    }

    @Override // defpackage.w3e
    public String b() {
        return this.b;
    }

    @Override // defpackage.w3e
    public String c() {
        return this.c;
    }

    @Override // defpackage.w3e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w3e)) {
            return false;
        }
        w3e w3e = (w3e) obj;
        if (!this.a.equals(w3e.d()) || !this.b.equals(w3e.b()) || !this.c.equals(w3e.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShareUrl{url=");
        V0.append(this.a);
        V0.append(", shareId=");
        V0.append(this.b);
        V0.append(", spotifyUri=");
        return je.I0(V0, this.c, "}");
    }
}
