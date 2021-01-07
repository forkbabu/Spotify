package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.b;

/* renamed from: evb  reason: default package */
public class evb {
    private final b a;
    private final e92 b;
    private final r92 c;

    public evb(b bVar, e92 e92, r92 r92) {
        this.a = bVar;
        this.b = e92;
        this.c = r92;
    }

    public void a() {
        this.a.a(WazeBannerModel.b(WazeBannerModel.Type.NO_BANNER).b());
        this.c.c(true);
    }

    public void b() {
        this.b.a("com.spotify.music.internal.waze.LAUNCH");
    }

    public boolean c() {
        return this.c.e() && this.c.d();
    }
}
