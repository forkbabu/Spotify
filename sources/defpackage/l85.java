package defpackage;

import android.graphics.Matrix;
import android.widget.ImageView;

/* renamed from: l85  reason: default package */
public class l85 implements g85 {
    private Matrix a;
    private final int b;

    public l85(int i) {
        this.b = i;
    }

    @Override // defpackage.g85
    public void a(ImageView imageView) {
    }

    @Override // defpackage.g85
    public void b(ImageView imageView) {
        this.a = new Matrix();
        float f = (float) this.b;
        float f2 = 1.15f * f;
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        float f3 = f2 / (intrinsicWidth < intrinsicHeight ? (float) intrinsicWidth : (float) intrinsicHeight);
        this.a.setScale(f3, f3);
        this.a.postTranslate((f - (((float) intrinsicWidth) * f3)) / 2.0f, (f - (((float) intrinsicHeight) * f3)) / 2.0f);
        imageView.setImageMatrix(this.a);
    }
}
