package com.spotify.music.spotlets.scannables.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

public final class ViewfinderView extends View {
    private static final byte[] q = {0, 63, 116, -106, -75, -47, -24, -8, -1, -11, -23, -34, -45, -55, -65, -73, -80, -84, -86, -84, -80, -73, -65, -55, -45, -34, -23, -11, -1, -8, -24, -47, -75, -106, 116, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private final Paint a;
    private final Paint b;
    private final RectF c = new RectF();
    private final float f;
    private final PorterDuffXfermode n = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    private Rect o;
    private long p;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(Color.argb((int) AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150, 0, 0, 0));
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        float applyDimension = TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        this.f = applyDimension;
        paint2.setStrokeWidth(applyDimension * 2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.c.left = ((float) this.o.left) - (this.b.getStrokeWidth() / 2.0f);
        this.c.top = ((float) this.o.top) - (this.b.getStrokeWidth() / 2.0f);
        this.c.right = (this.b.getStrokeWidth() / 2.0f) + ((float) this.o.right);
        this.c.bottom = (this.b.getStrokeWidth() / 2.0f) + ((float) this.o.bottom);
        canvas.drawPaint(this.a);
        canvas.drawRoundRect(this.c, 6.0f, 6.0f, this.b);
        RectF rectF = this.c;
        Rect rect = this.o;
        rectF.left = (float) rect.left;
        rectF.top = (float) rect.top;
        rectF.right = (float) rect.right;
        rectF.bottom = (float) rect.bottom;
        this.b.setXfermode(this.n);
        this.b.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(this.c, 6.0f, 6.0f, this.b);
        this.b.setXfermode(null);
        this.b.setStyle(Paint.Style.STROKE);
        float f2 = this.f;
        int i = (int) (40.0f * f2);
        Rect rect2 = this.o;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int i4 = ((i2 + i3) - i) / 2;
        int i5 = ((i2 + i3) + i) / 2;
        int i6 = rect2.bottom + ((int) (f2 * 20.0f));
        int i7 = i6 + ((int) (35.0f * f2));
        long currentTimeMillis = System.currentTimeMillis();
        if (this.p == 0) {
            this.p = currentTimeMillis;
        }
        float f3 = ((float) ((int) (currentTimeMillis - this.p))) * 5.0E-4f;
        float f4 = 0.5f;
        float f5 = ((float) (i6 + i7)) * 0.5f;
        int i8 = 0;
        while (i8 < 6) {
            float f6 = ((((float) i8) + f4) * ((float) (i5 - i4)) * 0.16666667f) + ((float) i4);
            float f7 = ((float) (i7 - i6)) * f4;
            double d = (double) ((((((float) (5 - i8)) * 0.04f) + f3) % 1.0f) * 60.0f);
            double floor = Math.floor(d);
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            int abs = (int) Math.abs(floor);
            byte[] bArr = q;
            float f8 = ((((((float) ((bArr[abs + 1] & 255) - (bArr[abs] & 255))) * ((float) (d - floor))) + ((float) (bArr[abs] & 255))) * 0.003921569f * 0.95f) + 0.05f) * f7;
            canvas.drawLine(f6, f5 - f8, f6, f5 + f8, this.b);
            i8++;
            f5 = f5;
            f4 = 0.5f;
        }
        postInvalidateDelayed(80, i4, i6, i5, i7);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = i / 10;
        this.o = new Rect(i5, i2 / 8, i - i5, i2 - (i2 / 3));
        super.onSizeChanged(i, i2, i3, i4);
    }
}
