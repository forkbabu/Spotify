package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.models.Show;
import com.spotify.podcast.endpoints.c0;
import com.spotify.podcast.endpoints.policy.shows.ShowsPolicy$DecorationPolicy;
import com.spotify.podcast.endpoints.policy.shows.ShowsPolicy$ListPolicy;
import com.spotify.podcast.endpoints.policy.shows.ShowsPolicy$Policy;
import defpackage.tkc;
import kotlin.jvm.internal.h;

/* renamed from: ukc  reason: default package */
public final class ukc implements fjf<c0.a> {
    private final wlf<ImmutableMap<String, Boolean>> a;

    public ukc(wlf<ImmutableMap<String, Boolean>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableMap<String, Boolean> immutableMap = this.a.get();
        tkc.a aVar = tkc.a;
        h.e(immutableMap, "attributes");
        Optional of = Optional.of(new ShowsPolicy$Policy(new ShowsPolicy$DecorationPolicy(new ShowsPolicy$ListPolicy(immutableMap))));
        h.d(of, "Optional.of(policy)");
        Optional of2 = Optional.of(Show.MediaType.VIDEO);
        h.d(of2, "Optional.of(Show.MediaType.VIDEO)");
        return new c0.a(null, null, null, of, null, of2, null, 87);
    }
}
