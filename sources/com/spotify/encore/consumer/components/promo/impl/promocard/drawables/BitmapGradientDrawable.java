package com.spotify.encore.consumer.components.promo.impl.promocard.drawables;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.spotify.encore.consumer.components.promo.impl.promocard.DrawableRevealAnimator;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.GradientRenderer;
import kotlin.jvm.internal.h;

public final class BitmapGradientDrawable extends Drawable {
    private final DrawableRevealAnimator animator = new DrawableRevealAnimator(this);
    private final BitmapRenderer bitmapRenderer = new BitmapRenderer();
    private final GradientRenderer gradientRenderer;
    private final Matrix matrix;
    private final Paint paint = new Paint(1);

    public BitmapGradientDrawable(Context context) {
        h.e(context, "context");
        this.gradientRenderer = new GradientRenderer(context);
        this.matrix = new Matrix();
    }

    private final void updateBounds() {
        Rect bounds = getBounds();
        h.d(bounds, "bounds");
        this.bitmapRenderer.updateBounds(bounds);
        this.gradientRenderer.updateBounds(bounds);
        updateGradientMatrix(bounds);
    }

    private final void updateGradientMatrix(Rect rect) {
        RectF rectF = new RectF(rect);
        this.matrix.reset();
        this.matrix.setScale(rectF.width(), rectF.height());
        this.gradientRenderer.updateMatrix(this.matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h.e(canvas, "canvas");
        ValueAnimator animator2 = this.animator.getAnimator();
        float animatedFraction = animator2 != null ? animator2.getAnimatedFraction() : 0.0f;
        if (this.bitmapRenderer.hasBitmap()) {
            this.bitmapRenderer.draw(canvas, this.paint, animatedFraction);
        }
        this.gradientRenderer.draw(canvas, this.paint, animatedFraction);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public final void reset() {
        this.animator.cancelAnimation();
        this.bitmapRenderer.reset();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        updateBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setImage(Bitmap bitmap, boolean z) {
        h.e(bitmap, "bitmap");
        BitmapRenderer bitmapRenderer2 = this.bitmapRenderer;
        Rect bounds = getBounds();
        h.d(bounds, "bounds");
        bitmapRenderer2.setBitmap(bitmap, bounds);
        this.gradientRenderer.updateBounds(getBounds());
        this.animator.revealDrawable(z);
    }
}
