package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.playlist.formatlisttype.a;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.j;
import io.reactivex.s;

public class z4 extends f5 {
    private static final RootlistRequestPayload j;
    private final p e;
    private final m f;
    private final s<Boolean> g;
    private final a h;
    private final Optional<String> i;

    static {
        PlaylistUserDecorationPolicy.a builder = PlaylistUserDecorationPolicy.builder();
        builder.c(true);
        builder.d(true);
        builder.b(true);
        PlaylistUserDecorationPolicy a = builder.a();
        PlaylistUserDecorationPolicy.a builder2 = PlaylistUserDecorationPolicy.builder();
        builder2.c(true);
        builder2.d(true);
        PlaylistUserDecorationPolicy a2 = builder2.a();
        PlaylistMetadataDecorationPolicy.a builder3 = PlaylistMetadataDecorationPolicy.builder();
        builder3.i(true);
        builder3.g(true);
        builder3.a(true);
        builder3.m(true);
        builder3.j(true);
        builder3.e(true);
        builder3.k(true);
        builder3.l(a);
        builder3.o(true);
        builder3.d(true);
        builder3.b(true);
        builder3.h(a2);
        builder3.f(true);
        PlaylistMetadataDecorationPolicy c = builder3.c();
        FolderMetadataDecorationPolicy.a builder4 = FolderMetadataDecorationPolicy.builder();
        builder4.f(true);
        builder4.g(true);
        builder4.a(true);
        builder4.c(true);
        builder4.h(true);
        builder4.d(true);
        FolderMetadataDecorationPolicy b = builder4.b();
        RootlistRequestDecorationPolicy.a builder5 = RootlistRequestDecorationPolicy.builder();
        builder5.d(true);
        builder5.c(true);
        builder5.b(true);
        RootlistRequestDecorationPolicy a3 = builder5.a();
        RootlistRequestPayload.a builder6 = RootlistRequestPayload.builder();
        FolderRequestPolicy.a builder7 = FolderRequestPolicy.builder();
        builder7.d(a3);
        builder7.b(b);
        builder7.c(c);
        builder6.b(builder7.a());
        j = builder6.a();
    }

    public z4(String str, e1 e1Var, p pVar, m mVar, s<Boolean> sVar, a aVar) {
        super(e1Var);
        this.i = Optional.fromNullable(str);
        this.e = pVar;
        this.f = mVar;
        this.g = sVar;
        this.h = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.f5
    public s<y3> l(x3 x3Var) {
        int k = x3Var.k();
        String e2 = x3Var.c().e();
        boolean booleanValue = ((Boolean) MoreObjects.firstNonNull(x3Var.c().b().get("available_offline_only"), Boolean.FALSE)).booleanValue();
        p.a.C0375a b = p.a.b();
        b.f(new qxd(k, k()));
        b.h(e2);
        b.c(!MoreObjects.isNullOrEmpty(e2));
        b.a(booleanValue ? Boolean.TRUE : null);
        ane c = x3Var.c().c();
        if (x3Var.g()) {
            c = new ane(p.a.c.f.c(), true, c);
        }
        b.g(c);
        b.e(j);
        return s.n(this.e.d(this.i, b.b()), this.g, e3.a).j0(new k2(this, k, x3Var));
    }

    public y3 m(int i2, x3 x3Var, eg9 eg9) {
        f fVar = (f) eg9.b();
        Boolean bool = (Boolean) eg9.c();
        int i3 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i4 = i2;
        int i5 = 0;
        for (j jVar : fVar.getItems()) {
            if (jVar.s()) {
                f e2 = jVar.e();
                if (e2 != null) {
                    builder.mo53add((ImmutableList.Builder) this.f.k(e2, i4));
                    i4++;
                }
            } else {
                String g2 = jVar.g();
                if (!(this.h.a(g2) == FormatListType.p || this.h.a(g2) == FormatListType.q)) {
                    builder.mo53add((ImmutableList.Builder) this.f.l(jVar, bool.booleanValue(), i4));
                    i4++;
                }
            }
            i5++;
            i4++;
        }
        return z3.k(fVar.isLoading(), fVar.getUnrangedLength() - i5, i2, builder.build(), x3Var, MusicItem.a);
    }
}
