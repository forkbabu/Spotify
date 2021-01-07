package defpackage;

/* renamed from: mg7  reason: default package */
public final class mg7 extends gg7 {
    private final boolean a;

    public mg7(boolean z) {
        super(null);
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof mg7) && this.a == ((mg7) obj).a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return je.P0(je.V0("OptInStateReceived(optedIn="), this.a, ")");
    }
}
