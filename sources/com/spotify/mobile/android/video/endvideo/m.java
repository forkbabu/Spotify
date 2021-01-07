package com.spotify.mobile.android.video.endvideo;

import com.google.common.base.Optional;
import com.google.protobuf.u;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.g0;
import io.reactivex.y;

public class m implements f0 {
    private final cqe a;
    private final gl0<u> b;
    private final i c;
    private final y f;
    private final o n;
    private final p o;
    private final com.spotify.mobile.android.util.connectivity.y p;

    public m(gl0<u> gl0, i iVar, cqe cqe, y yVar, o oVar, p pVar, com.spotify.mobile.android.util.connectivity.y yVar2) {
        this.b = gl0;
        this.a = cqe;
        this.c = iVar;
        this.f = yVar;
        this.n = oVar;
        this.o = pVar;
        this.p = yVar2;
    }

    @Override // com.spotify.mobile.android.video.events.f0
    public Optional<e0> g(d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, String str, g0 g0Var) {
        if (g0Var == null || !d0Var.f()) {
            return Optional.absent();
        }
        return Optional.of(new l(d0Var, a0Var, f0Var, str, this.a, this.p, this.c, this.b, this.f, this.o, this.n));
    }
}
