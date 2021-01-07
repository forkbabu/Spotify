package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.util.ui.k;

/* renamed from: o85  reason: default package */
public final class o85 implements fjf<n85> {
    private final wlf<e61> a;
    private final wlf<b61> b;
    private final wlf<Resources> c;
    private final wlf<ak2> d;
    private final wlf<k> e;

    public o85(wlf<e61> wlf, wlf<b61> wlf2, wlf<Resources> wlf3, wlf<ak2> wlf4, wlf<k> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n85(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
