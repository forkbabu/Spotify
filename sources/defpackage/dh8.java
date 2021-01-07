package defpackage;

/* renamed from: dh8  reason: default package */
abstract class dh8 extends gh8 {
    private final int a;
    private final float b;

    dh8(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.gh8
    public int a() {
        return this.a;
    }

    @Override // defpackage.gh8
    public float b() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gh8)) {
            return false;
        }
        gh8 gh8 = (gh8) obj;
        if (this.a == gh8.a() && Float.floatToIntBits(this.b) == Float.floatToIntBits(gh8.b())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("GradientBackgroundSaveState{height=");
        V0.append(this.a);
        V0.append(", yOffset=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
