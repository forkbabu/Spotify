package defpackage;

import com.spotify.music.features.ads.api.h;
import io.reactivex.disposables.a;

/* renamed from: ku3  reason: default package */
public class ku3 {
    public static final /* synthetic */ int d = 0;
    private final h a;
    private final a b = new a();
    private final l6a c;

    public ku3(h hVar, l6a l6a) {
        this.a = hVar;
        this.c = l6a;
    }

    public static void a(ku3 ku3, boolean z) {
        iu3 iu3 = iu3.a;
        gu3 gu3 = gu3.a;
        if (z) {
            ku3.b.b(ku3.a.a("ad-product", "no-midroll-watch-now").B0().subscribe(gu3, iu3));
        } else {
            ku3.b.b(ku3.a.a("ad-product", "midroll-watch-now").B0().subscribe(gu3, iu3));
        }
    }

    public void b() {
        this.b.b(this.a.a("focus", "false").B0().subscribe(gu3.a, iu3.a));
    }

    public void c() {
        this.b.b(this.a.a("focus", "true").B0().subscribe(gu3.a, iu3.a));
        this.b.b(this.c.b().subscribe(new hu3(this)));
    }

    public void d() {
        this.b.f();
    }
}
