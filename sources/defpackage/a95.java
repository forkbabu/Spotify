package defpackage;

/* renamed from: a95  reason: default package */
public final class a95 implements fjf<String> {
    private final wlf<ifd> a;

    public a95(wlf<ifd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String ifd = this.a.get().toString();
        yif.g(ifd, "Cannot return null from a non-@Nullable @Provides method");
        return ifd;
    }
}
