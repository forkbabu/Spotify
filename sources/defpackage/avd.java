package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: avd  reason: default package */
public class avd implements vud {
    public static final jvd<Integer> e = jvd.b(0);
    public static final jvd<Float> f;
    public static final jvd<Float> g;
    private final cvd a;
    private tud b;
    private tud c;
    private tud d;

    static {
        Float valueOf = Float.valueOf(0.6f);
        f = jvd.b(valueOf);
        g = jvd.b(valueOf);
    }

    public avd(cvd cvd) {
        this.a = cvd;
    }

    @Override // defpackage.vud
    public void a(float f2) {
        ((bvd) this.a).d().setScaleX(this.b.a(f2));
        ((bvd) this.a).d().setScaleY(this.b.a(f2));
        if (!((bvd) this.a).c().isEmpty()) {
            for (View view : ((bvd) this.a).c()) {
                view.setAlpha(this.c.a(f2));
            }
        }
        if (!((bvd) this.a).e().isEmpty()) {
            for (View view2 : ((bvd) this.a).e()) {
                view2.setAlpha(this.d.a(f2));
            }
        }
    }

    @Override // defpackage.vud
    public int b() {
        return e.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        Interpolator b2 = xud.b(((bvd) this.a).d().getContext());
        this.b = new tud(0.0f, 1.0f, ((bvd) this.a).d().getScaleX(), ((bvd) this.a).b(), b2);
        if (!((bvd) this.a).c().isEmpty()) {
            this.c = new tud(0.0f, 1.0f, ((bvd) this.a).c().get(0).getAlpha(), f.a().floatValue(), b2);
        }
        if (!((bvd) this.a).e().isEmpty()) {
            this.d = new tud(0.0f, 1.0f, ((bvd) this.a).e().get(0).getAlpha(), g.a().floatValue(), b2);
        }
    }
}
