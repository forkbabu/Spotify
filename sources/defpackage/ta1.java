package defpackage;

import io.reactivex.s;

/* renamed from: ta1  reason: default package */
public final class ta1 implements fjf<s<na1>> {
    private final wlf<qa1> a;

    public ta1(wlf<qa1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<na1> g = this.a.get().g();
        yif.g(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
