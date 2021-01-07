package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;

/* access modifiers changed from: package-private */
public final class n extends p<Status> {
    n(c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ i f(Status status) {
        return status;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.d
    public final /* synthetic */ void o(j jVar) {
        j jVar2 = jVar;
        ((t) jVar2.z()).e2(new m(this), jVar2.Z());
    }
}
