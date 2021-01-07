package defpackage;

import java.util.Calendar;

/* renamed from: zoa  reason: default package */
public final class zoa implements fjf<Calendar> {
    private final wlf<cqe> a;

    public zoa(wlf<cqe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Calendar e = this.a.get().e();
        yif.g(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
