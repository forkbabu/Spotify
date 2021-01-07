package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: mpc  reason: default package */
public class mpc extends Drawable {
    private final int a;
    private int b;
    private final Paint c = new Paint(1);
    private final RectF d = new RectF();

    public mpc(Resources resources, int i) {
        this.a = resources.getDimensionPixelSize(i);
        this.b = -14211289;
    }

    public void a(int i) {
        this.b = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.c.setColor(this.b);
        this.d.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        RectF rectF = this.d;
        int i = this.a;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
