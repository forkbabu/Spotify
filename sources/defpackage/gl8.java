package defpackage;

/* renamed from: gl8  reason: default package */
public final class gl8 implements fjf<fl8> {
    private final wlf<hl8> a;
    private final wlf<vl8> b;

    public gl8(wlf<hl8> wlf, wlf<vl8> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fl8(this.a.get(), this.b.get());
    }
}
