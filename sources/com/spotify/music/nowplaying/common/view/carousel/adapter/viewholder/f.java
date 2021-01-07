package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.e0;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.d0;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.events.i0;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.events.y;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.g0;
import com.spotify.mobile.android.video.l0;
import com.spotify.mobile.android.video.q;
import com.spotify.mobile.android.video.r;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.t;
import com.spotify.mobile.android.video.v;
import com.spotify.music.C0707R;
import com.spotify.music.canvas.model.CanvasContentType;
import com.spotify.music.canvas.model.b;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.List;

public class f extends e<ContextTrack> implements m, f0 {
    private static final ImmutableSet<CanvasContentType> S = ImmutableSet.of(CanvasContentType.VIDEO_LOOPING, CanvasContentType.VIDEO_LOOPING_RANDOM);
    private r C;
    private final l72 D;
    private final VideoSurfaceView E;
    private final pl2 F;
    private final View G = this.a.findViewById(C0707R.id.peek_placeholder);
    private final ImageView H;
    private final km2 I;
    private final mm2 J;
    private final g0 K;
    private final q L;
    private final s M;
    private b N;
    private final Picasso O;
    private final xl2 P;
    private ContextTrack Q;
    private final List<f0> R;

    class a implements e0 {
        a() {
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void a(long j) {
            d0.l(this, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void b(j0 j0Var, long j, long j2) {
            d0.x(this, j0Var, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void c(long j) {
            d0.s(this, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void d(boolean z, long j, long j2) {
            d0.b(this, z, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void e(long j, long j2) {
            d0.f(this, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void f(long j, long j2, long j3) {
            d0.u(this, j, j2, j3);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void h(i0 i0Var, long j) {
            d0.t(this, i0Var, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void i(EncryptionType encryptionType, long j) {
            d0.g(this, encryptionType, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void j(long j, long j2, long j3, long j4) {
            d0.d(this, j, j2, j3, j4);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void k(List list, long j) {
            d0.k(this, list, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public void l(BetamaxException betamaxException, long j, long j2) {
            f.u0(f.this);
            f.v0(f.this, betamaxException);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public void m(boolean z, long j) {
            f.u0(f.this);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void n(com.spotify.mobile.android.video.d0 d0Var, long j) {
            d0.i(this, d0Var, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public void o(BetamaxException betamaxException, long j, long j2) {
            f.u0(f.this);
            f.v0(f.this, betamaxException);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
            d0.o(this, vVar, reasonEnd, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public void q(StreamingType streamingType, long j, long j2) {
            f.E0(f.this);
            f.this.J.d(f.this.N.h());
            f.this.I.a(f.this.N);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void r(long j) {
            d0.h(this, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void s(float f, long j, long j2) {
            d0.p(this, f, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void t(Optional optional, long j, long j2) {
            d0.v(this, optional, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void u(Optional optional, long j, long j2) {
            d0.w(this, optional, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void v(y yVar, long j, long j2) {
            d0.a(this, yVar, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public void w(long j, long j2) {
            f.u0(f.this);
            f.this.J.e(f.this.N.h());
            f.this.I.b(f.this.N);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void x(long j, long j2) {
            d0.m(this, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void y(int i, long j) {
            d0.e(this, i, j);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.view.LayoutInflater r3, com.spotify.mobile.android.video.s r4, defpackage.l72 r5, com.spotify.mobile.android.video.g0 r6, defpackage.pl2 r7, com.spotify.mobile.android.video.q r8, defpackage.km2 r9, defpackage.mm2 r10, com.squareup.picasso.Picasso r11, android.view.ViewGroup r12, defpackage.xl2 r13, androidx.lifecycle.n r14) {
        /*
            r2 = this;
            r0 = 2131624774(0x7f0e0346, float:1.8876737E38)
            r1 = 0
            android.view.View r3 = r3.inflate(r0, r12, r1)
            r2.<init>(r3)
            r2.F = r7
            r2.P = r13
            r7 = 2131431911(0x7f0b11e7, float:1.8485565E38)
            android.view.View r3 = r3.findViewById(r7)
            com.spotify.mobile.android.video.VideoSurfaceView r3 = (com.spotify.mobile.android.video.VideoSurfaceView) r3
            r2.E = r3
            android.view.View r7 = r2.a
            r12 = 2131430807(0x7f0b0d97, float:1.8483325E38)
            android.view.View r7 = r7.findViewById(r12)
            r2.G = r7
            r7 = 8
            r3.setVisibility(r7)
            com.spotify.mobile.android.video.VideoSurfaceView$ScaleType r7 = com.spotify.mobile.android.video.VideoSurfaceView.ScaleType.ASPECT_FILL
            r3.setScaleType(r7)
            r2.I = r9
            r2.J = r10
            android.view.View r3 = r2.a
            r7 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r3 = r3.findViewById(r7)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.H = r3
            r2.O = r11
            r2.K = r6
            r2.L = r8
            r2.M = r4
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r2)
            r2.R = r3
            r2.D = r5
            androidx.lifecycle.Lifecycle r3 = r14.A()
            com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.CanvasVideoViewHolder$2 r4 = new com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.CanvasVideoViewHolder$2
            r4.<init>(r2, r10)
            r3.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.f.<init>(android.view.LayoutInflater, com.spotify.mobile.android.video.s, l72, com.spotify.mobile.android.video.g0, pl2, com.spotify.mobile.android.video.q, km2, mm2, com.squareup.picasso.Picasso, android.view.ViewGroup, xl2, androidx.lifecycle.n):void");
    }

    static void E0(f fVar) {
        bd0.c(fVar.E);
    }

    static void J0(f fVar) {
        s sVar = fVar.M;
        sVar.d("canvas-video");
        sVar.i(new l0());
        sVar.h(fVar.L);
        sVar.c(fVar.R);
        sVar.g(false);
        g0.a c = fVar.K.c();
        c.b(false);
        sVar.f(c.a());
        r a2 = sVar.a();
        fVar.C = a2;
        ((t) a2).a0(true);
    }

    /* access modifiers changed from: private */
    public void M0(ContextTrack contextTrack) {
        r rVar;
        b a2 = this.F.a(contextTrack);
        this.N = a2;
        if (a2 != null && (rVar = this.C) != null) {
            rVar.L(this.E);
            a0.a a3 = a0.a();
            a3.e(true);
            a3.d(Long.valueOf(this.P.a(this.N.i())));
            a0 b = a3.b();
            e0.a a4 = com.spotify.mobile.android.video.e0.a();
            a4.e(false);
            a4.d(true);
            if (MoreObjects.isNullOrEmpty(this.N.d())) {
                a4.f(this.N.f());
            } else {
                a4.f(this.D.a(this.N.d()));
            }
            this.C.P(S.contains(this.N.i()));
            this.C.t(a4.b(), b);
        }
    }

    static void u0(f fVar) {
        fVar.E.setVisibility(4);
    }

    static void v0(f fVar, BetamaxException betamaxException) {
        String str;
        km2 km2 = fVar.I;
        b bVar = fVar.N;
        switch (betamaxException.a().ordinal()) {
            case 0:
                str = betamaxException.getMessage();
                break;
            case 1:
                str = "This content is georestricted";
                break;
            case 2:
                str = "This content is unsupported for platform version";
                break;
            case 3:
                str = "This content is unsupported for client version";
                break;
            case 4:
                str = "There is no internet connection";
                break;
            case 5:
            default:
                str = "There is a error we didn't catch.";
                break;
            case 6:
                str = "This content is country restricted";
                break;
            case 7:
                str = "The content is unavailable";
                break;
            case 8:
                str = "The catalogue is restricted";
                break;
            case 9:
                str = "Video playback is stuck";
                break;
        }
        km2.c(bVar, "CANVAS_VIDEO_PLAYBACK_ERROR", str);
        fVar.J.f(fVar.N.h());
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void d() {
        this.H.setVisibility(4);
        this.E.setVisibility(4);
        this.G.setVisibility(0);
    }

    @Override // com.spotify.mobile.android.video.events.f0
    public Optional<com.spotify.mobile.android.video.events.e0> g(com.spotify.mobile.android.video.d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, String str, g0 g0Var) {
        return Optional.of(new a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(ContextTrack contextTrack, int i) {
        ContextTrack contextTrack2 = contextTrack;
        String d = kxd.d(contextTrack2);
        if (d == null) {
            this.H.setImageResource(C0707R.drawable.cover_art_placeholder);
        } else {
            z m = this.O.m(d);
            m.s(C0707R.drawable.cover_art_placeholder);
            m.m(this.H);
        }
        this.Q = contextTrack2;
        M0(contextTrack2);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void l0() {
        Logger.b("onViewAttachedToWindow", new Object[0]);
        r rVar = this.C;
        if (rVar != null) {
            rVar.L(this.E);
        }
        bd0.c(this.E);
        r rVar2 = this.C;
        if (rVar2 != null) {
            rVar2.resume();
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void m0() {
        Logger.b("onViewDetachedFromWindow", new Object[0]);
        r rVar = this.C;
        if (rVar != null) {
            rVar.pause();
        }
        this.E.setVisibility(4);
        r rVar2 = this.C;
        if (rVar2 != null) {
            rVar2.D(this.E);
        }
    }

    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m
    public void p() {
        if (this.H.getVisibility() == 0) {
            this.G.setVisibility(4);
        } else {
            bd0.a(this.G, this.H);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void s0() {
        Logger.b("onViewRecycled", new Object[0]);
        r rVar = this.C;
        if (rVar != null) {
            rVar.stop();
        }
    }
}
