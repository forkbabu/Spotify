package io.netty.handler.codec.http;

import io.netty.handler.codec.d;

public class g implements v {
    private d a = d.d;

    protected g() {
    }

    @Override // io.netty.handler.codec.http.v
    public d a() {
        return this.a;
    }

    @Override // io.netty.handler.codec.http.v
    public void e(d dVar) {
        this.a = dVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.a.equals(((g) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() + 31;
    }
}
