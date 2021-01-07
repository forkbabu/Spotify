package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ala  reason: default package */
public final class ala extends cla {
    private final Boolean a;
    private final String b;
    private final String c;

    ala(Boolean bool, String str, String str2) {
        if (bool != null) {
            this.a = bool;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null partnerIntegrationId");
            }
            throw new NullPointerException("Null clientId");
        }
        throw new NullPointerException("Null isConnected");
    }

    @Override // defpackage.cla
    public String a() {
        return this.b;
    }

    @Override // defpackage.cla
    public Boolean b() {
        return this.a;
    }

    @Override // defpackage.cla
    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cla)) {
            return false;
        }
        cla cla = (cla) obj;
        if (!this.a.equals(cla.b()) || !this.b.equals(cla.a()) || !this.c.equals(cla.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PartnerIntegrationModel{isConnected=");
        V0.append(this.a);
        V0.append(", clientId=");
        V0.append(this.b);
        V0.append(", partnerIntegrationId=");
        return je.I0(V0, this.c, "}");
    }
}
