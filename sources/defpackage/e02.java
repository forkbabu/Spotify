package defpackage;

import java.util.List;

/* renamed from: e02  reason: default package */
final class e02 extends i02 {
    private final List<j02> a;

    e02(List<j02> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null fields");
    }

    @Override // defpackage.i02
    public List<j02> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i02) {
            return this.a.equals(((i02) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("Display{fields="), this.a, "}");
    }
}
