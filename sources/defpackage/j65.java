package defpackage;

/* renamed from: j65  reason: default package */
public final class j65 implements fjf<i65> {
    private final wlf<k65> a;

    public j65(wlf<k65> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i65(this.a.get());
    }
}
