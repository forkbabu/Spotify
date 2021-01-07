package defpackage;

import io.reactivex.s;

/* renamed from: gk5  reason: default package */
public final class gk5 implements fjf<s<Boolean>> {
    private final wlf<hha> a;

    public gk5(wlf<hha> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<Boolean> i = this.a.get().i();
        yif.g(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
