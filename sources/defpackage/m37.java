package defpackage;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.policy.ShowPolicy;
import com.spotify.podcast.endpoints.x;
import defpackage.g37;
import kotlin.jvm.internal.h;

/* renamed from: m37  reason: default package */
public final class m37 implements fjf<x.a> {
    private final wlf<ShowPolicy> a;

    public m37(wlf<ShowPolicy> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ShowPolicy showPolicy = this.a.get();
        g37.a aVar = g37.a;
        h.e(showPolicy, "showPolicy");
        x.a.AbstractC0383a b = x.a.b();
        b.b(Optional.of(showPolicy));
        b.c(Optional.of(Boolean.TRUE));
        b.f(Optional.absent());
        b.j(Optional.of(Boolean.FALSE));
        x.a build = b.build();
        h.d(build, "ShowEntityEndpoint.Confi…\n                .build()");
        return build;
    }
}
