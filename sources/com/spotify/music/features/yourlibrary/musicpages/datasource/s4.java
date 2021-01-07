package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.k;
import io.reactivex.s;

public class s4 extends f5 {
    private static final Policy i;
    public static final /* synthetic */ int j = 0;
    private final d e;
    private final m f;
    private final s<Boolean> g;
    private final String h;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        ImmutableMap H = je.H(builder, "name", bool, "username", bool);
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.mo51put("username", bool);
        ImmutableMap build = builder2.build();
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.mo51put("picture", bool);
        builder3.mo51put("offline", bool);
        builder3.mo51put("ownedBySelf", bool);
        builder3.mo51put("name", bool);
        builder3.mo51put("formatListAttributes", bool);
        builder3.mo51put("formatListType", bool);
        builder3.mo51put("link", bool);
        ImmutableMap H2 = je.H(builder3, "isOnDemandInFree", bool, "totalLength", bool);
        HeaderPolicy.a builder4 = HeaderPolicy.builder();
        builder4.a(H2);
        builder4.e(H);
        builder4.d(build);
        HeaderPolicy b = builder4.b();
        ListPolicy.a builder5 = ListPolicy.builder();
        builder5.d(ImmutableMap.of());
        builder5.b(ImmutableMap.of());
        builder5.c(ImmutableMap.of());
        builder5.g(ImmutableMap.of());
        ListPolicy e2 = builder5.e();
        DecorationPolicy.a builder6 = DecorationPolicy.builder();
        builder6.b(b);
        builder6.c(e2);
        DecorationPolicy a = builder6.a();
        Policy.a builder7 = Policy.builder();
        builder7.b(a);
        i = builder7.a();
    }

    public s4(e1 e1Var, d dVar, m mVar, s<Boolean> sVar, String str) {
        super(e1Var);
        this.e = dVar;
        this.f = mVar;
        this.g = sVar;
        this.h = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.f5
    public s<y3> l(x3 x3Var) {
        int k = x3Var.k();
        String e2 = x3Var.c().e();
        boolean booleanValue = ((Boolean) MoreObjects.firstNonNull(x3Var.c().b().get("available_offline_only"), Boolean.FALSE)).booleanValue();
        d.b.a b = d.b.b();
        b.i(new qxd(0, k()));
        b.l(e2);
        b.a(booleanValue ? Boolean.TRUE : null);
        b.g(i);
        return s.n(this.e.d(this.h, b.b()).P(), this.g, h.a).j0(new t1(this, k, x3Var)).r0(u1.a);
    }

    public y3 m(int i2, x3 x3Var, eg9 eg9) {
        j j2 = ((k) eg9.b()).j();
        int i3 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo53add((ImmutableList.Builder) this.f.l(j2, ((Boolean) eg9.c()).booleanValue(), -1));
        ImmutableList build = builder.build();
        return z3.k(false, build.size(), i2, build, x3Var, MusicItem.a);
    }
}
