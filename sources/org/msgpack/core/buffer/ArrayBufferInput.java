package org.msgpack.core.buffer;

public class ArrayBufferInput implements MessageBufferInput {
    private MessageBuffer buffer;
    private boolean isRead;

    public ArrayBufferInput(MessageBuffer messageBuffer) {
        this.isRead = false;
        yif.f(messageBuffer, "input buffer is null");
        this.buffer = messageBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.buffer = null;
        this.isRead = false;
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        this.isRead = true;
        return this.buffer;
    }

    public MessageBuffer reset(MessageBuffer messageBuffer) {
        MessageBuffer messageBuffer2 = this.buffer;
        this.buffer = messageBuffer;
        this.isRead = false;
        return messageBuffer2;
    }

    public ArrayBufferInput(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public void reset(byte[] bArr) {
        yif.f(bArr, "input array is null");
        reset(MessageBuffer.wrap(bArr));
    }

    public ArrayBufferInput(byte[] bArr, int i, int i2) {
        boolean z = false;
        this.isRead = false;
        yif.d(i + i2 <= bArr.length ? true : z);
        yif.f(bArr, "input array is null");
        this.buffer = MessageBuffer.wrap(bArr).slice(i, i2);
    }

    public void reset(byte[] bArr, int i, int i2) {
        yif.f(bArr, "input array is null");
        reset(MessageBuffer.wrap(bArr).slice(i, i2));
    }
}
