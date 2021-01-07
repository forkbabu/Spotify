package defpackage;

/* renamed from: bxb  reason: default package */
public final class bxb implements fjf<axb> {
    private final wlf<Boolean> a;

    public bxb(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new axb(this.a.get().booleanValue());
    }
}
