package defpackage;

import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: ya0  reason: default package */
public class ya0 implements vud {
    private tud a;
    private final tud b;
    private final ab0 c;

    /* renamed from: ya0$a */
    public static class a {
        public static final jvd<Integer> a = jvd.b(0);
        public static final jvd<Integer> b = jvd.b(266);
        public static final jvd<Float> c = jvd.b(Float.valueOf(0.0f));
        public static final jvd<Float> d = jvd.b(Float.valueOf(0.5f));
        public static final Interpolator e = ta0.d;
    }

    /* renamed from: ya0$b */
    public static class b {
        public static final jvd<Integer> a = jvd.b(0);
        public static final jvd<Integer> b = jvd.b(266);
        public static final jvd<Float> c = jvd.b(Float.valueOf(1.0f));
        public static final jvd<Float> d = jvd.b(Float.valueOf(0.0f));
        public static final Interpolator e = ta0.d;
    }

    public ya0(ab0 ab0) {
        this.c = ab0;
        float b2 = (float) b();
        this.b = new tud(((float) a.a.a().intValue()) / b2, ((float) a.b.a().intValue()) / b2, a.c.a().floatValue(), a.d.a().floatValue(), a.e);
    }

    @Override // defpackage.vud
    public void a(float f) {
        StretchingGradientDrawable C = this.c.C();
        float D = this.c.D();
        C.d(this.b.a(f));
        C.f(this.a.a(f) * D);
        this.c.E();
    }

    @Override // defpackage.vud
    public int b() {
        return a.b.a().intValue() + a.a.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        float b2 = (float) b();
        this.a = new tud(((float) b.a.a().intValue()) / b2, ((float) b.b.a().intValue()) / b2, b.c.a().floatValue(), b.d.a().floatValue(), b.e);
    }
}
