package io.netty.util.internal;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public class u {
    static final ThreadLocal<e> k = new ThreadLocal<>();
    static final AtomicInteger l = new AtomicInteger();
    Object[] a;
    int b;
    Map<Class<?>, Boolean> c;
    d d;
    ThreadLocalRandom e;
    Map<Class<?>, t> f;
    Map<Class<?>, Map<String, t>> g;
    StringBuilder h;
    Map<Charset, CharsetEncoder> i;
    Map<Charset, CharsetDecoder> j;

    u(Object[] objArr) {
        this.a = objArr;
    }
}
