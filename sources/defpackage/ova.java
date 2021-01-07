package defpackage;

/* renamed from: ova  reason: default package */
public final class ova implements fjf<nva> {
    private final wlf<rva> a;
    private final wlf<pva> b;
    private final wlf<qqa> c;

    public ova(wlf<rva> wlf, wlf<pva> wlf2, wlf<qqa> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        rva rva = this.a.get();
        return new nva(rva, this.b.get(), this.c.get());
    }
}
