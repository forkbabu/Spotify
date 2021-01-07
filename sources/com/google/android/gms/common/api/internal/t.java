package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.h;

public abstract class t<A extends a.b, L> {
    private final k.a<L> a;

    protected t(@RecentlyNonNull k.a<L> aVar) {
        this.a = aVar;
    }

    @RecentlyNonNull
    public k.a<L> a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract void b(@RecentlyNonNull A a2, @RecentlyNonNull h<Boolean> hVar);
}
