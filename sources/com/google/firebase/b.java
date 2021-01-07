package com.google.firebase;

import android.content.Context;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements t10 {
    private final c a;
    private final Context b;

    private b(c cVar, Context context) {
        this.a = cVar;
        this.b = context;
    }

    public static t10 a(c cVar, Context context) {
        return new b(cVar, context);
    }

    @Override // defpackage.t10
    public Object get() {
        return c.q(this.a, this.b);
    }
}
