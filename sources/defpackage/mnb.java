package defpackage;

/* renamed from: mnb  reason: default package */
public final class mnb implements fjf<lnb> {
    private final wlf<Boolean> a;

    public mnb(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lnb(this.a.get().booleanValue());
    }
}
