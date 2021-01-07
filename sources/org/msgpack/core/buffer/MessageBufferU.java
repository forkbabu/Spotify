package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MessageBufferU extends MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public MessageBufferU(ByteBuffer byteBuffer) {
        super(null, 0, byteBuffer.capacity(), byteBuffer.order(ByteOrder.BIG_ENDIAN));
        this.reference.getClass();
    }

    private void resetBufferPosition() {
        this.reference.position(0);
        this.reference.limit(this.size);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        try {
            this.reference.position(i);
            messageBuffer.putByteBuffer(i2, this.reference, i3);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public boolean getBoolean(int i) {
        return this.reference.get(i) != 0;
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public byte getByte(int i) {
        return this.reference.get(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        try {
            this.reference.position(i);
            this.reference.limit(i + i2);
            byteBuffer.put(this.reference);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public double getDouble(int i) {
        return this.reference.getDouble(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public float getFloat(int i) {
        return this.reference.getFloat(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public int getInt(int i) {
        return this.reference.getInt(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public long getLong(int i) {
        return this.reference.getLong(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public short getShort(int i) {
        return this.reference.getShort(i);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putBoolean(int i, boolean z) {
        this.reference.put(i, z ? (byte) 1 : 0);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putByte(int i, byte b) {
        this.reference.put(i, b);
    }

    /* JADX INFO: finally extract failed */
    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.hasArray()) {
            putBytes(i, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i2);
            this.reference.position(i);
            this.reference.put(byteBuffer);
            byteBuffer.limit(limit);
        } catch (Throwable th) {
            byteBuffer.limit(limit);
            throw th;
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        try {
            this.reference.position(i);
            this.reference.put(bArr, i2, i3);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putDouble(int i, double d) {
        this.reference.putDouble(i, d);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putFloat(int i, float f) {
        this.reference.putFloat(i, f);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putInt(int i, int i2) {
        this.reference.putInt(i, i2);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putLong(int i, long j) {
        this.reference.putLong(i, j);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void putShort(int i, short s) {
        this.reference.putShort(i, s);
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public byte[] toByteArray() {
        int size = size();
        byte[] bArr = new byte[size];
        getBytes(0, bArr, 0, size);
        return bArr;
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public ByteBuffer toByteBuffer(int i, int i2) {
        try {
            this.reference.position(i);
            this.reference.limit(i + i2);
            return this.reference.slice();
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public MessageBufferU slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        int i3 = i2 + i;
        yif.d(i3 <= size());
        try {
            this.reference.position(i);
            this.reference.limit(i3);
            return new MessageBufferU(this.reference.slice());
        } finally {
            resetBufferPosition();
        }
    }

    MessageBufferU(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        try {
            this.reference.position(i);
            this.reference.get(bArr, i2, i3);
        } finally {
            resetBufferPosition();
        }
    }

    @Override // org.msgpack.core.buffer.MessageBuffer
    public ByteBuffer toByteBuffer() {
        return toByteBuffer(0, this.size);
    }
}
