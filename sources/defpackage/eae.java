package defpackage;

/* renamed from: eae  reason: default package */
public final class eae implements fjf<dae> {
    private final wlf<String> a;

    public eae(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dae(this.a.get());
    }
}
