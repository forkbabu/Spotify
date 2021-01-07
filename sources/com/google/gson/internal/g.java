package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* access modifiers changed from: package-private */
public class g implements q<T> {
    final /* synthetic */ Constructor a;

    g(f fVar, Constructor constructor) {
        this.a = constructor;
    }

    @Override // com.google.gson.internal.q
    public T a() {
        try {
            return (T) this.a.newInstance(null);
        } catch (InstantiationException e) {
            StringBuilder V0 = je.V0("Failed to invoke ");
            V0.append(this.a);
            V0.append(" with no args");
            throw new RuntimeException(V0.toString(), e);
        } catch (InvocationTargetException e2) {
            StringBuilder V02 = je.V0("Failed to invoke ");
            V02.append(this.a);
            V02.append(" with no args");
            throw new RuntimeException(V02.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
