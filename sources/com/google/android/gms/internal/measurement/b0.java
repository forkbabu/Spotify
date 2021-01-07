package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class b0 extends h.a {
    private final /* synthetic */ String n;
    private final /* synthetic */ String o;
    private final /* synthetic */ Object p;
    private final /* synthetic */ boolean q;
    private final /* synthetic */ h r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b0(h hVar, String str, String str2, Object obj, boolean z) {
        super(true);
        this.r = hVar;
        this.n = str;
        this.o = str2;
        this.p = obj;
        this.q = z;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.r.h.setUserProperty(this.n, this.o, b.F3(this.p), this.q, this.a);
    }
}
