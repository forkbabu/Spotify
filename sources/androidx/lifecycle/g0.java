package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

public class g0 {
    private final b a;
    private final h0 b;

    public static class a extends d {
        private static a b;
        private Application a;

        public a(Application application) {
            this.a = application;
        }

        public static a b(Application application) {
            if (b == null) {
                b = new a(application);
            }
            return b;
        }

        @Override // androidx.lifecycle.g0.d, androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            if (!b.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.a);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    public interface b {
        <T extends e0> T a(Class<T> cls);
    }

    /* access modifiers changed from: package-private */
    public static abstract class c extends e implements b {
        c() {
        }

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends e0> T c(String str, Class<T> cls);
    }

    public static class d implements b {
        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    static class e {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void b(e0 e0Var) {
        }
    }

    public g0(i0 i0Var) {
        this(i0Var.Z(), ((i) i0Var).l1());
    }

    public <T extends e0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String x0 = je.x0("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            T t = (T) this.b.b(x0);
            if (cls.isInstance(t)) {
                b bVar = this.a;
                if (!(bVar instanceof e)) {
                    return t;
                }
                ((e) bVar).b(t);
                return t;
            }
            b bVar2 = this.a;
            T t2 = bVar2 instanceof c ? (T) ((c) bVar2).c(x0, cls) : (T) bVar2.a(cls);
            this.b.d(x0, t2);
            return t2;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public g0(i0 i0Var, b bVar) {
        this(i0Var.Z(), bVar);
    }

    public g0(h0 h0Var, b bVar) {
        this.a = bVar;
        this.b = h0Var;
    }
}
