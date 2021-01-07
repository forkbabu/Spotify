package defpackage;

import com.spotify.music.navigation.t;
import defpackage.xg3;

/* renamed from: vg3  reason: default package */
public class vg3 {
    private final t a;
    private final xg3 b;
    private final xg3.a c = new a();
    private final tg3 d;
    private sg3 e;

    /* renamed from: vg3$a */
    class a implements xg3.a {
        a() {
        }
    }

    public vg3(t tVar, xg3 xg3, tg3 tg3) {
        this.a = tVar;
        this.b = xg3;
        this.d = tg3;
    }

    static void a(vg3 vg3) {
        vg3.a.d("spotify:internal:preferences");
        vg3.e.i();
    }

    static void b(vg3 vg3) {
        vg3.e.l();
    }

    static void c(vg3 vg3) {
        vg3.e.g();
    }

    static void d(vg3 vg3) {
        vg3.e.h();
    }

    public void e(String str, String str2, boolean z) {
        this.e = this.d.b(str, str2);
        if (z) {
            this.b.b(this.c, str, str2);
            this.e.f();
        } else {
            this.b.a(this.c, str, str2);
            this.e.b();
        }
        this.e.j();
    }
}
