package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.j;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class d {
    private static final d.b b;
    private final com.spotify.playlist.endpoints.d a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("username", bool);
        ImmutableMap build = builder.build();
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.mo51put("name", bool);
        builder2.mo51put("username", bool);
        ImmutableMap build2 = builder2.build();
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.mo51put("description", bool);
        builder3.mo51put("offline", bool);
        builder3.mo51put("ownedBySelf", bool);
        builder3.mo51put("name", bool);
        builder3.mo51put("link", bool);
        builder3.mo51put("picture", bool);
        builder3.mo51put("published", bool);
        builder3.mo51put("browsableOffline", bool);
        builder3.mo51put("collaborative", bool);
        ImmutableMap H = je.H(builder3, "followed", bool, "loaded", bool);
        HeaderPolicy.a builder4 = HeaderPolicy.builder();
        builder4.a(H);
        builder4.e(build);
        builder4.d(build2);
        HeaderPolicy b2 = builder4.b();
        ListPolicy.a builder5 = ListPolicy.builder();
        builder5.d(ImmutableMap.of());
        builder5.b(ImmutableMap.of());
        builder5.c(ImmutableMap.of());
        builder5.a(ImmutableMap.of());
        builder5.g(ImmutableMap.of());
        ListPolicy e = builder5.e();
        DecorationPolicy.a builder6 = DecorationPolicy.builder();
        builder6.c(e);
        builder6.b(b2);
        DecorationPolicy a2 = builder6.a();
        Policy.a builder7 = Policy.builder();
        builder7.b(a2);
        Policy a3 = builder7.a();
        d.b.a b3 = d.b.b();
        b3.g(a3);
        b3.i(new qxd(0, 0));
        b = b3.b();
    }

    public d(com.spotify.playlist.endpoints.d dVar) {
        this.a = dVar;
    }

    public z<j> a(String str) {
        return this.a.d(str, b).A(a.a).E(new b(str)).I(10, TimeUnit.SECONDS);
    }
}
