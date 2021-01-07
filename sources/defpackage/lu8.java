package defpackage;

/* renamed from: lu8  reason: default package */
public final class lu8 implements fjf<ku8> {
    private final wlf<mu8> a;

    public lu8(wlf<mu8> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ku8(this.a.get());
    }
}
