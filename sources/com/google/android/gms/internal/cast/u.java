package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements d {
    private final x a;
    private final w b;

    u(x xVar, w wVar) {
        this.a = xVar;
        this.b = wVar;
    }

    @Override // com.google.android.gms.tasks.d
    public final void b(Exception exc) {
        x xVar = this.a;
        w wVar = this.b;
        Status status = new Status(8, "unknown error");
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            status = new Status(apiException.b(), apiException.getMessage());
        }
        xVar.a(wVar.b(status));
    }
}
