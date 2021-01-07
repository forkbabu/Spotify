package defpackage;

/* renamed from: kh4  reason: default package */
public final class kh4 extends bh4 {
    private final int a;

    public kh4(int i) {
        super(null);
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof kh4) && this.a == ((kh4) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return je.B0(je.V0("PlayRequested(itemPosition="), this.a, ")");
    }
}
