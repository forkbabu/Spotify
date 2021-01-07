package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class m extends h.a {
    private final /* synthetic */ String n;
    private final /* synthetic */ String o;
    private final /* synthetic */ Bundle p;
    private final /* synthetic */ h q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m(h hVar, String str, String str2, Bundle bundle) {
        super(true);
        this.q = hVar;
        this.n = str;
        this.o = str2;
        this.p = bundle;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.q.h.clearConditionalUserProperty(this.n, this.o, this.p);
    }
}
