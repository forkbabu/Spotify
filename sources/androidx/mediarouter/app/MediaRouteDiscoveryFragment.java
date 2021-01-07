package androidx.mediarouter.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import defpackage.n6;

public class MediaRouteDiscoveryFragment extends Fragment {
    private n6 g0;
    private m6 h0;
    private n6.a i0;

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        if (this.h0 == null) {
            Bundle D2 = D2();
            if (D2 != null) {
                this.h0 = m6.c(D2.getBundle("selector"));
            }
            if (this.h0 == null) {
                this.h0 = m6.c;
            }
        }
        if (this.g0 == null) {
            this.g0 = n6.f(F2());
        }
        h hVar = new h(this);
        this.i0 = hVar;
        if (hVar != null) {
            this.g0.a(this.h0, hVar, 4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        n6.a aVar = this.i0;
        if (aVar != null) {
            this.g0.k(aVar);
            this.i0 = null;
        }
        super.P3();
    }
}
