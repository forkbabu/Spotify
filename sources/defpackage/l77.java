package defpackage;

/* renamed from: l77  reason: default package */
public final class l77 implements fjf<Boolean> {
    private final wlf<lbb> a;

    public l77(wlf<lbb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}
