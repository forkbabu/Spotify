package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;
import defpackage.w51;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.h;

/* renamed from: b25  reason: default package */
public final class b25 implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<v> c;
    private final wlf<w15> d;

    public b25(wlf<Context> wlf, wlf<c.a> wlf2, wlf<v> wlf3, wlf<w15> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        c.a aVar = this.b.get();
        v vVar = this.c.get();
        w15 w15 = this.d.get();
        h.e(context, "context");
        h.e(aVar, ContextTrack.Metadata.KEY_PROVIDER);
        h.e(vVar, "spotifyHubsConfig");
        h.e(w15, "feedRegistryResolver");
        w51.b b2 = vVar.a(context, aVar).a(EmptyMap.a).b();
        b2.g(w15);
        b2.m(w15);
        w51 a2 = b2.a();
        h.d(a2, "spotifyHubsConfig\n      …ver)\n            .build()");
        return a2;
    }
}
