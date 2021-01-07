package defpackage;

import io.reactivex.s;

/* renamed from: t5a  reason: default package */
public final class t5a implements fjf<s<Boolean>> {
    private final wlf<l6a> a;

    public t5a(wlf<l6a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<Boolean> b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
