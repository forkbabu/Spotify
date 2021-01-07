package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* access modifiers changed from: package-private */
public final class c0 implements Runnable {
    final /* synthetic */ Fragment a;
    final /* synthetic */ Fragment b;
    final /* synthetic */ boolean c;
    final /* synthetic */ m1 f;
    final /* synthetic */ View n;
    final /* synthetic */ j0 o;
    final /* synthetic */ Rect p;

    c0(Fragment fragment, Fragment fragment2, boolean z, m1 m1Var, View view, j0 j0Var, Rect rect) {
        this.a = fragment;
        this.b = fragment2;
        this.c = z;
        this.f = m1Var;
        this.n = view;
        this.o = j0Var;
        this.p = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        e0.c(this.a, this.b, this.c, this.f, false);
        View view = this.n;
        if (view != null) {
            this.o.j(view, this.p);
        }
    }
}
