package defpackage;

/* renamed from: b88  reason: default package */
public final class b88 implements fjf<Boolean> {
    private final wlf<Boolean> a;

    public b88(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().booleanValue());
    }
}
