package com.spotify.music.features.yourepisodes.interactor;

import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.playlist.models.Episode;
import io.reactivex.functions.c;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final ih0 a;
    private final txc b;

    static final class a<T, R> implements l<Map<String, ? extends String>, Boolean> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Map<String, ? extends String> map) {
            Map<String, ? extends String> map2 = map;
            h.e(map2, "it");
            return Boolean.valueOf(uxc.c(map2));
        }
    }

    static final class b<T1, T2, R> implements c<com.spotify.collection.endpoints.listenlater.models.a, Boolean, c> {
        final /* synthetic */ e a;
        final /* synthetic */ gh0 b;

        b(e eVar, gh0 gh0) {
            this.a = eVar;
            this.b = gh0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.reactivex.functions.c
        public c a(com.spotify.collection.endpoints.listenlater.models.a aVar, Boolean bool) {
            DownloadState downloadState;
            com.spotify.collection.endpoints.listenlater.models.a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            h.e(aVar2, "episodeList");
            e eVar = this.a;
            gh0 gh0 = this.b;
            eVar.getClass();
            List<Episode> a2 = aVar2.a();
            ArrayList arrayList = new ArrayList(d.e(a2, 10));
            for (T t : a2) {
                arrayList.add(new com.spotify.music.features.yourepisodes.domain.a(t, booleanValue || !t.g()));
            }
            int d = aVar2.d();
            jnf e = knf.e(gh0.b(), aVar2.a().size() + gh0.b());
            String c = aVar2.c();
            Integer b2 = aVar2.b();
            if (c != null) {
                switch (c.hashCode()) {
                    case -1211129254:
                        if (c.equals("downloading")) {
                            downloadState = new DownloadState.Downloading(b2 != null ? Float.valueOf((float) b2.intValue()) : null);
                            break;
                        }
                        break;
                    case 3521:
                        if (c.equals("no")) {
                            downloadState = DownloadState.Downloadable.INSTANCE;
                            break;
                        }
                        break;
                    case 119527:
                        if (c.equals("yes")) {
                            downloadState = DownloadState.Downloaded.INSTANCE;
                            break;
                        }
                        break;
                    case 111293437:
                        if (c.equals("waitingSyncNotAllowed")) {
                            downloadState = DownloadState.Error.INSTANCE;
                            break;
                        }
                        break;
                    case 119284121:
                        if (c.equals("waitingOfflineMode")) {
                            downloadState = DownloadState.Error.INSTANCE;
                            break;
                        }
                        break;
                    case 1116313165:
                        if (c.equals("waiting")) {
                            downloadState = DownloadState.Pending.INSTANCE;
                            break;
                        }
                        break;
                    case 1881262700:
                        if (c.equals("waitingNoConnection")) {
                            downloadState = DownloadState.Error.INSTANCE;
                            break;
                        }
                        break;
                }
                return new c(arrayList, d, e, downloadState);
            }
            downloadState = DownloadState.None.INSTANCE;
            return new c(arrayList, d, e, downloadState);
        }
    }

    public e(ih0 ih0, txc txc) {
        h.e(ih0, "listenLaterEndpoint");
        h.e(txc, "productState");
        this.a = ih0;
        this.b = txc;
    }

    @Override // com.spotify.music.features.yourepisodes.interactor.d
    public s<c> a(gh0 gh0) {
        h.e(gh0, "range");
        s<c> n = s.n(this.a.d(new jh0(500, null)), this.b.b().j0(a.a).E(), new b(this, gh0));
        h.d(n, "Observable.combineLatest…)\n            }\n        )");
        return n;
    }
}
