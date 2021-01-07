package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.z;

/* renamed from: caa  reason: default package */
public class caa {
    private static final d.b c;
    public static final /* synthetic */ int d = 0;
    private final l31 a;
    private final d b;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("name", Boolean.TRUE);
        ImmutableMap build = builder.build();
        HeaderPolicy.a builder2 = HeaderPolicy.builder();
        builder2.a(build);
        builder2.e(ImmutableMap.of());
        builder2.d(ImmutableMap.of());
        HeaderPolicy b2 = builder2.b();
        ListPolicy.a builder3 = ListPolicy.builder();
        builder3.d(ImmutableMap.of());
        builder3.b(ImmutableMap.of());
        builder3.c(ImmutableMap.of());
        builder3.a(ImmutableMap.of());
        builder3.g(ImmutableMap.of());
        ListPolicy e = builder3.e();
        DecorationPolicy.a builder4 = DecorationPolicy.builder();
        builder4.b(b2);
        builder4.c(e);
        DecorationPolicy a2 = builder4.a();
        Policy.a builder5 = Policy.builder();
        builder5.b(a2);
        Policy a3 = builder5.a();
        d.b.a b3 = d.b.b();
        b3.g(a3);
        b3.i(new qxd(0, 0));
        c = b3.b();
    }

    public caa(l31 l31, d dVar) {
        this.a = l31;
        this.b = dVar;
    }

    public z<String> a(String str, LinkType linkType) {
        int ordinal = linkType.ordinal();
        if (ordinal == 6) {
            return this.a.d(str).A(j9a.a);
        }
        if (ordinal == 14) {
            return this.a.b(str).A(i9a.a);
        }
        if (ordinal == 72 || ordinal == 185 || ordinal == 210) {
            return this.b.d(str, c).A(h9a.a);
        }
        if (ordinal != 246) {
            return z.q(new IllegalArgumentException(je.x0("Unsupported uri ", str)));
        }
        return this.a.a(str).A(o9a.a);
    }
}
