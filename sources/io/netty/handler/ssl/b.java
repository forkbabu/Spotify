package io.netty.handler.ssl;

import io.netty.buffer.j;
import io.netty.buffer.k;
import io.netty.handler.codec.base64.Base64Dialect;
import io.netty.handler.codec.base64.a;

final class b {
    static j a(k kVar, j jVar) {
        j a = a.a(jVar, jVar.n1(), jVar.m1(), true, Base64Dialect.STANDARD, kVar);
        jVar.p1(jVar.Z1());
        return a;
    }

    static void b(j jVar) {
        if (!jVar.J0()) {
            jVar.G1(0, jVar.J());
        }
    }
}
