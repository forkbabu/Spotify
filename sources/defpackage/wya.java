package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: wya  reason: default package */
public final class wya extends fza {
    private final String a;
    private final String b;
    private final String c;

    wya(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null countryCode");
            }
            throw new NullPointerException("Null catalogue");
        }
        throw new NullPointerException("Null username");
    }

    @Override // defpackage.fza
    public String a() {
        return this.b;
    }

    @Override // defpackage.fza
    public String b() {
        return this.c;
    }

    @Override // defpackage.fza
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fza)) {
            return false;
        }
        fza fza = (fza) obj;
        if (!this.a.equals(fza.d()) || !this.b.equals(fza.a()) || !this.c.equals(fza.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("UserSession{username=");
        V0.append(this.a);
        V0.append(", catalogue=");
        V0.append(this.b);
        V0.append(", countryCode=");
        return je.I0(V0, this.c, "}");
    }
}
