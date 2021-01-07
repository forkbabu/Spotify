package defpackage;

/* renamed from: fh4  reason: default package */
public final class fh4 extends bh4 {
    private final int a;

    public fh4(int i) {
        super(null);
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fh4) && this.a == ((fh4) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return je.B0(je.V0("DeleteRequested(itemPosition="), this.a, ")");
    }
}
