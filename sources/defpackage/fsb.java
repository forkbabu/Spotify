package defpackage;

/* renamed from: fsb  reason: default package */
public final class fsb implements fjf<esb> {
    private final wlf<csb> a;

    public fsb(wlf<csb> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new esb(this.a.get());
    }
}
