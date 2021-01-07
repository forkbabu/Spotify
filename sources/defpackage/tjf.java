package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: tjf  reason: default package */
public class tjf extends Drawable {
    private final vjf a;
    private final Paint b = new Paint(1);
    private final int c;
    private ojf d;

    public tjf(int i) {
        vjf vjf = new vjf();
        this.c = i;
        this.a = vjf;
        this.d = new ojf(this);
    }

    public void a(Bitmap bitmap, boolean z) {
        this.a.c(bitmap, getBounds());
        this.d.c(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ValueAnimator a2;
        ojf ojf = this.d;
        float f = 0.0f;
        if (!(ojf == null || (a2 = ojf.a()) == null)) {
            f = a2.getAnimatedFraction();
        }
        if (this.a.b()) {
            this.a.a(canvas, this.b, f, (float) this.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.d(getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
