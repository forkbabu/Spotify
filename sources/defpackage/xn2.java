package defpackage;

import android.view.animation.Interpolator;
import android.widget.ImageView;

/* renamed from: xn2  reason: default package */
public class xn2 implements vud {
    private final ImageView a;
    private tud b;
    private tud c;

    public xn2(ImageView imageView) {
        this.a = imageView;
    }

    @Override // defpackage.vud
    public void a(float f) {
        this.a.setScaleX(this.c.a(f));
        this.a.setScaleY(this.c.a(f));
        this.a.setImageAlpha((int) (this.b.a(f) * 255.0f));
    }

    @Override // defpackage.vud
    public int b() {
        return evd.e.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        Interpolator b2 = xud.b(this.a.getContext());
        this.c = new tud(0.0f, 1.0f, this.a.getScaleX(), 1.0f, b2);
        this.b = new tud(0.0f, 1.0f, ((float) this.a.getImageAlpha()) / 255.0f, 1.0f, b2);
    }
}
