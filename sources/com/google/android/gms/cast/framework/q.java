package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.framework.h;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class q<T extends h> extends o0 {
    private final j<T> a;
    private final Class<T> b;

    public q(j<T> jVar, Class<T> cls) {
        this.a = jVar;
        this.b = cls;
    }

    public final void D3(a aVar) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.j(this.b.cast(hVar));
        }
    }

    public final void E3(a aVar, int i) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.i(this.b.cast(hVar), i);
        }
    }

    public final void F3(a aVar, String str) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.l(this.b.cast(hVar), str);
        }
    }

    public final void G3(a aVar, boolean z) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.m(this.b.cast(hVar), z);
        }
    }

    public final a H3() {
        return b.F3(this.a);
    }

    public final void I3(a aVar) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.o(this.b.cast(hVar));
        }
    }

    public final void J3(a aVar, int i) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.h(this.b.cast(hVar), i);
        }
    }

    public final void K3(a aVar, String str) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.g(this.b.cast(hVar), str);
        }
    }

    public final void L3(a aVar, int i) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.n(this.b.cast(hVar), i);
        }
    }

    public final void M3(a aVar, int i) {
        j<T> jVar;
        h hVar = (h) b.E3(aVar);
        if (this.b.isInstance(hVar) && (jVar = this.a) != null) {
            jVar.f(this.b.cast(hVar), i);
        }
    }
}
