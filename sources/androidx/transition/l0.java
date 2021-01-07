package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

class l0 extends k0 {
    l0() {
    }

    @Override // androidx.transition.h0, androidx.transition.m0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.i0, androidx.transition.m0
    public void d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.j0, androidx.transition.m0
    public void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.h0, androidx.transition.m0
    public void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.k0, androidx.transition.m0
    public void g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.i0, androidx.transition.m0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.i0, androidx.transition.m0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
