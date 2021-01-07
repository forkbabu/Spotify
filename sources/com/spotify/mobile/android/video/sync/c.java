package com.spotify.mobile.android.video.sync;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.k0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.util.r;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.exo.t;

public class c extends t {
    private final b f;
    private long n;

    class a implements r {
        final /* synthetic */ Optional a;

        a(Optional optional) {
            this.a = optional;
        }

        @Override // com.google.android.exoplayer2.util.r
        public long f() {
            return ((a) this.a.get()).f() + c.this.n;
        }

        @Override // com.google.android.exoplayer2.util.r
        public k0 p() {
            return new k0(1.0f, 1.0f, false);
        }

        @Override // com.google.android.exoplayer2.util.r
        public void v(k0 k0Var) {
        }
    }

    public c(b bVar) {
        super(4);
        this.f = bVar;
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean b() {
        Optional<a> h = this.f.h();
        if (h.isPresent()) {
            return h.get().b();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.q0
    public int e(d0 d0Var) {
        return "track-sync-renderer".equals(d0Var.a) ? 4 : 0;
    }

    @Override // com.google.android.exoplayer2.p0
    public r h() {
        Optional<a> h = this.f.h();
        if (h.isPresent()) {
            return new a(h);
        }
        return null;
    }

    @Override // com.spotify.mobile.android.video.exo.t, com.google.android.exoplayer2.p0
    public void j(r0 r0Var, d0[] d0VarArr, b0 b0Var, long j, boolean z, long j2) {
        super.j(r0Var, d0VarArr, b0Var, j, z, j2);
        this.n = j2;
    }

    @Override // com.google.android.exoplayer2.p0
    public void m(float f2) {
    }

    @Override // com.google.android.exoplayer2.p0
    public void reset() {
    }

    @Override // com.google.android.exoplayer2.p0
    public long t() {
        return 0;
    }
}
