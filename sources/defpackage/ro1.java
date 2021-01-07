package defpackage;

import com.spotify.http.u;
import com.spotify.http.v;
import com.spotify.http.w;
import com.spotify.mobile.android.skiplimitpivot.a;
import com.spotify.music.json.g;
import kotlin.jvm.internal.h;
import okhttp3.y;

/* renamed from: ro1  reason: default package */
public final class ro1 implements fjf<oo1> {
    private final wlf<w> a;
    private final wlf<a> b;
    private final wlf<g> c;

    public ro1(wlf<w> wlf, wlf<a> wlf2, wlf<g> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        w wVar = this.a.get();
        a aVar = this.b.get();
        g gVar = this.c.get();
        h.e(wVar, "spotifyOkHttp");
        h.e(aVar, "cacheInterceptor");
        h.e(gVar, "objectMakerFactory");
        y.b q = wVar.a().q();
        q.b(aVar);
        Object c2 = new u(v.a(q.c(), gVar), qo1.a).c(oo1.class);
        h.d(c2, "retrofitMaker.createWebg…istsEndPoint::class.java)");
        return (oo1) c2;
    }
}
