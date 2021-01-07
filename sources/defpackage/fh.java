package defpackage;

import com.google.android.datatransport.runtime.synchronization.a;

/* access modifiers changed from: package-private */
/* renamed from: fh  reason: default package */
public final /* synthetic */ class fh implements a.AbstractC0087a {
    private final gh a;
    private final tg b;
    private final pg c;

    private fh(gh ghVar, tg tgVar, pg pgVar) {
        this.a = ghVar;
        this.b = tgVar;
        this.c = pgVar;
    }

    public static a.AbstractC0087a a(gh ghVar, tg tgVar, pg pgVar) {
        return new fh(ghVar, tgVar, pgVar);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.a.AbstractC0087a
    public Object h() {
        gh.b(this.a, this.b, this.c);
        return null;
    }
}
