package com.google.gson.internal;

import java.lang.reflect.Modifier;

public abstract class x {
    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder V0 = je.V0("Interface can't be instantiated! Interface name: ");
            V0.append(cls.getName());
            throw new UnsupportedOperationException(V0.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder V02 = je.V0("Abstract class can't be instantiated! Class name: ");
            V02.append(cls.getName());
            throw new UnsupportedOperationException(V02.toString());
        }
    }

    public abstract <T> T b(Class<T> cls);
}
