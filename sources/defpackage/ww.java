package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: ww  reason: default package */
public class ww implements TypeEvaluator<Matrix> {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    public Matrix a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.b;
            float f2 = fArr[i];
            float[] fArr2 = this.a;
            fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
        }
        this.c.setValues(this.b);
        return this.c;
    }
}
