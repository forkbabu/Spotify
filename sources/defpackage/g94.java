package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: g94  reason: default package */
public class g94 extends i94 {
    private final o94 d = new o94();
    private final d64 e = new d64(this);

    public g94(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public float c() {
        ValueAnimator b;
        d64 d64 = this.e;
        if (d64 == null || (b = d64.b()) == null) {
            return 0.0f;
        }
        return b.getAnimatedFraction();
    }

    public void d() {
        this.e.a();
        this.d.d();
        invalidateSelf();
    }

    @Override // defpackage.i94, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ValueAnimator b;
        super.draw(canvas);
        if (this.d.c()) {
            o94 o94 = this.d;
            Paint b2 = b();
            d64 d64 = this.e;
            float f = 0.0f;
            if (!(d64 == null || (b = d64.b()) == null)) {
                f = b.getAnimatedFraction();
            }
            o94.a(canvas, b2, f, (float) a());
        }
    }

    public void e(Bitmap bitmap, boolean z) {
        if (this.d.b() != bitmap) {
            this.d.e(bitmap, getBounds());
            this.e.d(z);
        }
    }

    /* access modifiers changed from: protected */
    public void f(Rect rect) {
        this.d.f(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        f(getBounds());
    }
}
