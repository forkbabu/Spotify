package defpackage;

/* renamed from: bb2  reason: default package */
public final class bb2 implements fjf<ab2> {
    private final wlf<jb2> a;
    private final wlf<pb2> b;

    public bb2(wlf<jb2> wlf, wlf<pb2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ab2(this.a, this.b);
    }
}
