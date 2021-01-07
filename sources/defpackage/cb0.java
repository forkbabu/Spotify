package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cb0  reason: default package */
public class cb0 implements vud {
    public static final jvd<Integer> d = jvd.b(0);
    public static final jvd<Integer> e = jvd.b(266);
    public static final jvd<Integer> f = jvd.b(16);
    public static final jvd<Float> g = jvd.b(Float.valueOf(0.176f));
    public static final jvd<Float> h;
    public static final Interpolator i = ta0.d;
    public static final jvd<Float> j;
    public static final jvd<Float> k = jvd.b(Float.valueOf(1.0f));
    private final ab0 a;
    private final List<tud> b = new ArrayList();
    private final List<tud> c = new ArrayList();

    static {
        Float valueOf = Float.valueOf(0.0f);
        h = jvd.b(valueOf);
        j = jvd.b(valueOf);
    }

    public cb0(ab0 ab0) {
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
        return (f.a().intValue() * (F.size() - 1)) + (e.a().intValue() * F.size());
    }

    @Override // defpackage.vud
    public void k() {
        List<View> F = this.a.F();
        float D = this.a.D();
        this.b.clear();
        this.c.clear();
        float b2 = (float) b();
        for (int i2 = 0; i2 < F.size(); i2++) {
            int intValue = (f.a().intValue() * ((F.size() - i2) - 1)) + d.a().intValue();
            List<tud> list = this.c;
            float f2 = ((float) intValue) / b2;
            jvd<Integer> jvd = e;
            float intValue2 = ((float) jvd.a().intValue()) / b2;
            float floatValue = j.a().floatValue();
            float floatValue2 = k.a().floatValue();
            Interpolator interpolator = i;
            list.add(new tud(f2, intValue2, floatValue, floatValue2, interpolator));
            this.b.add(new tud(f2, ((float) jvd.a().intValue()) / b2, g.a().floatValue() * D, h.a().floatValue() * D, interpolator));
        }
    }
}
