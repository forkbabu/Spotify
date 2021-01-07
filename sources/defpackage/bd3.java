package defpackage;

import java.util.Calendar;

/* renamed from: bd3  reason: default package */
public final class bd3 implements fjf<Calendar> {
    private final wlf<cqe> a;

    public bd3(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Calendar e = this.a.get().e();
        yif.g(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
