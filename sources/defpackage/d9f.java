package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: d9f  reason: default package */
public final class d9f extends BottomSheetBehavior.d {
    private final View[] a;
    private final int b;
    private Runnable c = b9f.a;

    public d9f(int i, View... viewArr) {
        this.a = viewArr;
        this.b = i;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public void a(View view, float f) {
        View[] viewArr = this.a;
        for (View view2 : viewArr) {
            float f2 = 0.0f;
            if (f > 0.0f) {
                f2 = ((float) this.b) * f;
            }
            view2.setTranslationY(f2);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public void b(View view, int i) {
        if (5 == i) {
            this.c.run();
        }
    }

    public void c(Runnable runnable) {
        this.c = runnable;
    }
}
