package defpackage;

/* renamed from: v50  reason: default package */
public final class v50 extends i60 {
    private final int a;

    public v50(int i) {
        super(null);
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof v50) && this.a == ((v50) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return je.B0(je.V0("GridMode(span="), this.a, ")");
    }
}
