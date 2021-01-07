package com.spotify.mobile.android.coreintegration;

import com.spotify.cosmos.android.RemoteNativeRouter;
import io.reactivex.s;
import io.reactivex.y;

public class h0 {
    private final s<RemoteNativeRouter> a;

    h0(wlf<CoreIntegration> wlf, y yVar) {
        this.a = s.y(new s(wlf)).N(r.a).I0(yVar).v0(1).h1();
    }

    public s<RemoteNativeRouter> a() {
        return this.a;
    }
}
