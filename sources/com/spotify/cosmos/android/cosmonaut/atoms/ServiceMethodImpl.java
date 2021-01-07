package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.cosmonaut.ServiceMethod;
import com.spotify.cosmos.router.RxRouter;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class ServiceMethodImpl implements ServiceMethod {
    private final RequestAtom mRequestAtom;
    private final ReturnTypeConverter mReturnTypeConverter;
    private final ResponseTransformer mReturnTypeTransformer;

    ServiceMethodImpl(Method method, RequestTransformers requestTransformers, ResponseTransformers responseTransformers) {
        this.mRequestAtom = new RequestAtom(method, requestTransformers);
        this.mReturnTypeTransformer = responseTransformers.create(method.getGenericReturnType());
        this.mReturnTypeConverter = ReturnTypeConverters.find(method);
    }

    @Override // com.spotify.cosmos.android.cosmonaut.ServiceMethod
    public Object create(RxRouter rxRouter, Object[] objArr) {
        return this.mReturnTypeConverter.convert(this.mReturnTypeTransformer, rxRouter.resolve(this.mRequestAtom.call(objArr)));
    }
}
