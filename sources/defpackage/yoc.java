package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: yoc  reason: default package */
public final class yoc extends zoc {
    private final int a;

    yoc(int i) {
        this.a = i;
    }

    @Override // defpackage.zoc
    public int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zoc) || this.a != ((zoc) obj).a()) {
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
