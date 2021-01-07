package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;

/* access modifiers changed from: package-private */
public class j extends i {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f = null;
    private PorterDuff.Mode g = null;
    private boolean h = false;
    private boolean i = false;

    j(SeekBar seekBar) {
        super(seekBar);
        this.d = seekBar;
    }

    private void d() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return;
        }
        if (this.h || this.i) {
            Drawable l = a.l(drawable.mutate());
            this.e = l;
            if (this.h) {
                a.i(l, this.f);
            }
            if (this.i) {
                a.j(this.e, this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.i
    public void b(AttributeSet attributeSet, int i2) {
        super.b(attributeSet, i2);
        Context context = this.d.getContext();
        int[] iArr = h0.h;
        h0 v = h0.v(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.d;
        q4.H(seekBar, seekBar.getContext(), iArr, attributeSet, v.r(), i2, 0);
        Drawable h2 = v.h(0);
        if (h2 != null) {
            this.d.setThumb(h2);
        }
        Drawable g2 = v.g(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = g2;
        if (g2 != null) {
            g2.setCallback(this.d);
            a.g(g2, q4.o(this.d));
            if (g2.isStateful()) {
                g2.setState(this.d.getDrawableState());
            }
            d();
        }
        this.d.invalidate();
        if (v.s(3)) {
            this.g = q.d(v.k(3, -1), this.g);
            this.i = true;
        }
        if (v.s(2)) {
            this.f = v.c(2);
            this.h = true;
        }
        v.w();
        d();
    }

    /* access modifiers changed from: package-private */
    public void e(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.d.getPaddingLeft(), (float) (this.d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
