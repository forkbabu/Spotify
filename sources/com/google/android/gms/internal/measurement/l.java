package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class l extends h.a {
    private final /* synthetic */ String n;
    private final /* synthetic */ String o;
    private final /* synthetic */ hb p;
    private final /* synthetic */ h q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(h hVar, String str, String str2, hb hbVar) {
        super(true);
        this.q = hVar;
        this.n = str;
        this.o = str2;
        this.p = hbVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.q.h.getConditionalUserProperties(this.n, this.o, this.p);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void b() {
        this.p.m(null);
    }
}
