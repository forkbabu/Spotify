package io.netty.handler.codec.http;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.handler.codec.d;
import io.netty.util.o;

public interface e0 extends o {
    public static final e0 l = new a();

    static class a implements e0 {
        a() {
        }

        @Override // io.netty.buffer.l
        public j content() {
            return j0.b;
        }

        @Override // io.netty.util.o
        public boolean d() {
            return false;
        }

        @Override // io.netty.handler.codec.http.v
        public void e(d dVar) {
            throw new UnsupportedOperationException("read only");
        }

        @Override // io.netty.util.o
        public int n() {
            return 1;
        }

        public String toString() {
            return "EmptyLastHttpContent";
        }

        @Override // io.netty.handler.codec.http.e0
        public r u() {
            return k.b;
        }

        @Override // io.netty.util.o
        public o z(Object obj) {
            return this;
        }
    }

    r u();
}
