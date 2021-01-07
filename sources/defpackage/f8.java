package defpackage;

import android.animation.TypeEvaluator;

/* access modifiers changed from: package-private */
/* renamed from: f8  reason: default package */
public class f8 implements TypeEvaluator<u2[]> {
    private u2[] a;

    f8() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public u2[] evaluate(float f, u2[] u2VarArr, u2[] u2VarArr2) {
        u2[] u2VarArr3 = u2VarArr;
        u2[] u2VarArr4 = u2VarArr2;
        if (r2.a(u2VarArr3, u2VarArr4)) {
            if (!r2.a(this.a, u2VarArr3)) {
                this.a = r2.g(u2VarArr3);
            }
            for (int i = 0; i < u2VarArr3.length; i++) {
                u2 u2Var = this.a[i];
                u2 u2Var2 = u2VarArr3[i];
                u2 u2Var3 = u2VarArr4[i];
                u2Var.getClass();
                u2Var.a = u2Var2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = u2Var2.b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    u2Var.b[i2] = (u2Var3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
