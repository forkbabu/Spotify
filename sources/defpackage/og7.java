package defpackage;

/* renamed from: og7  reason: default package */
public final class og7 extends eg7 {
    private final boolean a;

    public og7(boolean z) {
        super(null);
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof og7) && this.a == ((og7) obj).a;
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
        return je.P0(je.V0("Received(optedIn="), this.a, ")");
    }
}
