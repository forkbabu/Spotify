package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k0 implements a {
    private final o0 a;
    private final Bundle b;

    k0(o0 o0Var, Bundle bundle) {
        this.a = o0Var;
        this.b = bundle;
    }

    @Override // com.google.android.gms.tasks.a
    public final Object a(g gVar) {
        return this.a.c(this.b, gVar);
    }
}
