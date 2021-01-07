package com.google.firebase.installations;

import com.google.android.gms.tasks.h;
import com.google.firebase.installations.local.c;

/* access modifiers changed from: package-private */
public class j implements m {
    final h<String> a;

    public j(h<String> hVar) {
        this.a = hVar;
    }

    @Override // com.google.firebase.installations.m
    public boolean a(c cVar) {
        if (!cVar.k() && !cVar.j() && !cVar.h()) {
            return false;
        }
        this.a.e(cVar.c());
        return true;
    }

    @Override // com.google.firebase.installations.m
    public boolean b(c cVar, Exception exc) {
        return false;
    }
}
