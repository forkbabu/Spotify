package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.ubi.specification.factories.m2;
import kotlin.jvm.internal.h;

/* renamed from: c06  reason: default package */
public final class c06 implements fjf<m2> {
    private final wlf<a> a;
    private final wlf<String> b;

    public c06(wlf<a> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = this.a.get();
        String str = this.b.get();
        h.e(aVar, "pageIdentifier");
        h.e(str, "playlistUri");
        return new m2(aVar.path(), str);
    }
}
