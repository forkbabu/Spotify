package defpackage;

/* renamed from: s46  reason: default package */
public final class s46 implements i46 {
    private final wlf<y56> a;

    public s46(wlf<y56> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.i46
    public h46 create() {
        y56 y56 = this.a.get();
        a(y56, 1);
        return new r46(y56);
    }
}
