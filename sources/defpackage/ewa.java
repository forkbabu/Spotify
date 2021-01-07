package defpackage;

/* renamed from: ewa  reason: default package */
public final class ewa implements fjf<dwa> {
    private final wlf<fsa> a;
    private final wlf<ava> b;
    private final wlf<ksa> c;
    private final wlf<cva> d;

    public ewa(wlf<fsa> wlf, wlf<ava> wlf2, wlf<ksa> wlf3, wlf<cva> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dwa(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
