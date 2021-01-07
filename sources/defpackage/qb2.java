package defpackage;

/* renamed from: qb2  reason: default package */
public final class qb2 implements fjf<pb2> {
    private final wlf<e92> a;
    private final wlf<vla> b;

    public qb2(wlf<e92> wlf, wlf<vla> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pb2(this.a.get(), this.b.get());
    }
}
