package androidx.transition;

import android.view.View;

class j0 extends i0 {
    private static boolean j = true;

    j0() {
    }

    @Override // androidx.transition.m0
    public void e(View view, int i, int i2, int i3, int i4) {
        if (j) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }
}
