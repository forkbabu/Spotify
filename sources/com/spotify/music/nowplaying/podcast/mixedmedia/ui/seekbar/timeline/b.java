package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.d;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.f;
import com.spotify.rxjava2.q;
import defpackage.j1c;
import io.reactivex.d0;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.y;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class b implements e.a, a {
    private final q a = new q();
    private e b;
    private com.spotify.music.nowplaying.podcast.mixedmedia.model.a c;
    private final y d;
    private final i e;
    private final n1c f;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.player.a g;
    private final d h;
    private final f i;
    private final b1c j;
    private final /* synthetic */ a k;

    static final class a<T> implements g<Pair<? extends a.C0316a, ? extends a.b>> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(Pair<? extends a.C0316a, ? extends a.b> pair) {
            Pair<? extends a.C0316a, ? extends a.b> pair2 = pair;
            this.a.c = ((a.C0316a) pair2.c()).c().c();
            b.h(this.a).setTimeLineFullContext(pair2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.b$b  reason: collision with other inner class name */
    public static final class C0317b<T, R> implements l<j1c.b.C0628b, d0<? extends zwd>> {
        final /* synthetic */ b a;

        C0317b(b bVar) {
            this.a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends zwd> apply(j1c.b.C0628b bVar) {
            j1c.b.C0628b bVar2 = bVar;
            h.e(bVar2, "position");
            this.a.j.l(bVar2.a());
            return this.a.g.c(b.a(this.a), (long) bVar2.a()).D(new c(this, bVar2));
        }
    }

    public b(y yVar, i iVar, a aVar, n1c n1c, com.spotify.music.nowplaying.podcast.mixedmedia.player.a aVar2, d dVar, f fVar, b1c b1c) {
        h.e(yVar, "mainThread");
        h.e(iVar, "positionState");
        h.e(aVar, "flowables");
        h.e(n1c, "timeLineDragHelper");
        h.e(aVar2, "playerHelper");
        h.e(dVar, "currentTrackPresenter");
        h.e(fVar, "trackListPresenter");
        h.e(b1c, "playbackLogger");
        this.k = aVar;
        this.d = yVar;
        this.e = iVar;
        this.f = n1c;
        this.g = aVar2;
        this.h = dVar;
        this.i = fVar;
        this.j = b1c;
    }

    public static final /* synthetic */ com.spotify.music.nowplaying.podcast.mixedmedia.model.a a(b bVar) {
        com.spotify.music.nowplaying.podcast.mixedmedia.model.a aVar = bVar.c;
        if (aVar != null) {
            return aVar;
        }
        h.k("episodeUri");
        throw null;
    }

    public static final /* synthetic */ e h(b bVar) {
        e eVar = bVar.b;
        if (eVar != null) {
            return eVar;
        }
        h.k("viewBinder");
        throw null;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public io.reactivex.g<a.C0316a> b() {
        return this.k.b();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public io.reactivex.g<a.b> c(boolean z) {
        return this.k.c(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e.a
    public void d(e eVar) {
        h.e(eVar, "viewBinder");
        this.b = eVar;
        ((TimeLine) eVar).d(this, this.f);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public io.reactivex.g<Pair<a.C0316a, a.b>> f(boolean z) {
        return this.k.f(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e.a
    public void onStart() {
        this.e.e();
        this.h.start();
        this.i.start();
        this.a.a(f(true).Q(this.d).subscribe(new a(this)));
        this.a.a(this.f.a().J(new C0317b(this)).Q(this.d).subscribe());
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e.a
    public void onStop() {
        this.h.stop();
        this.i.stop();
        this.a.c();
    }
}
