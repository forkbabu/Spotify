package com.spotify.mobile.android.util.connectivity;

import android.app.Application;
import io.reactivex.y;

public final class s implements fjf<v> {
    private final wlf<Application> a;
    private final wlf<y> b;

    public s(wlf<Application> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static v a(Application application, y yVar) {
        v a2 = v.a(application.getApplicationContext(), yVar);
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
