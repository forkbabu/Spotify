package defpackage;

/* renamed from: jf7  reason: default package */
final class jf7 extends kf7 {
    private final String a;
    private final String b;

    jf7(String str, String str2) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null contextUri");
    }

    @Override // defpackage.kf7
    public String a() {
        return this.a;
    }

    @Override // defpackage.kf7
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kf7)) {
            return false;
        }
        kf7 kf7 = (kf7) obj;
        if (this.a.equals(kf7.a())) {
            String str = this.b;
            if (str == null) {
                if (kf7.b() == null) {
                    return true;
                }
            } else if (str.equals(kf7.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerStateUris{contextUri=");
        V0.append(this.a);
        V0.append(", trackUri=");
        return je.I0(V0, this.b, "}");
    }
}
