package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* access modifiers changed from: package-private */
public class g extends yx {
    private final Paint H;
    private final RectF I;
    private int J;

    g() {
        this(null);
    }

    /* access modifiers changed from: package-private */
    public boolean X() {
        return !this.I.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void Y(float f, float f2, float f3, float f4) {
        RectF rectF = this.I;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    @Override // defpackage.yx, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.J = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            this.J = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.I, this.H);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.J);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(dy dyVar) {
        super(dyVar == null ? new dy() : dyVar);
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I = new RectF();
    }
}
