package defpackage;

/* renamed from: ob2  reason: default package */
public final class ob2 implements fjf<nb2> {
    private final wlf<vla> a;

    public ob2(wlf<vla> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nb2(this.a.get());
    }
}
