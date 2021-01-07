package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class w extends h.a {
    private final /* synthetic */ String n;
    private final /* synthetic */ String o;
    private final /* synthetic */ boolean p;
    private final /* synthetic */ hb q;
    private final /* synthetic */ h r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w(h hVar, String str, String str2, boolean z, hb hbVar) {
        super(true);
        this.r = hVar;
        this.n = str;
        this.o = str2;
        this.p = z;
        this.q = hbVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.r.h.getUserProperties(this.n, this.o, this.p, this.q);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void b() {
        this.q.m(null);
    }
}
