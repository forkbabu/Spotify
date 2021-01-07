package android.support.wearable.watchface.decompositionface;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class e extends Drawable {
    private final Rect a = new Rect();
    private Drawable b;
    private int c;
    private int d;

    e() {
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(int i) {
        this.c = i;
    }

    public void c(Drawable drawable) {
        this.b = drawable;
        drawable.setAlpha(getAlpha());
        this.b.setColorFilter(getColorFilter());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            if (drawable != null) {
                this.a.set(getBounds().left, getBounds().top - (getBounds().height() * this.d), getBounds().right, (getBounds().height() * ((this.c - this.d) - 1)) + getBounds().bottom);
                this.b.setBounds(this.a);
            }
            canvas.save();
            canvas.clipRect(getBounds());
            this.b.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable == null || this.c == 0) {
            return 0;
        }
        return drawable.getIntrinsicHeight() / this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return 0;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
