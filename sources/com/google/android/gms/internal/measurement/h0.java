package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

final class h0 extends h.a {
    private final /* synthetic */ Activity n;
    private final /* synthetic */ hb o;
    private final /* synthetic */ h.b p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h0(h.b bVar, Activity activity, hb hbVar) {
        super(true);
        this.p = bVar;
        this.n = activity;
        this.o = hbVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        h.this.h.onActivitySaveInstanceState(b.F3(this.n), this.o, this.b);
    }
}
