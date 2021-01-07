package com.spotify.cosmos.android.cosmonaut;

import com.spotify.cosmos.router.RxRouter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final /* synthetic */ class a implements InvocationHandler {
    public final /* synthetic */ CosmonautHandler a;
    public final /* synthetic */ RxRouter b;

    public /* synthetic */ a(CosmonautHandler cosmonautHandler, RxRouter rxRouter) {
        this.a = cosmonautHandler;
        this.b = rxRouter;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.a.handle(this.b, method, objArr);
    }
}
