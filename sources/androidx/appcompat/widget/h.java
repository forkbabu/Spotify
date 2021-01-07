package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

public class h {
    private final ImageView a;
    private f0 b;
    private f0 c;

    public h(ImageView imageView) {
        this.a = imageView;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        ColorStateList colorStateList;
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            q.b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.c == null) {
                    this.c = new f0();
                }
                f0 f0Var = this.c;
                PorterDuff.Mode mode = null;
                f0Var.a = null;
                f0Var.d = false;
                f0Var.b = null;
                f0Var.c = false;
                ImageView imageView = this.a;
                if (i >= 21) {
                    colorStateList = imageView.getImageTintList();
                } else {
                    colorStateList = imageView instanceof androidx.core.widget.h ? ((androidx.core.widget.h) imageView).getSupportImageTintList() : null;
                }
                if (colorStateList != null) {
                    f0Var.d = true;
                    f0Var.a = colorStateList;
                }
                ImageView imageView2 = this.a;
                if (i >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof androidx.core.widget.h) {
                    mode = ((androidx.core.widget.h) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    f0Var.c = true;
                    f0Var.b = mode;
                }
                if (f0Var.d || f0Var.c) {
                    int[] drawableState = this.a.getDrawableState();
                    int i2 = g.d;
                    x.n(drawable, f0Var, drawableState);
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            f0 f0Var2 = this.b;
            if (f0Var2 != null) {
                int[] drawableState2 = this.a.getDrawableState();
                int i3 = g.d;
                x.n(drawable, f0Var2, drawableState2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        f0 f0Var = this.b;
        if (f0Var != null) {
            return f0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        f0 f0Var = this.b;
        if (f0Var != null) {
            return f0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void e(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int n;
        Context context = this.a.getContext();
        int[] iArr = h0.g;
        h0 v = h0.v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.a;
        q4.H(imageView, imageView.getContext(), iArr, attributeSet, v.r(), i, 0);
        try {
            Drawable drawable3 = this.a.getDrawable();
            if (!(drawable3 != null || (n = v.n(1, -1)) == -1 || (drawable3 = i0.b(this.a.getContext(), n)) == null)) {
                this.a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                q.b(drawable3);
            }
            if (v.s(2)) {
                ImageView imageView2 = this.a;
                ColorStateList c2 = v.c(2);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 21) {
                    imageView2.setImageTintList(c2);
                    if (!(i2 != 21 || (drawable2 = imageView2.getDrawable()) == null || imageView2.getImageTintList() == null)) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable2);
                    }
                } else if (imageView2 instanceof androidx.core.widget.h) {
                    ((androidx.core.widget.h) imageView2).setSupportImageTintList(c2);
                }
            }
            if (v.s(3)) {
                ImageView imageView3 = this.a;
                PorterDuff.Mode d = q.d(v.k(3, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 21) {
                    imageView3.setImageTintMode(d);
                    if (!(i3 != 21 || (drawable = imageView3.getDrawable()) == null || imageView3.getImageTintList() == null)) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView3.getDrawableState());
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                } else if (imageView3 instanceof androidx.core.widget.h) {
                    ((androidx.core.widget.h) imageView3).setSupportImageTintMode(d);
                }
            }
        } finally {
            v.w();
        }
    }

    public void f(int i) {
        if (i != 0) {
            Drawable b2 = i0.b(this.a.getContext(), i);
            if (b2 != null) {
                q.b(b2);
            }
            this.a.setImageDrawable(b2);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new f0();
        }
        f0 f0Var = this.b;
        f0Var.a = colorStateList;
        f0Var.d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new f0();
        }
        f0 f0Var = this.b;
        f0Var.b = mode;
        f0Var.c = true;
        a();
    }
}
