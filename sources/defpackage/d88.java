package defpackage;

import com.spotify.libs.search.online.entity.b;
import com.spotify.mobile.android.rx.w;
import io.reactivex.s;

/* renamed from: d88  reason: default package */
public final class d88 implements fjf<s<b>> {
    private final wlf<w> a;
    private final wlf<Boolean> b;

    public d88(wlf<w> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b().j0(g78.a).E().j0(new c78(this.b.get().booleanValue()));
    }
}
