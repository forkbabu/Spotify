package io.netty.handler.ssl;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

public abstract class b0 implements SSLSessionContext {
    private static final Enumeration<byte[]> b = new b(null);
    final f0 a;

    private static final class b implements Enumeration<byte[]> {
        b(a aVar) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Enumeration
        public byte[] nextElement() {
            throw new NoSuchElementException();
        }
    }

    b0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public Enumeration<byte[]> getIds() {
        return b;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public SSLSession getSession(byte[] bArr) {
        if (bArr != null) {
            return null;
        }
        throw new NullPointerException("bytes");
    }
}
