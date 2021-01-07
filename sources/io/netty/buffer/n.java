package io.netty.buffer;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;

public class n extends OutputStream implements DataOutput {
    private final j a;
    private final DataOutputStream b = new DataOutputStream(this);

    public n(j jVar) {
        this.a = jVar;
        jVar.Z1();
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            this.a.V1(bArr, i, i2);
        }
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z) {
        write(z ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i) {
        this.a.P1((byte) i);
    }

    @Override // java.io.DataOutput
    public void writeBytes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            write((byte) str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public void writeChar(int i) {
        writeShort((short) i);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            writeShort((short) str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d) {
        this.a.X1(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f) {
        this.a.W1(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i) {
        this.a.W1(i);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j) {
        this.a.X1(j);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i) {
        this.a.Y1((short) i);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) {
        this.b.writeUTF(str);
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr) {
        this.a.U1(bArr);
    }

    @Override // java.io.OutputStream, java.io.DataOutput
    public void write(int i) {
        this.a.P1((byte) i);
    }
}
