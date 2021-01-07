package com.spotify.android.glue.gradients;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;

class c implements b {
    private final float a;
    private final Paint b = new Paint(1);
    private final Matrix c = new Matrix();
    private final RectF d = new RectF();
    private Shader e;

    public c(int i, int i2, float f) {
        this.a = f;
        this.e = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i, i2, Shader.TileMode.CLAMP);
    }

    @Override // com.spotify.android.glue.gradients.b
    public void a(Canvas canvas, Rect rect) {
        canvas.save();
        int width = rect.width();
        int height = rect.height();
        if (Build.VERSION.SDK_INT > 16 && this.a != 0.0f) {
            float f = (float) width;
            float f2 = (float) height;
            this.d.set(0.0f, 0.0f, f, f2);
            this.c.setScale(f, f2);
            this.e.setLocalMatrix(this.c);
            this.b.setShader(this.e);
            RectF rectF = this.d;
            float f3 = this.a;
            canvas.drawRoundRect(rectF, f3, f3, this.b);
        } else {
            canvas.scale((float) width, (float) height);
            this.b.setShader(this.e);
            canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, this.b);
        }
        canvas.restore();
    }
}
