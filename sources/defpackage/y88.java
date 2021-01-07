package defpackage;

/* renamed from: y88  reason: default package */
public final class y88 implements fjf<Boolean> {
    private final wlf<td8> a;

    public y88(wlf<td8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}
