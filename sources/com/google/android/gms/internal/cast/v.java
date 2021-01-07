package com.google.android.gms.internal.cast;

import com.google.android.gms.tasks.e;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements e {
    private final x a;
    private final w b;

    v(x xVar, w wVar) {
        this.a = xVar;
        this.b = wVar;
    }

    @Override // com.google.android.gms.tasks.e
    public final void onSuccess(Object obj) {
        this.a.a(this.b.b(obj));
    }
}
