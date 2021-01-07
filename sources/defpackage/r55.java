package defpackage;

/* renamed from: r55  reason: default package */
public final class r55 implements fjf<String> {
    private final wlf<ifd> a;

    public r55(wlf<ifd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String ifd = this.a.get().toString();
        yif.g(ifd, "Cannot return null from a non-@Nullable @Provides method");
        return ifd;
    }
}
