package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.podcast.mixedmedia.model.TrackListItemType;
import com.spotify.music.nowplaying.podcast.mixedmedia.player.e;
import com.spotify.music.nowplaying.podcast.mixedmedia.player.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.UtilsKt;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class TrackListStateFlowableHelperImpl implements e, com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a {
    private final g<a> a;
    private final g<b> b;
    private final CollectionStateProvider c;
    private final /* synthetic */ com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a d;

    public static final class a {
        private final Map<String, CollectionStateProvider.a> a;
        private final a.C0316a b;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider$a> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<String, ? extends CollectionStateProvider.a> map, a.C0316a aVar) {
            h.e(map, "collectionStateMap");
            h.e(aVar, "timeLineContext");
            this.a = map;
            this.b = aVar;
        }

        public final Map<String, CollectionStateProvider.a> a() {
            return this.a;
        }

        public final a.C0316a b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b);
        }

        public int hashCode() {
            Map<String, CollectionStateProvider.a> map = this.a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            a.C0316a aVar = this.b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("CollectionStateAndTimeLineContext(collectionStateMap=");
            V0.append(this.a);
            V0.append(", timeLineContext=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b {
        private final a a;
        private final e b;

        public b(a aVar, e eVar) {
            h.e(aVar, "collectionStateAndTimeLineContext");
            h.e(eVar, "playerState");
            this.a = aVar;
            this.b = eVar;
        }

        public final a a() {
            return this.a;
        }

        public final e b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.a, bVar.a) && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            a aVar = this.a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            e eVar = this.b;
            if (eVar != null) {
                i = eVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TrackListState(collectionStateAndTimeLineContext=");
            V0.append(this.a);
            V0.append(", playerState=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    static final class c<T, R> implements l<a.C0316a, tpf<? extends a>> {
        final /* synthetic */ TrackListStateFlowableHelperImpl a;

        c(TrackListStateFlowableHelperImpl trackListStateFlowableHelperImpl) {
            this.a = trackListStateFlowableHelperImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.util.ArrayList */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.l
        public tpf<? extends a> apply(a.C0316a aVar) {
            a.C0316a aVar2 = aVar;
            h.e(aVar2, "context");
            CollectionStateProvider collectionStateProvider = this.a.c;
            String cVar = ViewUris.h0.toString();
            TrackListStateFlowableHelperImpl trackListStateFlowableHelperImpl = this.a;
            List<com.spotify.music.nowplaying.podcast.mixedmedia.model.b> d = aVar2.c().d();
            trackListStateFlowableHelperImpl.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = d.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.i() == TrackListItemType.MUSIC) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(d.e(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((com.spotify.music.nowplaying.podcast.mixedmedia.model.b) it2.next()).n());
            }
            Object[] array = arrayList2.toArray(new String[0]);
            if (array != null) {
                return collectionStateProvider.b(cVar, "", (String[]) array).Y0(BackpressureStrategy.LATEST).O(new f(aVar2));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public TrackListStateFlowableHelperImpl(com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a aVar, f fVar, CollectionStateProvider collectionStateProvider) {
        h.e(aVar, "timeLineFlowables");
        h.e(fVar, "trackListPlayerStateSource");
        h.e(collectionStateProvider, "collectionStateProvider");
        this.d = aVar;
        this.c = collectionStateProvider;
        g<R> F = b().F(new c(this));
        this.a = F;
        h.d(F, "collectionStateAndTimeLineContextFlowable");
        this.b = UtilsKt.b(F, fVar.a(), TrackListStateFlowableHelperImpl$flowable$1.a).Z();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.segments.e
    public g<b> a() {
        return this.b;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<a.C0316a> b() {
        return this.d.b();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<a.b> c(boolean z) {
        return this.d.c(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<Pair<a.C0316a, a.b>> f(boolean z) {
        return this.d.f(z);
    }
}
