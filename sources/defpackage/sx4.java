package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.editplaylist.EditPlaylistActivity;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.k;
import io.reactivex.z;

/* renamed from: sx4  reason: default package */
public class sx4 {
    private static final d.b c;
    private final String a;
    private final d b;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("name", bool);
        builder.mo51put("isWritable", bool);
        builder.mo51put("collaborative", bool);
        builder.mo51put("ownedBySelf", bool);
        builder.mo51put("picture", bool);
        ImmutableMap H = je.H(builder, "description", bool, "pictureFromAnnotate", bool);
        HeaderPolicy.a builder2 = HeaderPolicy.builder();
        builder2.a(H);
        builder2.e(ImmutableMap.of());
        builder2.d(ImmutableMap.of());
        HeaderPolicy b2 = builder2.b();
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.mo51put("name", bool);
        builder3.mo51put("link", bool);
        builder3.mo51put("rowId", bool);
        ImmutableMap build = builder3.build();
        ImmutableMap.Builder builder4 = ImmutableMap.builder();
        builder4.mo51put("name", bool);
        builder4.mo51put("username", bool);
        ImmutableMap build2 = builder4.build();
        ListPolicy.a builder5 = ListPolicy.builder();
        builder5.d(build);
        builder5.a(build2);
        builder5.b(ImmutableMap.of("name", bool));
        builder5.c(ImmutableMap.of("name", bool));
        builder5.g(ImmutableMap.of("name", bool));
        ListPolicy e = builder5.e();
        DecorationPolicy.a builder6 = DecorationPolicy.builder();
        builder6.b(b2);
        builder6.c(e);
        DecorationPolicy a2 = builder6.a();
        Policy.a builder7 = Policy.builder();
        builder7.b(a2);
        Policy a3 = builder7.a();
        d.b.a b3 = d.b.b();
        b3.c(true);
        b3.g(a3);
        c = b3.b();
    }

    public sx4(tx4 tx4, d dVar) {
        this.a = ((EditPlaylistActivity) tx4).a();
        this.b = dVar;
    }

    public z<k> a() {
        return this.b.d(this.a, c);
    }
}
