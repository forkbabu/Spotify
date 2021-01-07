package defpackage;

/* renamed from: rla  reason: default package */
public final class rla implements fjf<qla> {
    private final wlf<vla> a;

    public rla(wlf<vla> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qla(this.a.get());
    }
}
