package com.spotify.music.libs.assistedcuration.presenter;

import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import io.reactivex.z;

public class v implements y {
    private static final d.b c;
    public static final /* synthetic */ int d = 0;
    private final String a;
    private final d b;

    static {
        HeaderPolicy.a builder = HeaderPolicy.builder();
        Boolean bool = Boolean.TRUE;
        builder.a(ImmutableMap.of("name", bool));
        HeaderPolicy b2 = builder.b();
        ListPolicy.a builder2 = ListPolicy.builder();
        builder2.d(ImmutableMap.of("link", bool));
        ListPolicy e = builder2.e();
        DecorationPolicy.a builder3 = DecorationPolicy.builder();
        builder3.b(b2);
        builder3.c(e);
        DecorationPolicy a2 = builder3.a();
        Policy.a builder4 = Policy.builder();
        builder4.b(a2);
        Policy a3 = builder4.a();
        d.b.a b3 = d.b.b();
        b3.f(Boolean.FALSE);
        b3.g(a3);
        c = b3.b();
    }

    public v(String str, d dVar) {
        this.a = str;
        this.b = dVar;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.y
    public z<x> a() {
        return this.b.d(this.a, c).A(g.a);
    }
}
