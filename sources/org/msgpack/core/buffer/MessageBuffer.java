package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0127, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
        r9 = null;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012e, code lost:
        r9 = null;
        r5 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0127 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0173  */
    static {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.MessageBuffer.<clinit>():void");
    }

    MessageBuffer(long j, int i) {
        this.base = null;
        this.address = j;
        this.size = i;
        this.reference = null;
    }

    public static MessageBuffer newBuffer(int i) {
        return newMessageBuffer(new byte[i]);
    }

    public static MessageBuffer newDirectBuffer(int i) {
        return newMessageBuffer(ByteBuffer.allocateDirect(i));
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        try {
            return (MessageBuffer) mbBBConstructor.newInstance(byteBuffer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static MessageBuffer newOffHeapBuffer(int i) {
        if (!isUniversalBuffer) {
            return new MessageBuffer(unsafe.allocateMemory((long) i), i);
        }
        return newDirectBuffer(i);
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (!isUniversalBuffer) {
            Object obj = messageBuffer.base;
            if (!(obj instanceof byte[])) {
                if (DirectBufferAccess.isDirectByteBufferInstance(obj)) {
                    DirectBufferAccess.clean(messageBuffer.base);
                } else {
                    unsafe.freeMemory(messageBuffer.address);
                }
            }
        }
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr);
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), messageBuffer.base, ((long) i2) + messageBuffer.address, (long) i3);
    }

    public long getAddress() {
        return this.address;
    }

    public byte[] getArray() {
        return (byte[]) this.base;
    }

    public Object getBase() {
        return this.base;
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + ((long) i));
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + ((long) i));
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), bArr, (long) (ARRAY_BYTE_BASE_OFFSET + i2), (long) i3);
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + ((long) i)));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + ((long) i)));
    }

    public ByteBuffer getReference() {
        return this.reference;
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + ((long) i)));
    }

    public boolean hasArray() {
        return this.base instanceof byte[];
    }

    public int offset() {
        if (hasArray()) {
            return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
        }
        return 0;
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + ((long) i), z);
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + ((long) i), b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position()), this.base, this.address + ((long) i), (long) i2);
            byteBuffer.position(byteBuffer.position() + i2);
        } else if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            unsafe.copyMemory(array, (long) (byteBuffer.position() + ARRAY_BYTE_BASE_OFFSET), this.base, this.address + ((long) i), (long) i2);
            byteBuffer.position(byteBuffer.position() + i2);
        } else {
            Object obj = this.base;
            if (obj != null) {
                byteBuffer.get((byte[]) obj, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                unsafe.putByte(this.base, this.address + ((long) i), byteBuffer.get());
            }
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(bArr, (long) (ARRAY_BYTE_BASE_OFFSET + i2), this.base, this.address + ((long) i), (long) i3);
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + ((long) i), Integer.reverseBytes(i2));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, ((long) i) + this.address, Long.reverseBytes(j));
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + ((long) i), Short.reverseBytes(s));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        yif.d(i + i2 <= size());
        return new MessageBuffer(this.base, this.address + ((long) i), i2, this.reference);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, (long) ARRAY_BYTE_BASE_OFFSET, (long) size());
        return bArr;
    }

    public ByteBuffer toByteBuffer(int i, int i2) {
        if (hasArray()) {
            return ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ((long) ARRAY_BYTE_BASE_OFFSET)) + ((long) i)), i2);
        }
        return DirectBufferAccess.newByteBuffer(this.address, i, i2, this.reference);
    }

    public String toHexString(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(" ");
            }
            sb.append(String.format("%02x", Byte.valueOf(getByte(i3))));
        }
        return sb.toString();
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer).slice(byteBuffer.position(), byteBuffer.remaining());
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= i2) {
            byteBuffer.put(toByteBuffer(i, i2));
            return;
        }
        throw new BufferOverflowException();
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr) {
        bArr.getClass();
        try {
            return (MessageBuffer) mbArrConstructor.newInstance(bArr);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public ByteBuffer toByteBuffer() {
        return toByteBuffer(0, size());
    }

    MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (!isUniversalBuffer) {
                this.base = null;
                this.address = DirectBufferAccess.getAddress(byteBuffer);
                this.size = byteBuffer.capacity();
                this.reference = byteBuffer;
                return;
            }
            throw new IllegalStateException("Cannot create MessageBuffer from DirectBuffer");
        } else if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = (long) ARRAY_BYTE_BASE_OFFSET;
            this.size = byteBuffer.array().length;
            this.reference = null;
        } else {
            throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer are supported");
        }
    }

    MessageBuffer(byte[] bArr) {
        this.base = bArr;
        this.address = (long) ARRAY_BYTE_BASE_OFFSET;
        this.size = bArr.length;
        this.reference = null;
    }

    MessageBuffer(Object obj, long j, int i, ByteBuffer byteBuffer) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = byteBuffer;
    }
}
