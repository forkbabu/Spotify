package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h0 implements a {
    private final i0 a;
    private final Pair b;

    h0(i0 i0Var, Pair pair) {
        this.a = i0Var;
        this.b = pair;
    }

    @Override // com.google.android.gms.tasks.a
    public final Object a(g gVar) {
        this.a.b(this.b, gVar);
        return gVar;
    }
}
