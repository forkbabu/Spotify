package okio;

public abstract class i implements v {
    private final v a;

    public i(v vVar) {
        if (vVar != null) {
            this.a = vVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // okio.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // okio.v, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // okio.v
    public x k() {
        return this.a.k();
    }

    @Override // okio.v
    public void l0(e eVar, long j) {
        this.a.l0(eVar, j);
    }

    @Override // java.lang.Object
    public String toString() {
        return getClass().getSimpleName() + "(" + this.a.toString() + ")";
    }
}
