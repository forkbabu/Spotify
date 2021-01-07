package defpackage;

/* renamed from: g02  reason: default package */
final class g02 extends k02 {
    private final i02 a;

    g02(i02 i02) {
        if (i02 != null) {
            this.a = i02;
            return;
        }
        throw new NullPointerException("Null display");
    }

    @Override // defpackage.k02
    public i02 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k02) {
            return this.a.equals(((k02) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Promotion{display=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
