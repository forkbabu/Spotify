package io.netty.channel;

import io.netty.buffer.k;
import io.netty.util.j;

public class p<T> extends io.netty.util.a<p<T>> {
    public static final p<Boolean> A = i("SO_KEEPALIVE");
    public static final p<Integer> B = i("SO_SNDBUF");
    public static final p<Integer> C = i("SO_RCVBUF");
    public static final p<Boolean> D = i("SO_REUSEADDR");
    public static final p<Integer> E = i("SO_LINGER");
    public static final p<Integer> F = i("IP_TOS");
    public static final p<Boolean> G = i("TCP_NODELAY");
    public static final p<Boolean> H = i("SINGLE_EVENTEXECUTOR_PER_GROUP");
    private static final j<p<Object>> n = new a();
    public static final p<k> o = i("ALLOCATOR");
    public static final p<p0> p = i("RCVBUF_ALLOCATOR");
    public static final p<m0> q = i("MESSAGE_SIZE_ESTIMATOR");
    public static final p<Integer> r = i("CONNECT_TIMEOUT_MILLIS");
    @Deprecated
    public static final p<Integer> s = i("MAX_MESSAGES_PER_READ");
    public static final p<Integer> t = i("WRITE_SPIN_COUNT");
    @Deprecated
    public static final p<Integer> u = i("WRITE_BUFFER_HIGH_WATER_MARK");
    @Deprecated
    public static final p<Integer> v = i("WRITE_BUFFER_LOW_WATER_MARK");
    public static final p<x0> w = i("WRITE_BUFFER_WATER_MARK");
    public static final p<Boolean> x = i("ALLOW_HALF_CLOSURE");
    public static final p<Boolean> y = i("AUTO_READ");
    @Deprecated
    public static final p<Boolean> z = i("AUTO_CLOSE");

    static class a extends j<p<Object>> {
        a() {
        }

        /* Return type fixed from 'io.netty.util.i' to match base method */
        /* access modifiers changed from: protected */
        @Override // io.netty.util.j
        public p<Object> a(int i, String str) {
            return new p<>(i, str, null);
        }
    }

    static {
        i("SO_BROADCAST");
        i("SO_BACKLOG");
        i("SO_TIMEOUT");
        i("IP_MULTICAST_ADDR");
        i("IP_MULTICAST_IF");
        i("IP_MULTICAST_TTL");
        i("IP_MULTICAST_LOOP_DISABLED");
        i("DATAGRAM_CHANNEL_ACTIVE_ON_REGISTRATION");
    }

    p(int i, String str, a aVar) {
        super(i, str);
    }

    public static <T> p<T> i(String str) {
        return (p<T>) n.b(str);
    }
}
