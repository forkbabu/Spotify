package com.google.gson.internal;

import java.lang.reflect.Method;

class u extends x {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;

    u(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // com.google.gson.internal.x
    public <T> T b(Class<T> cls) {
        x.a(cls);
        return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
    }
}
