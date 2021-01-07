package defpackage;

/* renamed from: brc  reason: default package */
public final class brc implements uqc {
    private final int a;

    public brc(int i) {
        this.a = i;
    }

    @Override // defpackage.uqc
    public Object a() {
        return Integer.valueOf(this.a);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof brc) && this.a == ((brc) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return je.B0(je.V0("ProgressState(progress="), this.a, ")");
    }
}
