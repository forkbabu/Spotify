package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* access modifiers changed from: package-private */
public class e implements q<T> {
    private final x a;
    final /* synthetic */ Class b;
    final /* synthetic */ Type c;

    e(f fVar, Class cls, Type type) {
        x xVar;
        this.b = cls;
        this.c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            xVar = new t(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                xVar = new u(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    xVar = new v(declaredMethod3);
                } catch (Exception unused3) {
                    xVar = new w();
                }
            }
        }
        this.a = xVar;
    }

    @Override // com.google.gson.internal.q
    public T a() {
        try {
            return (T) this.a.b(this.b);
        } catch (Exception e) {
            StringBuilder V0 = je.V0("Unable to invoke no-args constructor for ");
            V0.append(this.c);
            V0.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(V0.toString(), e);
        }
    }
}
