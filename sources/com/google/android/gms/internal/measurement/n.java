package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class n extends h.a {
    private final /* synthetic */ Activity n;
    private final /* synthetic */ String o;
    private final /* synthetic */ String p;
    private final /* synthetic */ h q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(h hVar, Activity activity, String str, String str2) {
        super(true);
        this.q = hVar;
        this.n = activity;
        this.o = str;
        this.p = str2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.h.a
    public final void a() {
        this.q.h.setCurrentScreen(b.F3(this.n), this.o, this.p, this.a);
    }
}
