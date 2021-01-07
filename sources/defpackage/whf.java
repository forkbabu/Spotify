package defpackage;

/* renamed from: whf  reason: default package */
public final class whf implements fjf<Boolean> {
    private final wlf<thf> a;

    public whf(wlf<thf> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().e());
    }
}
