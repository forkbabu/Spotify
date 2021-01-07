package defpackage;

/* renamed from: yjd  reason: default package */
final class yjd extends dkd {
    private final boolean a;
    private final String b;

    yjd(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.dkd
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.dkd
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dkd)) {
            return false;
        }
        dkd dkd = (dkd) obj;
        if (this.a == dkd.a()) {
            String str = this.b;
            if (str == null) {
                if (dkd.b() == null) {
                    return true;
                }
            } else if (str.equals(dkd.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("SuperbirdSession{isConnected=");
        V0.append(this.a);
        V0.append(", serial=");
        return je.I0(V0, this.b, "}");
    }
}
