package defpackage;

/* renamed from: dnb  reason: default package */
public final class dnb implements fjf<cnb> {
    private final wlf<kcb> a;

    public dnb(wlf<kcb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cnb(this.a.get());
    }
}
