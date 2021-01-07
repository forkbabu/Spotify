package defpackage;

/* renamed from: wo5  reason: default package */
public final class wo5 implements fjf<vo5> {
    private final wlf<ro5> a;
    private final wlf<yo5> b;
    private final wlf<o1e<b91>> c;

    public wo5(wlf<ro5> wlf, wlf<yo5> wlf2, wlf<o1e<b91>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vo5(this.a.get(), this.b.get(), this.c.get());
    }
}
