package com.spotify.mobile.android.video.events;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.a0;
import com.spotify.mobile.android.video.events.g0;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.i0;
import com.spotify.mobile.android.video.v;
import java.util.List;

public class h0 implements e0 {
    private final a0 a;
    private final d0 b;
    private g0.a c;

    public h0(d0 d0Var, a0 a0Var) {
        this.b = d0Var;
        this.a = a0Var;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void a(long j) {
        d0.l(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void b(j0 j0Var, long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void c(long j) {
        g0.a aVar = this.c;
        aVar.d(false);
        aVar.g(j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void d(boolean z, long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void e(long j, long j2) {
        this.c.b(Long.valueOf(j));
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void f(long j, long j2, long j3) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j2));
        aVar.g(j3);
    }

    public g0 g() {
        g0.a aVar = this.c;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
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
        g0.a aVar = this.c;
        aVar.d(true);
        aVar.e(0.0f);
        aVar.c(false);
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void m(boolean z, long j) {
        a0.b bVar = new a0.b();
        bVar.h(this.b);
        bVar.f(null);
        bVar.g(j);
        bVar.c(false);
        bVar.b(null);
        bVar.e(0.0f);
        bVar.d(!this.a.c());
        this.c = bVar;
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void n(d0 d0Var, long j) {
        d0.i(this, d0Var, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void o(BetamaxException betamaxException, long j, long j2) {
        g0.a aVar = this.c;
        aVar.d(true);
        aVar.e(0.0f);
        aVar.c(false);
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
        aVar.e(0.0f);
        aVar.c(false);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void q(StreamingType streamingType, long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
        aVar.c(false);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void r(long j) {
        d0.h(this, j);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void s(float f, long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
        aVar.e(f);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void t(Optional<i0> optional, long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void u(Optional<VideoSurfaceView> optional, long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void v(y yVar, long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void w(long j, long j2) {
        g0.a aVar = this.c;
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
        aVar.c(true);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public void x(long j, long j2) {
        g0.a aVar = this.c;
        aVar.d(true);
        aVar.f(Long.valueOf(j));
        aVar.g(j2);
    }

    @Override // com.spotify.mobile.android.video.events.e0
    public /* synthetic */ void y(int i, long j) {
        d0.e(this, i, j);
    }
}
