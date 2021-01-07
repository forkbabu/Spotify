package org.msgpack.core;

import java.io.Closeable;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.msgpack.core.b;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.Variable;
import org.msgpack.value.p;
import org.msgpack.value.v;

public class d implements Closeable {
    private static final MessageBuffer r = MessageBuffer.wrap(new byte[0]);
    private final b.a a;
    private MessageBufferInput b;
    private MessageBuffer c = r;
    private int f;
    private long n;
    private MessageBuffer o = null;
    private final MessageBuffer p = MessageBuffer.wrap(new byte[24]);
    private boolean q = false;

    public d(MessageBufferInput messageBufferInput) {
        b.a aVar = b.b;
        yif.f(messageBufferInput, "MessageBufferInput is null");
        this.b = messageBufferInput;
        yif.f(aVar, "Config");
        this.a = aVar;
    }

    private MessageBuffer C() {
        if (this.q) {
            return null;
        }
        MessageBuffer messageBuffer = this.o;
        if (messageBuffer == null) {
            messageBuffer = this.b.next();
        } else {
            this.o = null;
        }
        if (messageBuffer == null) {
            this.q = true;
        }
        return messageBuffer;
    }

    private static MessageTypeException D(String str, byte b2) {
        String str2;
        MessageFormat g = MessageFormat.g(b2);
        if (g == MessageFormat.NEVER_USED) {
            str2 = "NeverUsed";
        } else {
            String name = g.d().name();
            str2 = name.substring(0, 1) + name.substring(1).toLowerCase();
        }
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, str2, Byte.valueOf(b2)));
    }

    private byte a() {
        byte l = l();
        this.f++;
        return l;
    }

    private void b(int i) {
        if (this.f + i < 0) {
            f();
        }
        this.f += i;
    }

    private boolean d(int i) {
        MessageBuffer messageBuffer;
        if (i == 0) {
            return true;
        }
        if (!f()) {
            return false;
        }
        if (this.f + i <= this.c.size()) {
            return true;
        }
        MessageBuffer newBuffer = i <= this.p.size() ? this.p : MessageBuffer.newBuffer(i);
        int size = this.c.size();
        int i2 = this.f;
        int i3 = size - i2;
        if (i3 > 0) {
            this.c.copyTo(i2, newBuffer, 0, i3);
        }
        while (i3 < i) {
            MessageBuffer C = C();
            this.o = C;
            if (C == null) {
                return false;
            }
            int min = Math.min(i - i3, C.size());
            this.o.copyTo(0, newBuffer, i3, min);
            if (min == this.o.size()) {
                messageBuffer = null;
            } else {
                MessageBuffer messageBuffer2 = this.o;
                messageBuffer = messageBuffer2.slice(min, messageBuffer2.size() - min);
            }
            this.o = messageBuffer;
            i3 += min;
        }
        this.n += (long) this.f;
        if (i != newBuffer.size()) {
            newBuffer = newBuffer.slice(0, i);
        }
        this.c = newBuffer;
        this.f = 0;
        return true;
    }

    private boolean f() {
        while (true) {
            MessageBuffer messageBuffer = this.c;
            if (messageBuffer == null || this.f < messageBuffer.size()) {
                break;
            }
            int size = this.c.size();
            this.f -= size;
            this.n += (long) size;
            this.c = C();
        }
        return this.c != null;
    }

    private byte l() {
        if (d(1)) {
            return this.c.getByte(this.f);
        }
        throw new EOFException();
    }

    private int m(byte b2) {
        switch (b2) {
            case -60:
                return s();
            case -59:
                return q();
            case -58:
                return r();
            default:
                return -1;
        }
    }

    private long p() {
        if (d(8)) {
            long j = this.c.getLong(this.f);
            b(8);
            return j;
        }
        throw new EOFException("insufficient data length for reading long value");
    }

    private int q() {
        return readShort() & 65535;
    }

    private int r() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new MessageSizeException(((long) (readInt & Integer.MAX_VALUE)) + 2147483648L);
    }

    private byte readByte() {
        if (d(1)) {
            byte b2 = this.c.getByte(this.f);
            b(1);
            return b2;
        }
        throw new EOFException("insufficient data length for reading byte value");
    }

    private int readInt() {
        if (d(4)) {
            int i = this.c.getInt(this.f);
            b(4);
            return i;
        }
        throw new EOFException("insufficient data length for reading int value");
    }

    private short readShort() {
        if (d(2)) {
            short s = this.c.getShort(this.f);
            b(2);
            return s;
        }
        throw new EOFException("insufficient data length for reading short value");
    }

    private int s() {
        return readByte() & 255;
    }

    private int w(byte b2) {
        switch (b2) {
            case -39:
                return s();
            case -38:
                return q();
            case -37:
                return r();
            default:
                return -1;
        }
    }

    public MessageBufferInput B(MessageBufferInput messageBufferInput) {
        yif.f(messageBufferInput, "MessageBufferInput is null");
        MessageBufferInput messageBufferInput2 = this.b;
        this.b = messageBufferInput;
        this.c = r;
        this.f = 0;
        this.n = 0;
        this.o = null;
        this.q = false;
        return messageBufferInput2;
    }

    public int F() {
        byte a2 = a();
        if ((a2 & -16) == -112) {
            return a2 & 15;
        }
        if (a2 == -36) {
            return q();
        }
        if (a2 == -35) {
            return r();
        }
        throw D("Array", a2);
    }

    public BigInteger G() {
        byte a2 = a();
        int i = a2 & 255;
        if (i <= 127 || i >= 224) {
            return BigInteger.valueOf((long) a2);
        }
        switch (a2) {
            case -52:
                return BigInteger.valueOf((long) (readByte() & 255));
            case -51:
                return BigInteger.valueOf((long) (readShort() & 65535));
            case -50:
                int readInt = readInt();
                if (readInt < 0) {
                    return BigInteger.valueOf(((long) (readInt & Integer.MAX_VALUE)) + 2147483648L);
                }
                return BigInteger.valueOf((long) readInt);
            case -49:
                long p2 = p();
                if (p2 < 0) {
                    return BigInteger.valueOf(p2 + Long.MAX_VALUE + 1).setBit(63);
                }
                return BigInteger.valueOf(p2);
            case -48:
                return BigInteger.valueOf((long) readByte());
            case -47:
                return BigInteger.valueOf((long) readShort());
            case -46:
                return BigInteger.valueOf((long) readInt());
            case -45:
                return BigInteger.valueOf(p());
            default:
                throw D("Integer", a2);
        }
    }

    public int I() {
        int w;
        byte a2 = a();
        if ((a2 & -32) == -96) {
            return a2 & 31;
        }
        int m = m(a2);
        if (m >= 0) {
            return m;
        }
        if (this.a.f() && (w = w(a2)) >= 0) {
            return w;
        }
        throw D("Binary", a2);
    }

    public boolean J() {
        byte a2 = a();
        if (a2 == -62) {
            return false;
        }
        if (a2 == -61) {
            return true;
        }
        throw D("boolean", a2);
    }

    public double M() {
        byte a2 = a();
        if (a2 != -54) {
            if (a2 != -53) {
                throw D("Float", a2);
            } else if (d(8)) {
                double d = this.c.getDouble(this.f);
                b(8);
                return d;
            } else {
                throw new EOFException("insufficient data length for reading double value");
            }
        } else if (d(4)) {
            float f2 = this.c.getFloat(this.f);
            b(4);
            return (double) f2;
        } else {
            throw new EOFException("insufficient data length for reading float value");
        }
    }

    public a O() {
        byte a2 = a();
        switch (a2) {
            case -57:
                return new a(readByte(), s());
            case -56:
                return new a(readByte(), q());
            case -55:
                return new a(readByte(), r());
            default:
                switch (a2) {
                    case -44:
                        return new a(readByte(), 1);
                    case -43:
                        return new a(readByte(), 2);
                    case -42:
                        return new a(readByte(), 4);
                    case -41:
                        return new a(readByte(), 8);
                    case -40:
                        return new a(readByte(), 16);
                    default:
                        throw D("Ext", a2);
                }
        }
    }

    public long Q() {
        byte a2 = a();
        int i = a2 & 255;
        if (i <= 127 || i >= 224) {
            return (long) a2;
        }
        switch (a2) {
            case -52:
                return (long) (readByte() & 255);
            case -51:
                return (long) (readShort() & 65535);
            case -50:
                int readInt = readInt();
                return readInt < 0 ? ((long) (readInt & Integer.MAX_VALUE)) + 2147483648L : (long) readInt;
            case -49:
                long p2 = p();
                if (p2 >= 0) {
                    return p2;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(p2 + Long.MAX_VALUE + 1).setBit(63));
            case -48:
                return (long) readByte();
            case -47:
                return (long) readShort();
            case -46:
                return (long) readInt();
            case -45:
                return p();
            default:
                throw D("Integer", a2);
        }
    }

    public int U() {
        byte a2 = a();
        if ((a2 & -32) == -128) {
            return a2 & 15;
        }
        if (a2 == -34) {
            return q();
        }
        if (a2 == -33) {
            return r();
        }
        throw D("Map", a2);
    }

    public void W() {
        byte a2 = a();
        if (a2 != -64) {
            throw D("Nil", a2);
        }
    }

    public int b0() {
        int m;
        byte a2 = a();
        if ((a2 & -32) == -96) {
            return a2 & 31;
        }
        int w = w(a2);
        if (w >= 0) {
            return w;
        }
        if (this.a.e() && (m = m(a2)) >= 0) {
            return m;
        }
        throw D("String", a2);
    }

    public p c0() {
        MessageFormat g = g();
        int i = 0;
        switch (g.d().ordinal()) {
            case 0:
                W();
                return rpf.n0();
            case 1:
                return J() ? mpf.b : mpf.c;
            case 2:
                if (g.ordinal() != 18) {
                    return new ppf(Q());
                }
                return new kpf(G());
            case 3:
                return new npf(M());
            case 4:
                return new spf(v(b0()));
            case 5:
                return new lpf(v(I()));
            case 6:
                int F = F();
                v[] vVarArr = new v[F];
                while (i < F) {
                    vVarArr[i] = c0();
                    i++;
                }
                if (F == 0) {
                    return jpf.o0();
                }
                return new jpf((v[]) Arrays.copyOf(vVarArr, F));
            case 7:
                int U = U() * 2;
                v[] vVarArr2 = new v[U];
                while (i < U) {
                    vVarArr2[i] = c0();
                    int i2 = i + 1;
                    vVarArr2[i2] = c0();
                    i = i2 + 1;
                }
                return yif.y(vVarArr2);
            case 8:
                a O = O();
                return new opf(O.b(), v(O.a()));
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    public Variable d0(Variable variable) {
        MessageFormat g = g();
        int i = 0;
        switch (g.d().ordinal()) {
            case 0:
                W();
                variable.D();
                return variable;
            case 1:
                variable.r(J());
                return variable;
            case 2:
                if (g.ordinal() != 18) {
                    variable.w(Q());
                    return variable;
                }
                variable.B(G());
                return variable;
            case 3:
                variable.v(M());
                return variable;
            case 4:
                variable.F(v(b0()));
                return variable;
            case 5:
                variable.q(v(I()));
                return variable;
            case 6:
                int F = F();
                ArrayList arrayList = new ArrayList(F);
                while (i < F) {
                    arrayList.add(c0());
                    i++;
                }
                variable.p(arrayList);
                return variable;
            case 7:
                int U = U();
                HashMap hashMap = new HashMap();
                while (i < U) {
                    hashMap.put(c0(), c0());
                    i++;
                }
                variable.C(hashMap);
                return variable;
            case 8:
                a O = O();
                variable.s(O.b(), v(O.a()));
                return variable;
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }

    public MessageFormat g() {
        return MessageFormat.g(l());
    }

    public long h() {
        return this.n + ((long) this.f);
    }

    public boolean i() {
        return d(1);
    }

    public byte[] v(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            if (f()) {
                int min = Math.min(this.c.size() - this.f, i - i2);
                this.c.getBytes(this.f, bArr, 0 + i2, min);
                b(min);
                i2 += min;
            } else {
                throw new EOFException();
            }
        }
        return bArr;
    }
}
