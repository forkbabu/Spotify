package defpackage;

import android.net.MailTo;
import android.util.Patterns;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.podcast.episode.g0;
import defpackage.vb7;

/* renamed from: tb7  reason: default package */
public class tb7 implements vb7.a, woa {
    private final ExplicitContentFacade a;
    private final cjc b;
    private final oa7 c;
    private final String d;
    private final g0 e;

    public tb7(ExplicitContentFacade explicitContentFacade, cjc cjc, oa7 oa7, String str, g0 g0Var) {
        this.a = explicitContentFacade;
        this.b = cjc;
        this.c = oa7;
        this.d = str;
        this.e = g0Var;
    }

    @Override // defpackage.vb7.a
    public void a() {
        this.c.o(this.d);
    }

    @Override // defpackage.vb7.a
    public void b(String str, long j, boolean z) {
        String n = this.c.n((int) j);
        if (!this.e.d() || !z) {
            this.b.b(str, this.d, j, n);
        } else {
            this.a.e(this.d, str);
        }
    }

    @Override // defpackage.woa
    public void c(String str) {
        d(str);
    }

    @Override // defpackage.vb7.a
    public void d(String str) {
        if (Patterns.EMAIL_ADDRESS.matcher(str).matches() || MailTo.isMailTo(str)) {
            this.c.i(str);
        } else if (l0.x(str)) {
            this.c.q(str);
        } else {
            this.c.c(str);
        }
    }

    public void e() {
        this.b.onStart();
    }

    public void f() {
        this.b.onStop();
    }
}
