package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.RecentlyNonNull;

public class b {
    private int a = 1;

    @RecentlyNonNull
    public b a(Object obj) {
        this.a = (31 * this.a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.a;
    }

    @RecentlyNonNull
    public final b c(boolean z) {
        this.a = (31 * this.a) + (z ? 1 : 0);
        return this;
    }
}
