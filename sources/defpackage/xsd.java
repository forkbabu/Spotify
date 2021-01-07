package defpackage;

/* renamed from: xsd  reason: default package */
public final class xsd extends vsd {
    private final int a;

    public xsd(int i) {
        super(null);
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xsd) && this.a == ((xsd) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return je.B0(je.V0("ResourceTitle(resourceId="), this.a, ")");
    }
}
