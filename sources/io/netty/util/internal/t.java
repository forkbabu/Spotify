package io.netty.util.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public abstract class t {
    private static final t a = new l();
    private static final Object b = new Object();

    /* access modifiers changed from: private */
    public static final class a extends t {
        private final Class<?> c;

        a(Class<?> cls) {
            this.c = cls;
        }

        @Override // io.netty.util.internal.t
        public boolean d(Object obj) {
            return this.c.isInstance(obj);
        }
    }

    protected t() {
    }

    private static Class<?> a(Class<?> cls, String str) {
        throw new IllegalStateException("cannot determine the type of the type parameter '" + str + "': " + cls);
    }

    public static t b(Object obj, Class<?> cls, String str) {
        e e = e.e();
        Map map = e.g;
        if (map == null) {
            map = new IdentityHashMap();
            e.g = map;
        }
        Class<?> cls2 = obj.getClass();
        Map map2 = (Map) map.get(cls2);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(cls2, map2);
        }
        t tVar = (t) map2.get(str);
        if (tVar != null) {
            return tVar;
        }
        Class<?> cls3 = Object.class;
        Class<?> cls4 = obj.getClass();
        Class<?> cls5 = cls4;
        String str2 = str;
        while (true) {
            if (cls5.getSuperclass() == cls) {
                int i = -1;
                TypeVariable<Class<? super Object>>[] typeParameters = cls5.getSuperclass().getTypeParameters();
                int i2 = 0;
                while (true) {
                    if (i2 >= typeParameters.length) {
                        break;
                    } else if (str2.equals(typeParameters[i2].getName())) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    Type genericSuperclass = cls5.getGenericSuperclass();
                    if (!(genericSuperclass instanceof ParameterizedType)) {
                        break;
                    }
                    Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[i];
                    if (type instanceof ParameterizedType) {
                        type = ((ParameterizedType) type).getRawType();
                    }
                    if (type instanceof Class) {
                        cls3 = (Class) type;
                        break;
                    }
                    if (type instanceof GenericArrayType) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        if (genericComponentType instanceof ParameterizedType) {
                            genericComponentType = ((ParameterizedType) genericComponentType).getRawType();
                        }
                        if (genericComponentType instanceof Class) {
                            cls3 = Array.newInstance((Class) genericComponentType, 0).getClass();
                            break;
                        }
                    }
                    if (type instanceof TypeVariable) {
                        TypeVariable typeVariable = (TypeVariable) type;
                        if (typeVariable.getGenericDeclaration() instanceof Class) {
                            Class<?> cls6 = (Class) typeVariable.getGenericDeclaration();
                            str2 = typeVariable.getName();
                            if (!cls6.isAssignableFrom(cls4)) {
                                break;
                            }
                            cls = cls6;
                            cls5 = cls4;
                        } else {
                            break;
                        }
                    } else {
                        a(cls4, str2);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("unknown type parameter '" + str2 + "': " + cls);
                }
            } else {
                cls5 = cls5.getSuperclass();
                if (cls5 == null) {
                    a(cls4, str2);
                    throw null;
                }
            }
        }
        t c = c(cls3);
        map2.put(str, c);
        return c;
    }

    public static t c(Class<?> cls) {
        e e = e.e();
        Map map = e.f;
        if (map == null) {
            map = new IdentityHashMap();
            e.f = map;
        }
        t tVar = (t) map.get(cls);
        if (tVar == null) {
            if (cls == Object.class) {
                tVar = a;
            } else if (PlatformDependent.y()) {
                try {
                    tVar = f.a(cls);
                    tVar.d(b);
                } catch (Exception | IllegalAccessError unused) {
                    tVar = null;
                }
            }
            if (tVar == null) {
                tVar = new a(cls);
            }
            map.put(cls, tVar);
        }
        return tVar;
    }

    public abstract boolean d(Object obj);
}
