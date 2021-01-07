package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import defpackage.q0;

public abstract class ActionBar {

    public interface a {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class b {
        public abstract void a();
    }

    public abstract boolean a();

    public abstract void b(boolean z);

    public abstract int c();

    public abstract Context d();

    public abstract void e();

    public abstract void f(Configuration configuration);

    public abstract boolean g(int i, KeyEvent keyEvent);

    public abstract void h(boolean z);

    public abstract void i(boolean z);

    public abstract void j(boolean z);

    public abstract void k(float f);

    public abstract void l(Drawable drawable);

    public abstract void m(boolean z);

    public abstract void n(CharSequence charSequence);

    public abstract void o(CharSequence charSequence);

    public abstract q0 p(q0.a aVar);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.a = 0;
            this.a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 0;
            this.a = layoutParams.a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
