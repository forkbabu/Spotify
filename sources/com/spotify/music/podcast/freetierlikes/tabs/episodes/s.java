package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.google.common.base.Optional;
import com.spotify.music.podcast.freetierlikes.tabs.episodes.i;
import com.spotify.music.podcast.freetierlikes.tabs.l;
import com.spotify.playlist.models.Episode;
import com.spotify.podcast.endpoints.collection.i;
import com.spotify.podcast.endpoints.r;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.g0;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class s implements vjc {
    private final i0 a;
    private final i b;
    private final i.a c;
    private final z d;
    private final d0 e;
    private final txc f;
    private final l g;
    private final String h;
    private final pnc i;
    private final y j;

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements io.reactivex.functions.l<com.spotify.playlist.models.i<Episode>, i> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i apply(com.spotify.playlist.models.i<Episode> iVar) {
            com.spotify.playlist.models.i<Episode> iVar2 = iVar;
            h.e(iVar2, "it");
            return new i.b(iVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements io.reactivex.functions.l<Throwable, i> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i apply(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "t");
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            return new i.a(message);
        }
    }

    public s(i0 i0Var, com.spotify.podcast.endpoints.collection.i iVar, i.a aVar, z zVar, d0 d0Var, txc txc, l lVar, String str, pnc pnc, y yVar) {
        h.e(i0Var, "unfinishedEpisodesSource");
        h.e(iVar, "unionCollectionEpisodesEndpoint");
        h.e(aVar, "unionCollectionConfiguration");
        h.e(zVar, "filterEpisodesStrategy");
        h.e(d0Var, "replaceEpisodeHeadersStrategy");
        h.e(txc, "productState");
        h.e(lVar, "yourEpisodesCountDataSource");
        h.e(str, "username");
        h.e(pnc, "playerStateProvider");
        h.e(yVar, "computationScheduler");
        this.a = i0Var;
        this.b = iVar;
        this.c = aVar;
        this.d = zVar;
        this.e = d0Var;
        this.f = txc;
        this.g = lVar;
        this.h = str;
        this.i = pnc;
        this.j = yVar;
    }

    private final z<i> e() {
        z<R> E = this.a.a().A(a.a).E(b.a);
        h.d(E, "unfinishedEpisodesSource…age ?: \"Unknown Error\") }");
        return E;
    }

    @Override // defpackage.vjc
    public z<wjc> a(int i2, int i3) {
        z<i> e2 = e();
        i.a aVar = this.c;
        Optional<r> a2 = r.a(i2, i3);
        h.d(a2, "Range.create(start, end)");
        z<R> E = this.b.a(this.h, i.a.a(aVar, null, null, null, a2, null, null, null, null, null, null, 1015)).A(new a(0, this)).A(new a(1, this)).A(q.a).E(r.a);
        h.d(E, "unionCollectionEpisodesE…age ?: \"Unknown Error\") }");
        z s = z.R(e2, E, new m(this)).s(n.a);
        h.d(s, "getUnfinishedEpisodeTabR…          }\n            }");
        z S = z.S(Functions.n(l.a), s, this.f.b().T(), this.g.a().R(0));
        h.d(S, "Single.zip(\n            …eateDataModel()\n        )");
        return sjc.b(S, this.i.a(this.j));
    }

    @Override // defpackage.vjc
    public io.reactivex.s<wjc> b(int i2, int i3) {
        i.a aVar = this.c;
        Optional<r> a2 = r.a(i2, i3);
        h.d(a2, "Range.create(start, end)");
        i.a a3 = i.a.a(aVar, null, null, null, a2, null, null, null, null, null, null, 1015);
        io.reactivex.s<i> P = e().P();
        g0 g0Var = new g0(this.b.b(this.h, a3).j0(new b(0, this)).j0(new b(1, this)).j0(o.a), p.a);
        h.d(g0Var, "unionCollectionEpisodesE…age ?: \"Unknown Error\") }");
        io.reactivex.s W = io.reactivex.s.n(P, g0Var, new m(this)).W(j.a, false, Integer.MAX_VALUE);
        h.d(W, "combineEpisodeItemsSources(configuration)");
        io.reactivex.s m = io.reactivex.s.m(W, this.f.b(), this.g.a(), l.a);
        h.d(m, "Observable.combineLatest…eateDataModel()\n        )");
        io.reactivex.s<wjc> a4 = sjc.a(m, this.i.a(this.j));
        h.d(a4, "Observable.combineLatest…te(computationScheduler))");
        return a4;
    }
}
