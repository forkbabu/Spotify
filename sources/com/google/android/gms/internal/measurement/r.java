package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class r extends h.a {
    private final /* synthetic */ hb n;
    private final /* synthetic */ h o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(h hVar, hb hbVar) {
        super(true);
        this.o = hVar;
        this.n = hbVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.o.h.getCachedAppInstanceId(this.n);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void b() {
        this.n.m(null);
    }
}
