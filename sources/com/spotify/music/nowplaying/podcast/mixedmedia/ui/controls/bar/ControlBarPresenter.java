package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.segments.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class ControlBarPresenter implements ControlBarViewBinder.a, com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a {
    private final q a = new q();
    private boolean b = true;
    private final List<f> c = new ArrayList();
    private com.spotify.music.nowplaying.podcast.mixedmedia.model.a d;
    private a.c e;
    private ControlBarViewBinder f;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a g;
    private final y h;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.player.a i;
    private final a1c j;

    static final class a<T> implements n<a.b> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(a.b bVar) {
            a.b bVar2 = bVar;
            h.e(bVar2, "it");
            return !bVar2.c();
        }
    }

    static final class b<T, R> implements l<a.b, ControlBarViewBinder.Mode> {
        final /* synthetic */ ControlBarPresenter a;

        b(ControlBarPresenter controlBarPresenter) {
            this.a = controlBarPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ControlBarViewBinder.Mode apply(a.b bVar) {
            a.b bVar2 = bVar;
            h.e(bVar2, "it");
            a.c b = bVar2.b();
            this.a.e = b;
            this.a.getClass();
            if (b.c().b().i().ordinal() != 1) {
                return ControlBarViewBinder.Mode.TALK;
            }
            return ControlBarViewBinder.Mode.MUSIC;
        }
    }

    static final class c<T> implements g<ControlBarViewBinder.Mode> {
        final /* synthetic */ ControlBarPresenter a;
        final /* synthetic */ ControlBarViewBinder b;

        c(ControlBarPresenter controlBarPresenter, ControlBarViewBinder controlBarViewBinder) {
            this.a = controlBarPresenter;
            this.b = controlBarViewBinder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(ControlBarViewBinder.Mode mode) {
            ControlBarViewBinder.Mode mode2 = mode;
            ControlBarViewBinder controlBarViewBinder = this.b;
            h.d(mode2, "mode");
            controlBarViewBinder.b(mode2, this.a.b);
            this.a.b = false;
        }
    }

    static final class d<T> implements g<a.C0316a> {
        final /* synthetic */ ControlBarPresenter a;

        d(ControlBarPresenter controlBarPresenter) {
            this.a = controlBarPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(a.C0316a aVar) {
            a.C0316a aVar2 = aVar;
            this.a.c.clear();
            this.a.c.addAll(aVar2.a());
            this.a.d = aVar2.c().c();
        }
    }

    public ControlBarPresenter(com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a aVar, y yVar, com.spotify.music.nowplaying.podcast.mixedmedia.player.a aVar2, a1c a1c) {
        h.e(aVar, "flowables");
        h.e(yVar, "mainThread");
        h.e(aVar2, "playerHelper");
        h.e(a1c, "mainControlsLogger");
        this.g = aVar;
        this.h = yVar;
        this.i = aVar2;
        this.j = a1c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder.Mode r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarPresenter.a(com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder$Mode, boolean):void");
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public io.reactivex.g<a.C0316a> b() {
        return this.g.b();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public io.reactivex.g<a.b> c(boolean z) {
        return this.g.c(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder.a
    public void e(ControlBarViewBinder controlBarViewBinder) {
        h.e(controlBarViewBinder, "controlBarViewBinder");
        this.f = controlBarViewBinder;
        this.a.a(c(false).C(a.a).O(new b(this)).s().Q(this.h).subscribe(new c(this, controlBarViewBinder)));
        this.a.a(b().subscribe(new d(this)));
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public io.reactivex.g<Pair<a.C0316a, a.b>> f(boolean z) {
        return this.g.f(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder.a
    public void stop() {
        this.b = true;
        this.a.c();
    }
}
