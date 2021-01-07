package defpackage;

import com.spotify.instrumentation.a;

/* renamed from: lfd  reason: default package */
public final class lfd implements fjf<a> {
    private final wlf<mfd> a;

    public lfd(wlf<mfd> wlf) {
        this.a = wlf;
    }

    public static a a(mfd mfd) {
        a g1 = mfd.g1();
        yif.g(g1, "Cannot return null from a non-@Nullable @Provides method");
        return g1;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
