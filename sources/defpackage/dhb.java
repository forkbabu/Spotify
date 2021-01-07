package defpackage;

/* renamed from: dhb  reason: default package */
public final class dhb implements fjf<chb> {
    private final wlf<xhd> a;

    public dhb(wlf<xhd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new chb(this.a.get());
    }
}
