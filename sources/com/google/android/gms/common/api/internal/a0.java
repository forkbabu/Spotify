package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.internal.b;

/* access modifiers changed from: package-private */
public final class a0 implements b.e {
    final /* synthetic */ g.a a;

    a0(g.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.common.internal.b.e
    public final void a() {
        g.this.w.post(new b0(this));
    }
}
