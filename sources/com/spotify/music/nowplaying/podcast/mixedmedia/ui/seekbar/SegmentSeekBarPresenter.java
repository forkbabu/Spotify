package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.d;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a;
import com.spotify.rxjava2.q;
import defpackage.k1c;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class SegmentSeekBarPresenter implements d.a, a {
    private d a;
    private final q b = new q();
    private final k1c.a c;
    private final y d;
    private final /* synthetic */ a e;

    public SegmentSeekBarPresenter(k1c.a aVar, y yVar, a aVar2) {
        h.e(aVar, "seekBarTimeStampHelperFactory");
        h.e(yVar, "mainThread");
        h.e(aVar2, "flowables");
        this.e = aVar2;
        this.c = aVar;
        this.d = yVar;
    }

    public void a(d dVar) {
        h.e(dVar, "viewBinder");
        this.a = dVar;
        ((SegmentedSeekBar) dVar).b(this, this.c);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<a.C0316a> b() {
        return this.e.b();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<a.b> c(boolean z) {
        return this.e.c(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.a
    public g<Pair<a.C0316a, a.b>> f(boolean z) {
        return this.e.f(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b] */
    /* JADX WARNING: Unknown variable types count: 5 */
    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.d.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart() {
        /*
            r5 = this;
            io.reactivex.g r0 = r5.b()
            kotlin.reflect.g r1 = com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$1.a
            if (r1 == 0) goto L_0x000e
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b r2 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b
            r2.<init>(r1)
            r1 = r2
        L_0x000e:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.g r0 = r0.O(r1)
            kotlin.reflect.g r1 = com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$2.a
            if (r1 == 0) goto L_0x001e
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b r2 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b
            r2.<init>(r1)
            r1 = r2
        L_0x001e:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.g r0 = r0.O(r1)
            io.reactivex.y r1 = r5.d
            io.reactivex.g r0 = r0.Q(r1)
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$3 r1 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$3
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.d r2 = r5.a
            r3 = 0
            java.lang.String r4 = "viewBinder"
            if (r2 == 0) goto L_0x009b
            r1.<init>(r2)
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.a r2 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.a
            r2.<init>(r1)
            io.reactivex.disposables.b r0 = r0.subscribe(r2)
            com.spotify.rxjava2.q r1 = r5.b
            r1.a(r0)
            r0 = 1
            io.reactivex.g r0 = r5.c(r0)
            kotlin.reflect.g r1 = com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$5.a
            if (r1 == 0) goto L_0x0053
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b r2 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b
            r2.<init>(r1)
            r1 = r2
        L_0x0053:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.g r0 = r0.O(r1)
            kotlin.reflect.g r1 = com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$6.a
            if (r1 == 0) goto L_0x0063
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b r2 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b
            r2.<init>(r1)
            r1 = r2
        L_0x0063:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.g r0 = r0.O(r1)
            kotlin.reflect.g r1 = com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$7.a
            if (r1 == 0) goto L_0x0073
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b r2 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.b
            r2.<init>(r1)
            r1 = r2
        L_0x0073:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.g r0 = r0.O(r1)
            io.reactivex.y r1 = r5.d
            io.reactivex.g r0 = r0.Q(r1)
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$8 r1 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter$onStart$8
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.d r2 = r5.a
            if (r2 == 0) goto L_0x0097
            r1.<init>(r2)
            com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.a r2 = new com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.a
            r2.<init>(r1)
            io.reactivex.disposables.b r0 = r0.subscribe(r2)
            com.spotify.rxjava2.q r1 = r5.b
            r1.a(r0)
            return
        L_0x0097:
            kotlin.jvm.internal.h.k(r4)
            throw r3
        L_0x009b:
            kotlin.jvm.internal.h.k(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter.onStart():void");
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.d.a
    public void onStop() {
        this.b.c();
    }
}
