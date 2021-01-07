package com.google.gson.internal;

import java.lang.reflect.Method;

class t extends x {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;

    t(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // com.google.gson.internal.x
    public <T> T b(Class<T> cls) {
        x.a(cls);
        return (T) this.a.invoke(this.b, cls);
    }
}
