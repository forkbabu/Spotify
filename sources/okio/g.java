package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface g extends w, ReadableByteChannel {
    byte[] B0(long j);

    short E0();

    String E1(Charset charset);

    e L();

    void L0(long j);

    long Q0(byte b);

    long R(ByteString byteString);

    int R1();

    String V(long j);

    ByteString Z0(long j);

    @Override // okio.f
    @Deprecated
    e c();

    long d2(v vVar);

    boolean g0(long j, ByteString byteString);

    byte[] j1();

    long k2();

    boolean l1();

    InputStream m2();

    boolean n(long j);

    int n2(q qVar);

    long r1();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    void skip(long j);

    String y0();
}
