package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.rxjava2.q;
import io.reactivex.g;

/* renamed from: m6c  reason: default package */
public class m6c {
    private final dv3 a;
    private final g<Boolean> b;
    private final g<Ad> c;
    private final q d = new q();
    private Ad e;

    public m6c(g<Boolean> gVar, g<Ad> gVar2, dv3 dv3) {
        this.b = gVar;
        this.c = gVar2;
        this.a = dv3;
    }

    public static void a(m6c m6c, Ad ad) {
        m6c.e = ad;
    }

    public static void b(m6c m6c, boolean z) {
        dv3 dv3 = m6c.a;
        String str = z ? "unobscured" : "obscured";
        Ad ad = m6c.e;
        dv3.a(str, ad != null ? ad.id() : "");
    }

    public void c() {
        this.d.a(this.c.subscribe(new k6c(this)));
        this.d.a(this.b.subscribe(new l6c(this)));
    }

    public void d() {
        this.d.c();
    }
}
