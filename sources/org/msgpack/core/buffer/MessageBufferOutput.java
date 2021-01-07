package org.msgpack.core.buffer;

import java.io.Closeable;

public interface MessageBufferOutput extends Closeable {
    void flush(MessageBuffer messageBuffer);

    MessageBuffer next(int i);
}
