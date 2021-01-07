package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.g;
import com.google.android.gms.cast.internal.k0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b0 implements q {
    private final z a;

    b0(z zVar) {
        this.a = zVar;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        ((g) k0Var.z()).w0(this.a.k);
        ((g) k0Var.z()).f();
        ((h) obj2).c(null);
    }
}
