package defpackage;

import java.util.List;

/* renamed from: h02  reason: default package */
final class h02 extends l02 {
    private final List<k02> a;

    h02(List<k02> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null promotions");
    }

    @Override // defpackage.l02
    public List<k02> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l02) {
            return this.a.equals(((l02) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.L0(je.V0("PromotionsResponse{promotions="), this.a, "}");
    }
}
