package defpackage;

import com.spotify.music.navigation.t;
import defpackage.mc7;

/* renamed from: kc7  reason: default package */
public class kc7 implements mc7.a {
    private final oa7 a;
    private final t b;

    public kc7(oa7 oa7, t tVar) {
        this.a = oa7;
        this.b = tVar;
    }

    @Override // defpackage.mc7.a
    public void a(String str) {
        this.a.p(str);
        this.b.d(str);
    }

    @Override // defpackage.mc7.a
    public void b(String str) {
        this.a.f(str);
        this.b.d(str);
    }
}
