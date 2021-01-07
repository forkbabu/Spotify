package com.spotify.music;

import androidx.fragment.app.Fragment;
import com.jakewharton.rxrelay2.b;
import com.spotify.mobile.android.ui.fragments.BottomNavigationFragment;
import com.spotify.rxjava2.q;
import defpackage.ej9;
import defpackage.ij9;
import io.reactivex.s;

/* access modifiers changed from: package-private */
public class o0 implements ij9.a {
    private final q a;
    private final b<ej9> b = b.g1();

    o0(q qVar) {
        this.a = qVar;
    }

    @Override // defpackage.ij9.a
    public s<ej9> a() {
        return this.b;
    }

    public void d(Fragment fragment, String str) {
        if (fragment instanceof com.spotify.mobile.android.ui.fragments.s) {
            this.a.a(((com.spotify.mobile.android.ui.fragments.s) fragment).u0().e().G0(ej9.a.a(str)).j0(new p(str, BottomNavigationFragment.M4(fragment))).subscribe(this.b));
        }
    }
}
