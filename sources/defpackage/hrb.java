package defpackage;

import com.spotify.mobile.android.util.ui.e;
import io.reactivex.g;

/* renamed from: hrb  reason: default package */
public final class hrb implements fjf<grb> {
    private final wlf<g<Integer>> a;
    private final wlf<e> b;

    public hrb(wlf<g<Integer>> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new grb(this.a.get(), this.b.get());
    }
}
