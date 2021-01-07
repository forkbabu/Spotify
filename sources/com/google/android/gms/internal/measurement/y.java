package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class y extends h.a {
    private final /* synthetic */ String n;
    private final /* synthetic */ Object o;
    private final /* synthetic */ h p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    y(h hVar, String str, Object obj) {
        super(false);
        this.p = hVar;
        this.n = str;
        this.o = obj;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.p.h.logHealthData(5, this.n, b.F3(this.o), b.F3(null), b.F3(null));
    }
}
