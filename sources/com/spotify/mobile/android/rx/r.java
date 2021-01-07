package com.spotify.mobile.android.rx;

import io.reactivex.s;
import java.util.Map;

public final class r implements fjf<w> {
    private final wlf<s<Map<String, String>>> a;

    public r(wlf<s<Map<String, String>>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get());
    }
}
