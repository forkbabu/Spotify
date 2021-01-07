package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.m;

/* renamed from: e24  reason: default package */
public class e24 implements a71 {
    public static final /* synthetic */ int f = 0;
    private final m a;
    private final p71 b;
    private final c8b c;

    public e24(m mVar, p71 p71, c8b c8b) {
        mVar.getClass();
        this.a = mVar;
        p71.getClass();
        this.b = p71;
        c8b.getClass();
        this.c = c8b;
    }

    public static o81 a(String str) {
        return z81.b().e("ac:navigate").b("uri", str).c();
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (string == null) {
            Assertion.g("empty uri");
            return;
        }
        this.c.a();
        String string2 = o81.data().string("title");
        String title = n61.d().text().title();
        if (string2 == null) {
            string2 = title;
        }
        if (string2 != null) {
            this.a.c(string, string2);
            this.b.a(string, n61.d(), "navigate-forward", null);
        }
    }
}
