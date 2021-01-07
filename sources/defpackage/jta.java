package defpackage;

/* renamed from: jta  reason: default package */
public final class jta implements fjf<ita> {
    private final wlf<bta> a;
    private final wlf<qqa> b;

    public jta(wlf<bta> wlf, wlf<qqa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ita(this.a.get(), this.b.get());
    }
}
