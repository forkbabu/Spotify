package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class VersionedParcel {
    protected final m1<String, Method> a;
    protected final m1<String, Method> b;
    protected final m1<String, Class> c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(m1<String, Method> m1Var, m1<String, Method> m1Var2, m1<String, Class> m1Var3) {
        this.a = m1Var;
        this.b = m1Var2;
        this.c = m1Var3;
    }

    private Class c(Class<? extends c> cls) {
        Class orDefault = this.c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls2);
        return cls2;
    }

    private Method d(String str) {
        Method orDefault = this.a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) {
        Method orDefault = this.b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c2 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c2.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public void A(CharSequence charSequence, int i) {
        u(i);
        z(charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract void B(int i);

    public void C(int i, int i2) {
        u(i2);
        B(i);
    }

    /* access modifiers changed from: protected */
    public abstract void D(Parcelable parcelable);

    public void E(Parcelable parcelable, int i) {
        u(i);
        D(parcelable);
    }

    /* access modifiers changed from: protected */
    public abstract void F(String str);

    public void G(String str, int i) {
        u(i);
        F(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.versionedparcelable.VersionedParcel */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public void H(c cVar) {
        if (cVar == null) {
            F(null);
            return;
        }
        try {
            F(c(cVar.getClass()).getName());
            VersionedParcel b2 = b();
            try {
                e(cVar.getClass()).invoke(null, cVar, b2);
                b2.a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    public void I(c cVar, int i) {
        u(i);
        H(cVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract VersionedParcel b();

    /* access modifiers changed from: protected */
    public abstract boolean f();

    public boolean g(boolean z, int i) {
        if (!l(i)) {
            return z;
        }
        return f();
    }

    /* access modifiers changed from: protected */
    public abstract byte[] h();

    public byte[] i(byte[] bArr, int i) {
        if (!l(i)) {
            return bArr;
        }
        return h();
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence j();

    public CharSequence k(CharSequence charSequence, int i) {
        if (!l(i)) {
            return charSequence;
        }
        return j();
    }

    /* access modifiers changed from: protected */
    public abstract boolean l(int i);

    /* access modifiers changed from: protected */
    public abstract int m();

    public int n(int i, int i2) {
        if (!l(i2)) {
            return i;
        }
        return m();
    }

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T o();

    public <T extends Parcelable> T p(T t, int i) {
        return !l(i) ? t : (T) o();
    }

    /* access modifiers changed from: protected */
    public abstract String q();

    public String r(String str, int i) {
        if (!l(i)) {
            return str;
        }
        return q();
    }

    /* access modifiers changed from: protected */
    public <T extends c> T s() {
        String q = q();
        if (q == null) {
            return null;
        }
        try {
            return (T) ((c) d(q).invoke(null, b()));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public <T extends c> T t(T t, int i) {
        return !l(i) ? t : (T) s();
    }

    /* access modifiers changed from: protected */
    public abstract void u(int i);

    /* access modifiers changed from: protected */
    public abstract void v(boolean z);

    public void w(boolean z, int i) {
        u(i);
        v(z);
    }

    /* access modifiers changed from: protected */
    public abstract void x(byte[] bArr);

    public void y(byte[] bArr, int i) {
        u(i);
        x(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void z(CharSequence charSequence);
}
