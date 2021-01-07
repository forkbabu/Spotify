package com.spotify.mobile.android.video.tracking;

import com.google.common.base.Optional;
import com.google.protobuf.u;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.i0;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.events.y;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.v;
import java.util.List;

public class n implements e0 {
    private final gl0<u> a;
    private final d0 b;
    private final String c;

    public n(d0 d0Var, gl0<u> gl0, String str) {
        this.b = d0Var;
        this.a = gl0;
        this.c = t72.b(d0Var).or((Optional<String>) str);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void a(long j) {
        com.spotify.mobile.android.video.events.d0.l(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void b(j0 j0Var, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.x(this, j0Var, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void c(long j) {
        com.spotify.mobile.android.video.events.d0.s(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void d(boolean z, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.b(this, z, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void e(long j, long j2) {
        com.spotify.mobile.android.video.events.d0.f(this, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void f(long j, long j2, long j3) {
        com.spotify.mobile.android.video.events.d0.u(this, j, j2, j3);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void h(i0 i0Var, long j) {
        com.spotify.mobile.android.video.events.d0.t(this, i0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void i(EncryptionType encryptionType, long j) {
        com.spotify.mobile.android.video.events.d0.g(this, encryptionType, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void j(long j, long j2, long j3, long j4) {
        com.spotify.mobile.android.video.events.d0.d(this, j, j2, j3, j4);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void k(List list, long j) {
        com.spotify.mobile.android.video.events.d0.k(this, list, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void l(BetamaxException betamaxException, long j, long j2) {
        this.a.c(q.b(this.b, this.c, betamaxException));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void m(boolean z, long j) {
        com.spotify.mobile.android.video.events.d0.n(this, z, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void n(d0 d0Var, long j) {
        com.spotify.mobile.android.video.events.d0.i(this, d0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void o(BetamaxException betamaxException, long j, long j2) {
        this.a.c(q.b(this.b, this.c, betamaxException));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.o(this, vVar, reasonEnd, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void q(StreamingType streamingType, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.q(this, streamingType, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void r(long j) {
        com.spotify.mobile.android.video.events.d0.h(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void s(float f, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.p(this, f, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void t(Optional optional, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.v(this, optional, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void u(Optional optional, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.w(this, optional, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void v(y yVar, long j, long j2) {
        com.spotify.mobile.android.video.events.d0.a(this, yVar, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void w(long j, long j2) {
        com.spotify.mobile.android.video.events.d0.c(this, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void x(long j, long j2) {
        com.spotify.mobile.android.video.events.d0.m(this, j, j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void y(int i, long j) {
        com.spotify.mobile.android.video.events.d0.e(this, i, j);
    }
}
