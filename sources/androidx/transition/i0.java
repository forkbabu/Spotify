package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

class i0 extends h0 {
    private static boolean g = true;
    private static boolean h = true;
    private static boolean i = true;

    i0() {
    }

    @Override // androidx.transition.m0
    public void d(View view, Matrix matrix) {
        if (g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    @Override // androidx.transition.m0
    public void h(View view, Matrix matrix) {
        if (h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    @Override // androidx.transition.m0
    public void i(View view, Matrix matrix) {
        if (i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
