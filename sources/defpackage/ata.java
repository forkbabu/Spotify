package defpackage;

/* renamed from: ata  reason: default package */
public final class ata implements fjf<zsa> {
    private final wlf<fsa> a;
    private final wlf<kta> b;
    private final wlf<ksa> c;
    private final wlf<mta> d;

    public ata(wlf<fsa> wlf, wlf<kta> wlf2, wlf<ksa> wlf3, wlf<mta> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zsa(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
