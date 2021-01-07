package defpackage;

/* renamed from: k68  reason: default package */
public final class k68 implements fjf<j68> {
    private final wlf<Boolean> a;

    public k68(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j68(this.a.get().booleanValue());
    }
}
