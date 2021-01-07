package defpackage;

/* renamed from: ag5  reason: default package */
public final class ag5 implements fjf<zf5> {
    private final wlf<Boolean> a;

    public ag5(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zf5(this.a.get().booleanValue());
    }
}
