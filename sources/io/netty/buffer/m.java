package io.netty.buffer;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;

public class m extends InputStream implements DataInput {
    private final j a;
    private final int b;
    private final int c;
    private final StringBuilder f = new StringBuilder();

    public m(j jVar) {
        int m1 = jVar.m1();
        if (m1 < 0) {
            throw new IllegalArgumentException(je.p0("length: ", m1));
        } else if (m1 <= jVar.m1()) {
            this.a = jVar;
            int n1 = jVar.n1();
            this.b = n1;
            this.c = n1 + m1;
            jVar.L0();
        } else {
            StringBuilder W0 = je.W0("Too many bytes to be read - Needs ", m1, ", maximum is ");
            W0.append(jVar.m1());
            throw new IndexOutOfBoundsException(W0.toString());
        }
    }

    private void a(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("fieldSize cannot be a negative number");
        } else if (i > available()) {
            StringBuilder W0 = je.W0("fieldSize is too long! Length is ", i, ", but maximum is ");
            W0.append(available());
            throw new EOFException(W0.toString());
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.c - this.a.n1();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.a.L0();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.a.K0()) {
            return -1;
        }
        return this.a.b1() & 255;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        a(1);
        if (read() != 0) {
            return true;
        }
        return false;
    }

    @Override // java.io.DataInput
    public byte readByte() {
        if (this.a.K0()) {
            return this.a.b1();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        int length = bArr.length;
        a(length);
        this.a.f1(bArr, 0, length);
    }

    @Override // java.io.DataInput
    public int readInt() {
        a(4);
        return this.a.g1();
    }

    @Override // java.io.DataInput
    public String readLine() {
        this.f.setLength(0);
        while (this.a.K0()) {
            short l1 = this.a.l1();
            if (l1 != 10) {
                if (l1 != 13) {
                    this.f.append((char) l1);
                } else if (this.a.K0()) {
                    j jVar = this.a;
                    if (((char) jVar.u0(jVar.n1())) == '\n') {
                        this.a.I1(1);
                    }
                }
            }
            return this.f.toString();
        }
        if (this.f.length() > 0) {
            return this.f.toString();
        }
        return null;
    }

    @Override // java.io.DataInput
    public long readLong() {
        a(8);
        return this.a.h1();
    }

    @Override // java.io.DataInput
    public short readShort() {
        a(2);
        return this.a.k1();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        return DataInputStream.readUTF(this);
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        return readByte() & 255;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        return readShort() & 65535;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.a.r1();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int skipBytes;
        if (j > 2147483647L) {
            skipBytes = skipBytes(Integer.MAX_VALUE);
        } else {
            skipBytes = skipBytes((int) j);
        }
        return (long) skipBytes;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) {
        int min = Math.min(available(), i);
        this.a.I1(min);
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int available = available();
        if (available == 0) {
            return -1;
        }
        int min = Math.min(available, i2);
        this.a.f1(bArr, i, min);
        return min;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.f1(bArr, i, i2);
    }
}
