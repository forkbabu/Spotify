package defpackage;

import com.spotify.libs.search.history.l;
import com.spotify.libs.search.history.p;

/* renamed from: p88  reason: default package */
public final class p88 implements fjf<p> {
    private final wlf<l> a;
    private final wlf<String> b;
    private final wlf<Boolean> c;
    private final wlf<Integer> d;

    public p88(wlf<l> wlf, wlf<String> wlf2, wlf<Boolean> wlf3, wlf<Integer> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        l lVar = this.a.get();
        String str = this.b.get();
        boolean booleanValue = this.c.get().booleanValue();
        p b2 = lVar.b(str, booleanValue ? "assisted_curation" : "default", this.d.get().intValue());
        yif.g(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
