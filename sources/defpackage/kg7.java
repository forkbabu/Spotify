package defpackage;

/* renamed from: kg7  reason: default package */
public final class kg7 extends gg7 {
    private final boolean a;

    public kg7(boolean z) {
        super(null);
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof kg7) && this.a == ((kg7) obj).a;
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
        return je.P0(je.V0("OptInStateChanged(optingIn="), this.a, ")");
    }
}
