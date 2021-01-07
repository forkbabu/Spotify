package defpackage;

/* renamed from: dja  reason: default package */
public final class dja implements fjf<cja> {
    private final wlf<asd> a;

    public dja(wlf<asd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cja(this.a.get());
    }
}
