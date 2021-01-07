package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: i94  reason: default package */
public class i94 extends Drawable {
    private final Paint a;
    private final RectF b = new RectF();
    private final int c;

    public i94(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = i;
        paint.setColor(-14211289);
    }

    public int a() {
        return this.c;
    }

    public Paint b() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.b.set(0.0f, 0.0f, (float) getBounds().width(), (float) getBounds().height());
        RectF rectF = this.b;
        float f = (float) this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
