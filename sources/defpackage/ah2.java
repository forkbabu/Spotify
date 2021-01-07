package defpackage;

/* renamed from: ah2  reason: default package */
public final class ah2 implements fjf<zg2> {
    private final wlf<dld> a;

    public ah2(wlf<dld> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zg2(this.a.get());
    }
}
