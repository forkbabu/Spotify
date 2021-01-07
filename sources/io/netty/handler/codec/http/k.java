package io.netty.handler.codec.http;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class k extends r {
    static final Iterator<Map.Entry<CharSequence, CharSequence>> a = Collections.emptyList().iterator();
    public static final k b = c0.a;

    protected k() {
    }

    @Override // io.netty.handler.codec.http.r
    public r A(String str, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.http.r
    public r d(String str, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.http.r
    public boolean h(String str) {
        return false;
    }

    @Override // io.netty.handler.codec.http.r
    public boolean isEmpty() {
        return true;
    }

    @Override // io.netty.handler.codec.http.r, java.lang.Iterable
    public Iterator<Map.Entry<String, String>> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // io.netty.handler.codec.http.r
    public String k(String str) {
        return null;
    }

    @Override // io.netty.handler.codec.http.r
    public List<String> n(String str) {
        return Collections.emptyList();
    }

    @Override // io.netty.handler.codec.http.r
    public Iterator<Map.Entry<CharSequence, CharSequence>> o() {
        return a;
    }

    @Override // io.netty.handler.codec.http.r
    public r u(String str) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.http.r
    public r z(String str, Iterable<?> iterable) {
        throw new UnsupportedOperationException("read only");
    }
}
