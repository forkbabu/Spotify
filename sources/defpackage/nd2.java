package defpackage;

/* renamed from: nd2  reason: default package */
public final class nd2 implements fjf<md2> {
    private final wlf<cte> a;

    public nd2(wlf<cte> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new md2(this.a.get());
    }
}
