package com.google.android.exoplayer2;

import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.util.r;

public interface p0 extends n0.b {
    void a();

    boolean b();

    @Override // com.google.android.exoplayer2.q0
    int c();

    boolean d();

    b0 g();

    q0 getCapabilities();

    int getState();

    r h();

    boolean i();

    void j(r0 r0Var, d0[] d0VarArr, b0 b0Var, long j, boolean z, long j2);

    void k();

    void m(float f);

    void n();

    boolean o();

    void q(int i);

    void reset();

    void s(long j, long j2);

    void start();

    void stop();

    long t();

    void u(long j);

    void w(d0[] d0VarArr, b0 b0Var, long j);
}
