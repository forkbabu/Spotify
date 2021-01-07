package com.google.firebase.installations;

import com.google.android.gms.tasks.h;
import com.google.firebase.installations.a;
import com.google.firebase.installations.local.c;

class i implements m {
    private final n a;
    private final h<k> b;

    public i(n nVar, h<k> hVar) {
        this.a = nVar;
        this.b = hVar;
    }

    @Override // com.google.firebase.installations.m
    public boolean a(c cVar) {
        if (!cVar.j() || this.a.b(cVar)) {
            return false;
        }
        h<k> hVar = this.b;
        a.b bVar = new a.b();
        bVar.d(cVar.a());
        bVar.c(cVar.b());
        bVar.b(cVar.g());
        hVar.c(bVar.a());
        return true;
    }

    @Override // com.google.firebase.installations.m
    public boolean b(c cVar, Exception exc) {
        if (!cVar.h() && !cVar.i() && !cVar.k()) {
            return false;
        }
        this.b.d(exc);
        return true;
    }
}
