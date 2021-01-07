package androidx.transition;

import android.os.Build;
import android.view.View;

class k0 extends j0 {
    private static boolean k = true;

    k0() {
    }

    @Override // androidx.transition.m0
    public void g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i);
        } else if (k) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
