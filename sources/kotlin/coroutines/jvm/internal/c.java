package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c {
    private static final a a = new a(null, null, null);
    public static a b;
    public static final c c = new c();

    private static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private c() {
    }

    public final String a(BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        a aVar = a;
        h.e(baseContinuationImpl, "continuation");
        a aVar2 = b;
        if (aVar2 == null) {
            try {
                a aVar3 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                b = aVar3;
                aVar2 = aVar3;
            } catch (Exception unused) {
                b = aVar;
                aVar2 = aVar;
            }
        }
        String str = null;
        if (aVar2 == aVar || (method = aVar2.a) == null || (invoke = method.invoke(baseContinuationImpl.getClass(), new Object[0])) == null || (method2 = aVar2.b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar2.c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            str = invoke3;
        }
        return str;
    }
}
