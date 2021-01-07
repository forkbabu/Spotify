package com.google.firebase.components;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements t10 {
    private final l a;
    private final d b;

    private i(l lVar, d dVar) {
        this.a = lVar;
        this.b = dVar;
    }

    public static t10 a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    @Override // defpackage.t10
    public Object get() {
        l lVar = this.a;
        d dVar = this.b;
        int i = l.f;
        return dVar.c().a(new t(dVar, lVar));
    }
}
