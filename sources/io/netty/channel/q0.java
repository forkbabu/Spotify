package io.netty.channel;

import io.netty.channel.d;
import io.netty.util.internal.r;

/* JADX WARN: Incorrect class signature, class is equals to this class: <T::Lio/netty/channel/d;>Ljava/lang/Object;Lio/netty/channel/q0<TT;>; */
public class q0<T extends d> implements hkf {
    private final Class<? extends T> a;

    public q0(Class<? extends T> cls) {
        this.a = cls;
    }

    public T a() {
        try {
            return (T) ((d) this.a.newInstance());
        } catch (Throwable th) {
            StringBuilder V0 = je.V0("Unable to create Channel from class ");
            V0.append(this.a);
            throw new ChannelException(V0.toString(), th);
        }
    }

    public String toString() {
        return r.e(this.a) + ".class";
    }
}
