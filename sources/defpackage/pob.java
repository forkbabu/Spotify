package defpackage;

import androidx.fragment.app.Fragment;
import com.google.protobuf.u;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.ui.k;

/* renamed from: pob  reason: default package */
public final class pob implements fjf<oob> {
    private final wlf<Fragment> a;
    private final wlf<gl0<u>> b;
    private final wlf<bv3> c;
    private final wlf<cqe> d;
    private final wlf<k> e;
    private final wlf<SpSharedPreferences<Object>> f;

    public pob(wlf<Fragment> wlf, wlf<gl0<u>> wlf2, wlf<bv3> wlf3, wlf<cqe> wlf4, wlf<k> wlf5, wlf<SpSharedPreferences<Object>> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oob(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
