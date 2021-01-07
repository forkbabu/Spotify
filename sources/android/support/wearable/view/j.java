package android.support.wearable.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* access modifiers changed from: package-private */
@Deprecated
public class j extends Drawable implements Drawable.Callback {
    private int A;
    private float B;
    private float C;
    private Drawable a;
    private int b = BitmapRenderer.ALPHA_VISIBLE;
    private boolean c = true;
    private int f;
    private PorterDuff.Mode n;
    private ColorFilter o;
    private boolean p = true;
    private int q;
    private int r = 2;
    private int s = 2;
    private float t = 1.0f;
    private float u = 1.0f;
    private int v;
    private int w;
    private final Rect x = new Rect();
    private float y = 1.0f;
    private int z;

    public j() {
        c(null);
    }

    private static float a(float f2, int i, int i2) {
        float f3 = (float) i;
        if (f2 < f3) {
            return f3;
        }
        float f4 = (float) i2;
        return f2 > f4 ? f4 : f2;
    }

    private void b() {
        if (this.a != null && this.x.width() != 0 && this.x.height() != 0) {
            this.z = this.a.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            this.A = intrinsicHeight;
            if (this.z == -1 || intrinsicHeight == -1) {
                this.z = this.x.width();
                this.A = this.x.height();
                this.y = 1.0f;
                this.B = 0.0f;
                this.C = 0.0f;
                this.v = 0;
                this.w = 0;
                return;
            }
            this.B = ((float) this.x.width()) * 0.2f;
            this.C = ((float) this.x.height()) * 0.2f;
            float width = (((float) this.r) * this.B) + ((float) this.x.width());
            float height = (((float) this.s) * this.C) + ((float) this.x.height());
            float max = Math.max(width / ((float) this.z), height / ((float) this.A));
            this.y = max;
            float f2 = ((float) this.z) * max;
            float f3 = ((float) this.A) * max;
            if (f2 > width) {
                this.v = (int) ((f2 - width) / 2.0f);
                this.w = 0;
                return;
            }
            this.w = (int) ((f3 - height) / 2.0f);
            this.v = 0;
        }
    }

    private void e(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            if (intrinsicWidth == -1 || intrinsicHeight == -1) {
                this.a.setBounds(rect);
                return;
            }
            Drawable drawable2 = this.a;
            int i = rect.left;
            int i2 = rect.top;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
    }

    public void c(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.a = drawable;
            if (drawable != null) {
                drawable.setAlpha(this.b);
                e(getBounds());
                this.a.setCallback(this);
                ColorFilter colorFilter = this.o;
                if (colorFilter != null) {
                    this.a.setColorFilter(colorFilter);
                }
                PorterDuff.Mode mode = this.n;
                if (mode != null) {
                    this.a.setColorFilter(this.f, mode);
                }
                this.a.setDither(this.c);
                this.a.setFilterBitmap(this.p);
                this.a.setState(getState());
                b();
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        if (this.n != null) {
            this.n = null;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.clearColorFilter();
            }
        }
    }

    public void d(float f2, float f3) {
        if (this.t != f2 || this.u != f3) {
            this.t = a(f2, 0, this.r);
            this.u = a(f3, 0, this.s);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a != null) {
            canvas.save();
            canvas.clipRect(getBounds());
            canvas.translate(-((this.t * this.B) + ((float) this.v)), -((this.u * this.C) + ((float) this.w)));
            float f2 = this.y;
            canvas.scale(f2, f2);
            this.a.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.a && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.x.set(rect);
        e(rect);
        b();
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.a && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.b != i) {
            this.b = i;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        if (this.q != i) {
            this.q = i;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setChangingConfigurations(i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.f != i || this.n != mode) {
            this.f = i;
            this.n = mode;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setColorFilter(i, mode);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        if (this.c != z2) {
            this.c = z2;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        if (this.p != z2) {
            this.p = z2;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setFilterBitmap(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.a && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.o != colorFilter) {
            this.o = colorFilter;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }
}
