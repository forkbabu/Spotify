package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;

public abstract class d<R extends i, A extends a.b> extends BasePendingResult<R> implements e<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected d(@RecentlyNonNull a<?> aVar, @RecentlyNonNull c cVar) {
        super(cVar);
        g.k(cVar, "GoogleApiClient must not be null");
        g.k(aVar, "Api must not be null");
    }

    /* access modifiers changed from: protected */
    public abstract void o(@RecentlyNonNull A a);

    public final void p(@RecentlyNonNull Status status) {
        g.d(!status.r2(), "Failed result must not be success");
        a(f(status));
    }
}
