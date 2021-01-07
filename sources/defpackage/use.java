package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.audiorecord.api.e;
import com.spotify.voice.api.model.k;
import com.spotify.voice.api.model.l;
import io.netty.channel.d;
import io.netty.channel.j0;
import io.netty.handler.ssl.g0;
import io.reactivex.g;
import io.reactivex.z;

/* renamed from: use  reason: default package */
public final class use implements fjf<g<d>> {
    private final wlf<e> a;
    private final wlf<ObjectMapper> b;
    private final wlf<g0> c;
    private final wlf<j0> d;
    private final wlf<z<k>> e;
    private final wlf<l> f;
    private final wlf<sse> g;
    private final wlf<String> h;
    private final wlf<pre> i;
    private final wlf<com.spotify.voice.api.l> j;

    public use(wlf<e> wlf, wlf<ObjectMapper> wlf2, wlf<g0> wlf3, wlf<j0> wlf4, wlf<z<k>> wlf5, wlf<l> wlf6, wlf<sse> wlf7, wlf<String> wlf8, wlf<pre> wlf9, wlf<com.spotify.voice.api.l> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        e eVar = this.a.get();
        ObjectMapper objectMapper = this.b.get();
        g0 g0Var = this.c.get();
        j0 j0Var = this.d.get();
        z<k> zVar = this.e.get();
        l lVar = this.f.get();
        sse sse = this.g.get();
        String str = this.h.get();
        pre pre = this.i.get();
        com.spotify.voice.api.l lVar2 = this.j.get();
        if (g0Var != null) {
            return zVar.w(new fse(lVar, sse, lVar2, objectMapper, g0Var, j0Var, eVar, pre, str)).Z();
        }
        throw new IllegalArgumentException("SslContext is null");
    }
}
