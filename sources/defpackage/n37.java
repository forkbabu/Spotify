package defpackage;

import com.spotify.podcast.endpoints.policy.ShowDecorationPolicy;
import com.spotify.podcast.endpoints.policy.ShowPolicy;
import defpackage.g37;
import kotlin.jvm.internal.h;

/* renamed from: n37  reason: default package */
public final class n37 implements fjf<ShowPolicy> {
    private final wlf<ShowDecorationPolicy> a;

    public n37(wlf<ShowDecorationPolicy> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ShowDecorationPolicy showDecorationPolicy = this.a.get();
        g37.a aVar = g37.a;
        h.e(showDecorationPolicy, "showDecorationPolicy");
        ShowPolicy.a builder = ShowPolicy.builder();
        builder.a(showDecorationPolicy);
        ShowPolicy build = builder.build();
        h.d(build, "ShowPolicy.builder()\n   …\n                .build()");
        return build;
    }
}
