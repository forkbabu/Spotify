package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class b0 extends g0.c {
    private static final Class<?>[] f = {Application.class, a0.class};
    private static final Class<?>[] g = {a0.class};
    private final Application a;
    private final g0.a b;
    private final Bundle c;
    private final Lifecycle d;
    private final SavedStateRegistry e;

    public b0(Application application, b bVar, Bundle bundle) {
        this.e = bVar.g0();
        this.d = bVar.A();
        this.c = bundle;
        this.a = application;
        this.b = g0.a.b(application);
    }

    private static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.g0.c, androidx.lifecycle.g0.b
    public <T extends e0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.lifecycle.g0.e
    public void b(e0 e0Var) {
        SavedStateHandleController.a(e0Var, this.e, this.d);
    }

    @Override // androidx.lifecycle.g0.c
    public <T extends e0> T c(String str, Class<T> cls) {
        Constructor constructor;
        T t;
        boolean isAssignableFrom = b.class.isAssignableFrom(cls);
        if (isAssignableFrom) {
            constructor = d(cls, f);
        } else {
            constructor = d(cls, g);
        }
        if (constructor == null) {
            return (T) this.b.a(cls);
        }
        SavedStateHandleController c2 = SavedStateHandleController.c(this.e, this.d, str, this.c);
        if (isAssignableFrom) {
            try {
                t = (T) ((e0) constructor.newInstance(this.a, c2.d()));
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        } else {
            t = (T) ((e0) constructor.newInstance(c2.d()));
        }
        t.f("androidx.lifecycle.savedstate.vm.tag", c2);
        return t;
    }
}
