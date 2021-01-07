package defpackage;

import android.view.animation.Interpolator;
import android.widget.ImageView;

/* renamed from: wn2  reason: default package */
public class wn2 implements vud {
    private final ImageView a;
    private tud b;
    private tud c;

    public wn2(ImageView imageView) {
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
        return avd.e.a().intValue();
    }

    @Override // defpackage.vud
    public void k() {
        Interpolator b2 = xud.b(this.a.getContext());
        this.c = new tud(0.0f, 1.0f, this.a.getScaleX(), dvd.c.a().floatValue(), b2);
        this.b = new tud(0.0f, 1.0f, (float) this.a.getImageAlpha(), avd.f.a().floatValue(), b2);
    }
}
