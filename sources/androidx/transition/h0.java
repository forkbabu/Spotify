package androidx.transition;

import android.view.View;

class h0 extends m0 {
    private static boolean f = true;

    h0() {
    }

    @Override // androidx.transition.m0
    public void a(View view) {
    }

    @Override // androidx.transition.m0
    public float b(View view) {
        if (f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.m0
    public void c(View view) {
    }

    @Override // androidx.transition.m0
    public void f(View view, float f2) {
        if (f) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
        view.setAlpha(f2);
    }
}
