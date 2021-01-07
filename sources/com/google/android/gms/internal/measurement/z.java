package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class z extends h.a {
    private final /* synthetic */ String n;
    private final /* synthetic */ hb o;
    private final /* synthetic */ h p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z(h hVar, String str, hb hbVar) {
        super(true);
        this.p = hVar;
        this.n = str;
        this.o = hbVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.p.h.getMaxUserProperties(this.n, this.o);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void b() {
        this.o.m(null);
    }
}
