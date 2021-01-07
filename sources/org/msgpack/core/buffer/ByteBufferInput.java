package org.msgpack.core.buffer;

import java.nio.ByteBuffer;

public class ByteBufferInput implements MessageBufferInput {
    private ByteBuffer input;
    private boolean isRead = false;

    public ByteBufferInput(ByteBuffer byteBuffer) {
        yif.f(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        this.isRead = true;
        return MessageBuffer.wrap(this.input);
    }

    public ByteBuffer reset(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.input;
        this.input = byteBuffer;
        this.isRead = false;
        return byteBuffer2;
    }
}
