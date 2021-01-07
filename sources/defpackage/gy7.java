package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: gy7  reason: default package */
public final class gy7 extends ly7 {
    private final String a;
    private final String b;

    gy7(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null currentUri");
        }
        throw new NullPointerException("Null previousUri");
    }

    @Override // defpackage.ly7
    public String a() {
        return this.b;
    }

    @Override // defpackage.ly7
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ly7)) {
            return false;
        }
        ly7 ly7 = (ly7) obj;
        if (!this.a.equals(ly7.b()) || !this.b.equals(ly7.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("NavigationEvent{previousUri=");
        V0.append(this.a);
        V0.append(", currentUri=");
        return je.I0(V0, this.b, "}");
    }
}
