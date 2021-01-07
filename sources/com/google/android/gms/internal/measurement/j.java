package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class j extends h.a {
    private final /* synthetic */ Bundle n;
    private final /* synthetic */ h o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(h hVar, Bundle bundle) {
        super(true);
        this.o = hVar;
        this.n = bundle;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.o.h.setConditionalUserProperty(this.n, this.a);
    }
}
