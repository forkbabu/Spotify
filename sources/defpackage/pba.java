package defpackage;

/* renamed from: pba  reason: default package */
public final class pba implements fjf<oba> {
    private final wlf<jz1> a;

    public pba(wlf<jz1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oba(this.a.get());
    }
}
