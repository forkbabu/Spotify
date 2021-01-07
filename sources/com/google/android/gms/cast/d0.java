package com.google.android.gms.cast;

import com.google.android.gms.cast.e;
import com.google.android.gms.cast.internal.k0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d0 implements q {
    private final z a;
    private final e.d b;
    private final String c;

    d0(z zVar, e.d dVar, String str) {
        this.a = zVar;
        this.b = dVar;
        this.c = str;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        this.a.G(this.b, this.c, (k0) obj, (h) obj2);
    }
}
