package okio;

import java.io.Closeable;
import java.io.Flushable;

public interface v extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    x k();

    void l0(e eVar, long j);
}
