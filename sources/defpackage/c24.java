package defpackage;

import com.spotify.libs.search.history.i;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.assistedcuration.search.m;

/* renamed from: c24  reason: default package */
public class c24 implements a71 {
    public static final /* synthetic */ int o = 0;
    private final m a;
    private final p71 b;
    private final i c;
    private final s6b f;
    private final c8b n;

    public c24(m mVar, p71 p71, i iVar, s6b s6b, c8b c8b) {
        mVar.getClass();
        this.a = mVar;
        p71.getClass();
        this.b = p71;
        iVar.getClass();
        this.c = iVar;
        s6b.getClass();
        this.f = s6b;
        c8b.getClass();
        this.n = c8b;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (string == null) {
            Assertion.g("empty uri");
            return;
        }
        this.n.a();
        String title = n61.d().text().title();
        if (title != null) {
            this.a.c(string, title);
            this.b.a(string, n61.d(), "navigate-forward", null);
            this.c.a(this.f.a(string, n61.d()));
        }
    }
}
