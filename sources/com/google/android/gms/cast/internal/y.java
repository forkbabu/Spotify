package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements q {
    private final v a;
    private final String[] b;

    y(v vVar, String[] strArr) {
        this.a = vVar;
        this.b = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void a(Object obj, Object obj2) {
        String[] strArr = this.b;
        ((k) ((b0) obj).z()).r0(new a0((h) obj2), strArr);
    }
}
