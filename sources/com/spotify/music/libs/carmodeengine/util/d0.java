package com.spotify.music.libs.carmodeengine.util;

import com.google.protobuf.u;
import com.spotify.messages.CarModeState;

public class d0 implements c0 {
    private final gl0<u> a;

    public d0(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a(b0 b0Var) {
        CarModeState.b n = CarModeState.n();
        n.o((String) b0Var.e().a(h.a, i.a, f.a));
        n.p(b0Var.d());
        n.m("car_mode_availability", (String) b0Var.c().c(k.a, j.a, g.a));
        n.m("auto_activation", String.valueOf(b0Var.b()));
        n.m("keep_app_open", String.valueOf(b0Var.h()));
        n.n("mic_permission", String.valueOf(b0Var.g()));
        n.n("api_level", String.valueOf(b0Var.a()));
        n.n("device_language", b0Var.f());
        this.a.c(n.build());
    }
}
