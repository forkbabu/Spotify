package defpackage;

/* renamed from: su8  reason: default package */
public final class su8 implements fjf<ru8> {
    private final wlf<yt8> a;

    public su8(wlf<yt8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ru8(this.a.get());
    }
}
