package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: fnf  reason: default package */
public final class fnf implements gnf<Float> {
    private final float a;
    private final float b;

    public fnf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // defpackage.gnf
    public boolean a(Float f) {
        float floatValue = f.floatValue();
        return floatValue >= this.a && floatValue <= this.b;
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fnf) {
            if (!b() || !((fnf) obj).b()) {
                fnf fnf = (fnf) obj;
                if (!(this.a == fnf.a && this.b == fnf.b)) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (Float.valueOf(this.a).hashCode() * 31) + Float.valueOf(this.b).hashCode();
    }

    public String toString() {
        return this.a + ".." + this.b;
    }
}
