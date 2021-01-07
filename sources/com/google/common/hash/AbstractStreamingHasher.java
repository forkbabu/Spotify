package com.google.common.hash;

import com.google.common.base.MoreObjects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class AbstractStreamingHasher extends AbstractHasher {
    private final ByteBuffer buffer;
    private final int bufferSize;
    private final int chunkSize;

    protected AbstractStreamingHasher(int i) {
        MoreObjects.checkArgument(i % i == 0);
        this.buffer = ByteBuffer.allocate(i + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.bufferSize = i;
        this.chunkSize = i;
    }

    private void munch() {
        this.buffer.flip();
        while (this.buffer.remaining() >= this.chunkSize) {
            process(this.buffer);
        }
        this.buffer.compact();
    }

    private void munchIfFull() {
        if (this.buffer.remaining() < 8) {
            munch();
        }
    }

    @Override // com.google.common.hash.Hasher
    public final HashCode hash() {
        munch();
        this.buffer.flip();
        if (this.buffer.remaining() > 0) {
            processRemaining(this.buffer);
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.limit());
        }
        return makeHash();
    }

    /* access modifiers changed from: protected */
    public abstract HashCode makeHash();

    /* access modifiers changed from: protected */
    public abstract void process(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void processRemaining(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putByte */
    public final Hasher mo78putByte(byte b) {
        this.buffer.put(b);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher
    public final Hasher putChar(char c) {
        this.buffer.putChar(c);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putBytes */
    public final Hasher mo79putBytes(byte[] bArr, int i, int i2) {
        ByteBuffer order = ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN);
        if (order.remaining() <= this.buffer.remaining()) {
            this.buffer.put(order);
            munchIfFull();
        } else {
            int position = this.bufferSize - this.buffer.position();
            for (int i3 = 0; i3 < position; i3++) {
                this.buffer.put(order.get());
            }
            munch();
            while (order.remaining() >= this.chunkSize) {
                process(order);
            }
            this.buffer.put(order);
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    /* renamed from: putByte  reason: collision with other method in class */
    public PrimitiveSink mo82putByte(byte b) {
        this.buffer.put(b);
        munchIfFull();
        return this;
    }
}
