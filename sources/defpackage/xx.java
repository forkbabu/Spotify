package defpackage;

/* renamed from: xx  reason: default package */
public final class xx extends wx {
    private final float a;

    public xx(float f) {
        this.a = f - 0.001f;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wx
    public boolean b() {
        return true;
    }

    @Override // defpackage.wx
    public void c(float f, float f2, float f3, fy fyVar) {
        double d = (double) this.a;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float f4 = (float) ((sqrt * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.a, 2.0d) - Math.pow((double) f4, 2.0d));
        double d2 = (double) this.a;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = sqrt3 * d2;
        double d4 = (double) this.a;
        Double.isNaN(d4);
        fyVar.f(f2 - f4, ((float) (-(d3 - d4))) + sqrt2);
        double d5 = (double) this.a;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = sqrt4 * d5;
        double d7 = (double) this.a;
        Double.isNaN(d7);
        fyVar.e(f2, (float) (-(d6 - d7)));
        double d8 = (double) this.a;
        double sqrt5 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = sqrt5 * d8;
        double d10 = (double) this.a;
        Double.isNaN(d10);
        fyVar.e(f2 + f4, ((float) (-(d9 - d10))) + sqrt2);
    }
}
