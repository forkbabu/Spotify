package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class q extends h.a {
    private final /* synthetic */ String n;
    private final /* synthetic */ h o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(h hVar, String str) {
        super(true);
        this.o = hVar;
        this.n = str;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.o.h.beginAdUnitExposure(this.n, this.b);
    }
}
