package defpackage;

/* renamed from: v84  reason: default package */
public final class v84 implements fjf<u84> {
    private final wlf<Boolean> a;

    public v84(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u84(this.a.get().booleanValue());
    }
}
