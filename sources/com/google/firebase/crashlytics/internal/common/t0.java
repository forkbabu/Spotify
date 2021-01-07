package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t0 implements a {
    private final v0 a;

    private t0(v0 v0Var) {
        this.a = v0Var;
    }

    public static a b(v0 v0Var) {
        return new t0(v0Var);
    }

    @Override // com.google.android.gms.tasks.a
    public Object a(g gVar) {
        return Boolean.valueOf(v0.a(this.a, gVar));
    }
}
