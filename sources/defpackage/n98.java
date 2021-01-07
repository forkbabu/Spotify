package defpackage;

import com.spotify.libs.search.history.l;
import com.spotify.libs.search.history.p;

/* renamed from: n98  reason: default package */
public final class n98 implements fjf<p> {
    private final wlf<l> a;
    private final wlf<String> b;
    private final wlf<Integer> c;

    public n98(wlf<l> wlf, wlf<String> wlf2, wlf<Integer> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        p b2 = this.a.get().b(this.b.get(), "default", this.c.get().intValue());
        yif.g(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
