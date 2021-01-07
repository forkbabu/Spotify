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
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.k;
import io.reactivex.s;

public class c5 extends f5 {
    private static final Policy i;
    public static final /* synthetic */ int j = 0;
    private final d e;
    private final m f;
    private final s<Boolean> g;
    private final String h;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("picture", bool);
        builder.mo51put("offline", bool);
        builder.mo51put("name", bool);
        builder.mo51put("formatListAttributes", bool);
        builder.mo51put("formatListType", bool);
        builder.mo51put("link", bool);
        builder.mo51put("totalLength", bool);
        ImmutableMap build = builder.build();
        HeaderPolicy.a builder2 = HeaderPolicy.builder();
        builder2.a(build);
        HeaderPolicy b = builder2.b();
        DecorationPolicy.a builder3 = DecorationPolicy.builder();
        builder3.b(b);
        DecorationPolicy a = builder3.a();
        Policy.a builder4 = Policy.builder();
        builder4.b(a);
        i = builder4.a();
    }

    public c5(e1 e1Var, d dVar, m mVar, s<Boolean> sVar, String str) {
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
        return s.n(this.e.d(this.h, b.b()).P(), this.g, h.a).j0(new l2(this, k, x3Var)).r0(m2.a);
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
