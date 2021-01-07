package defpackage;

/* renamed from: vsc  reason: default package */
public final class vsc implements fjf<usc> {
    private final wlf<wsc> a;
    private final wlf<rsc> b;

    public vsc(wlf<wsc> wlf, wlf<rsc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new usc(this.a.get(), this.b.get());
    }
}
