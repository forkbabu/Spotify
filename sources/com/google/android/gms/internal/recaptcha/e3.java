package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.recaptcha.d;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e3 implements q {
    private final d3 a;
    private final d b;

    e3(d3 d3Var, d dVar) {
        this.a = d3Var;
        this.b = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        d dVar = this.b;
        ((b3) ((d) obj).z()).k1(new b((h) obj2), dVar);
    }
}
