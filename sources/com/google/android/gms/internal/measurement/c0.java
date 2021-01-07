package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class c0 extends h.a {
    private final /* synthetic */ Long n;
    private final /* synthetic */ String o;
    private final /* synthetic */ String p;
    private final /* synthetic */ Bundle q;
    private final /* synthetic */ boolean r;
    private final /* synthetic */ boolean s;
    private final /* synthetic */ h t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c0(h hVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(true);
        this.t = hVar;
        this.n = l;
        this.o = str;
        this.p = str2;
        this.q = bundle;
        this.r = z;
        this.s = z2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        Long l = this.n;
        this.t.h.logEvent(this.o, this.p, this.q, this.r, this.s, l == null ? this.a : l.longValue());
    }
}
