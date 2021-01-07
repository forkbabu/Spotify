package com.spotify.android.glue.gradients;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

class e implements b {
    private final Paint a = new Paint(1);
    private Shader b;
    private Shader c;
    private final Matrix d = new Matrix();

    public e(int i, int i2) {
        this.b = new LinearGradient(0.0f, 1.0f, 1.0f, 0.0f, i, i2, Shader.TileMode.REPEAT);
        this.c = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i, i2, Shader.TileMode.REPEAT);
    }

    private void b(float f, Canvas canvas) {
        canvas.rotate(f);
        this.d.postRotate(-f);
    }

    private void c(float f, float f2, Canvas canvas) {
        canvas.scale(f, f2);
        this.d.postScale(1.0f / f, 1.0f / f2);
    }

    private void d(float f, float f2, Canvas canvas) {
        canvas.skew(f, f2);
        this.d.postSkew(-f, -f2);
    }

    private void e(float f, float f2, Canvas canvas) {
        canvas.translate(f, f2);
        this.d.postTranslate(-f, -f2);
    }

    @Override // com.spotify.android.glue.gradients.b
    public void a(Canvas canvas, Rect rect) {
        this.a.setShader(this.b);
        int width = rect.width();
        int height = rect.height();
        this.d.reset();
        this.a.getShader().setLocalMatrix(this.d);
        canvas.save();
        float f = (float) width;
        float f2 = (float) height;
        canvas.scale(f, f2);
        canvas.drawRect(0.0f, 0.0f, f, f2, this.a);
        canvas.restore();
        this.a.setShader(this.c);
        this.d.reset();
        canvas.save();
        canvas.scale(f, f2);
        e(-0.1f, 0.8f, canvas);
        b(-75.0f, canvas);
        c(1.0f, 1.5f, canvas);
        d(3.0f, 0.0f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.3f, -0.1f, 0.3f, 0.1f, this.a);
        canvas.restore();
        this.d.reset();
        canvas.save();
        canvas.scale(f, f2);
        e(0.2f, 1.0f, canvas);
        b(-63.0f, canvas);
        c(1.6f, 3.5f, canvas);
        d(4.0f, 0.0f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.4f, -0.1f, 0.4f, 0.1f, this.a);
        canvas.restore();
        this.d.reset();
        canvas.save();
        canvas.scale(f, f2);
        e(0.6f, 1.0f, canvas);
        b(-69.0f, canvas);
        c(1.3f, 2.0f, canvas);
        d(2.0f, 0.0f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.2f, -0.1f, 0.2f, 0.1f, this.a);
        canvas.restore();
    }
}
