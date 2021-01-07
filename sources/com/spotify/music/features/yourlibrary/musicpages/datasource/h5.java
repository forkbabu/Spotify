package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.models.o;
import io.reactivex.a;
import io.reactivex.s;

public class h5 extends f5 implements j5 {
    private static final Policy j;
    private final e1 e;
    private final faa f;
    private final m g;
    private final s<Boolean> h;
    private final String i;

    static {
        ListPolicy listPolicy = new ListPolicy();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put("previewId", bool);
        builder.mo51put("inCollection", bool);
        builder.mo51put("isBanned", bool);
        builder.mo51put("isExplicit", bool);
        builder.mo51put("is19PlusOnly", bool);
        builder.mo51put("playabilityRestriction", bool);
        builder.mo51put("playable", bool);
        builder.mo51put("offline", bool);
        builder.mo51put("isLocal", bool);
        builder.mo51put("groupLabel", bool);
        builder.mo51put("trackDescriptors", bool);
        listPolicy.setListAttributes(builder.build());
        listPolicy.setArtistsAttributes(ImmutableMap.of("name", bool));
        listPolicy.setAlbumAttributes(ImmutableMap.of("name", bool, "covers", bool));
        listPolicy.setAlbumArtistAttributes(ImmutableMap.of("link", bool));
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        j = new Policy(decorationPolicy);
    }

    public h5(e1 e1Var, faa faa, m mVar, s<Boolean> sVar, String str) {
        super(e1Var);
        this.e = e1Var;
        this.f = faa;
        this.g = mVar;
        this.h = sVar;
        faa.b().h(new ane("addTime", false, null, 6));
        this.i = str;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.j5
    public a a(boolean z) {
        return this.f.e(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.f5
    public s<y3> l(x3 x3Var) {
        boolean z;
        ane c = x3Var.c().c();
        if (c != null) {
            this.f.b().h(c);
        }
        this.f.b().f(Integer.valueOf(x3Var.k()), Integer.valueOf(x3Var.j()));
        this.f.b().c(x3Var.a());
        this.f.b().i(x3Var.c().e());
        if (this.e.g()) {
            this.f.b().e(ImmutableList.copyOf(Collections2.transform(Collections2.filter((Iterable) x3Var.c().b().entrySet(), (Predicate) j.a), g.a)));
            z = false;
        } else {
            z = ((Boolean) MoreObjects.firstNonNull(x3Var.c().b().get("available_offline_only"), Boolean.FALSE)).booleanValue();
        }
        this.f.b().d(false, z, false);
        faa faa = this.f;
        Policy policy = j;
        faa.getClass();
        return s.n(s.B(new k9a(faa, policy)), this.h, z2.a).j0(new y2(this, x3Var));
    }

    public y3 m(x3 x3Var, eg9 eg9) {
        ni0 ni0 = (ni0) eg9.b();
        boolean booleanValue = ((Boolean) eg9.c()).booleanValue();
        int k = x3Var.k();
        o[] oVarArr = (o[]) ni0.getItems().toArray(new o[0]);
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i3 = 0; i3 < oVarArr.length; i3++) {
            o oVar = oVarArr[i3];
            builder.mo53add((ImmutableList.Builder) this.g.m(oVar, this.i, booleanValue, true, false, k + i3));
        }
        return z3.k(ni0.isLoading(), ni0.getUnrangedLength(), k, builder.build(), x3Var, MusicItem.a);
    }
}
