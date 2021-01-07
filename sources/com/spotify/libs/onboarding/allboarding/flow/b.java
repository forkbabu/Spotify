package com.spotify.libs.onboarding.allboarding.flow;

import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.lifecycle.a0;
import androidx.lifecycle.e0;
import kotlin.jvm.internal.h;

public final class b<V extends e0> extends a {
    private final k<V> d;
    private final Bundle e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(k<V> kVar, androidx.savedstate.b bVar, Bundle bundle) {
        super(bVar, bundle);
        h.e(kVar, "viewModelFactory");
        h.e(bVar, "owner");
        h.e(bundle, "defaultArgs");
        this.d = kVar;
        this.e = bundle;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T extends androidx.lifecycle.e0, androidx.lifecycle.e0] */
    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.a
    public <T extends e0> T d(String str, Class<T> cls, a0 a0Var) {
        h.e(str, "key");
        h.e(cls, "modelClass");
        h.e(a0Var, "handle");
        V a = this.d.a(a0Var, this.e);
        if (a != 0) {
            return a;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }
}
