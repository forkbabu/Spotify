package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: prc  reason: default package */
public final class prc extends rrc {
    private final int a;

    prc(int i) {
        this.a = i;
    }

    @Override // defpackage.rrc
    public int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rrc) || this.a != ((rrc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        return je.B0(je.V0("Configuration{cardWidth="), this.a, "}");
    }
}
