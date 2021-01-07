package com.spotify.music.libs.accountlinkingnudges;

import com.spotify.remoteconfig.n7;
import kotlin.jvm.internal.h;

public final class j implements fjf<Boolean> {
    private final wlf<n7> a;

    public j(wlf<n7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        n7 n7Var = this.a.get();
        h.e(n7Var, "properties");
        return Boolean.valueOf(n7Var.a());
    }
}
