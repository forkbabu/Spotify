package com.spotify.effortlesslogin;

import androidx.lifecycle.e0;
import androidx.lifecycle.g0;

public class q implements g0.b {
    private final wlf<p> a;

    public q(wlf<p> wlf) {
        this.a = wlf;
    }

    @Override // androidx.lifecycle.g0.b
    public <T extends e0> T a(Class<T> cls) {
        if (cls == p.class) {
            return this.a.get();
        }
        throw new RuntimeException("unsupported view model class: " + cls);
    }
}
