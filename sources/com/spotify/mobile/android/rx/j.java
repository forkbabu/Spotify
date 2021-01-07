package com.spotify.mobile.android.rx;

import com.google.common.collect.ImmutableMap;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Map;

class j {
    private final s<Boolean> a;
    private final s b;

    public j(s<Boolean> sVar, s sVar2) {
        this.a = sVar;
        this.b = sVar2;
    }

    public s<Map<String, String>> a() {
        return this.a.E().J0(new d(this));
    }

    public /* synthetic */ v b(Boolean bool) {
        if (bool.booleanValue()) {
            return this.b.a();
        }
        return s.i0(ImmutableMap.of());
    }
}
