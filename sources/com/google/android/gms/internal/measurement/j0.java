package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

final class j0 extends h.a {
    private final /* synthetic */ Activity n;
    private final /* synthetic */ h.b o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j0(h.b bVar, Activity activity) {
        super(true);
        this.o = bVar;
        this.n = activity;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        h.this.h.onActivityDestroyed(b.F3(this.n), this.b);
    }
}
