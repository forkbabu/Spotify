package com.fasterxml.jackson.datatype.guava.deser.util;

import com.google.common.collect.BoundType;
import com.google.common.collect.Collections2;
import com.google.common.collect.Range;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class RangeFactory {
    private static Method legacyAllMethod;
    private static Method legacyDownToMethod;
    private static Method legacyRangeMethod;
    private static Method legacyUpToMethod;

    static {
        try {
            Class<?> cls = Class.forName("com.google.common.collect.Ranges");
            legacyRangeMethod = findMethod(cls, "range", Comparable.class, BoundType.class, Comparable.class, BoundType.class);
            legacyDownToMethod = findMethod(cls, "downTo", Comparable.class, BoundType.class);
            legacyUpToMethod = findMethod(cls, "upTo", Comparable.class, BoundType.class);
            legacyAllMethod = findMethod(cls, "all", new Class[0]);
        } catch (ClassNotFoundException unused) {
        }
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return createRange(new Callable<Range<C>>() {
            /* class com.fasterxml.jackson.datatype.guava.deser.util.RangeFactory.AnonymousClass4 */

            @Override // java.util.concurrent.Callable
            public Object call() {
                return Range.all();
            }
        }, legacyAllMethod, new Object[0]);
    }

    private static <C extends Comparable<?>> Range<C> createRange(Callable<Range<C>> callable, Method method, Object... objArr) {
        try {
            return callable.call();
        } catch (NoSuchMethodError e) {
            if (method != null) {
                try {
                    return (Range) method.invoke(null, objArr);
                } catch (Exception e2) {
                    StringBuilder V0 = je.V0("Failed to invoke legacy Range factory method [");
                    V0.append(method.getName());
                    V0.append("] with params ");
                    V0.append(Collections2.newArrayList(objArr));
                    V0.append(".");
                    throw new RuntimeException(V0.toString(), e2);
                }
            } else {
                throw e;
            }
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public static <C extends Comparable<?>> Range<C> downTo(final C c, final BoundType boundType) {
        return createRange(new Callable<Range<C>>() {
            /* class com.fasterxml.jackson.datatype.guava.deser.util.RangeFactory.AnonymousClass2 */

            @Override // java.util.concurrent.Callable
            public Object call() {
                return Range.downTo(c, boundType);
            }
        }, legacyDownToMethod, c, boundType);
    }

    private static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static <C extends Comparable<?>> Range<C> range(final C c, final BoundType boundType, final C c2, final BoundType boundType2) {
        return createRange(new Callable<Range<C>>() {
            /* class com.fasterxml.jackson.datatype.guava.deser.util.RangeFactory.AnonymousClass1 */

            @Override // java.util.concurrent.Callable
            public Object call() {
                return Range.range(c, boundType, c2, boundType2);
            }
        }, legacyRangeMethod, c, boundType, c2, boundType2);
    }

    public static <C extends Comparable<?>> Range<C> upTo(final C c, final BoundType boundType) {
        return createRange(new Callable<Range<C>>() {
            /* class com.fasterxml.jackson.datatype.guava.deser.util.RangeFactory.AnonymousClass3 */

            @Override // java.util.concurrent.Callable
            public Object call() {
                return Range.upTo(c, boundType);
            }
        }, legacyUpToMethod, c, boundType);
    }
}
