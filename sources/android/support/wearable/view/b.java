package android.support.wearable.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

@Deprecated
public class b extends Drawable implements Drawable.Callback {
    private Drawable a;
    private Drawable b;
    private float c;
    private int f;
    private int n;
    private ColorFilter o;
    private boolean p;
    private boolean q;
    private int r;
    private PorterDuff.Mode s;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r3 > r0) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(float r3) {
        /*
            r2 = this;
            r0 = 0
            float r0 = (float) r0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0008
        L_0x0006:
            r3 = r0
            goto L_0x000f
        L_0x0008:
            r0 = 1
            float r0 = (float) r0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x000f
            goto L_0x0006
        L_0x000f:
            float r0 = r2.c
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
            r2.c = r3
            r2.invalidateSelf()
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.b.a(float):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        if (this.s != null) {
            this.s = null;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.clearColorFilter();
            }
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                drawable2.clearColorFilter();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null && (this.c < 1.0f || this.a == null)) {
            drawable.setAlpha(BitmapRenderer.ALPHA_VISIBLE);
            this.b.draw(canvas);
        }
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            float f2 = this.c;
            if (f2 > 0.0f) {
                drawable2.setAlpha((int) (f2 * 255.0f));
                this.a.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        int i = -1;
        int intrinsicHeight = drawable == null ? -1 : drawable.getIntrinsicHeight();
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            i = drawable2.getIntrinsicHeight();
        }
        return Math.max(intrinsicHeight, i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        int i = -1;
        int intrinsicWidth = drawable == null ? -1 : drawable.getIntrinsicWidth();
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            i = drawable2.getIntrinsicHeight();
        }
        return Math.max(intrinsicWidth, i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        int i = 0;
        int opacity = drawable == null ? 0 : drawable.getOpacity();
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            i = drawable2.getOpacity();
        }
        return Drawable.resolveOpacity(opacity, i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if ((drawable == this.a || drawable == this.b) && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable;
        Drawable drawable2 = this.a;
        return (drawable2 != null && drawable2.isStateful()) || ((drawable = this.b) != null && drawable.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        boolean z = false;
        if (drawable != null) {
            z = false | drawable.setLevel(i);
        }
        Drawable drawable2 = this.b;
        return drawable2 != null ? z | drawable2.setLevel(i) : z;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        boolean z = false;
        if (drawable != null) {
            z = false | drawable.setState(iArr);
        }
        Drawable drawable2 = this.b;
        return drawable2 != null ? z | drawable2.setState(iArr) : z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if ((drawable == this.a || drawable == this.b) && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f) {
            this.f = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        if (this.n != i) {
            this.n = i;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setChangingConfigurations(i);
            }
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                drawable2.setChangingConfigurations(i);
            }
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
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                drawable2.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.q != z) {
            this.q = z;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setDither(z);
            }
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                drawable2.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        if (this.p != z) {
            this.p = z;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                drawable2.setFilterBitmap(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if ((drawable == this.a || drawable == this.b) && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.r != i || this.s != mode) {
            this.r = i;
            this.s = mode;
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setColorFilter(i, mode);
            }
            Drawable drawable2 = this.b;
            if (drawable2 != null) {
                drawable2.setColorFilter(i, mode);
            }
        }
    }
}
