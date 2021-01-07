package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public final class c extends Drawable {
    private final ValueAnimator.AnimatorUpdateListener a = new a();
    private final Paint b;
    private final Rect c;
    private final Matrix d;
    private ValueAnimator e;
    private b f;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.invalidateSelf();
        }
    }

    public c() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    private float b(float f2, float f3, float f4) {
        return je.a(f3, f2, f4, f2);
    }

    private void f() {
        b bVar;
        Shader shader;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (bVar = this.f) != null) {
            int i = bVar.g;
            if (i <= 0) {
                i = Math.round(bVar.i * ((float) width));
            }
            b bVar2 = this.f;
            int i2 = bVar2.h;
            if (i2 <= 0) {
                i2 = Math.round(bVar2.j * ((float) height));
            }
            b bVar3 = this.f;
            boolean z = true;
            if (bVar3.f != 1) {
                int i3 = bVar3.c;
                if (!(i3 == 1 || i3 == 3)) {
                    z = false;
                }
                if (z) {
                    i = 0;
                }
                if (!z) {
                    i2 = 0;
                }
                b bVar4 = this.f;
                shader = new LinearGradient(0.0f, 0.0f, (float) i, (float) i2, bVar4.b, bVar4.a, Shader.TileMode.CLAMP);
            } else {
                float f2 = ((float) i) / 2.0f;
                float f3 = ((float) i2) / 2.0f;
                double max = (double) Math.max(i, i2);
                double sqrt = Math.sqrt(2.0d);
                Double.isNaN(max);
                b bVar5 = this.f;
                shader = new RadialGradient(f2, f3, (float) (max / sqrt), bVar5.b, bVar5.a, Shader.TileMode.CLAMP);
            }
            this.b.setShader(shader);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        b bVar;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (bVar = this.f) != null && bVar.o && getCallback() != null) {
            this.e.start();
        }
    }

    public void c(b bVar) {
        boolean z;
        this.f = bVar;
        if (bVar != null) {
            this.b.setXfermode(new PorterDuffXfermode(this.f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        f();
        if (this.f != null) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.e.cancel();
                this.e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            b bVar2 = this.f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (bVar2.t / bVar2.s)) + 1.0f);
            this.e = ofFloat;
            ofFloat.setRepeatMode(this.f.r);
            this.e.setRepeatCount(this.f.q);
            ValueAnimator valueAnimator2 = this.e;
            b bVar3 = this.f;
            valueAnimator2.setDuration(bVar3.s + bVar3.t);
            this.e.addUpdateListener(this.a);
            if (z) {
                this.e.start();
            }
        }
        invalidateSelf();
    }

    public void d() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            if (!(valueAnimator.isStarted()) && getCallback() != null) {
                this.e.start();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f2;
        float b2;
        if (this.f != null && this.b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f.m));
            float width = (((float) this.c.width()) * tan) + ((float) this.c.height());
            float height = (tan * ((float) this.c.height())) + ((float) this.c.width());
            ValueAnimator valueAnimator = this.e;
            float f3 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f.c;
            if (i != 1) {
                if (i == 2) {
                    b2 = b(height, -height, animatedFraction);
                } else if (i != 3) {
                    b2 = b(-height, height, animatedFraction);
                } else {
                    f2 = b(width, -width, animatedFraction);
                }
                f3 = b2;
                f2 = 0.0f;
            } else {
                f2 = b(-width, width, animatedFraction);
            }
            this.d.reset();
            this.d.setRotate(this.f.m, ((float) this.c.width()) / 2.0f, ((float) this.c.height()) / 2.0f);
            this.d.postTranslate(f3, f2);
            this.b.getShader().setLocalMatrix(this.d);
            canvas.drawRect(this.c, this.b);
        }
    }

    public void e() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                this.e.cancel();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        b bVar = this.f;
        return (bVar == null || (!bVar.n && !bVar.p)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        f();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
