package android.support.wearable.watchface.decompositionface;

import android.graphics.Rect;
import android.graphics.RectF;

public class a {
    private final Rect a = new Rect();

    public void a(RectF rectF, Rect rect) {
        rect.set(b(rectF.left), c(rectF.top), b(rectF.right), c(rectF.bottom));
    }

    public int b(float f) {
        return Math.round((f * ((float) this.a.width())) + ((float) this.a.left));
    }

    public int c(float f) {
        return Math.round((f * ((float) this.a.height())) + ((float) this.a.top));
    }

    public void d(int i, int i2, int i3, int i4) {
        this.a.set(i, i2, i3, i4);
    }

    public void e(Rect rect) {
        this.a.set(rect);
    }
}
