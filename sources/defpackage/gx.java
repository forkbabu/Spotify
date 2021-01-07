package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: gx  reason: default package */
public final class gx {
    private final View a;
    private boolean b = false;
    private int c = 0;

    public gx(fx fxVar) {
        this.a = (View) fxVar;
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.b;
    }

    public void c(Bundle bundle) {
        this.b = bundle.getBoolean("expanded", false);
        this.c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            ViewParent parent = this.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).f(this.a);
            }
        }
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.b);
        bundle.putInt("expandedComponentIdHint", this.c);
        return bundle;
    }

    public void e(int i) {
        this.c = i;
    }
}
