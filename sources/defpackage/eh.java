package defpackage;

import com.google.android.datatransport.g;

/* renamed from: eh  reason: default package */
final /* synthetic */ class eh implements Runnable {
    private final gh a;
    private final tg b;
    private final g c;
    private final pg f;

    private eh(gh ghVar, tg tgVar, g gVar, pg pgVar) {
        this.a = ghVar;
        this.b = tgVar;
        this.c = gVar;
        this.f = pgVar;
    }

    public static Runnable a(gh ghVar, tg tgVar, g gVar, pg pgVar) {
        return new eh(ghVar, tgVar, gVar, pgVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        gh.c(this.a, this.b, this.c, this.f);
    }
}
