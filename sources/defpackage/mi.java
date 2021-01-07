package defpackage;

/* renamed from: mi  reason: default package */
public final class mi implements fjf<li> {
    private final wlf<ti> a;
    private final wlf<ti> b;
    private final wlf<oh> c;
    private final wlf<ri> d;

    public mi(wlf<ti> wlf, wlf<ti> wlf2, wlf<oh> wlf3, wlf<ri> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new li(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
