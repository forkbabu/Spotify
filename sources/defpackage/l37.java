package defpackage;

import com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy;
import com.spotify.podcast.endpoints.policy.ShowDecorationPolicy;
import defpackage.g37;
import kotlin.jvm.internal.h;

/* renamed from: l37  reason: default package */
public final class l37 implements fjf<ShowDecorationPolicy> {
    private final wlf<EpisodeDecorationPolicy> a;

    public l37(wlf<EpisodeDecorationPolicy> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EpisodeDecorationPolicy episodeDecorationPolicy = this.a.get();
        g37.a aVar = g37.a;
        h.e(episodeDecorationPolicy, "episodeDecorationPolicy");
        ShowDecorationPolicy.a builder = ShowDecorationPolicy.builder();
        builder.a(episodeDecorationPolicy);
        ShowDecorationPolicy build = builder.build();
        h.d(build, "ShowDecorationPolicy.bui…\n                .build()");
        return build;
    }
}
