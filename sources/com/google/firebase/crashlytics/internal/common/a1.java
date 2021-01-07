package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;

/* access modifiers changed from: package-private */
public class a1 implements a<T, Void> {
    final /* synthetic */ h a;

    a1(h hVar) {
        this.a = hVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.tasks.a
    public Void a(g gVar) {
        if (gVar.r()) {
            this.a.e(gVar.n());
            return null;
        }
        this.a.d(gVar.m());
        return null;
    }
}
