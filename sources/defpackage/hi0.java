package defpackage;

/* renamed from: hi0  reason: default package */
public final class hi0 implements fjf<gi0> {
    private final wlf<di0> a;

    public hi0(wlf<di0> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gi0(this.a.get());
    }
}
