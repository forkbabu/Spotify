package defpackage;

import com.adjust.sdk.Constants;
import okhttp3.u;
import okhttp3.y;
import retrofit2.adapter.rxjava2.g;
import retrofit2.w;

/* renamed from: mrd  reason: default package */
public final class mrd implements fjf<lrd> {
    private final wlf<y> a;

    public mrd(wlf<y> wlf) {
        this.a = wlf;
    }

    public static lrd a(y yVar) {
        u.a aVar = new u.a();
        aVar.i(Constants.SCHEME);
        aVar.f("spclient.wg.spotify.com");
        u c = aVar.c();
        w.b bVar = new w.b();
        bVar.g(yVar);
        bVar.d(c);
        bVar.b(gqf.c());
        bVar.a(g.e());
        lrd lrd = (lrd) bVar.e().d(lrd.class);
        yif.g(lrd, "Cannot return null from a non-@Nullable @Provides method");
        return lrd;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
