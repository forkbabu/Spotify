package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* renamed from: gvb  reason: default package */
public class gvb extends Drawable {
    private final Drawable a;
    private float b;
    private final Paint c;
    private ColorStateList d;
    private int e = BitmapRenderer.ALPHA_VISIBLE;
    private int f;

    public gvb(Drawable drawable) {
        Paint paint = new Paint(1);
        this.c = paint;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            throw new IllegalArgumentException("Drawables without intrinsic size are not supported.");
        }
        this.a = drawable.mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
    }

    private void e() {
        this.c.setAlpha((Color.alpha(this.f) * this.e) / BitmapRenderer.ALPHA_VISIBLE);
    }

    public void a(int i) {
        this.a.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        invalidateSelf();
    }

    public void b(int i) {
        this.d = ColorStateList.valueOf(i);
        this.c.setColor(i);
        this.f = i;
        e();
        invalidateSelf();
    }

    public void c(float f2) {
        this.b = f2;
    }

    public void d(float f2) {
        if (f2 >= 0.0f) {
            this.c.setStrokeWidth(f2);
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Negative strokeWidth is not supported.");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int intrinsicWidth = this.a.getIntrinsicWidth();
        int intrinsicHeight = this.a.getIntrinsicHeight();
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.translate(bounds.exactCenterX(), bounds.exactCenterY());
        if (this.c.getStrokeWidth() > 0.0f) {
            float f2 = ((float) intrinsicWidth) / 2.0f;
            float f3 = this.b;
            float f4 = ((float) intrinsicHeight) / 2.0f;
            canvas.drawLine(f2 - f3, (-f4) + f3, (-f2) + f3, f4 - f3, this.c);
        }
        canvas.translate(((float) (-intrinsicWidth)) / 2.0f, ((float) (-intrinsicHeight)) / 2.0f);
        this.a.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.d;
        return (colorStateList != null && colorStateList.isStateful()) || this.a.isStateful();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean state = this.a.isStateful() ? this.a.setState(iArr) | false : false;
        if (this.d != null) {
            int color = this.c.getColor();
            int colorForState = this.d.getColorForState(iArr, color);
            this.c.setColor(colorForState);
            this.f = colorForState;
            state |= colorForState != color;
        }
        e();
        if (!state) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e = i;
        e();
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
