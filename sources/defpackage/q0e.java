package defpackage;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: q0e  reason: default package */
public final class q0e extends r0e {
    private final List<String> a;

    q0e(List<String> list) {
        this.a = list;
    }

    @Override // defpackage.r0e
    public List<String> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0e) {
            return this.a.equals(((r0e) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("EnumValueValidator{values="), this.a, "}");
    }
}
