package com.spotify.encore.mobile.utils.picassocolorextractor;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class InternalPicassoDrawable extends Drawable {
    private final PicassoDrawableState drawableState;

    public static final class PicassoDrawableState extends Drawable.ConstantState {
        private boolean animating;
        private int drawableAlpha;
        private int drawableChangingConfigurations;
        private final float fadeDurationMs;
        private final Drawable innerDrawable;
        private Picasso.LoadedFrom loadedFrom;
        private Drawable placeholder;
        private long startTimeMillis;

        public PicassoDrawableState(Drawable drawable, Drawable drawable2, Picasso.LoadedFrom loadedFrom2, long j, boolean z, int i, float f) {
            h.e(drawable, "innerDrawable");
            h.e(loadedFrom2, "loadedFrom");
            this.innerDrawable = drawable;
            this.placeholder = drawable2;
            this.loadedFrom = loadedFrom2;
            this.startTimeMillis = j;
            this.animating = z;
            this.drawableAlpha = i;
            this.fadeDurationMs = f;
        }

        public final boolean getAnimating() {
            return this.animating;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.drawableChangingConfigurations;
        }

        public final int getDrawableAlpha() {
            return this.drawableAlpha;
        }

        public final int getDrawableChangingConfigurations() {
            return this.drawableChangingConfigurations;
        }

        public final float getFadeDurationMs$libs_encore_mobile_utils() {
            return this.fadeDurationMs;
        }

        public final Drawable getInnerDrawable() {
            return this.innerDrawable;
        }

        public final Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        public final Drawable getPlaceholder() {
            return this.placeholder;
        }

        public final long getStartTimeMillis() {
            return this.startTimeMillis;
        }

        public final void setAnimating(boolean z) {
            this.animating = z;
        }

        public final void setDrawableAlpha(int i) {
            this.drawableAlpha = i;
        }

        public final void setDrawableChangingConfigurations(int i) {
            this.drawableChangingConfigurations = i;
        }

        public final void setLoadedFrom(Picasso.LoadedFrom loadedFrom2) {
            h.e(loadedFrom2, "<set-?>");
            this.loadedFrom = loadedFrom2;
        }

        public final void setPlaceholder(Drawable drawable) {
            this.placeholder = drawable;
        }

        public final void setStartTimeMillis(long j) {
            this.startTimeMillis = j;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public InternalPicassoDrawable newDrawable() {
            return new InternalPicassoDrawable(this.innerDrawable, this.placeholder, this.loadedFrom);
        }
    }

    public InternalPicassoDrawable(Drawable drawable, Drawable drawable2, Picasso.LoadedFrom loadedFrom) {
        boolean z;
        long j;
        Drawable drawable3;
        h.e(drawable, "innerDrawable");
        h.e(loadedFrom, "loadedFrom");
        if (loadedFrom != Picasso.LoadedFrom.MEMORY) {
            drawable3 = drawable2;
            j = SystemClock.uptimeMillis();
            z = true;
        } else {
            drawable3 = null;
            j = 0;
            z = false;
        }
        this.drawableState = new PicassoDrawableState(drawable, drawable3, loadedFrom, j, z, BitmapRenderer.ALPHA_VISIBLE, 200.0f);
    }

    private final void forceUpdatePlaceholderBounds() {
        Drawable placeholder = this.drawableState.getPlaceholder();
        if (placeholder != null && (!h.a(getBounds(), placeholder.getBounds()))) {
            placeholder.setBounds(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h.e(canvas, "canvas");
        if (!this.drawableState.getAnimating()) {
            this.drawableState.getInnerDrawable().draw(canvas);
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.drawableState.getStartTimeMillis())) / this.drawableState.getFadeDurationMs$libs_encore_mobile_utils();
        if (uptimeMillis >= 1.0f) {
            this.drawableState.setAnimating(false);
            this.drawableState.setPlaceholder(null);
            this.drawableState.getInnerDrawable().draw(canvas);
            return;
        }
        this.drawableState.getInnerDrawable().setAlpha((int) (((float) this.drawableState.getDrawableAlpha()) * uptimeMillis));
        this.drawableState.getInnerDrawable().draw(canvas);
        this.drawableState.getInnerDrawable().setAlpha(this.drawableState.getDrawableAlpha());
        invalidateSelf();
        Drawable placeholder = this.drawableState.getPlaceholder();
        if (placeholder != null) {
            forceUpdatePlaceholderBounds();
            placeholder.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        this.drawableState.setDrawableChangingConfigurations(getChangingConfigurations());
        return this.drawableState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawableState.getInnerDrawable().getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawableState.getInnerDrawable().getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawableState.getInnerDrawable().getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return this.drawableState.newDrawable();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        h.e(rect, "bounds");
        this.drawableState.getInnerDrawable().setBounds(rect);
        super.onBoundsChange(rect);
        Drawable placeholder = this.drawableState.getPlaceholder();
        if (placeholder != null) {
            placeholder.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.drawableState.setDrawableAlpha(i);
        this.drawableState.getInnerDrawable().setAlpha(i);
        Drawable placeholder = this.drawableState.getPlaceholder();
        if (placeholder != null) {
            placeholder.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.getInnerDrawable().setColorFilter(colorFilter);
        Drawable placeholder = this.drawableState.getPlaceholder();
        if (placeholder != null) {
            placeholder.setColorFilter(colorFilter);
        }
    }
}
