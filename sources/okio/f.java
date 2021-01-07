package okio;

import java.nio.channels.WritableByteChannel;

public interface f extends v, WritableByteChannel {
    f J1(long j);

    f N0(long j);

    f S();

    f Y1(ByteString byteString);

    e c();

    f e0(String str);

    @Override // okio.v, java.io.Flushable
    void flush();

    f k1(int i);

    long n0(w wVar);

    f write(byte[] bArr);

    f write(byte[] bArr, int i, int i2);

    f writeByte(int i);

    f writeInt(int i);

    f writeShort(int i);
}
