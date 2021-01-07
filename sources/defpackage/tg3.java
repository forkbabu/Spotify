package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: tg3  reason: default package */
public class tg3 {
    private final wlf<jz1> a;
    private final wlf<cqe> b;
    private final wlf<ere> c;

    tg3(wlf<jz1> wlf, wlf<cqe> wlf2, wlf<ere> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public sg3 b(String str, String str2) {
        jz1 jz1 = this.a.get();
        a(jz1, 1);
        jz1 jz12 = jz1;
        cqe cqe = this.b.get();
        a(cqe, 2);
        a(str, 3);
        String str3 = str;
        ere ere = this.c.get();
        a(ere, 5);
        return new sg3(jz12, cqe, str3, str2, ere);
    }
}
