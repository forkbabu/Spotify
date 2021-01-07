package defpackage;

import android.graphics.Matrix;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: m85  reason: default package */
public class m85 implements g85 {
    private final int a;
    private final int b;
    private Matrix c;

    public m85(int i, int i2, boolean z) {
        if (z) {
            double d = (double) i;
            Double.isNaN(d);
            i = (int) (d * 0.75d);
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.g85
    public void a(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = this.a;
        layoutParams.width = i;
        layoutParams.height = Math.min((int) (((float) this.b) * 0.6f), i);
        imageView.setLayoutParams(layoutParams);
    }

    @Override // defpackage.g85
    public void b(ImageView imageView) {
        this.c = new Matrix();
        int i = this.a;
        int min = Math.min((int) (((float) this.b) * 0.6f), i);
        float f = (float) i;
        float f2 = 1.15f * f;
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        float f3 = f2 / (intrinsicWidth < intrinsicHeight ? (float) intrinsicWidth : (float) intrinsicHeight);
        this.c.setScale(f3, f3);
        this.c.postTranslate((f - (((float) intrinsicWidth) * f3)) * 0.5f, (((float) min) - (((float) intrinsicHeight) * f3)) * 0.33f);
        imageView.setImageMatrix(this.c);
    }
}
