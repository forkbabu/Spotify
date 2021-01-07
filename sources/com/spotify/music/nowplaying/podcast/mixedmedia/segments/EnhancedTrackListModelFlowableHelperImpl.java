package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.UtilsKt;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.g;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class EnhancedTrackListModelFlowableHelperImpl implements a, com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a {
    private final g<f> a;
    private final g<com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a> b;
    private final i c;
    private final /* synthetic */ com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a d;

    static final class a<T> implements n<a.b> {
        final /* synthetic */ EnhancedTrackListModelFlowableHelperImpl a;

        a(EnhancedTrackListModelFlowableHelperImpl enhancedTrackListModelFlowableHelperImpl) {
            this.a = enhancedTrackListModelFlowableHelperImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(a.b bVar) {
            h.e(bVar, "it");
            return this.a.c.d() == null;
        }
    }

    static final class b<T, R> implements l<a.b, f> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public f apply(a.b bVar) {
            a.b bVar2 = bVar;
            h.e(bVar2, "it");
            return bVar2.b().c();
        }
    }

    public EnhancedTrackListModelFlowableHelperImpl(com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a aVar, e eVar, i iVar) {
        h.e(aVar, "timeLineFlowables");
        h.e(eVar, "trackListStateFlowableHelper");
        h.e(iVar, "positionSate");
        this.d = aVar;
        this.c = iVar;
        g<R> O = c(false).C(new a(this)).O(b.a);
        h.d(O, "timeLinePositionContextF…Context.timeLineSegment }");
        this.a = O;
        this.b = UtilsKt.b(eVar.a(), O, EnhancedTrackListModelFlowableHelperImpl$flowable$1.a).s().Z();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.segments.a
    public g<com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a> a() {
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
