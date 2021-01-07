package defpackage;

/* renamed from: y0f  reason: default package */
public final class y0f {
    private final jz1 a;
    private final cqe b;

    y0f(jz1 jz1, cqe cqe) {
        this.a = jz1;
        this.b = cqe;
    }

    public void a(String str, String str2, int i) {
        this.a.a(new ga1(str, "voice", "voice:alternative-search-results", "-1", (long) i, str2, "TAP", "navigate", (double) this.b.d(), ""));
    }

    public void b(String str) {
        this.a.a(new ga1(str, "voice", "voice:alternative-search-results", "-1", -1, "", "SWIPE", "close", (double) this.b.d(), ""));
    }
}
