package com.spotify.paste.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class BadgedDrawable extends Drawable {
    public static final /* synthetic */ int j = 0;
    private final BadgePosition a;
    private final int b;
    private final int c;
    private final Drawable d;
    private final Drawable e;
    private final boolean f;
    private final Rect g;
    private final Matrix h = new Matrix();
    private final Matrix i = new Matrix();

    public enum BadgePosition {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public static final class a {
        public BadgePosition a = BadgePosition.BOTTOM_RIGHT;
        public int b = -1;
        public int c = -1;
        public int d;
        public int e;
        public boolean f;

        public a() {
            int i = BadgedDrawable.j;
        }
    }

    public BadgedDrawable(Drawable drawable, Drawable drawable2, a aVar) {
        if (drawable != null) {
            BadgePosition badgePosition = aVar.a;
            if (badgePosition != null) {
                this.d = drawable;
                this.e = drawable2;
                this.a = badgePosition;
                this.c = aVar.e;
                this.b = aVar.d;
                int i2 = aVar.b;
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                if (i2 < 0) {
                    if (intrinsicWidth >= 0) {
                        i2 = intrinsicWidth;
                    } else {
                        throw new IllegalArgumentException("The drawable has no intrinsic measures, set them manually.");
                    }
                }
                int i3 = aVar.c;
                int intrinsicHeight = drawable2.getIntrinsicHeight();
                if (i3 < 0) {
                    if (intrinsicHeight >= 0) {
                        i3 = intrinsicHeight;
                    } else {
                        throw new IllegalArgumentException("The drawable has no intrinsic measures, set them manually.");
                    }
                }
                this.g = new Rect(0, 0, i2, i3);
                this.f = aVar.f;
                return;
            }
            throw new NullPointerException("null position");
        }
        throw new NullPointerException("null drawable");
    }

    private static void a(Canvas canvas, Drawable drawable, Matrix matrix) {
        if (!matrix.isIdentity()) {
            int save = canvas.save();
            canvas.concat(matrix);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        drawable.draw(canvas);
    }

    private void b(Drawable drawable, Rect rect, Matrix matrix, boolean z) {
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        matrix.reset();
        if (z || intrinsicHeight < 0 || intrinsicWidth < 0) {
            drawable.setBounds(rect);
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        rectF.set(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight);
        rectF2.set(rect);
        if (!rectF.equals(rectF2)) {
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            matrix.mapRect(rectF);
            float max = Math.max(rectF2.width() / rectF.width(), rectF2.height() / rectF.height());
            matrix.postScale(max, max, rectF2.centerX(), rectF2.centerY());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        a(canvas, this.d, this.h);
        a(canvas, this.e, this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f) {
            return -1;
        }
        return this.d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f) {
            return -1;
        }
        return this.d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return Drawable.resolveOpacity(this.d.getOpacity(), this.e.getOpacity());
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i2;
        int i3;
        boolean z = true;
        b(this.d, rect, this.h, !this.f);
        BadgePosition badgePosition = BadgePosition.TOP_LEFT;
        BadgePosition badgePosition2 = this.a;
        boolean z2 = badgePosition2 == BadgePosition.BOTTOM_LEFT || badgePosition2 == badgePosition;
        if (!(badgePosition2 == badgePosition || badgePosition2 == BadgePosition.TOP_RIGHT)) {
            z = false;
        }
        Rect rect2 = this.g;
        if (z2) {
            i2 = this.c;
        } else {
            i2 = (rect.right - this.c) - rect2.width();
        }
        if (z) {
            i3 = this.b;
        } else {
            i3 = (rect.bottom - this.b) - this.g.height();
        }
        rect2.offsetTo(i2, i3);
        b(this.e, this.g, this.i, false);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.d.setAlpha(i2);
        this.e.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
