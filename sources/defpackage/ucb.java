package defpackage;

/* renamed from: ucb  reason: default package */
public final class ucb implements fjf<tcb> {
    private final wlf<ocb> a;
    private final wlf<jfb> b;
    private final wlf<kcb> c;

    public ucb(wlf<ocb> wlf, wlf<jfb> wlf2, wlf<kcb> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tcb(this.a.get(), this.b.get(), this.c.get());
    }
}
