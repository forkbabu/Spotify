package com.spotify.music.libs.ageverification;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$ImageGroup;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.music.libs.mediabrowserservice.d2;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.q;
import io.reactivex.z;

public class n {
    private static final d.b d;
    private final d2 a;
    private final l31 b;
    private final d c;

    static {
        HeaderPolicy.a builder = HeaderPolicy.builder();
        builder.a(ImmutableMap.of("covers", Boolean.TRUE));
        HeaderPolicy b2 = builder.b();
        DecorationPolicy.a builder2 = DecorationPolicy.builder();
        builder2.b(b2);
        DecorationPolicy a2 = builder2.a();
        Policy.a builder3 = Policy.builder();
        builder3.b(a2);
        Policy a3 = builder3.a();
        d.b.a b3 = d.b.b();
        b3.g(a3);
        d = b3.b();
    }

    public n(l31 l31, d2 d2Var, d dVar) {
        this.a = d2Var;
        this.b = l31;
        this.c = dVar;
    }

    private Optional<String> f(Metadata$ImageGroup metadata$ImageGroup) {
        if (metadata$ImageGroup.l() <= 0) {
            return Optional.absent();
        }
        return Optional.of(this.a.a(new SpotifyUri(SpotifyUri.Kind.IMAGE, lg0.a(metadata$ImageGroup.i(0).h().A()), null).toString()).toString());
    }

    public /* synthetic */ Optional a(Metadata$Album metadata$Album) {
        return f(metadata$Album.h());
    }

    public /* synthetic */ Optional b(Metadata$Artist metadata$Artist) {
        return f(metadata$Artist.l());
    }

    public Optional c(k kVar) {
        j j = kVar.j();
        Covers c2 = j.c();
        Covers.Size size = Covers.Size.LARGE;
        if (MoreObjects.isNullOrEmpty(q.c(c2, size))) {
            return Optional.absent();
        }
        return Optional.of(this.a.a(q.c(j.c(), size)).toString());
    }

    public /* synthetic */ Optional d(Metadata$Track metadata$Track) {
        return f(metadata$Track.h().h());
    }

    public z<Optional<String>> e(String str) {
        if (ViewUris.y.a(str)) {
            return this.b.c(str).A(new f(this));
        }
        if (ViewUris.P0.a(str)) {
            return this.b.d(str).A(new e(this));
        }
        if (ViewUris.R0.a(str)) {
            return this.b.b(str).A(new g(this));
        }
        if (ViewUris.G0.a(str)) {
            return this.c.d(str, d).A(new d(this));
        }
        return z.z(Optional.absent());
    }
}
