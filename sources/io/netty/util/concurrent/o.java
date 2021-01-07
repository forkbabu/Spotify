package io.netty.util.concurrent;

public final class o<V> extends e<V> {
    private final Throwable b;

    public o(l lVar, Throwable th) {
        super(lVar);
        if (th != null) {
            this.b = th;
            return;
        }
        throw new NullPointerException("cause");
    }

    @Override // io.netty.util.concurrent.r
    public Throwable r() {
        return this.b;
    }

    @Override // io.netty.util.concurrent.r
    public V s() {
        return null;
    }

    @Override // io.netty.util.concurrent.r
    public boolean x() {
        return false;
    }
}
