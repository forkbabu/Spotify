package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: f14  reason: default package */
public class f14 implements vud {
    public static final jvd<Integer> c = jvd.b(0);
    public static final jvd<Integer> d = jvd.b(266);
    private tud a;
    private final View b;

    /* renamed from: f14$a */
    public static class a {
        public static final jvd<Float> a = jvd.b(Float.valueOf(1.0f));
        public static final Interpolator b = ta0.d;
    }

    public f14(View view) {
        this.b = view;
    }

    @Override // defpackage.vud
    public void a(float f) {
        this.b.animate().alpha(this.a.a(f));
    }

    @Override // defpackage.vud
    public int b() {
        return d.a().intValue() + c.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        float b2 = (float) b();
        this.a = new tud(((float) c.a().intValue()) / b2, ((float) d.a().intValue()) / b2, this.b.getAlpha(), a.a.a().floatValue(), a.b);
    }
}
