package defpackage;

/* renamed from: kk1  reason: default package */
final class kk1 extends lk1 {
    private final boolean a;
    private final Integer b;

    kk1(boolean z, Integer num) {
        this.a = z;
        if (num != null) {
            this.b = num;
            return;
        }
        throw new NullPointerException("Null duration");
    }

    @Override // defpackage.lk1
    public Integer a() {
        return this.b;
    }

    @Override // defpackage.lk1
    public boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lk1)) {
            return false;
        }
        lk1 lk1 = (lk1) obj;
        if (this.a != lk1.b() || !this.b.equals(lk1.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CrossfadeState{enabled=");
        V0.append(this.a);
        V0.append(", duration=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
