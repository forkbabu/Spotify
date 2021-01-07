package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.music.libs.collection.model.d;
import com.spotify.playlist.models.a;
import io.reactivex.s;
import java.util.HashMap;

public class l3 extends f5 {
    private static final Policy h;
    public static final /* synthetic */ int i = 0;
    private final s9a e;
    private final m f;
    private final s<Boolean> g;

    static {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("addTime", bool);
        builder.mo51put("name", bool);
        builder.mo51put("link", bool);
        builder.mo51put("covers", bool);
        builder.mo51put("groupLabel", bool);
        decorationPolicy.setListAttributes(builder.build());
        HashMap hashMap = new HashMap();
        hashMap.put("name", bool);
        decorationPolicy.setArtistAttributes(hashMap);
        h = new Policy(decorationPolicy);
    }

    public l3(e1 e1Var, s9a s9a, m mVar, s<Boolean> sVar) {
        super(e1Var);
        this.e = s9a;
        this.f = mVar;
        this.g = sVar;
        s9a.a().h(new ane("name", false, null, 6));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.f5
    public s<y3> l(x3 x3Var) {
        int k = x3Var.k();
        this.e.a().f(Integer.valueOf(k), Integer.valueOf(k()));
        this.e.a().i(x3Var.c().e());
        this.e.a().d(false, ((Boolean) MoreObjects.firstNonNull(x3Var.c().b().get("available_offline_only"), Boolean.FALSE)).booleanValue(), false);
        ane c = x3Var.c().c();
        if (x3Var.g()) {
            this.e.a().h(new ane("availableOffline", true, c));
        } else if (c != null) {
            this.e.a().h(c);
        }
        return s.n(this.e.d(h).r0(t.a), this.g, j0.a).j0(new u(this, k, x3Var));
    }

    public y3 m(int i2, x3 x3Var, eg9 eg9) {
        d dVar = (d) eg9.b();
        boolean booleanValue = ((Boolean) eg9.c()).booleanValue();
        a[] aVarArr = (a[]) dVar.getItems().toArray(new a[0]);
        int i3 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            builder.mo53add((ImmutableList.Builder) this.f.i(aVarArr[i4], booleanValue, i2 + i4, false));
        }
        return z3.k(dVar.isLoading(), dVar.getUnrangedLength(), i2, builder.build(), x3Var, MusicItem.a);
    }
}
