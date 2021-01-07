package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: g14  reason: default package */
public class g14 implements vud {
    public static final jvd<Integer> d = jvd.b(0);
    public static final jvd<Integer> e = jvd.b(266);
    private final View a;
    private tud b;
    private tud c;

    /* renamed from: g14$a */
    public static class a {
        public static final jvd<Float> a = jvd.b(Float.valueOf(1.0f));
        public static final Interpolator b = ta0.d;
    }

    /* renamed from: g14$b */
    public static class b {
        public static final jvd<Float> a = jvd.b(Float.valueOf(10.0f));
        public static final Interpolator b = ta0.d;
    }

    public g14(View view) {
        this.a = view;
    }

    @Override // defpackage.vud
    public void a(float f) {
        this.a.animate().scaleX(this.b.a(f));
        this.a.animate().scaleY(this.b.a(f));
        this.a.animate().translationY(this.c.a(f));
    }

    @Override // defpackage.vud
    public int b() {
        return e.a().intValue() + d.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        float b2 = (float) b();
        jvd<Integer> jvd = d;
        jvd<Integer> jvd2 = e;
        this.b = new tud(((float) jvd.a().intValue()) / b2, ((float) jvd2.a().intValue()) / b2, this.a.getScaleX(), a.a.a().floatValue(), a.b);
        this.c = new tud(((float) jvd.a().intValue()) / b2, ((float) jvd2.a().intValue()) / b2, this.a.getTranslationY(), b.a.a().floatValue(), b.b);
    }
}
