package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* access modifiers changed from: package-private */
public final class q1 extends ContentObserver {
    private final /* synthetic */ o1 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q1(o1 o1Var) {
        super(null);
        this.a = o1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.c();
    }
}
