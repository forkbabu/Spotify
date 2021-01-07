package com.google.gson.internal;

import java.lang.reflect.Method;

class v extends x {
    final /* synthetic */ Method a;

    v(Method method) {
        this.a = method;
    }

    @Override // com.google.gson.internal.x
    public <T> T b(Class<T> cls) {
        x.a(cls);
        return (T) this.a.invoke(null, cls, Object.class);
    }
}
