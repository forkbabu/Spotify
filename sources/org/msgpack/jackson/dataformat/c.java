package org.msgpack.jackson.dataformat;

public class c<F, S> {
    private final F a;
    private final S b;

    public c(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public F a() {
        return this.a;
    }

    public S b() {
        return this.b;
    }
}
