package defpackage;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.hubframework.defaults.m;

/* renamed from: u55  reason: default package */
public final class u55 implements fjf<e61> {
    private final wlf<Activity> a;
    private final wlf<Fragment> b;
    private final wlf<w51> c;
    private final wlf<tk9> d;
    private final wlf<m> e;

    public u55(wlf<Activity> wlf, wlf<Fragment> wlf2, wlf<w51> wlf3, wlf<tk9> wlf4, wlf<m> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        tk9 tk9 = this.d.get();
        ke3 ke3 = new ke3(this.a.get(), this.e.get(), this.b.get(), this.c.get());
        tk9.o(true);
        tk9.g(ke3.F());
        tk9.g(ke3.G());
        return ke3;
    }
}
