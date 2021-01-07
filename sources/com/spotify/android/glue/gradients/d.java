package com.spotify.android.glue.gradients;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

class d implements b {
    private final Paint a = new Paint(1);
    private Shader b;
    private Shader c;
    private final Matrix d = new Matrix();

    public d(int i, int i2) {
        this.b = new LinearGradient(0.0f, 1.0f, 1.0f, 0.0f, i, i2, Shader.TileMode.REPEAT);
        this.c = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i2, i, Shader.TileMode.REPEAT);
    }

    private void b() {
        this.d.reset();
        this.d.postScale(2.0f, 2.0f);
        this.d.postTranslate(-0.5f, -0.5f);
    }

    private void c(float f, Canvas canvas) {
        canvas.rotate(f);
        this.d.postRotate(-f);
    }

    private void d(float f, float f2, Canvas canvas) {
        canvas.scale(f, f2);
        this.d.postScale(1.0f / f, 1.0f / f2);
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
        b();
        canvas.save();
        canvas.scale(f, f2);
        e(0.0f, 0.8f, canvas);
        c(-75.0f, canvas);
        d(8.25f, 0.65f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.1f, -0.1f, 0.1f, 0.1f, this.a);
        canvas.restore();
        b();
        canvas.save();
        canvas.scale(f, f2);
        e(0.13f, 0.8f, canvas);
        c(-70.0f, canvas);
        d(10.0f, 0.85f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.1f, -0.1f, 0.1f, 0.1f, this.a);
        canvas.restore();
        b();
        canvas.save();
        canvas.scale(f, f2);
        e(0.39f, 1.0f, canvas);
        c(-58.0f, canvas);
        d(8.9f, 2.8f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.1f, -0.1f, 0.1f, 0.1f, this.a);
        canvas.restore();
        b();
        canvas.save();
        canvas.scale(f, f2);
        e(1.0f, 0.9f, canvas);
        c(-42.0f, canvas);
        d(8.9f, 2.0f, canvas);
        this.a.getShader().setLocalMatrix(this.d);
        canvas.drawRect(-0.1f, -0.1f, 0.1f, 0.1f, this.a);
        canvas.restore();
    }
}
