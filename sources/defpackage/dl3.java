package defpackage;

/* renamed from: dl3  reason: default package */
public final class dl3 implements fjf<cl3> {
    private final wlf<ol3> a;

    public dl3(wlf<ol3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cl3(this.a.get());
    }
}
