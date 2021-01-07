package com.spotify.music.features.browse.component.findcard.deprecated;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;

@Deprecated
public class a extends Drawable {
    private final Paint a;
    private final Paint b = new Paint(1);
    private int c;
    private float d;
    private boolean e;
    private final PointF f = new PointF();
    private Path g;
    private final Rect h = new Rect();
    private Bitmap i;
    private boolean j;

    public a(Context context) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = (float) nud.g(4.0f, context.getResources());
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, 0, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.postRotate(25.0f);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
    }

    private static float a(Rect rect) {
        return Math.min(((float) rect.height()) * 0.73913044f, ((float) rect.width()) * 0.41463414f);
    }

    public static void b(Rect rect) {
        float a2 = a(rect);
        RectF rectF = new RectF(0.0f, 0.0f, a2, a2);
        Matrix matrix = new Matrix();
        matrix.postRotate(25.0f);
        matrix.mapRect(rectF);
        rect.set(0, 0, Math.round(rectF.width() * 0.66396165f), Math.round(rectF.height() * 0.88528216f));
    }

    public void c(float f2) {
        this.d = f2;
        invalidateSelf();
    }

    public void d(boolean z) {
        this.j = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        if (Build.VERSION.SDK_INT >= 18) {
            if (this.g == null) {
                Path path = new Path();
                this.g = path;
                RectF rectF = new RectF(getBounds());
                float f2 = this.d;
                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            }
            Path path2 = this.g;
            if (path2 != null) {
                canvas.clipPath(path2);
            }
        }
        canvas.save();
        if (this.j) {
            canvas.translate((float) bounds.width(), 0.0f);
            canvas.scale((float) (-bounds.width()), (float) bounds.height());
        } else {
            canvas.scale((float) bounds.width(), (float) bounds.height());
        }
        canvas.drawRect(bounds, this.a);
        canvas.restore();
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.c == 0 ? -2 : -3;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e = false;
        this.g = null;
        this.i = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.c = i2;
        this.a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
