package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.json.g;
import kotlin.jvm.internal.h;

/* renamed from: fh0  reason: default package */
public final class fh0 implements fjf<ObjectMapper> {
    private final wlf<g> a;

    public fh0(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g gVar = this.a.get();
        h.e(gVar, "objectMapperFactory");
        ObjectMapper a2 = gVar.a();
        h.d(a2, "objectMapperFactory.buildObjectMapper()");
        return a2;
    }
}
