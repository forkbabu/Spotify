package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.c;
import retrofit2.j;

/* access modifiers changed from: package-private */
public class s {
    private static final s a;

    static class a extends s {

        /* renamed from: retrofit2.s$a$a  reason: collision with other inner class name */
        static class ExecutorC0677a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            ExecutorC0677a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public List<? extends c.a> a(Executor executor) {
            if (executor != null) {
                k kVar = new k(executor);
                if (Build.VERSION.SDK_INT >= 24) {
                    return Arrays.asList(g.a, kVar);
                }
                return Collections.singletonList(kVar);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public int b() {
            return Build.VERSION.SDK_INT >= 24 ? 2 : 1;
        }

        @Override // retrofit2.s
        public Executor c() {
            return new ExecutorC0677a();
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public List<? extends j.a> d() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Collections.singletonList(o.a);
            }
            return Collections.emptyList();
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public int e() {
            return Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public boolean h(Method method) {
            if (Build.VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }
    }

    static class b extends s {
        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public List<? extends c.a> a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(g.a);
            arrayList.add(new k(executor));
            return Collections.unmodifiableList(arrayList);
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public int b() {
            return 2;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public List<? extends j.a> d() {
            return Collections.singletonList(o.a);
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public int e() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.s
        public boolean h(Method method) {
            return method.isDefault();
        }
    }

    static {
        s sVar;
        try {
            Class.forName("android.os.Build");
            int i = Build.VERSION.SDK_INT;
            sVar = new a();
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("java.util.Optional");
                sVar = new b();
            } catch (ClassNotFoundException unused2) {
                sVar = new s();
            }
        }
        a = sVar;
    }

    s() {
    }

    static s f() {
        return a;
    }

    /* access modifiers changed from: package-private */
    public List<? extends c.a> a(Executor executor) {
        return Collections.singletonList(new k(executor));
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public Executor c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<? extends j.a> d() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public boolean h(Method method) {
        return false;
    }
}
