package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.k0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g0 implements q {
    private final z a;
    private final String b;
    private final h c;

    g0(z zVar, String str, h hVar) {
        this.a = zVar;
        this.b = str;
        this.c = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        this.a.Q(this.b, this.c, (k0) obj, (h) obj2);
    }
}
