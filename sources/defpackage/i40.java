package defpackage;

import java.nio.ByteBuffer;

/* renamed from: i40  reason: default package */
public class i40 {
    int a;
    int b = 0;
    private ByteBuffer c;

    public i40(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
        this.a = byteBuffer.position();
    }

    public void a(int i, int i2) {
        int i3 = this.b;
        int i4 = 8 - (i3 % 8);
        int i5 = 1;
        if (i2 <= i4) {
            int i6 = this.c.get((i3 / 8) + this.a);
            if (i6 < 0) {
                i6 += 256;
            }
            int i7 = i6 + (i << (i4 - i2));
            ByteBuffer byteBuffer = this.c;
            int i8 = (this.b / 8) + this.a;
            if (i7 > 127) {
                i7 -= 256;
            }
            byteBuffer.put(i8, (byte) i7);
            this.b += i2;
        } else {
            int i9 = i2 - i4;
            a(i >> i9, i4);
            a(i & ((1 << i9) - 1), i9);
        }
        ByteBuffer byteBuffer2 = this.c;
        int i10 = this.a;
        int i11 = this.b;
        int i12 = (i11 / 8) + i10;
        if (i11 % 8 <= 0) {
            i5 = 0;
        }
        byteBuffer2.position(i12 + i5);
    }
}
