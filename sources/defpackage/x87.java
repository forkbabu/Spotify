package defpackage;

/* renamed from: x87  reason: default package */
public final class x87 implements fjf<w87> {
    private final wlf<s87> a;

    public x87(wlf<s87> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w87(this.a.get());
    }
}
