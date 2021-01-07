package defpackage;

import android.view.animation.Interpolator;

/* renamed from: eb0  reason: default package */
public class eb0 implements vud {
    public static final jvd<Integer> c = jvd.b(0);
    public static final jvd<Integer> d = jvd.b(266);
    public static final jvd<Float> e = jvd.b(Float.valueOf(0.0f));
    public static final jvd<Float> f = jvd.b(Float.valueOf(1.0f));
    public static final Interpolator g = ta0.d;
    private final tud a;
    private final ab0 b;

    public eb0(ab0 ab0) {
        this.b = ab0;
        float b2 = (float) b();
        this.a = new tud(((float) c.a().intValue()) / b2, ((float) d.a().intValue()) / b2, e.a().floatValue(), f.a().floatValue(), g);
    }

    @Override // defpackage.vud
    public void a(float f2) {
        this.b.A().setAlpha(this.a.a(f2));
    }

    @Override // defpackage.vud
    public int b() {
        return d.a().intValue() + c.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
    }
}
