package defpackage;

/* renamed from: jf2  reason: default package */
public final class jf2 implements fjf<if2> {
    private final wlf<hkd> a;

    public jf2(wlf<hkd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new if2(this.a.get());
    }
}
