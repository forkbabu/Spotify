package defpackage;

import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;

/* renamed from: bb0  reason: default package */
public class bb0 implements vud {
    public static final jvd<Integer> c = jvd.b(0);
    public static final jvd<Integer> d = jvd.b(266);
    private final ab0 a;
    private tud b;

    public bb0(ab0 ab0) {
        this.a = ab0;
    }

    @Override // defpackage.vud
    public void a(float f) {
        this.a.C().e((int) this.b.a(f));
    }

    @Override // defpackage.vud
    public int b() {
        return d.a().intValue() + c.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        float D = this.a.D();
        StretchingGradientDrawable C = this.a.C();
        float b2 = (float) b();
        this.b = new tud(((float) c.a().intValue()) / b2, ((float) d.a().intValue()) / b2, (((0.5f * D) - ((float) C.b())) / D) * D, 0.0f, ta0.d);
    }
}
