package defpackage;

import com.spotify.mobile.android.util.ui.e;
import io.reactivex.g;

/* renamed from: rlb  reason: default package */
public final class rlb implements fjf<qlb> {
    private final wlf<g<Integer>> a;
    private final wlf<e> b;

    public rlb(wlf<g<Integer>> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qlb(this.a.get(), this.b.get());
    }
}
