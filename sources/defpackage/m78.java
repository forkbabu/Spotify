package defpackage;

import com.spotify.libs.search.history.l;
import com.spotify.libs.search.history.p;

/* renamed from: m78  reason: default package */
public final class m78 implements fjf<p> {
    private final wlf<l> a;
    private final wlf<String> b;

    public m78(wlf<l> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        p a2 = this.a.get().a(this.b.get(), "assisted_curation");
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
