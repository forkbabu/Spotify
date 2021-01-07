package defpackage;

/* renamed from: vx  reason: default package */
public class vx extends ux {
    @Override // defpackage.ux
    public void a(fy fyVar, float f, float f2, float f3) {
        fyVar.g(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double sin = Math.sin(Math.toRadians((double) f));
        double d = (double) f3;
        Double.isNaN(d);
        double d2 = (double) f2;
        Double.isNaN(d2);
        double sin2 = Math.sin(Math.toRadians((double) (90.0f - f)));
        Double.isNaN(d);
        Double.isNaN(d2);
        fyVar.e((float) (sin * d * d2), (float) (sin2 * d * d2));
    }
}
