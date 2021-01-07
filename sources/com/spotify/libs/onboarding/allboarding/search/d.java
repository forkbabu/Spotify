package com.spotify.libs.onboarding.allboarding.search;

import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.h;

public final class d implements g0.b {
    private final iw0 a;
    private final String b;
    private final String c;

    public d(iw0 iw0, String str, String str2) {
        h.e(iw0, "allboardingProvider");
        h.e(str, "searchUrl");
        h.e(str2, "onboardingSessionId");
        this.a = iw0;
        this.b = str;
        this.c = str2;
    }

    @Override // androidx.lifecycle.g0.b
    public <T extends e0> T a(Class<T> cls) {
        h.e(cls, "modelClass");
        return new e(this.a, this.b, this.c);
    }
}
