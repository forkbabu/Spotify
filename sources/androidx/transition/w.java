package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

class w {
    private static final boolean a;
    private static final boolean b;
    private static final boolean c;

    static class a implements TypeEvaluator<Matrix> {
        final float[] a = new float[9];
        final float[] b = new float[9];
        final Matrix c = new Matrix();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
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

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        a = i >= 19;
        b = i >= 18;
        if (i < 28) {
            z = false;
        }
        c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.view.View a(android.view.ViewGroup r16, android.view.View r17, android.view.View r18) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.w.a(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }

    static Animator b(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
