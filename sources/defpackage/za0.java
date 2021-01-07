package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: za0  reason: default package */
public class za0 implements vud {
    private tud a;
    private tud b;
    private tud c;
    private final ab0 d;

    /* renamed from: za0$a */
    public static class a {
        public static final jvd<Integer> a = jvd.b(0);
        public static final jvd<Integer> b = jvd.b(100);
        public static final jvd<Float> c = jvd.b(Float.valueOf(0.0f));
        public static final Interpolator d = ta0.c;
    }

    /* renamed from: za0$b */
    public static class b {
        public static final jvd<Integer> a = jvd.b(0);
        public static final jvd<Integer> b = jvd.b(100);
        public static final jvd<Float> c = jvd.b(Float.valueOf(1.0f));
        public static final Interpolator d = ta0.c;
    }

    /* renamed from: za0$c */
    public static class c {
        public static final jvd<Integer> a = jvd.b(0);
        public static final jvd<Integer> b = jvd.b(100);
        public static final jvd<Float> c = jvd.b(Float.valueOf(0.0f));
        public static final Interpolator d = ta0.a;
    }

    public za0(ab0 ab0) {
        this.d = ab0;
    }

    @Override // defpackage.vud
    public void a(float f) {
        StretchingGradientDrawable C = this.d.C();
        View G = this.d.G();
        C.f(this.a.a(f));
        C.d(this.b.a(f));
        G.setAlpha(this.c.a(f));
        this.d.E();
    }

    @Override // defpackage.vud
    public int b() {
        return b.b.a().intValue() + this.d.B();
    }

    @Override // defpackage.vud
    public void k() {
        int B = this.d.B();
        float b2 = (float) b();
        StretchingGradientDrawable C = this.d.C();
        View G = this.d.G();
        this.a = new tud(((float) b.a.a().intValue()) / b2, ((float) (b.b.a().intValue() + B)) / b2, C.c(), b.c.a().floatValue() * this.d.D(), b.d);
        this.b = new tud(((float) a.a.a().intValue()) / b2, ((float) (a.b.a().intValue() + B)) / b2, C.a(), a.c.a().floatValue(), a.d);
        this.c = new tud(((float) c.a.a().intValue()) / b2, ((float) (c.b.a().intValue() + B)) / b2, G.getAlpha(), c.c.a().floatValue(), c.d);
    }
}
