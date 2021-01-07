package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* access modifiers changed from: package-private */
public final class x<R extends i> extends BasePendingResult<R> {
    private final w<R, Status> n;

    x(w<R, Status> wVar) {
        super(null);
        this.n = wVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R f(Status status) {
        return this.n.b(status);
    }
}
