package com.spotify.music.nowplaying.drivingmode.view.playpause;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class TransparentPlayPauseDrawable extends Drawable {
    private final Paint a;
    private final Paint b;
    private final InnerShape c;
    private final int d;

    public enum InnerShape {
        PLAY,
        PAUSE
    }

    public TransparentPlayPauseDrawable(Context context, int i, InnerShape innerShape, int i2) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.d = i2;
        this.c = innerShape;
        paint2.setColor(context.getResources().getColor(i));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float width = (float) getBounds().width();
        float height = (float) getBounds().height();
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        float min = Math.min(width, height) / 2.0f;
        canvas.drawCircle(f, f2, min, this.b);
        if (this.c == InnerShape.PLAY) {
            int i = (int) f;
            int i2 = (int) f2;
            this.a.setPathEffect(new CornerPathEffect(0.08f * min));
            int i3 = (int) (0.29f * min);
            int i4 = (int) (min * 0.07f);
            int i5 = (i - i3) + i4;
            Point point = new Point(i5, (i2 - i3) - i4);
            Point point2 = new Point(i5, i2 + i3 + i4);
            double d2 = (double) i4;
            Double.isNaN(d2);
            Double.isNaN(d2);
            Point point3 = new Point(i + i3 + ((int) (d2 * 1.5d)), i2);
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo((float) point.x, (float) point.y);
            path.lineTo((float) point2.x, (float) point2.y);
            path.lineTo((float) point3.x, (float) point3.y);
            path.lineTo((float) point.x, (float) point.y);
            path.close();
            canvas.drawPath(path, this.a);
            return;
        }
        int i6 = (int) f;
        int i7 = (int) f2;
        this.a.setPathEffect(new CornerPathEffect(0.03f * min));
        int i8 = (int) (0.27f * min);
        int i9 = i6 - i8;
        int i10 = (int) (0.12f * min);
        int i11 = i6 - i10;
        int i12 = i10 + i6;
        int i13 = i6 + i8;
        int i14 = (int) (min * 0.35f);
        float f3 = (float) (i7 + i14);
        float f4 = (float) (i7 - i14);
        RectF rectF = new RectF((float) i9, f3, (float) i11, f4);
        RectF rectF2 = new RectF((float) i12, f3, (float) i13, f4);
        canvas.drawRect(rectF, this.a);
        canvas.drawRect(rectF2, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
