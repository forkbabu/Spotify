package defpackage;

import androidx.fragment.app.c;
import com.spotify.mobile.android.spotlets.tooltip.a;

/* renamed from: kxc  reason: default package */
public final class kxc implements fjf<bxc> {
    private final wlf<c> a;
    private final wlf<a> b;
    private final wlf<exc> c;

    public kxc(wlf<c> wlf, wlf<a> wlf2, wlf<exc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bxc(this.a.get(), this.b.get(), this.c.get());
    }
}
