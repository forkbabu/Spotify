package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class r {
    private static Map<Class<?>, Integer> a = new HashMap();
    private static Map<Class<?>, List<Constructor<? extends h>>> b = new HashMap();

    private static h a(Constructor<? extends h> constructor, Object obj) {
        try {
            return (h) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int c(Class<?> cls) {
        Constructor<?> constructor;
        Integer num = a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b2 = b(canonicalName);
                if (!name.isEmpty()) {
                    b2 = name + "." + b2;
                }
                constructor = Class.forName(b2).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                b.put(cls, Collections.singletonList(constructor));
            } else if (!c.c.c(cls)) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass != null && m.class.isAssignableFrom(superclass)) {
                    if (c(superclass) != 1) {
                        arrayList = new ArrayList(b.get(superclass));
                    }
                }
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Class<?> cls2 = interfaces[i2];
                        if (cls2 != null && m.class.isAssignableFrom(cls2)) {
                            if (c(cls2) == 1) {
                                break;
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.addAll(b.get(cls2));
                        }
                        i2++;
                    } else if (arrayList != null) {
                        b.put(cls, arrayList);
                    }
                }
            }
            i = 2;
        }
        a.put(cls, Integer.valueOf(i));
        return i;
    }

    static l d(Object obj) {
        boolean z = obj instanceof l;
        boolean z2 = obj instanceof g;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((g) obj, (l) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((g) obj, null);
        }
        if (z) {
            return (l) obj;
        }
        Class<?> cls = obj.getClass();
        if (c(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends h>> list = b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        h[] hVarArr = new h[list.size()];
        for (int i = 0; i < list.size(); i++) {
            hVarArr[i] = a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(hVarArr);
    }
}
