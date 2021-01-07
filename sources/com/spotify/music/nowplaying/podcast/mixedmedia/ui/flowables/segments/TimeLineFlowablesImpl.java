package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.UtilsKt;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.g;
import io.reactivex.y;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class TimeLineFlowablesImpl implements com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a {
    private final g<List<f>> a;
    private final g<a.b> b;
    private final g<a.b> c;
    private final g<a.b> d;
    private final g<a.C0316a> e;
    private final i f;
    private final y g;

    /* compiled from: java-style lambda group */
    static final class a<T> implements io.reactivex.functions.g<a.b> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public final void accept(a.b bVar) {
            int i = this.a;
            if (i == 0) {
                ((TimeLineFlowablesImpl) this.b).f.i(Long.valueOf((long) bVar.b().a().a()));
            } else if (i == 1) {
                a.b bVar2 = bVar;
                ((TimeLineFlowablesImpl) this.b).f.f(bVar2.a().d());
                ((TimeLineFlowablesImpl) this.b).f.g(bVar2.b().a());
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements n<Optional<O>> {
        public static final b a = new b();

        b() {
        }

        @Override // io.reactivex.functions.n
        public boolean test(Object obj) {
            Optional optional = (Optional) obj;
            h.e(optional, "it");
            return optional.isPresent();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements l<Optional<O>, O> {
        public static final c a = new c();

        c() {
        }

        @Override // io.reactivex.functions.l
        public Object apply(Object obj) {
            Optional optional = (Optional) obj;
            h.e(optional, "it");
            return optional.get();
        }
    }

    static final class d<T, R> implements l<a.C0316a, List<? extends f>> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public List<? extends f> apply(a.C0316a aVar) {
            a.C0316a aVar2 = aVar;
            h.e(aVar2, "it");
            return aVar2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements n<a.b> {
        final /* synthetic */ boolean a;

        e(boolean z) {
            this.a = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(a.b bVar) {
            a.b bVar2 = bVar;
            h.e(bVar2, "it");
            return this.a || !bVar2.b().a().c();
        }
    }

    public TimeLineFlowablesImpl(i iVar, n1c n1c, com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.a aVar, a aVar2, f fVar, y yVar) {
        h.e(iVar, "positionState");
        h.e(n1c, "timeLineDragHelper");
        h.e(aVar, "playbackPositionHelper");
        h.e(aVar2, "timeLineContextFlowableHelper");
        h.e(fVar, "positionMapper");
        h.e(yVar, "mainThread");
        this.f = iVar;
        this.g = yVar;
        g<R> Z = aVar2.a().O(d.a).Z();
        this.a = Z;
        h.d(Z, "segmentFlowable");
        g a2 = UtilsKt.a(Z, n1c.b());
        h.d(a2, "segmentFlowable.combineL…lper.rawPositionFlowable)");
        g<a.b> A = e(a2, new TimeLineFlowablesImpl$physicalPositionFlowable$1(fVar)).A(new a(0, this));
        this.b = A;
        h.d(Z, "segmentFlowable");
        g a3 = UtilsKt.a(Z, aVar.a());
        h.d(a3, "segmentFlowable.combineL…kPositionHelper.flowable)");
        g<a.b> e2 = e(a3, new TimeLineFlowablesImpl$playbackPositionFlowable$1(fVar));
        this.c = e2;
        g<a.b> Z2 = g.P(e2, A).A(new a(1, this)).e0(yVar).Q(yVar).Z();
        h.c(Z2);
        this.d = Z2;
        g<a.C0316a> Z3 = aVar2.a().e0(yVar).Q(yVar).Z();
        h.c(Z3);
        this.e = Z3;
    }

    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: io.reactivex.g<R>, java.lang.Object, io.reactivex.g<O> */
    private final <I, O> g<O> e(g<I> gVar, nmf<? super I, ? extends Optional<O>> nmf) {
        g gVar2 = (g<R>) gVar.O(new d(new TimeLineFlowablesImpl$mapOptional$1(nmf))).C(b.a).O(c.a);
        h.d(gVar2, "map(mapper::invoke)\n    …        .map { it.get() }");
        return gVar2;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<a.C0316a> b() {
        return this.e;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<a.b> c(boolean z) {
        return this.d.C(new e(z)).Z();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<Pair<a.C0316a, a.b>> f(boolean z) {
        g<a.C0316a> gVar = this.e;
        g<a.b> c2 = c(z);
        h.d(c2, "timeLinePositionContextFlowable(interpolate)");
        return UtilsKt.a(gVar, c2).Z();
    }
}
