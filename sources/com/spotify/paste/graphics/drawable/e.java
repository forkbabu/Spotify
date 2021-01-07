package com.spotify.paste.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class e extends Drawable {
    private final a a;

    /* access modifiers changed from: package-private */
    public static class a extends Drawable.ConstantState {
        final Drawable a;
        final float b;
        final int c;
        int d;

        a(Drawable drawable, float f, int i) {
            this.a = drawable;
            this.b = f;
            this.c = i;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new e(this.a, this.b, this.c);
        }
    }

    public e(Drawable drawable, float f, int i) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            throw new IllegalArgumentException("drawable must have an intrinsic size");
        }
        this.a = new a(drawable, f, i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = this.a.c;
        if (i != 0) {
            canvas.drawColor(i);
        }
        Rect bounds = getBounds();
        float intrinsicWidth = (float) this.a.a.getIntrinsicWidth();
        float intrinsicHeight = (float) this.a.a.getIntrinsicHeight();
        int save = canvas.save();
        canvas.translate(bounds.exactCenterX(), bounds.exactCenterY());
        float min = ((float) Math.min(bounds.width(), bounds.height())) / Math.max(intrinsicWidth, intrinsicHeight);
        canvas.scale(min, min);
        float f = this.a.b;
        canvas.scale(f, f);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        this.a.a.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (((float) this.a.a.getIntrinsicHeight()) / this.a.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (((float) this.a.a.getIntrinsicWidth()) / this.a.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return (int) (((float) this.a.a.getMinimumHeight()) / this.a.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return (int) (((float) this.a.a.getMinimumWidth()) / this.a.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.a.a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.a.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.a.a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return getConstantState().newDrawable();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.a.a.setLevel(i);
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.a.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.a.a.setState(iArr);
    }
}
