package io.netty.handler.ssl;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.buffer.k;
import io.netty.util.IllegalReferenceCountException;
import io.netty.util.b;
import io.netty.util.h;
import io.netty.util.o;
import java.nio.charset.Charset;
import java.security.PrivateKey;

public final class PemPrivateKey extends b implements PrivateKey, c0 {
    private static final byte[] b;
    private static final byte[] c;
    private final j content;

    static {
        Charset charset = h.f;
        b = "-----BEGIN PRIVATE KEY-----\n".getBytes(charset);
        c = "\n-----END PRIVATE KEY-----\n".getBytes(charset);
    }

    static c0 f(k kVar, boolean z, PrivateKey privateKey) {
        if (privateKey instanceof c0) {
            return ((c0) privateKey).h();
        }
        j e = j0.e(privateKey.getEncoded());
        try {
            j a = b.a(kVar, e);
            try {
                byte[] bArr = b;
                int length = bArr.length + a.m1();
                byte[] bArr2 = c;
                int length2 = length + bArr2.length;
                e = z ? kVar.h(length2) : kVar.j(length2);
                try {
                    e.U1(bArr);
                    e.R1(a);
                    e.U1(bArr2);
                    d0 d0Var = new d0(e, true);
                    b.b(a);
                    a.d();
                    return d0Var;
                } finally {
                    b.b(e);
                    e.d();
                }
            } finally {
                b.b(a);
                a.d();
            }
        } finally {
            b.b(e);
            e.d();
        }
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.util.b
    public void a() {
        j jVar = this.content;
        b.b(jVar);
        jVar.d();
    }

    @Override // io.netty.buffer.l
    public j content() {
        int n = n();
        if (n > 0) {
            return this.content;
        }
        throw new IllegalReferenceCountException(n);
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        b(n());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // io.netty.handler.ssl.c0
    public c0 h() {
        super.e();
        return this;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return n() == 0;
    }

    @Override // io.netty.handler.ssl.c0
    public boolean x() {
        return true;
    }

    @Override // io.netty.util.o
    public o z(Object obj) {
        this.content.z(obj);
        return this;
    }
}
