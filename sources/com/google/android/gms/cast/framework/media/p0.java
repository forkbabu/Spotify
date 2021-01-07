package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.internal.o;
import com.google.android.gms.cast.m;

/* access modifiers changed from: package-private */
public final class p0 implements o {
    private final /* synthetic */ h a;

    p0(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void a() {
        for (h.b bVar : this.a.g) {
            bVar.a();
        }
        for (h.a aVar : this.a.h) {
            aVar.getClass();
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void b() {
        this.a.getClass();
        for (h.b bVar : this.a.g) {
            bVar.b();
        }
        for (h.a aVar : this.a.h) {
            aVar.getClass();
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void c() {
        for (h.b bVar : this.a.g) {
            bVar.c();
        }
        for (h.a aVar : this.a.h) {
            aVar.getClass();
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void d() {
        for (h.b bVar : this.a.g) {
            bVar.d();
        }
        for (h.a aVar : this.a.h) {
            aVar.getClass();
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void e() {
        this.a.getClass();
        h.F(this.a);
        for (h.b bVar : this.a.g) {
            bVar.e();
        }
        for (h.a aVar : this.a.h) {
            aVar.a();
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void f(int[] iArr, int i) {
        for (h.a aVar : this.a.h) {
            aVar.c(iArr, i);
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void g(int[] iArr) {
        for (h.a aVar : this.a.h) {
            aVar.f(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void h(int[] iArr) {
        for (h.a aVar : this.a.h) {
            aVar.b(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void i(int[] iArr) {
        for (h.a aVar : this.a.h) {
            aVar.e(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void j(MediaError mediaError) {
        for (h.a aVar : this.a.h) {
            aVar.getClass();
        }
    }

    @Override // com.google.android.gms.cast.internal.o
    public final void k(m[] mVarArr) {
        for (h.a aVar : this.a.h) {
            aVar.d(mVarArr);
        }
    }
}
