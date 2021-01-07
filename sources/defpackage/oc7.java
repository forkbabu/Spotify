package defpackage;

/* renamed from: oc7  reason: default package */
public final class oc7 implements fjf<nc7> {
    private final wlf<pc7> a;

    public oc7(wlf<pc7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nc7(this.a.get());
    }
}
