package com.google.gson.internal;

import com.google.gson.b;
import com.google.gson.c;
import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class n implements x, Cloneable {
    public static final n c = new n();
    private List<b> a = Collections.emptyList();
    private List<b> b = Collections.emptyList();

    class a extends w<T> {
        private w<T> a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ j d;
        final /* synthetic */ z20 e;

        a(boolean z, boolean z2, j jVar, z20 z20) {
            this.b = z;
            this.c = z2;
            this.d = jVar;
            this.e = z20;
        }

        @Override // com.google.gson.w
        public T read(com.google.gson.stream.a aVar) {
            if (this.b) {
                aVar.b0();
                return null;
            }
            w<T> wVar = this.a;
            if (wVar == null) {
                wVar = this.d.d(n.this, this.e);
                this.a = wVar;
            }
            return wVar.read(aVar);
        }

        @Override // com.google.gson.w
        public void write(com.google.gson.stream.b bVar, T t) {
            if (this.c) {
                bVar.r();
                return;
            }
            w<T> wVar = this.a;
            if (wVar == null) {
                wVar = this.d.d(n.this, this.e);
                this.a = wVar;
            }
            wVar.write(bVar, t);
        }
    }

    private boolean d(Class<?> cls, boolean z) {
        for (b bVar : z ? this.a : this.b) {
            if (bVar.b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean f(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // com.google.gson.x
    public <T> w<T> b(j jVar, z20<T> z20) {
        Class<? super T> c2 = z20.c();
        boolean f = f(c2);
        boolean z = f || d(c2, true);
        boolean z2 = f || d(c2, false);
        if (z || z2) {
            return new a(z2, z, jVar, z20);
        }
        return null;
    }

    public boolean c(Class<?> cls, boolean z) {
        return f(cls) || d(cls, z);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public Object clone() {
        try {
            return (n) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean e(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || f(field.getType())) {
            return true;
        }
        List<b> list = z ? this.a : this.b;
        if (list.isEmpty()) {
            return false;
        }
        c cVar = new c(field);
        for (b bVar : list) {
            if (bVar.a(cVar)) {
                return true;
            }
        }
        return false;
    }
}
