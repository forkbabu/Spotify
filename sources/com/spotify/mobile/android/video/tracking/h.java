package com.spotify.mobile.android.video.tracking;

import com.google.common.base.Optional;
import com.google.protobuf.u;
import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.g0;

public class h implements f0 {
    private final gl0<u> a;
    private final cqe b;
    private final y c;

    public h(gl0<u> gl0, cqe cqe, y yVar) {
        this.c = yVar;
        this.a = gl0;
        this.b = cqe;
    }

    @Override // com.spotify.mobile.android.video.events.f0
    public Optional<e0> g(d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, String str, g0 g0Var) {
        return Optional.of(new g(d0Var, this.b, this.c, str, this.a));
    }
}
