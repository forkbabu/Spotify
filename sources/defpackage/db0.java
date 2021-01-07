package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: db0  reason: default package */
public class db0 implements vud {
    public static final jvd<Integer> d = jvd.b(0);
    public static final jvd<Integer> e = jvd.b(100);
    public static final jvd<Integer> f = jvd.b(16);
    public static final jvd<Float> g = jvd.b(Float.valueOf(0.176f));
    public static final Interpolator h = ta0.c;
    public static final jvd<Float> i = jvd.b(Float.valueOf(0.0f));
    private final ab0 a;
    private final List<tud> b = new ArrayList();
    private final List<tud> c = new ArrayList();

    public db0(ab0 ab0) {
        this.a = ab0;
    }

    @Override // defpackage.vud
    public void a(float f2) {
        List<View> F = this.a.F();
        for (int i2 = 0; i2 < F.size(); i2++) {
            View view = F.get(i2);
            view.setTranslationY(this.b.get(i2).a(f2));
            view.setAlpha(this.c.get(i2).a(f2));
        }
        this.a.E();
    }

    @Override // defpackage.vud
    public int b() {
        List<View> F = this.a.F();
        return ((F.size() - 1) * f.a().intValue()) + e.a().intValue() + d.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        List<View> F = this.a.F();
        float b2 = (float) b();
        this.b.clear();
        this.c.clear();
        for (int i2 = 0; i2 < F.size(); i2++) {
            int intValue = d.a().intValue();
            int intValue2 = (f.a().intValue() * ((F.size() - i2) - 1)) + e.a().intValue();
            View view = F.get(i2);
            List<tud> list = this.c;
            float f2 = ((float) intValue) / b2;
            float f3 = ((float) intValue2) / b2;
            float alpha = view.getAlpha();
            float floatValue = i.a().floatValue();
            Interpolator interpolator = h;
            list.add(new tud(f2, f3, alpha, floatValue, interpolator));
            this.b.add(new tud(f2, f3, view.getTranslationY(), this.a.D() * g.a().floatValue(), interpolator));
        }
    }
}
