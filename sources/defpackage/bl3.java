package defpackage;

/* renamed from: bl3  reason: default package */
public final class bl3 implements fjf<zk3> {
    private final wlf<al3> a;

    public bl3(wlf<al3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zk3(this.a.get());
    }
}
