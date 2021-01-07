package org.msgpack.core.buffer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class InputStreamBufferInput implements MessageBufferInput {
    private final int bufferSize;
    private InputStream in;
    private boolean reachedEOF;

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public static MessageBufferInput newBufferInput(InputStream inputStream) {
        FileChannel channel;
        yif.f(inputStream, "InputStream is null");
        if (!(inputStream instanceof FileInputStream) || (channel = ((FileInputStream) inputStream).getChannel()) == null) {
            return new InputStreamBufferInput(inputStream);
        }
        return new ChannelBufferInput(channel);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.reachedEOF) {
            return null;
        }
        byte[] bArr = new byte[this.bufferSize];
        int read = this.in.read(bArr);
        if (read != -1) {
            return MessageBuffer.wrap(bArr).slice(0, read);
        }
        this.reachedEOF = true;
        return null;
    }

    public InputStream reset(InputStream inputStream) {
        InputStream inputStream2 = this.in;
        this.in = inputStream;
        this.reachedEOF = false;
        return inputStream2;
    }

    public InputStreamBufferInput(InputStream inputStream, int i) {
        this.reachedEOF = false;
        yif.f(inputStream, "input is null");
        this.in = inputStream;
        this.bufferSize = i;
    }
}
