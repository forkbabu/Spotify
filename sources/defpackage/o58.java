package defpackage;

/* renamed from: o58  reason: default package */
public class o58 implements a71 {
    private final c8b a;
    private final k8b b;
    private final p8b c;

    public o58(c8b c8b, k8b k8b, p8b p8b) {
        this.a = c8b;
        this.b = k8b;
        this.c = p8b;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("trendingSearchQuery");
        string.getClass();
        this.c.a(string, o81.data().intValue("trendingSearchItemIndex", 0));
        this.b.b(string);
        this.a.a();
    }
}
