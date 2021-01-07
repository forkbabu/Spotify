package defpackage;

/* renamed from: zhf  reason: default package */
public final class zhf implements fjf<Boolean> {
    private final wlf<thf> a;

    public zhf(wlf<thf> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().c());
    }
}
