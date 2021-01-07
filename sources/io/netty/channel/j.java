package io.netty.channel;

import io.netty.channel.i;
import io.netty.util.internal.e;
import java.util.Map;

public abstract class j implements i {
    boolean a;

    @Override // io.netty.channel.i
    public void D(k kVar) {
    }

    public boolean a() {
        Class<?> cls = getClass();
        Map<Class<?>, Boolean> g = e.e().g();
        Boolean bool = g.get(cls);
        if (bool == null) {
            bool = Boolean.valueOf(cls.isAnnotationPresent(i.a.class));
            g.put(cls, bool);
        }
        return bool.booleanValue();
    }

    @Override // io.netty.channel.i, io.netty.channel.l
    public void d(k kVar, Throwable th) {
        kVar.v(th);
    }

    @Override // io.netty.channel.i
    public void r(k kVar) {
    }
}
