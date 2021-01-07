package org.msgpack.core.buffer;

import java.io.OutputStream;

public class OutputStreamBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private OutputStream out;
    private byte[] tmpBuf;

    public OutputStreamBufferOutput(OutputStream outputStream) {
        yif.f(outputStream, "output is null");
        this.out = outputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.out.flush();
        } finally {
            this.out.close();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void flush(MessageBuffer messageBuffer) {
        int size = messageBuffer.size();
        if (messageBuffer.hasArray()) {
            this.out.write(messageBuffer.getArray(), messageBuffer.offset(), size);
            return;
        }
        byte[] bArr = this.tmpBuf;
        if (bArr == null || bArr.length < size) {
            this.tmpBuf = new byte[size];
        }
        messageBuffer.getBytes(0, this.tmpBuf, 0, size);
        this.out.write(this.tmpBuf, 0, size);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i) {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer == null || messageBuffer.size != i) {
            this.buffer = MessageBuffer.newBuffer(i);
        }
        return this.buffer;
    }

    public OutputStream reset(OutputStream outputStream) {
        OutputStream outputStream2 = this.out;
        this.out = outputStream;
        return outputStream2;
    }
}
