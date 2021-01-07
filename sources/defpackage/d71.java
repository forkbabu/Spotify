package defpackage;

import android.text.TextUtils;
import com.spotify.music.navigation.t;

/* renamed from: d71  reason: default package */
public class d71 implements a71 {
    private final t a;
    private final p71 b;
    private final j81 c;
    private final ere f;

    public d71(t tVar, p71 p71, j81 j81, ere ere) {
        tVar.getClass();
        this.a = tVar;
        p71.getClass();
        this.b = p71;
        this.c = j81;
        this.f = ere;
    }

    public static o81 a(String str) {
        return z81.b().e("navigate").b("uri", str).c();
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri", "");
        if (!TextUtils.isEmpty(string)) {
            nqe i = this.c.a(n61).i(string);
            this.b.a(string, n61.d(), "navigate-forward", null);
            this.f.a(i);
            this.a.b(string, i.b());
        }
    }
}
