package androidx.fragment.app;

import android.view.View;
import androidx.core.os.a;

/* access modifiers changed from: package-private */
public final class d implements a.AbstractC0029a {
    final /* synthetic */ Fragment a;

    d(Fragment fragment) {
        this.a = fragment;
    }

    @Override // androidx.core.os.a.AbstractC0029a
    public void b() {
        if (this.a.C2() != null) {
            View C2 = this.a.C2();
            this.a.p4(null);
            C2.clearAnimation();
        }
        this.a.q4(null);
    }
}
