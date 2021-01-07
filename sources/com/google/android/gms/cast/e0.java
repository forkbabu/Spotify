package com.google.android.gms.cast;

import com.google.android.gms.cast.e;
import com.google.android.gms.cast.internal.k0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e0 implements q {
    private final z a;
    private final String b;
    private final e.d c;

    e0(z zVar, String str, e.d dVar) {
        this.a = zVar;
        this.b = str;
        this.c = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        this.a.P(this.b, this.c, (k0) obj, (h) obj2);
    }
}
