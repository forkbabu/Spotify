package defpackage;

import java.nio.ByteBuffer;

/* renamed from: iq1  reason: default package */
public class iq1 {

    /* renamed from: iq1$a */
    public static class a {
        private final byte a;
        private final byte b;

        public a(byte b2, byte b3) {
            this.a = b2;
            this.b = b3;
        }

        public byte a() {
            return this.b;
        }

        public byte b() {
            return this.a;
        }
    }

    private void b(byte[] bArr, int i, ByteBuffer byteBuffer, hq1 hq1) {
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            hq1.a(b);
            if (b == 124 || b == 126 || b == 125) {
                byteBuffer.put((byte) 125);
                byteBuffer.put((byte) (b - 32));
            } else {
                byteBuffer.put(b);
            }
        }
    }

    public void a(byte[] bArr, int i, byte b, byte b2, ByteBuffer byteBuffer) {
        hq1 hq1 = new hq1();
        byteBuffer.put((byte) 126);
        hq1.a(b);
        byteBuffer.put(b);
        hq1.a(b2);
        byteBuffer.put(b2);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        b(allocate.array(), 4, byteBuffer, hq1);
        b(bArr, i, byteBuffer, hq1);
        ByteBuffer allocate2 = ByteBuffer.allocate(2);
        allocate2.putShort(hq1.b());
        b(allocate2.array(), 2, byteBuffer, hq1);
        byteBuffer.put((byte) 124);
    }
}
