package defpackage;

/* renamed from: gl3  reason: default package */
public final class gl3 implements fjf<fl3> {
    private final wlf<pl3> a;

    public gl3(wlf<pl3> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fl3(this.a.get());
    }
}
