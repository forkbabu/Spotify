package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.t;
import java.io.Serializable;

public final class g {
    private final t a;
    private final boolean b;
    private final boolean c;
    private final Object d;

    public static final class a {
        private t<?> a;
        private boolean b = false;
        private Object c;
        private boolean d = false;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX DEBUG: Type inference failed for r0v14. Raw type applied. Possible types: androidx.navigation.t<java.lang.String[]> */
        public g a() {
            t tVar;
            t pVar;
            if (this.a == null) {
                Object obj = this.c;
                if (obj instanceof Integer) {
                    tVar = t.b;
                } else if (obj instanceof int[]) {
                    tVar = t.d;
                } else if (obj instanceof Long) {
                    tVar = t.e;
                } else if (obj instanceof long[]) {
                    tVar = t.f;
                } else if (obj instanceof Float) {
                    tVar = t.g;
                } else if (obj instanceof float[]) {
                    tVar = t.h;
                } else if (obj instanceof Boolean) {
                    tVar = t.i;
                } else if (obj instanceof boolean[]) {
                    tVar = t.j;
                } else if ((obj instanceof String) || obj == null) {
                    tVar = t.k;
                } else if (obj instanceof String[]) {
                    tVar = t.l;
                } else {
                    if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                        pVar = new t.m(obj.getClass().getComponentType());
                    } else if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
                        pVar = new t.o(obj.getClass().getComponentType());
                    } else if (obj instanceof Parcelable) {
                        pVar = new t.n(obj.getClass());
                    } else if (obj instanceof Enum) {
                        pVar = new t.l(obj.getClass());
                    } else if (obj instanceof Serializable) {
                        pVar = new t.p(obj.getClass());
                    } else {
                        throw new IllegalArgumentException(je.n0(obj, je.V0("Object of type "), " is not supported for navigation arguments."));
                    }
                    tVar = pVar;
                }
                this.a = tVar;
            }
            return new g(this.a, this.b, this.c, this.d);
        }

        public a b(Object obj) {
            this.c = obj;
            this.d = true;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(t<?> tVar) {
            this.a = tVar;
            return this;
        }
    }

    g(t<?> tVar, boolean z, Object obj, boolean z2) {
        if (!tVar.c() && z) {
            throw new IllegalArgumentException(tVar.b() + " does not allow nullable values");
        } else if (z || !z2 || obj != null) {
            this.a = tVar;
            this.b = z;
            this.d = obj;
            this.c = z2;
        } else {
            StringBuilder V0 = je.V0("Argument with type ");
            V0.append(tVar.b());
            V0.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(V0.toString());
        }
    }

    public Object a() {
        return this.d;
    }

    public t<?> b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void e(String str, Bundle bundle) {
        if (this.c) {
            this.a.e(bundle, str, this.d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.b != gVar.b || this.c != gVar.c || !this.a.equals(gVar.a)) {
            return false;
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            return obj2.equals(gVar.d);
        }
        if (gVar.d == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean f(String str, Bundle bundle) {
        if (!this.b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.a.a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
