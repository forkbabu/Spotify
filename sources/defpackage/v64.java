package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: v64  reason: default package */
public class v64 extends Drawable {
    private final z64 a;
    private final a74 b = new a74();
    private final b74 c = new b74();
    private final d64 d = new d64(this);
    private int e;

    public v64(Context context) {
        context.getClass();
        this.a = new z64(context);
    }

    public void a(float f) {
        this.a.f(f);
        invalidateSelf();
    }

    public void b(Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            this.b.c();
            this.d.a();
        } else {
            this.b.e(bitmap);
            this.d.d(z);
        }
        invalidateSelf();
    }

    public void c(int i, int i2) {
        this.a.e(i, i2);
        invalidateSelf();
    }

    public void d(float f) {
        this.b.h(f);
        this.c.e(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ValueAnimator b2;
        ValueAnimator b3;
        this.a.a(canvas);
        if (this.b.b()) {
            b74 b74 = this.c;
            d64 d64 = this.d;
            float f = 0.0f;
            b74.a(canvas, (d64 == null || (b3 = d64.b()) == null) ? 0.0f : b3.getAnimatedFraction());
            a74 a74 = this.b;
            d64 d642 = this.d;
            if (!(d642 == null || (b2 = d642.b()) == null)) {
                f = b2.getAnimatedFraction();
            }
            a74.a(canvas, f);
        }
    }

    public void e(boolean z) {
        this.b.i(z);
        this.c.f(z);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.e == 0 ? -2 : -3;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.c(rect);
        this.b.f(rect);
        this.c.c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e = i;
        this.a.b(i);
        this.b.d(i);
        this.c.b(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.d(colorFilter);
        this.b.g(colorFilter);
        this.c.d(colorFilter);
    }
}
