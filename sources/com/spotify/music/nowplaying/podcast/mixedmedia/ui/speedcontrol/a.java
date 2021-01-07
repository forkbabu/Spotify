package com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol;

import com.spotify.music.nowplaying.podcast.mixedmedia.model.TrackListItemType;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.music.nowplaying.podcast.speedcontrol.e;
import com.spotify.music.nowplaying.podcast.speedcontrol.g;
import com.spotify.rxjava2.q;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

public final class a implements g.a, g {
    private final q a = new q();
    private final e b;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a c;

    /* renamed from: com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.a$a  reason: collision with other inner class name */
    static final class C0318a<T, R> implements l<a.b, TrackListItemType> {
        public static final C0318a a = new C0318a();

        C0318a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public TrackListItemType apply(a.b bVar) {
            a.b bVar2 = bVar;
            h.e(bVar2, "it");
            return bVar2.b().c().b().i();
        }
    }

    static final class b<T> implements io.reactivex.functions.g<TrackListItemType> {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(TrackListItemType trackListItemType) {
            this.a.setEnabled(trackListItemType != TrackListItemType.MUSIC);
        }
    }

    public a(e eVar, com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a aVar) {
        h.e(eVar, "speedControlButtonPresenter");
        h.e(aVar, "flowables");
        this.b = eVar;
        this.c = aVar;
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g.a
    public void a() {
        this.b.a();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.g
    public void b(c cVar) {
        h.e(cVar, "viewBinder");
        this.b.e(cVar);
        this.a.a(this.c.c(false).O(C0318a.a).s().subscribe(new b(cVar)));
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.g
    public void stop() {
        this.b.f();
        this.a.c();
    }
}
