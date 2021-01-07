package defpackage;

/* renamed from: n8b  reason: default package */
public final class n8b implements p8b {
    private final cqe a;
    private final jz1 b;
    private final ifd c;

    public n8b(jz1 jz1, ifd ifd, cqe cqe) {
        jz1.getClass();
        this.b = jz1;
        ifd.getClass();
        this.c = ifd;
        cqe.getClass();
        this.a = cqe;
    }

    @Override // defpackage.p8b
    public void a(String str, int i) {
        jz1 jz1 = this.b;
        ifd ifd = this.c;
        ifd.getClass();
        oxa oxa = new oxa();
        oxa.c(str);
        jz1.a(new fa1(null, ifd.getName(), "spotify:search-trending", null, (long) i, String.format("spotify:search:%s", oxa.a()), "hit", "fill", (double) this.a.d()));
    }
}
