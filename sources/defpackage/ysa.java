package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ysa  reason: default package */
public final class ysa extends gta {
    private final String a;
    private final String b;

    ysa(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null header");
    }

    @Override // defpackage.gta
    public String b() {
        return this.a;
    }

    @Override // defpackage.gta
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gta)) {
            return false;
        }
        gta gta = (gta) obj;
        if (!this.a.equals(gta.b()) || !this.b.equals(gta.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineTextHolder{header=");
        V0.append(this.a);
        V0.append(", subtitle=");
        return je.I0(V0, this.b, "}");
    }
}
