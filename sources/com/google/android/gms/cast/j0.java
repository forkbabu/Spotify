package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.k0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j0 implements q {
    private final z a;
    private final String b;
    private final String c;

    j0(z zVar, String str, String str2) {
        this.a = zVar;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        this.a.S(this.b, this.c, null, (k0) obj, (h) obj2);
    }
}
