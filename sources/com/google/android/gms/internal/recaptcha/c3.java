package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c3 implements q {
    private final d3 a;
    private final String b;

    c3(d3 d3Var, String str) {
        this.a = d3Var;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        String str = this.b;
        ((b3) ((d) obj).z()).s1(new g3((h) obj2), str);
    }
}
