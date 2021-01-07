package defpackage;

/* renamed from: wda  reason: default package */
public final class wda implements fjf<Boolean> {
    private final wlf<Boolean> a;

    public wda(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Boolean bool = this.a.get();
        if (bool != null) {
            return bool;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
