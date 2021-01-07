package defpackage;

import com.spotify.collection.endpoints.listenlater.models.EpisodeUriList;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse;
import com.spotify.mobile.android.spotlets.show.proto.e;
import com.spotify.playlist.models.Episode;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: kh0  reason: default package */
public final class kh0 implements ih0 {
    private final hh0 a;

    /* renamed from: kh0$a */
    static final class a<T, R> implements l<ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse, com.spotify.collection.endpoints.listenlater.models.a> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public com.spotify.collection.endpoints.listenlater.models.a apply(ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse) {
            Integer num;
            ListenLaterCosmosResponse$ProtoListenLaterEpisodesResponse listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2 = listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse;
            h.e(listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2, "it");
            h.e(listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2, "from");
            int m = listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2.m();
            int n = listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2.n();
            List<? extends e> h = listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2.h();
            h.d(h, "episodeOrBuilderList");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = h.iterator();
            while (true) {
                num = null;
                EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                EpisodeMetadata$ProtoEpisodeMetadata k = next.d() ? next.k() : null;
                EpisodeState$ProtoEpisodeOfflineState b = next.e() ? next.b() : null;
                EpisodeState$ProtoEpisodePlayState g = next.c() ? next.g() : null;
                if (next.j()) {
                    episodeState$ProtoEpisodeCollectionState = next.f();
                }
                Episode b2 = tyd.b(k, b, g, episodeState$ProtoEpisodeCollectionState, null, next.getHeader());
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            String i = listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2.o() ? listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2.i() : null;
            if (listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2.p()) {
                num = Integer.valueOf(listenLaterCosmosResponse$ProtoListenLaterEpisodesResponse2.l());
            }
            return new com.spotify.collection.endpoints.listenlater.models.a(m, n, arrayList, i, num);
        }
    }

    public kh0(hh0 hh0) {
        h.e(hh0, "cosmosService");
        this.a = hh0;
    }

    @Override // defpackage.ih0
    public io.reactivex.a a() {
        z<Response> a2 = this.a.a();
        a2.getClass();
        i iVar = new i(a2);
        h.d(iVar, "cosmosService\n          …         .ignoreElement()");
        return iVar;
    }

    @Override // defpackage.ih0
    public io.reactivex.a b() {
        z<Response> b = this.a.b();
        b.getClass();
        i iVar = new i(b);
        h.d(iVar, "cosmosService\n          …         .ignoreElement()");
        return iVar;
    }

    @Override // defpackage.ih0
    public io.reactivex.a c(List<String> list) {
        h.e(list, "episodeList");
        z<Response> e = this.a.e(new EpisodeUriList(list));
        e.getClass();
        i iVar = new i(e);
        h.d(iVar, "cosmosService\n          …         .ignoreElement()");
        return iVar;
    }

    @Override // defpackage.ih0
    public s<com.spotify.collection.endpoints.listenlater.models.a> d(jh0 jh0) {
        h.e(jh0, "configuration");
        s<R> j0 = this.a.c(jh0.a()).j0(a.a);
        h.d(j0, "cosmosService\n          …tenLaterEpisodeList(it) }");
        return j0;
    }

    @Override // defpackage.ih0
    public io.reactivex.a e(List<String> list) {
        h.e(list, "episodeList");
        z<Response> d = this.a.d(new EpisodeUriList(list));
        d.getClass();
        i iVar = new i(d);
        h.d(iVar, "cosmosService\n          …         .ignoreElement()");
        return iVar;
    }
}
