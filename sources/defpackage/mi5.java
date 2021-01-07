package defpackage;

/* renamed from: mi5  reason: default package */
public final class mi5 implements fjf<li5> {
    private final wlf<ri5> a;

    public mi5(wlf<ri5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new li5(this.a.get());
    }
}
