package com.spotify.music.container.app.foregroundstate;

import com.spotify.music.container.app.foregroundstate.a;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class b implements fjf<s<Boolean>> {
    private final wlf<AppUiForegroundState> a;

    public b(wlf<AppUiForegroundState> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AppUiForegroundState appUiForegroundState = this.a.get();
        a.C0211a aVar = a.a;
        h.e(appUiForegroundState, "appUiForegroundState");
        s<Boolean> b = appUiForegroundState.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
