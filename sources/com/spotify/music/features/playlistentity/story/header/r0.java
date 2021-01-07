package com.spotify.music.features.playlistentity.story.header;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.d0;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.i0;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.events.y;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.v;
import java.util.List;

class r0 implements e0 {
    final /* synthetic */ s0 a;

    r0(s0 s0Var) {
        this.a = s0Var;
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
    public /* synthetic */ void l(BetamaxException betamaxException, long j, long j2) {
        d0.j(this, betamaxException, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void m(boolean z, long j) {
        d0.n(this, z, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void n(com.spotify.mobile.android.video.d0 d0Var, long j) {
        d0.i(this, d0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void o(BetamaxException betamaxException, long j, long j2) {
        d0.r(this, betamaxException, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
        d0.o(this, vVar, reasonEnd, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void q(StreamingType streamingType, long j, long j2) {
        VideoSurfaceView H2 = this.a.v.H2();
        ImageView F2 = this.a.v.F2();
        if (H2.getVisibility() != 0) {
            H2.setAlpha(0.0f);
            H2.setVisibility(0);
            AnimatorSet duration = new AnimatorSet().setDuration(600L);
            duration.addListener(new t0(F2));
            duration.playSequentially(ObjectAnimator.ofFloat(H2, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(F2, "alpha", 1.0f, 0.0f));
            duration.start();
        }
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
    public /* synthetic */ void w(long j, long j2) {
        d0.c(this, j, j2);
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
