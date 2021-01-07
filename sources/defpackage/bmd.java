package defpackage;

import com.spotify.http.v;
import com.spotify.music.json.g;
import defpackage.amd;
import kotlin.jvm.internal.h;
import okhttp3.y;

/* renamed from: bmd  reason: default package */
public final class bmd implements fjf<zld> {
    private final wlf<y> a;
    private final wlf<g> b;

    public bmd(wlf<y> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        y yVar = this.a.get();
        g gVar = this.b.get();
        amd.a aVar = amd.a;
        h.e(yVar, "client");
        h.e(gVar, "mapperFactory");
        y.b q = yVar.q();
        q.i(false);
        Object d = v.a(q.c(), gVar).d(zld.class);
        h.d(d, "retrofit.create(TtsEndpoint::class.java)");
        return (zld) d;
    }
}
