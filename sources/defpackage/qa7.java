package defpackage;

/* renamed from: qa7  reason: default package */
public final class qa7 implements fjf<pa7> {
    private final wlf<String> a;
    private final wlf<ja7> b;

    public qa7(wlf<String> wlf, wlf<ja7> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pa7(this.a.get(), this.b.get());
    }
}
