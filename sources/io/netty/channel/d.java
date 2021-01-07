package io.netty.channel;

import io.netty.buffer.k;
import io.netty.channel.p0;
import io.netty.util.f;
import java.net.SocketAddress;

public interface d extends f, s, Comparable<d> {

    public interface a {
        q A();

        void B();

        void C(i0 i0Var, v vVar);

        void D();

        SocketAddress E();

        void flush();

        void i(v vVar);

        void k(v vVar);

        v l();

        void u(SocketAddress socketAddress, SocketAddress socketAddress2, v vVar);

        void x(Object obj, v vVar);

        p0.a y();

        SocketAddress z();
    }

    i0 V();

    e X();

    boolean g0();

    ChannelId id();

    boolean isActive();

    boolean isOpen();

    a l0();

    o metadata();

    boolean n0();

    t o();

    d read();

    k t();
}
