package defpackage;

import io.reactivex.s;

/* renamed from: q5a  reason: default package */
public final class q5a implements fjf<s<d7a>> {
    private final wlf<k5a> a;

    public q5a(wlf<k5a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<d7a> e = this.a.get().e();
        yif.g(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
