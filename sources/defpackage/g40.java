package defpackage;

import java.nio.ByteBuffer;

@l40(tags = {0})
/* renamed from: g40  reason: default package */
public abstract class g40 {
    int a;
    int b;
    int c;

    /* access modifiers changed from: package-private */
    public abstract int a();

    public int b() {
        return c() + a() + 1;
    }

    public int c() {
        int a2 = a();
        int i = 0;
        while (true) {
            if (a2 <= 0 && i >= this.c) {
                return i;
            }
            a2 >>>= 7;
            i++;
        }
    }

    public final void d(int i, ByteBuffer byteBuffer) {
        this.a = i;
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.b = i2 & 127;
        int i3 = 1;
        while ((i2 >>> 7) == 1) {
            i2 = byteBuffer.get();
            if (i2 < 0) {
                i2 += 256;
            }
            i3++;
            this.b = (this.b << 7) | (i2 & 127);
        }
        this.c = i3;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.b);
        e(slice);
        byteBuffer.position(byteBuffer.position() + this.b);
    }

    public abstract void e(ByteBuffer byteBuffer);

    public void f(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        int i2 = 0;
        while (true) {
            if (i > 0 || i2 < this.c) {
                i2++;
                if (i > 0) {
                    byteBuffer.put((c() + position) - i2, (byte) (i & 127));
                } else {
                    byteBuffer.put((c() + position) - i2, Byte.MIN_VALUE);
                }
                i >>>= 7;
            } else {
                byteBuffer.position(c() + position);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("BaseDescriptor", "{tag=");
        Z0.append(this.a);
        Z0.append(", sizeOfInstance=");
        return je.A0(Z0, this.b, '}');
    }
}
