package defpackage;

import com.spotify.mobile.android.rx.v;
import io.reactivex.g;

/* renamed from: j41  reason: default package */
public final class j41 implements fjf<g<Boolean>> {
    private final wlf<v> a;

    public j41(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b().O(g41.a).s();
    }
}
