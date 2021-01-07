package defpackage;

/* renamed from: nh2  reason: default package */
public final class nh2 implements fjf<mh2> {
    private final wlf<xld> a;

    public nh2(wlf<xld> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mh2(this.a.get());
    }
}
