package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public class ChannelBufferInput implements MessageBufferInput {
    private final int bufferSize;
    private ReadableByteChannel channel;
    private boolean reachedEOF;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.channel.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.reachedEOF) {
            return null;
        }
        MessageBuffer newBuffer = MessageBuffer.newBuffer(this.bufferSize);
        ByteBuffer byteBuffer = newBuffer.toByteBuffer();
        while (!this.reachedEOF && byteBuffer.remaining() > 0) {
            if (this.channel.read(byteBuffer) == -1) {
                this.reachedEOF = true;
            }
        }
        byteBuffer.flip();
        if (byteBuffer.remaining() == 0) {
            return null;
        }
        return newBuffer.slice(0, byteBuffer.limit());
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        this.reachedEOF = false;
        return readableByteChannel2;
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int i) {
        boolean z = false;
        this.reachedEOF = false;
        yif.f(readableByteChannel, "input channel is null");
        this.channel = readableByteChannel;
        z = i > 0 ? true : z;
        yif.e(z, "buffer size must be > 0: " + i);
        this.bufferSize = i;
    }
}
