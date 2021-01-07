package defpackage;

/* renamed from: ih4  reason: default package */
public final class ih4 extends bh4 {
    private final int a;

    public ih4(int i) {
        super(null);
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ih4) && this.a == ((ih4) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return je.B0(je.V0("PauseRequested(itemPosition="), this.a, ")");
    }
}
