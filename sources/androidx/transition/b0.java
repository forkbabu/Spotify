package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* access modifiers changed from: package-private */
public class b0 implements c0 {
    private final ViewGroupOverlay a;

    b0(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.c0
    public void a(View view) {
        this.a.add(view);
    }

    @Override // androidx.transition.c0
    public void b(View view) {
        this.a.remove(view);
    }
}
