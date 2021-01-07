package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.recaptcha.a;
import com.google.android.gms.recaptcha.d;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f3 implements q {
    private final d3 a;
    private final d b;
    private final a c;

    f3(d3 d3Var, d dVar, a aVar) {
        this.a = d3Var;
        this.b = dVar;
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        this.a.x(this.b, this.c, (d) obj, (h) obj2);
    }
}
