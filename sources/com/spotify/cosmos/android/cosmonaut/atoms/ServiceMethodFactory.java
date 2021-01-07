package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.cosmonaut.ServiceMethod;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceMethodFactory {
    private final RequestTransformers mRequestTransformers;
    private final ResponseTransformers mResponseTransformers;
    private final Map<Method, ServiceMethod> mServiceMethodCache = new ConcurrentHashMap();

    public ServiceMethodFactory(List<Converter.Factory> list) {
        this.mRequestTransformers = new RequestTransformers(list);
        this.mResponseTransformers = new ResponseTransformers(list);
    }

    public ServiceMethod loadServiceMethod(Method method) {
        ServiceMethod serviceMethod;
        ServiceMethod serviceMethod2 = this.mServiceMethodCache.get(method);
        if (serviceMethod2 != null) {
            return serviceMethod2;
        }
        synchronized (this.mServiceMethodCache) {
            serviceMethod = this.mServiceMethodCache.get(method);
            if (serviceMethod == null) {
                serviceMethod = new ServiceMethodImpl(method, this.mRequestTransformers, this.mResponseTransformers);
                this.mServiceMethodCache.put(method, serviceMethod);
            }
        }
        return serviceMethod;
    }
}
