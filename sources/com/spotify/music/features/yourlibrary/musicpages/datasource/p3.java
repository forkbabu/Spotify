package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.collection.endpoints.artist.policy.ListPolicy;
import com.spotify.collection.endpoints.artist.policy.Policy;
import com.spotify.music.features.yourlibrary.musicpages.datasource.s3;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.i;
import io.reactivex.s;

public class p3 extends f5 {
    private static final Policy h;
    private final a e;
    private final z9a f;
    private final m g;

    public static abstract class a {
        public static final a a;

        /* renamed from: com.spotify.music.features.yourlibrary.musicpages.datasource.p3$a$a  reason: collision with other inner class name */
        public static abstract class AbstractC0261a {
            public abstract AbstractC0261a a(boolean z);

            public abstract a b();

            public abstract AbstractC0261a c(boolean z);

            public abstract AbstractC0261a d(boolean z);

            public abstract AbstractC0261a e(Optional<SortOrder> optional);
        }

        static {
            s3.b bVar = new s3.b();
            bVar.c(true);
            bVar.d(false);
            bVar.a(false);
            bVar.e(Optional.absent());
            a = bVar.b();
        }

        public abstract boolean a();

        public abstract boolean b();

        public abstract boolean c();

        public abstract Optional<SortOrder> d();

        public abstract AbstractC0261a e();
    }

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("addTime", bool);
        builder.mo51put("link", bool);
        builder.mo51put("collectionLink", bool);
        builder.mo51put("name", bool);
        builder.mo51put("portraits", bool);
        builder.mo51put("isFollowed", bool);
        builder.mo51put("isBanned", bool);
        builder.mo51put("numTracksInCollection", bool);
        builder.mo51put("groupLabel", bool);
        h = new Policy(new com.spotify.collection.endpoints.artist.policy.a(new ListPolicy(builder.build(), ImmutableMap.of(), ImmutableMap.of(), ImmutableMap.of())));
    }

    public p3(a aVar, e1 e1Var, z9a z9a, m mVar) {
        super(e1Var);
        this.e = aVar;
        this.f = z9a;
        this.g = mVar;
        boolean z = true;
        if (aVar.b() && !aVar.c()) {
            z9a.b().d(true);
        }
        if ((aVar.b() || !aVar.c()) ? false : z) {
            z9a.b().d(false);
        }
        z9a.b().f(new ane("name", false, null, 6));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.f5
    public s<y3> l(x3 x3Var) {
        ane ane;
        int k = x3Var.k();
        this.f.b().e(Integer.valueOf(k), Integer.valueOf(k()));
        this.f.b().g(x3Var.c().e());
        Boolean bool = x3Var.c().b().get("available_offline_only");
        Boolean bool2 = Boolean.FALSE;
        this.f.b().c(false, ((Boolean) MoreObjects.firstNonNull(bool, bool2)).booleanValue(), false);
        if (this.e.d().isPresent()) {
            SortOrder sortOrder = this.e.d().get();
            if (sortOrder.ordinal() == 4) {
                ane = new ane("recentlyPlayedRank", false, new ane("addTime", false, null, 6));
            } else {
                throw new AssertionError("Sort order not supported: " + sortOrder);
            }
        } else {
            ane = x3Var.c().c();
        }
        if (ane != null) {
            this.f.b().f(ane);
        }
        boolean booleanValue = ((Boolean) MoreObjects.firstNonNull(x3Var.f(), bool2)).booleanValue();
        boolean a2 = this.e.a();
        z9a z9a = this.f;
        Policy policy = h;
        z9a.getClass();
        return s.B(new g9a(z9a, policy)).j0(new f0(this, k, booleanValue, a2, x3Var));
    }

    public y3 m(int i, boolean z, boolean z2, x3 x3Var, i iVar) {
        b[] bVarArr = (b[]) iVar.getItems().toArray(new b[0]);
        int i2 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i3 = 0; i3 < bVarArr.length; i3++) {
            builder.mo53add((ImmutableList.Builder) this.g.j(bVarArr[i3], i + i3, z, z2));
        }
        return z3.k(iVar.isLoading(), iVar.getUnrangedLength(), i, builder.build(), x3Var, MusicItem.a);
    }
}
