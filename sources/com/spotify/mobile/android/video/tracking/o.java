package com.spotify.mobile.android.video.tracking;

import com.google.common.base.Optional;
import com.google.protobuf.u;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.g0;

public class o implements f0 {
    private final gl0<u> a;

    public o(gl0<u> gl0) {
        this.a = gl0;
    }

    @Override // com.spotify.mobile.android.video.events.f0
    public Optional<e0> g(d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, String str, g0 g0Var) {
        return Optional.of(new n(d0Var, this.a, str));
    }
}
