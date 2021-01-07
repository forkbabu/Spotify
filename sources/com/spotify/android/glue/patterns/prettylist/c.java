package com.spotify.android.glue.patterns.prettylist;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;

public class c {
    private final ImageView a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public c(ImageView imageView) {
        this.a = imageView;
    }

    private int a(int i) {
        if (this.e) {
            return 0;
        }
        if (!this.f) {
            return -((int) ((1.0f - (((float) i) / ((float) this.c))) * ((float) (this.a.getMeasuredHeight() - this.c))));
        }
        float f2 = (float) i;
        return (int) ((1.4f * f2) - f2);
    }

    public void b() {
        int a2 = a(this.d);
        ImageView imageView = this.a;
        imageView.layout(0, a2, imageView.getMeasuredWidth(), this.a.getMeasuredHeight() + a2);
    }

    public void c(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        if (!this.e && !this.f) {
            i3 = (int) (((float) i3) * 1.4f);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void d(boolean z) {
        this.f = z;
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void f(int i) {
        this.d = i;
        this.a.offsetTopAndBottom(a(i) - this.a.getTop());
        ImageView imageView = this.a;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        imageView.postInvalidateOnAnimation();
    }
}
