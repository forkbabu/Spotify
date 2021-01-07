package okio;

public abstract class j implements w {
    private final w a;

    public j(w wVar) {
        if (wVar != null) {
            this.a = wVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final w a() {
        return this.a;
    }

    @Override // okio.w
    public long c2(e eVar, long j) {
        return this.a.c2(eVar, j);
    }

    @Override // okio.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // okio.w
    public x k() {
        return this.a.k();
    }

    @Override // java.lang.Object
    public String toString() {
        return getClass().getSimpleName() + "(" + this.a.toString() + ")";
    }
}
