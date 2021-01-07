package com.spotify.android.glue.gradients;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

class a implements b {
    private final Paint a = new Paint(1);
    private Shader b;

    public a(int i, int i2) {
        this.b = new LinearGradient(0.0f, 1.0f, 1.0f, 0.0f, i, i2, Shader.TileMode.REPEAT);
    }

    @Override // com.spotify.android.glue.gradients.b
    public void a(Canvas canvas, Rect rect) {
        this.a.setShader(this.b);
        int width = rect.width();
        int height = rect.height();
        canvas.save();
        float f = (float) width;
        float f2 = (float) height;
        canvas.scale(f, f2);
        canvas.drawRect(0.0f, 0.0f, f, f2, this.a);
        canvas.restore();
        canvas.save();
        canvas.scale(f, f2);
        canvas.translate(0.15f, 0.85f);
        canvas.scale(0.3f, 0.3f);
        canvas.drawCircle(0.0f, 0.0f, 0.7f, this.a);
        canvas.restore();
        canvas.save();
        canvas.scale(f, f2);
        canvas.translate(0.2f, -0.0f);
        canvas.scale(0.2f, 0.2f);
        canvas.drawCircle(0.0f, 0.0f, 0.7f, this.a);
        canvas.restore();
        canvas.save();
        canvas.scale(f, f2);
        canvas.translate(0.9f, 0.4f);
        canvas.scale(0.5f, 0.5f);
        canvas.drawCircle(0.0f, 0.0f, 0.7f, this.a);
        canvas.restore();
    }
}
