package com.spotify.cosmos.android.cosmonaut;

import com.spotify.cosmos.android.cosmonaut.atoms.ServiceMethodFactory;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.router.RxRouter;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* access modifiers changed from: package-private */
public class CosmonautHandler {
    private final ServiceMethodFactory mServiceMethodFactory;

    CosmonautHandler(List<Converter.Factory> list) {
        this.mServiceMethodFactory = new ServiceMethodFactory(list);
    }

    public <T> T create(Class<T> cls, RxRouter rxRouter) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this, rxRouter));
    }

    /* access modifiers changed from: package-private */
    public Object handle(RxRouter rxRouter, Method method, Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        return this.mServiceMethodFactory.loadServiceMethod(method).create(rxRouter, objArr);
    }
}
