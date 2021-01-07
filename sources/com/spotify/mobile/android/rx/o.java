package com.spotify.mobile.android.rx;

import io.reactivex.s;
import java.util.Map;

public final class o implements fjf<s<Map<String, String>>> {
    private final wlf<w> a;

    public o(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s<Map<String, String>> b = this.a.get().b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
