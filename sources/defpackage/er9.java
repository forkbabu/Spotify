package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: er9  reason: default package */
public class er9 extends Drawable {
    private final int a;
    private final Paint b = new Paint(1);
    private final int c;
    private final int d;
    private final float e;
    private final int f;
    private Shader g;
    private Shader h;

    public er9(int i, int i2, int i3, float f2, int i4) {
        this.f = i4;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        if (this.g == null) {
            this.g = new LinearGradient(0.0f, 0.0f, (float) (this.f == 0 ? 0 : getBounds().width()), (float) this.a, this.c, this.d, Shader.TileMode.CLAMP);
            this.h = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.a, Color.argb((int) (this.e * 255.0f), 0, 0, 0), this.d, Shader.TileMode.CLAMP);
        }
        this.b.setShader(this.g);
        canvas.drawRect(0.0f, 0.0f, (float) getBounds().width(), (float) this.a, this.b);
        this.b.setShader(this.h);
        canvas.drawRect(0.0f, 0.0f, (float) getBounds().width(), (float) this.a, this.b);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
