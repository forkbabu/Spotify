package com.spotify.mobile.android.rx;

import com.google.common.base.Optional;
import io.reactivex.w;
import java.util.Map;

public final class t implements fjf<s> {
    private final wlf<u> a;
    private final wlf<w<Optional<Map<String, String>>, Map<String, String>>> b;

    public t(wlf<u> wlf, wlf<w<Optional<Map<String, String>>, Map<String, String>>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s(this.a.get(), this.b.get());
    }
}
