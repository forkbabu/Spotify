package defpackage;

/* renamed from: wh1  reason: default package */
public final class wh1 implements fjf<vh1> {
    private final wlf<fb1> a;

    public wh1(wlf<fb1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vh1(this.a.get());
    }
}
