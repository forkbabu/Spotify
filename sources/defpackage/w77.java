package defpackage;

import com.spotify.remoteconfig.k6;

/* renamed from: w77  reason: default package */
public final class w77 implements fjf<cjc> {
    private final wlf<djc> a;
    private final wlf<fjc> b;
    private final wlf<k6> c;

    public w77(wlf<djc> wlf, wlf<fjc> wlf2, wlf<k6> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        Object obj = (djc) this.a.get();
        Object obj2 = (fjc) this.b.get();
        if (this.c.get().b()) {
            obj = obj2;
        }
        yif.g(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
