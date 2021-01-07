package defpackage;

import io.reactivex.g;

/* renamed from: bb3  reason: default package */
public final class bb3 implements fjf<g<Boolean>> {
    private final wlf<gsb> a;

    public bb3(wlf<gsb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<Boolean> f = this.a.get().f();
        yif.g(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
