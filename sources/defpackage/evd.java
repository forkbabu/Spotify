package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: evd  reason: default package */
public class evd implements vud {
    public static final jvd<Integer> e = jvd.b(Integer.valueOf(Build.VERSION.SDK_INT < 21 ? 0 : 200));
    private final cvd a;
    private tud b;
    private tud c;
    private tud d;

    public evd(cvd cvd) {
        this.a = cvd;
    }

    @Override // defpackage.vud
    public void a(float f) {
        ((bvd) this.a).d().setScaleX(this.b.a(f));
        ((bvd) this.a).d().setScaleY(this.b.a(f));
        if (!((bvd) this.a).c().isEmpty()) {
            for (View view : ((bvd) this.a).c()) {
                view.setAlpha(this.c.a(f));
            }
        }
        if (!((bvd) this.a).e().isEmpty()) {
            for (View view2 : ((bvd) this.a).e()) {
                view2.setAlpha(this.d.a(f));
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
        this.b = new tud(0.0f, 1.0f, ((bvd) this.a).d().getScaleX(), 1.0f, b2);
        if (!((bvd) this.a).c().isEmpty()) {
            this.c = new tud(0.0f, 1.0f, ((bvd) this.a).c().get(0).getAlpha(), 1.0f, b2);
        }
        if (!((bvd) this.a).e().isEmpty()) {
            this.d = new tud(0.0f, 1.0f, ((bvd) this.a).e().get(0).getAlpha(), 1.0f, b2);
        }
    }
}
