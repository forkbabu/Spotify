package com.spotify.mobile.android.video.exo;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.source.b0;

public abstract class t implements p0, q0 {
    private final int a;
    private int b;
    private b0 c;

    public t(int i) {
        this.a = i;
    }

    @Override // com.google.android.exoplayer2.p0
    public void a() {
        this.b = 0;
    }

    @Override // com.google.android.exoplayer2.p0, com.google.android.exoplayer2.q0
    public int c() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean d() {
        return true;
    }

    @Override // com.google.android.exoplayer2.p0
    public b0 g() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.p0
    public q0 getCapabilities() {
        return this;
    }

    @Override // com.google.android.exoplayer2.p0
    public int getState() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean i() {
        return true;
    }

    @Override // com.google.android.exoplayer2.p0
    public void j(r0 r0Var, d0[] d0VarArr, b0 b0Var, long j, boolean z, long j2) {
        this.b = 1;
        this.c = b0Var;
    }

    @Override // com.google.android.exoplayer2.p0
    public void k() {
    }

    @Override // com.google.android.exoplayer2.n0.b
    public void l(int i, Object obj) {
    }

    @Override // com.google.android.exoplayer2.p0
    public void n() {
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean o() {
        return false;
    }

    @Override // com.google.android.exoplayer2.p0
    public void q(int i) {
    }

    @Override // com.google.android.exoplayer2.q0
    public int r() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.p0
    public void s(long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.p0
    public void start() {
        this.b = 2;
    }

    @Override // com.google.android.exoplayer2.p0
    public void stop() {
        this.b = 1;
    }

    @Override // com.google.android.exoplayer2.p0
    public void u(long j) {
    }

    @Override // com.google.android.exoplayer2.p0
    public void w(d0[] d0VarArr, b0 b0Var, long j) {
        this.c = b0Var;
    }
}
