package com.spotify.mobile.android.audioplayer;

import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.y;
import com.spotify.mobile.android.audioplayer.domain.a;
import com.spotify.mobile.android.audioplayer.domain.d;
import com.spotify.mobile.android.audioplayer.domain.f;
import com.spotify.mobile.android.audioplayer.domain.g;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;
import kotlin.jvm.internal.h;

public final class MobiusAudioPlayer implements m, t31 {
    private final c<g> a;
    private f b;
    private MobiusLoop<f, d, com.spotify.mobile.android.audioplayer.domain.c> c;
    private final cqe f;
    private final y n;
    private final w o;
    private final a p;

    public MobiusAudioPlayer(cqe cqe, y yVar, w wVar, a aVar, Lifecycle lifecycle) {
        h.e(cqe, "clock");
        h.e(yVar, "exoPlayer");
        h.e(wVar, "mediaSourceFactory");
        h.e(aVar, "audioFocusHandler");
        h.e(lifecycle, "lifecycle");
        this.f = cqe;
        this.n = yVar;
        this.o = wVar;
        this.p = aVar;
        PublishSubject h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        this.a = h1;
        lifecycle.a(this);
    }

    @Override // defpackage.t31
    public void a(Uri uri) {
        h.e(uri, "previewUri");
        this.a.onNext(new g.c(uri));
    }

    @Override // defpackage.t31
    public void b() {
        this.a.onNext(g.e.a);
    }

    @Override // defpackage.t31
    public void c() {
        this.a.onNext(g.a.a);
    }

    @androidx.lifecycle.w(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        this.n.d();
    }

    @Override // defpackage.t31
    public void pause() {
        this.a.onNext(g.b.a);
    }

    @Override // defpackage.t31
    public void resume() {
        this.a.onNext(g.d.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.spotify.mobile.android.audioplayer.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.lifecycle.w(androidx.lifecycle.Lifecycle.Event.ON_START)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r13 = this;
            com.spotify.mobile.android.audioplayer.MobiusAudioPlayer$start$1 r0 = com.spotify.mobile.android.audioplayer.MobiusAudioPlayer$start$1.a
            if (r0 == 0) goto L_0x000a
            com.spotify.mobile.android.audioplayer.a r1 = new com.spotify.mobile.android.audioplayer.a
            r1.<init>(r0)
            r0 = r1
        L_0x000a:
            com.spotify.mobius.g0 r0 = (com.spotify.mobius.g0) r0
            com.google.android.exoplayer2.y r1 = r13.n
            com.google.android.exoplayer2.source.w r2 = r13.o
            com.spotify.mobile.android.audioplayer.MobiusAudioPlayer$start$2 r3 = new com.spotify.mobile.android.audioplayer.MobiusAudioPlayer$start$2
            r3.<init>(r13)
            com.spotify.mobile.android.audioplayer.MobiusAudioPlayer$start$3 r4 = new com.spotify.mobile.android.audioplayer.MobiusAudioPlayer$start$3
            r4.<init>(r13)
            io.reactivex.w r1 = defpackage.b41.a(r1, r2, r3, r4)
            com.spotify.mobius.MobiusLoop$f r0 = com.spotify.mobius.rx2.i.c(r0, r1)
            com.google.android.exoplayer2.y r1 = r13.n
            cqe r2 = r13.f
            io.reactivex.subjects.c<com.spotify.mobile.android.audioplayer.domain.g> r3 = r13.a
            com.spotify.mobile.android.audioplayer.domain.a r4 = r13.p
            io.reactivex.s r4 = r4.c()
            com.spotify.mobius.q r1 = defpackage.f41.a(r1, r2, r3, r4)
            com.spotify.mobius.MobiusLoop$f r0 = r0.h(r1)
            com.spotify.mobius.android.e r1 = new com.spotify.mobius.android.e
            java.lang.String r2 = "AudioPlayer"
            r1.<init>(r2)
            com.spotify.mobius.MobiusLoop$f r0 = r0.f(r1)
            com.spotify.mobile.android.audioplayer.domain.f r1 = r13.b
            if (r1 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            com.spotify.mobile.android.audioplayer.domain.f r1 = new com.spotify.mobile.android.audioplayer.domain.f
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 63
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r8, r10, r12)
        L_0x0057:
            r2 = 0
            com.spotify.mobile.android.audioplayer.domain.c[] r2 = new com.spotify.mobile.android.audioplayer.domain.c[r2]
            java.util.Set r2 = defpackage.z42.l(r2)
            com.spotify.mobius.MobiusLoop r0 = r0.a(r1, r2)
            java.lang.String r1 = "loop(\n                Up…PlayerModel(), effects())"
            kotlin.jvm.internal.h.d(r0, r1)
            r13.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.audioplayer.MobiusAudioPlayer.start():void");
    }

    @androidx.lifecycle.w(Lifecycle.Event.ON_STOP)
    public final void stop() {
        MobiusLoop<f, d, com.spotify.mobile.android.audioplayer.domain.c> mobiusLoop = this.c;
        if (mobiusLoop != null) {
            this.b = mobiusLoop.i();
            MobiusLoop<f, d, com.spotify.mobile.android.audioplayer.domain.c> mobiusLoop2 = this.c;
            if (mobiusLoop2 != null) {
                mobiusLoop2.dispose();
                this.n.j(false);
                return;
            }
            h.k("mobiusLoop");
            throw null;
        }
        h.k("mobiusLoop");
        throw null;
    }
}
