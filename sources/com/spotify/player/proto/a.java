package com.spotify.player.proto;

import com.spotify.player.esperanto.proto.EsResponseWithReasons$ResponseWithReasons;
import kotlin.jvm.internal.h;

public final class a {
    public static final zwd a(EsResponseWithReasons$ResponseWithReasons esResponseWithReasons$ResponseWithReasons) {
        h.e(esResponseWithReasons$ResponseWithReasons, "response");
        if (esResponseWithReasons$ResponseWithReasons.h().ordinal() != 0) {
            zwd a = zwd.a(esResponseWithReasons$ResponseWithReasons.i());
            h.d(a, "CommandResult.failure(response.reasons)");
            return a;
        }
        zwd b = zwd.b();
        h.d(b, "CommandResult.success()");
        return b;
    }
}
