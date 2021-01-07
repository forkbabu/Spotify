package defpackage;

import com.spotify.libs.search.history.i;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: m58  reason: default package */
public class m58 implements a71 {
    private final i a;
    private final mb8 b;
    private final c8b c;

    public m58(i iVar, mb8 mb8, c8b c8b) {
        this.a = iVar;
        this.b = mb8;
        this.c = c8b;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (string == null) {
            Assertion.g("empty recent search");
            return;
        }
        this.b.a(o81.data().intValue("position", -1), string);
        this.c.a();
        this.a.f(string);
    }
}
