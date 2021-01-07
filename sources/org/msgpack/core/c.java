package org.msgpack.core;

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.b;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;

public class c implements Closeable {
    private final b.a a;
    private MessageBufferOutput b;
    private MessageBuffer c;
    private MessageBuffer f;
    private int n = 0;
    private long o = 0;
    private CharsetEncoder p;

    public c(MessageBufferOutput messageBufferOutput) {
        b.a aVar = b.b;
        yif.f(aVar, "config is null");
        this.a = aVar;
        yif.f(messageBufferOutput, "MessageBufferOutput is null");
        this.b = messageBufferOutput;
    }

    private void C(byte b2) {
        a(1);
        MessageBuffer messageBuffer = this.c;
        int i = this.n;
        this.n = i + 1;
        messageBuffer.putByte(i, b2);
    }

    private void D(byte b2, byte b3) {
        a(2);
        MessageBuffer messageBuffer = this.c;
        int i = this.n;
        this.n = i + 1;
        messageBuffer.putByte(i, b2);
        MessageBuffer messageBuffer2 = this.c;
        int i2 = this.n;
        this.n = i2 + 1;
        messageBuffer2.putByte(i2, b3);
    }

    private void F(byte b2, int i) {
        a(5);
        MessageBuffer messageBuffer = this.c;
        int i2 = this.n;
        this.n = i2 + 1;
        messageBuffer.putByte(i2, b2);
        this.c.putInt(this.n, i);
        this.n += 4;
    }

    private void G(byte b2, long j) {
        a(9);
        MessageBuffer messageBuffer = this.c;
        int i = this.n;
        this.n = i + 1;
        messageBuffer.putByte(i, b2);
        this.c.putLong(this.n, j);
        this.n += 8;
    }

    private void I(byte b2, short s) {
        a(3);
        MessageBuffer messageBuffer = this.c;
        int i = this.n;
        this.n = i + 1;
        messageBuffer.putByte(i, b2);
        this.c.putShort(this.n, s);
        this.n += 2;
    }

    private void a(int i) {
        MessageBuffer messageBuffer = this.c;
        if (messageBuffer == null || this.n + i >= messageBuffer.size()) {
            flush();
            this.c = this.b.next(Math.max(this.a.c(), i));
        }
    }

    private void w() {
        if (this.c == null) {
            this.c = this.b.next(this.a.c());
        }
    }

    public MessageBufferOutput B(MessageBufferOutput messageBufferOutput) {
        yif.f(messageBufferOutput, "MessageBufferOutput is null");
        MessageBufferOutput messageBufferOutput2 = this.b;
        this.b = messageBufferOutput;
        this.n = 0;
        this.o = 0;
        return messageBufferOutput2;
    }

    public c J(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining >= this.a.d()) {
            flush();
            this.b.flush(MessageBuffer.wrap(byteBuffer));
            byteBuffer.position(byteBuffer.limit());
            this.o += (long) remaining;
        } else {
            while (byteBuffer.remaining() > 0) {
                if (this.n >= this.c.size()) {
                    flush();
                }
                w();
                int min = Math.min(this.c.size() - this.n, byteBuffer.remaining());
                this.c.putByteBuffer(this.n, byteBuffer, min);
                this.n += min;
            }
        }
        return this;
    }

    public c M(byte[] bArr) {
        int length = bArr.length;
        if (length >= this.a.d()) {
            flush();
            this.b.flush(MessageBuffer.wrap(bArr).slice(0, length));
            this.o += (long) length;
        } else {
            int i = 0;
            while (i < length) {
                MessageBuffer messageBuffer = this.c;
                if (messageBuffer != null && this.n >= messageBuffer.size()) {
                    flush();
                }
                w();
                int min = Math.min(this.c.size() - this.n, length - i);
                this.c.putBytes(this.n, bArr, 0 + i, min);
                this.n += min;
                i += min;
            }
        }
        return this;
    }

    public c b(int i) {
        if (i >= 0) {
            if (i < 16) {
                C((byte) (i | -112));
            } else if (i < 65536) {
                I((byte) -36, (short) i);
            } else {
                F((byte) -35, i);
            }
            return this;
        }
        throw new IllegalArgumentException("array size must be >= 0");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
        } finally {
            this.b.close();
        }
    }

    public c d(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            p(bigInteger.longValue());
        } else if (bigInteger.bitLength() == 64 && bigInteger.signum() == 1) {
            G((byte) -49, bigInteger.longValue());
        } else {
            throw new IllegalArgumentException("MessagePack cannot serialize BigInteger larger than 2^64-1");
        }
        return this;
    }

    public c f(int i) {
        if (i < 256) {
            D((byte) -60, (byte) i);
        } else if (i < 65536) {
            I((byte) -59, (short) i);
        } else {
            F((byte) -58, i);
        }
        return this;
    }

    public void flush() {
        MessageBuffer messageBuffer = this.c;
        if (messageBuffer != null) {
            if (this.n == messageBuffer.size()) {
                this.b.flush(this.c);
            } else {
                this.b.flush(this.c.slice(0, this.n));
            }
            this.c = null;
            this.o += (long) this.n;
            this.n = 0;
        }
    }

    public c g(boolean z) {
        C(z ? (byte) -61 : -62);
        return this;
    }

    public c h(double d) {
        a(9);
        MessageBuffer messageBuffer = this.c;
        int i = this.n;
        this.n = i + 1;
        messageBuffer.putByte(i, (byte) -53);
        this.c.putDouble(this.n, d);
        this.n += 8;
        return this;
    }

    public c i(byte b2, int i) {
        if (i < 256) {
            if (i <= 0 || ((i - 1) & i) != 0) {
                D((byte) -57, (byte) i);
                C(b2);
            } else if (i == 1) {
                D((byte) -44, b2);
            } else if (i == 2) {
                D((byte) -43, b2);
            } else if (i == 4) {
                D((byte) -42, b2);
            } else if (i == 8) {
                D((byte) -41, b2);
            } else if (i == 16) {
                D((byte) -40, b2);
            } else {
                D((byte) -57, (byte) i);
                C(b2);
            }
        } else if (i < 65536) {
            I((byte) -56, (short) i);
            C(b2);
        } else {
            F((byte) -55, i);
            C(b2);
        }
        return this;
    }

    public c l(float f2) {
        a(5);
        MessageBuffer messageBuffer = this.c;
        int i = this.n;
        this.n = i + 1;
        messageBuffer.putByte(i, (byte) -54);
        this.c.putFloat(this.n, f2);
        this.n += 4;
        return this;
    }

    public c m(int i) {
        if (i < -32) {
            if (i < -32768) {
                F((byte) -46, i);
            } else if (i < -128) {
                I((byte) -47, (short) i);
            } else {
                D((byte) -48, (byte) i);
            }
        } else if (i < 128) {
            C((byte) i);
        } else if (i < 256) {
            D((byte) -52, (byte) i);
        } else if (i < 65536) {
            I((byte) -51, (short) i);
        } else {
            F((byte) -50, i);
        }
        return this;
    }

    public c p(long j) {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    G((byte) -45, j);
                } else {
                    F((byte) -46, (int) j);
                }
            } else if (j < -128) {
                I((byte) -47, (short) ((int) j));
            } else {
                D((byte) -48, (byte) ((int) j));
            }
        } else if (j < 128) {
            C((byte) ((int) j));
        } else if (j < 65536) {
            if (j < 256) {
                D((byte) -52, (byte) ((int) j));
            } else {
                I((byte) -51, (short) ((int) j));
            }
        } else if (j < 4294967296L) {
            F((byte) -50, (int) j);
        } else {
            G((byte) -49, j);
        }
        return this;
    }

    public c q(int i) {
        if (i >= 0) {
            if (i < 16) {
                C((byte) (i | -128));
            } else if (i < 65536) {
                I((byte) -34, (short) i);
            } else {
                F((byte) -33, i);
            }
            return this;
        }
        throw new IllegalArgumentException("map size must be >= 0");
    }

    public c r() {
        C((byte) -64);
        return this;
    }

    public c s(int i) {
        if (i < 32) {
            C((byte) (i | -96));
        } else if (i < 256) {
            D((byte) -39, (byte) i);
        } else if (i < 65536) {
            I((byte) -38, (short) i);
        } else {
            F((byte) -37, i);
        }
        return this;
    }

    public c v(String str) {
        if (str.length() <= 0) {
            s(0);
            return this;
        }
        CharBuffer wrap = CharBuffer.wrap(str);
        if (this.p == null) {
            this.p = b.a.newEncoder().onMalformedInput(this.a.a()).onUnmappableCharacter(this.a.a());
        }
        flush();
        w();
        MessageBuffer messageBuffer = this.c;
        ByteBuffer byteBuffer = messageBuffer.toByteBuffer(this.n, messageBuffer.size() - this.n);
        this.p.reset();
        boolean z = false;
        while (wrap.hasRemaining()) {
            try {
                CoderResult encode = this.p.encode(wrap, byteBuffer, true);
                if (encode.isUnderflow()) {
                    encode = this.p.flush(byteBuffer);
                }
                if (encode.isOverflow()) {
                    int max = Math.max(1, (int) (((float) wrap.remaining()) * this.p.averageBytesPerChar()));
                    byteBuffer.flip();
                    double capacity = (double) byteBuffer.capacity();
                    Double.isNaN(capacity);
                    ByteBuffer allocate = ByteBuffer.allocate(Math.max((int) (capacity * 1.5d), byteBuffer.remaining() + max));
                    allocate.put(byteBuffer);
                    this.p.reset();
                    byteBuffer = allocate;
                    z = true;
                } else if (encode.isError() && ((encode.isMalformed() && this.a.a() == CodingErrorAction.REPORT) || (encode.isUnmappable() && this.a.b() == CodingErrorAction.REPORT))) {
                    encode.throwException();
                }
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        MessageBuffer messageBuffer2 = this.c;
        if (this.f == null) {
            this.f = MessageBuffer.newBuffer(5);
        }
        this.c = this.f;
        this.n = 0;
        s(remaining);
        flush();
        if (z) {
            messageBuffer2 = MessageBuffer.wrap(byteBuffer);
        }
        this.c = messageBuffer2;
        this.n = remaining;
        return this;
    }
}
